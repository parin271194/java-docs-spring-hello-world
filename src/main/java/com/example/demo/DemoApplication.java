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
                "    <title>Basic Website</title>\n" +
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
                "        input[type=text] {\n" +
                "            padding: 10px;\n" +
                "            margin-bottom: 10px;\n" +
                "        }\n" +
                "        button {\n" +
                "            padding: 10px 20px;\n" +
                "            background-color: #007bff;\n" +
                "            color: #fff;\n" +
                "            border: none;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <script>\n" +
                "        function handleClick() {\n" +
                "            var inputText = document.getElementById('myInput').value;\n" +
                "            alert('You entered: ' + inputText);\n" +
                "        }\n" +
                "        document.getElementById('myButton').addEventListener('click', handleClick);\n" +
                "    </script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>My Basic Website</h1>\n" +
                "    <label for='myInput'>Enter some text:</label>\n" +
                "    <input type='text' id='myInput'>\n" +
                "    <br>\n" +
                "    <button id='myButton'>Click Me</button>\n" +
                "</body>\n" +
                "</html>";
    }
}
