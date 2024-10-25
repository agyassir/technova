<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 2024-10-24
  Time: 11:19 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>


<div class="flex h-screen bg-indigo-700">
    <div class="w-full max-w-xs m-auto bg-indigo-100 rounded p-5">
        <header>
            <img class="w-20 mx-auto mb-5" src="https://img.icons8.com/fluent/344/year-of-tiger.png" />
        </header>

        <form method="post" action="./login">
            <div>
                <label class="block mb-2 text-indigo-500" for="username">Username</label>
                <input class="w-full p-2 mb-6 text-indigo-700 border-b-2 border-indigo-500 outline-none focus:bg-gray-300" type="text" name="username" id="Username">
            </div>

            <div>
                <label class="block mb-2 text-indigo-500" for="password">Password</label>
                <input class="w-full p-2 mb-6 text-indigo-700 border-b-2 border-indigo-500 outline-none focus:bg-gray-300" type="password" name="password" id="password">
            </div>
            <div>
                <input class="w-full bg-indigo-700 hover:bg-pink-700 text-white font-bold py-2 px-4 mb-6 rounded" type="submit">
            </div>
        </form>
        <footer>
            <a class="text-indigo-700 hover:text-pink-700 text-sm float-left" href="#">Forgot Password?</a>
            <a class="text-indigo-700 hover:text-pink-700 text-sm float-right" href="./signup">Create Account</a>
        </footer>
    </div>
</div>
</body>
</html>