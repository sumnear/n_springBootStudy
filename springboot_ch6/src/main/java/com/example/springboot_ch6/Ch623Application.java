package com.example.springboot_ch6;

import com.example.springboot_ch6.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch623Application
{


    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;


    @Autowired
    private AuthorSettings authorSettings; //1

    @RequestMapping("/")
    public String index()
    {
        return  "book name is:" + bookName + " and book author is:" + bookAuthor +"author name is " + authorSettings.getName() + " and author age is " + authorSettings.getAge();
    }

    //        SpringApplication app = new SpringApplication(Ch623Application.class);
    //        app.setShowBanner(false);
    //        app.run(args);

    //        new SpringApplicationBuilder(SpringbootApplication.class).showBanner(false).run(args);
    public static void main(String[] args)
    {
        SpringApplication.run(Ch623Application.class, args);
    }
}
