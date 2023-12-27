package ie.atu.regconfirmation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegConfirmationController {
    @PostMapping("/confirmation")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> SortConfirmationRequests(@RequestBody StudentDetails studentDetails){
        Map<String, String> confirmationMessage = new HashMap<>();
        confirmationMessage.put("Confirmation of registration", "Student name: " + studentDetails.getName() + ", Email: " + studentDetails.getEmail() +
                ", Date of Birth: " + studentDetails.getDob() + ", Course: " + studentDetails.getCourse());
        return confirmationMessage;
    }
}