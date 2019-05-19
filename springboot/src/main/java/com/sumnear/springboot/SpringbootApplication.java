package com.sumnear.springboot;

import com.sumnear.springboot.ch6_2_3.config.SystemSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

//通过 ImportResource 加载自定义xml
//@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
public class SpringbootApplication
{
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private SystemSettings systemSettings;

    @RequestMapping("/")
    String index()
    {
        //ch5
        // return "book name is:" + bookName + " and book author is:" + bookAuthor;

        //ch6_2_3
        return "systemSettings  sys.path is" +systemSettings.getPath();

    }

    public static void main(String[] args)
    {
//        SpringApplication app = new SpringApplication(SpringbootApplication.class);
//        app.setShowBanner(false);
//        app.run(args);

//        new SpringApplicationBuilder(SpringbootApplication.class).showBanner(false).run(args);
        SpringApplication.run(SpringbootApplication.class, args);
    }


}
