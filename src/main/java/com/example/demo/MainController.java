package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
    @RequestMapping ("/")
    public void animal(){
        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());
        print(c.yowl());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

    }
    private static void print(String s){
        System.out.println(s);
    }
}
