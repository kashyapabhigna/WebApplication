package com.learn.springboot.webApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //hit this url and return a response
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hellooo!! Howz learning going on??";
    }

    //Appending string isn't efficient so we can use stringBuilder or stringBuffer
    //But this approach of giving in HTML is bad!
    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuilder builder = new StringBuilder();
        builder.append("<html>");
        builder.append("<head>");
        builder.append("<title>MY FIRST WEB APPLICATION</title>");
        builder.append("</head>");
        builder.append("<body>");
        builder.append("A realTime web Application while learning a lot of web and spring concepts!!");
        builder.append("</body>");
        builder.append("</html>");
        return builder.toString();
    }

    //The previous approach is bad, so hit a url to redirect it to a sayHello.jsp file which contains the html content
    //say-hello-jsp => sayHello.jsp (/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp)
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
