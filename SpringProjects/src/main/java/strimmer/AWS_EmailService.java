package strimmer;

import org.springframework.stereotype.Component;

@Component
public class AWS_EmailService implements EmailService{

    public void emailServie() {
        System.out.println("Inside AWS Email Service");
    }
}
