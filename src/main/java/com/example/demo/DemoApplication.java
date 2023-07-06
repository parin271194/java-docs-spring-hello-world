package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Advanced Website</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        nav {\n" +
                "            background-color: #007bff;\n" +
                "            padding: 10px;\n" +
                "        }\n" +
                "        nav a {\n" +
                "            color: #fff;\n" +
                "            text-decoration: none;\n" +
                "            margin-right: 10px;\n" +
                "        }\n" +
                "        .content {\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        .hidden {\n" +
                "            display: none;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <script>\n" +
                "        function showPage(pageId) {\n" +
                "            var pages = document.getElementsByClassName('page');\n" +
                "            for (var i = 0; i < pages.length; i++) {\n" +
                "                pages[i].classList.add('hidden');\n" +
                "            }\n" +
                "            document.getElementById(pageId).classList.remove('hidden');\n" +
                "        }\n" +
                "    </script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <nav>\n" +
                "        <a href='#' onclick=\"showPage('home');\">Home</a>\n" +
                "        <a href='#' onclick=\"showPage('about');\">About</a>\n" +
                "        <a href='#' onclick=\"showPage('contact');\">Contact</a>\n" +
                "    </nav>\n" +
                "    <div class='content'>\n" +
                "        <div id='home' class='page'>\n" +
                "            <h1>Welcome to the Home Page</h1>\n" +
                "            <p>This is the home page content.</p>\n" +
                "        </div>\n" +
                "        <div id='about' class='page hidden'>\n" +
                "            <h1>About Us</h1>\n" +
                "            <p>This is the about page content.</p>\n" +
                "        </div>\n" +
                "        <div id='contact' class='page hidden'>\n" +
                "            <h1>Contact Us</h1>\n" +
                "            <p>This is the contact page content.</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <script>\n" +
                "        showPage('home');\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }
}
