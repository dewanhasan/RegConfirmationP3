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
    @PostMapping("/confirmReg")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> SortConfirmationRequests(@RequestBody StudentDetails studentDetails){
        Map<String, String> confirmationMessage = new HashMap<>();
        confirmationMessage.put("Confirmation of registration", "Student firstname: " + studentDetails.getFirstname() +
                ";  Date of Birth: " + studentDetails.getDob() + ";  Status: " + studentDetails.getStatus() +
                ";  Welcome to Atlantic Technological University. Please Enrol Student details to the database. Thank you");
        return confirmationMessage;
    }
}