package strimmer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Runner is the class which has main() thread. Execution will start from here.
public class Runner {

    public static void main(String[] args) {

        /*System.out.println("Hello, This is in main class ");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After Context initialization");
//

//        HelloWorld aObj = context.getBean(HelloWorld.class);
//        aObj.SayHello();
AWS_EmailService obj = context.getBean(AWS_EmailService.class);
        obj.emailService();

        GmailService gObj = context.getBean(GmailService.class);
        gObj.emailService();

*/



//First need ApplicationContext object to access annotation methods.

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        HelloWorld getObject1 = context.getBean(HelloWorld.class);
        HelloWorld getObject2 = context.getBean(HelloWorld.class);

        System.out.println(getObject1 == getObject2);

        //getObject1.SayHello();


    }

}
