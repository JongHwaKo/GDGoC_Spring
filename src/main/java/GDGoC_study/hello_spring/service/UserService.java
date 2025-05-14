package GDGoC_study.hello_spring.service;

import GDGoC_study.hello_spring.model.User;
import GDGoC_study.hello_spring.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    //회원가입
    public User createUser(String email, String nickname, String password) {
        User user = new User(null, email, nickname, password);
        return repository.save(user);
    }

    //수정
    public User updateUser(Long id, String nickname, String password) {
        Optional<User> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()) {
            throw new IllegalArgumentException("해당 사용자가 존재하지 않습니다.");
        }

        User user = optionalUser.get();
        user.setNickname(nickname);
        user.setPassword(password);
        return repository.save(user);
    }
}