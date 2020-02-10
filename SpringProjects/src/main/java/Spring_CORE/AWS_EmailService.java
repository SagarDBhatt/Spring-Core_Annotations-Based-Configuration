package Spring_CORE;

import org.springframework.stereotype.Component;

@Component
public class AWS_EmailService implements EmailService{

    @Override
    public void sendNotification(String to, String body) {

        System.out.println("------------- AWS Email Service --------------");
        System.out.println("Email sent to : " + to);
        System.out.println("Email body : " + body);
        System.out.println("-------------");
    }
}
