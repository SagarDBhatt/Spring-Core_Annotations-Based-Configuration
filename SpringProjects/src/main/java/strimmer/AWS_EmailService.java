package strimmer;

import org.springframework.stereotype.Component;

@Component
public class AWS_EmailService implements EmailService{

    @Override
    public void emailService() {
        System.out.println("Inside AWS Email Service");
    }
}
