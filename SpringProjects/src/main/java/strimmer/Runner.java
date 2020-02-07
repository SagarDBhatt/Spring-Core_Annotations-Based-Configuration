package strimmer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Runner is the class which has main() thread. Execution will start from here.
public class Runner {

    public static void main(String[] args) {

        System.out.println("Hello, This is in main class ");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After Context initialization");
//
//        HelloWorld aObj = context.getBean(HelloWorld.class);
//        aObj.SayHello();

         AWS_EmailService obj = context.getBean(AWS_EmailService.class);
         obj.emailServie();

         GmailService gObj = context.getBean(GmailService.class);
         gObj.emailServie();

         

    }

}
