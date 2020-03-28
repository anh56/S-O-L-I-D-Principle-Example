package D.DI_Fixed;

public class Main {
    public static void main(String[] args){
        MessageService emailMessageService = new EmailService();
        MessageService facebookMessageService = new FacebookService();
        EmailUserController emailUserController = new EmailUserController(emailMessageService);
        FacebookUserController facebookUserController = new FacebookUserController(facebookMessageService);

        emailUserController.send();
        facebookUserController.send();
    }
}
