package pl.dudekonline.magazyndomowy.services.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dudekonline.magazyndomowy.exceptions.NotFoundExceptions;
import pl.dudekonline.magazyndomowy.models.User;
import pl.dudekonline.magazyndomowy.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserDatabaseServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void removeUserById(Integer userId) {
        if(userRepository.existsById(userId)){
            userRepository.deleteById(userId);
        }else{
            throw new NotFoundExceptions();
        }
    }

    @Override
    public User addUser(User newUser) {
        newUser.setId(null);
        return userRepository.save(newUser);
    }

    @Override
    public User editUser(Integer id, User editedUser) {
       editedUser.setId(id);
        return userRepository.save(editedUser);
    }

    @Override
    public boolean existByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
