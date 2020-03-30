package D.DI_Violation;

public class EmailUserController {
    EmailService service;

    // here we see an violation of DI, since this Controller will depend on the EmailService to first be created
    public EmailUserController(){
        service = new EmailService();
    }
    public void send(){
        service.sendMessage();
    }
}
