package pl.dudekonline.magazyndomowy.services.users;

import pl.dudekonline.magazyndomowy.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    Optional<User>findUserById(Integer userId);

    void removeUserById(Integer userId);

    User addUser(User newUser);

    User editUser(Integer id, User editedUser);

    boolean existByEmail(String email);
}
