package L;

import java.util.List;

public interface IRepository {
    public List<User> getAllUser();
    public List<User> getUserByConditions();
}
