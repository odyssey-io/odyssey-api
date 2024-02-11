package io.odyssey.user.user;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

  private final UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping
  public User create(@RequestBody @Valid User registration) {
    return userRepository.create(registration);
  }

  @GetMapping()
  public List<User> get() {
    return userRepository.get();
  }

  @GetMapping(path = "/{id}")
  public User get(@PathVariable("id") Integer id) {
    return userRepository.get(id);
  }

  @DeleteMapping(path = "/{id}")
  public void delete(@PathVariable("id") Integer id) {
    userRepository.delete(id);
  }
}
