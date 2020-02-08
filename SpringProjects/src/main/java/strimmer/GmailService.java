package strimmer;

import org.springframework.stereotype.Component;

@Component
public class GmailService implements EmailService {

    @Override
    public void emailService() {
        System.out.println("Inside Gmail Service");
    }
}
