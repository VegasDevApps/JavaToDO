package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    // "say-hello" => "Hello! What are you learning today?"

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        return
                """
                    <html>
                        <head>
                            <title>
                                My first HTML Page
                            </title>
                        </head>
                        <body>
                            My First HTML page with body!
                        </body>
                    </html>
                """;
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
