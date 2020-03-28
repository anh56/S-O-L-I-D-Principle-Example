package D.DI_Fixed;

public class FacebookService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending Facebook text");
    }
}
