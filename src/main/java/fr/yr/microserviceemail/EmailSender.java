package fr.yr.microserviceemail;

public interface EmailSender {
    void send(String to, String email);
}
