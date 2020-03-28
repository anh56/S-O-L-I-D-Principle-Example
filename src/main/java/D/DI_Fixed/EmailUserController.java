package D.DI_Fixed;

public class EmailUserController {
    MessageService messageService;
    public EmailUserController(MessageService messageService){
        this.messageService = messageService;
    }
    public void send(){
        messageService.sendMessage();
    }
}
