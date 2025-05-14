package GDGoC_study.hello_spring.controller;

import GDGoC_study.hello_spring.model.User;
import GDGoC_study.hello_spring.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.createUser(user.getEmail(), user.getNickname(), user.getPassword());
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.updateUser(id, user.getNickname(), user.getPassword());
    }
}
