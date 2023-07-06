package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        model.addAttribute("welcomeMessage", "Welcome to our website!");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About");
        model.addAttribute("aboutText", "We are a passionate team dedicated to providing excellent services.");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact");
        model.addAttribute("email", "contact@example.com");
        model.addAttribute("phone", "+1234567890");
        return "contact";
    }
}
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title th:text="${pageTitle}"></title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        h1 {
            color: #333;
        }
        nav {
            background-color: #007bff;
            padding: 10px;
            margin-bottom: 20px;
        }
        nav a {
            color: #fff;
            text-decoration: none;
            margin-right: 10px;
        }
        .container {
            margin-top: 20px;
        }
    </style>
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            const navLinks = document.querySelectorAll('.nav-link');
            const sections = document.querySelectorAll('section');
            
            navLinks.forEach(function(link) {
                link.addEventListener('click', function(event) {
                    event.preventDefault();
                    const targetSection = document.querySelector(link.getAttribute('href'));
                    window.scrollTo({
                        top: targetSection.offsetTop,
                        behavior: 'smooth'
                    });
                });
            });
        });
    </script>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">My Website</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/contact">Contact> (Continuation of the `home.html` template)

```html
                </li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <h1 th:text="${pageTitle}"></h1>
        <p th:text="${welcomeMessage}"></p>
    </div>
</body>
</html>
<div class="container">
    <h1 th:text="${pageTitle}"></h1>
    <p th:text="${aboutText}"></p>
</div>
<div class="container">
    <h1 th:text="${pageTitle}"></h1>
    <p>Email: <span th:text="${email}"></span></p>
    <p>Phone: <span th:text="${phone}"></span></p>
</div>
