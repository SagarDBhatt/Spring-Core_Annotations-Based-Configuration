package Spring_CORE;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //@Configuration annotation describe the class as IOC container which provides objects of annotated class.
@ComponentScan
public class ApplicationConfiguration {


    //Need @Bean annotation to get an object of a class. Method name is not important, should return object of the class.
    //Creating HelloWorld class method that return object of that class.

   /* @Bean
    public HelloWorld helloWorldGetObject(){
        return new HelloWorld();
    }*/

   /* Same o/p can be achieved by using "@ComponentScan" annotation. And HelloWorld Class should be annotated as "@Component".
   This helps to access property (variables and methods) of HelloWorld class without creating a bean. */



}
