package fr.yr.microserviceemail;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "Email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/email/{emailRecipient}")
    public ResponseEntity<Void> sendEmail(@PathVariable(value = "emailRecipient") String addressEmail) {
        emailService.send(addressEmail,"This is the content of the email sent to your recipient.");
        return ResponseEntity.accepted().build();
    }
}
