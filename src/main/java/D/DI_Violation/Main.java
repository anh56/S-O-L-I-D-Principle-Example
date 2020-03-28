package D.DI_Violation;

public class Main {
    public static void main(String[] args){
        EmailUserController emailUserController = new EmailUserController();
        emailUserController.send();

        FacebookUserController facebookUserController = new FacebookUserController();
        facebookUserController.send();
    }
}
