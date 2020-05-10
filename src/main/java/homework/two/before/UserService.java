package homework.two.before;

import java.util.Date;

public class UserService{

    private UserDbContext userDbContext = new UserDbContext();

    public void run()
    {
        UserService userService = new UserService();

        User user = userService.getUser("username",
                "password", true);

        User anotherUser = userService.getUser("username",
                null, false);
    }


    public User getUser(String username, String password, boolean login)
    {
        if (login)
        {
            // Check if there is a user with the given username and password in db
            // If yes, set the last login date and then return the user.
            User user = userDbContext.findUser(username,password);
            if (user != null)
                user.lastLogin = new Date();
            return user;
        }
        else
        {
            // Check if there is a user with the given username
            // If yes, return it, otherwise return null
            User user = userDbContext.findUser(username);
            return user;
        }
    }
}
