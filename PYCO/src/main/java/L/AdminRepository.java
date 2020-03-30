package L;
import java.util.List;

/* this AdminRepository inherits from UserRepository is a violation of Liskov Substitution Principle,
   since its functions will not be able to replace the UserRepository functions
   To fix this, we provide an interface, and let AdminRepository implements it
   This makes UserRepository no longer needed

public class AdminRepository extends UserRepository {

    @Override
    public List<User> getAllUser() {
        return null;
    }
    @Override
    public List<User> getUserByCondition() {
        return null;
    }
}
*/


public class AdminRepository implements IRepository {

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public List<User> getUserByConditions() {
        return null;
    }
}
