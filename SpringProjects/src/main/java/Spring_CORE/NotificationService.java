package Spring_CORE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

//1. Property Based DI
    @Autowired
    @Qualifier("gmailServ")
    private EmailService emailService;

//2. Constructor Based DI
/*
    public NotificationService(EmailService emailService)
    {
        this.emailService = emailService;
    }
*/

    public void notif(String to, String body){
        emailService.sendNotification(to,body);
    }

//3. Setter Based DI
/*
    public void setEmailService(EmailService emailService){
        this.emailService = emailService;
    }
*/

}
