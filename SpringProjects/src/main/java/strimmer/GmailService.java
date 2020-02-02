package strimmer;

import org.springframework.stereotype.Component;

@Component
public class GmailService implements EmailService {

    public void emailServie() {
        System.out.println("THis is Gmail Service");
    }
}
