package strimmer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorld {

    public void SayHello(){
        System.out.println("Say Hello to HelloWorld");
    }

}
