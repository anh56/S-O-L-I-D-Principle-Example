package I;

public class UserDTO implements IDataTransferObject {
    // we have a userDataTransferObject that implement such methods
    @Override
    public Object getObjectByID() {
        return null;
    }

    @Override
    public Object getObjectByName() {
        return null;
    }


    // if the class User did not have the SecretCode property, then this method is unnecessary
    @Override
    public Object getObjectBySecretCode() {
        return null;
    }
    // this is a violation of Interface Integration principle
}
