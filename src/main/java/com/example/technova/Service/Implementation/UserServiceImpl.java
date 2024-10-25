package com.example.technova.Service.Implementation;

import com.example.technova.Entity.User;
import com.example.technova.Repository.UserRepo;
import com.example.technova.Service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepository;
    @Transactional
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User signup(String firstname, String lastname, String email, String password){

        String hashedPassword = hashPassword(password);
        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("Email already in use.");
        }
        User newUser = new User();
        newUser.setFirstName(firstname);
        newUser.setLastName(lastname);
        newUser.setEmail(email);
        newUser.setPassword(hashedPassword);
        addUser(newUser);
        return newUser;
    }

    public boolean login(String username, String password) {
        User user = (User) userRepository.findByEmail(username).get();
        if (user == null || !checkPassword(password, user.getPassword())) {
            return false;
        }
        return true;
    }


    public User findById(UUID id){
//        return userRepository.findById(id).get();
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new EntityNotFoundException("Membre not found with ID: " + id);
        }
        return user.get();
    }

    public String hashPassword(String password) {
        // Implement password hashing logic (e.g., BCrypt)
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    private boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

}
