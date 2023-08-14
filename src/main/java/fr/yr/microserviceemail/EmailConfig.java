package fr.yr.microserviceemail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {

    //If you're using MailDev for testing, use this setup
    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("localhost"); // Address of server MailDev
        mailSender.setPort(1025); // Port SMTP of MailDev
        return mailSender;
    }


      //If you're using Gmail for testing, use this setup

//    @Bean
//    public JavaMailSender javaMailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com"); // Server SMTP of Gmail
//        mailSender.setPort(587); // Port SMTP of Gmail
//        mailSender.setUsername("your-address-email@gmail.com"); // Your address Gmail
//        mailSender.setPassword("your-password"); // Password address Gmail
//
//        // Additional configuration to enable SSL and TLS support
//        java.util.Properties properties = new java.util.Properties();
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//
//        mailSender.setJavaMailProperties(properties);
//
//        return mailSender;
//    }
//}

}