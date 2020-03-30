package D.DI_Fixed;

public class EmailService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending email");
    }
}
