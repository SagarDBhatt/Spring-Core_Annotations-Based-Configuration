package strimmer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void SayHello(){

        System.out.println("Inside method say hello");

    }

}
