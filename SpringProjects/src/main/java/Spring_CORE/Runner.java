package Spring_CORE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Runner is the class which has main() thread. Execution will start from here.
public class Runner {

    public static void main(String[] args) {

//First, need ApplicationContext object to access annotation methods.

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

/*        HelloWorld getObject1 = context.getBean(HelloWorld.class);
        HelloWorld getObject2 = context.getBean(HelloWorld.class);
        System.out.println(getObject1 == getObject2);*/

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.notif("Sbhatt@csu.edu","Hi Sam, Welcome to Spring");
    }

}
