package homework.two.after;

import java.util.Date;

public class UserService {

    private UserDbContext userDbContext = new UserDbContext();

    public void run() {
        UserService userService = new UserService();

        User user = userService.getUserFromDbContext("username",
                "password", true);

        User anotherUser = userService.getUserFromDbContext("username",
                null, false);
    }

    public User getUserFromDbContext(String username, String password, boolean login) {
        if (login) {
            User user = userDbContext.findUser(username, password);
            setLastLogin(user);
            return user;
        } else {
            return userDbContext.findUser(username);
        }
    }

    public void setLastLogin(User user) {
        if (user != null)
            user.setLastLogin(new Date());
    }
}
