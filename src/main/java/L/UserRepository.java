package L;

import java.util.List;

public abstract class UserRepository {
    public abstract List<User> getAllUser();
    public abstract List<User> getUserByCondition();
}
