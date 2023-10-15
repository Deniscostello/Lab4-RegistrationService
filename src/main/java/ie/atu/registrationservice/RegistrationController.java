package ie.atu.registrationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @PostMapping("/confirm")
    public String confirmUser(@RequestBody UserDetails userDetails){
        String confirmation = "User registered " + userDetails.getName() +  " " + userDetails.getEmail();
        return confirmation;
    }
}
