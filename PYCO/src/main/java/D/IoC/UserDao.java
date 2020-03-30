package D.IoC;

public interface UserDao {
    void update(User user);
    User findById(int id);
}
