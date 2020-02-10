package Spring_CORE;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gmailServ")
//@Primary
public class GmailService implements EmailService {

    @Override
    public void sendNotification(String to, String body) {
        System.out.println("*************** Gmail Service ***************");
        System.out.println("Email sent to : " + to);
        System.out.println("Email body : " + body);
        System.out.println("***************");
    }
}
