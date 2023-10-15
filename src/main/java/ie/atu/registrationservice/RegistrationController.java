package ie.atu.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private NotificationServiceClient notificationSC;

    @Autowired
    public RegistrationController(NotificationServiceClient notificationSC){
        this.notificationSC=notificationSC;
    }

    @PostMapping("/confirm")
    public String confirmUser(@RequestBody UserDetails userDetails){
       // String confirmation = "User registered " + userDetails.getName() +  " " + userDetails.getEmail();
        String confirmation = notificationSC.notifyDetails(userDetails);
        return confirmation;
    }
}
