package io.odyssey.user.user;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserRepository {

  private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

  private final List<User> users = List.of(
    new User(1, "Jason", "Bourne", "jason.bourne@gmail.com"),
    new User(2, "Ian", "Fleming", "ian.fleming@gmail.com"),
    new User(3, "Bob", "Hope", "ben.hope@gmail.com"));

  public User create(User user) {
    int id = ID_GENERATOR.incrementAndGet();

    var saved = new User(id, user.firstName(), user.lastName(), user.email());
    users.add(id, saved);
    return saved;
  }

  public Optional<User> findById(Integer id) {
    return Optional.ofNullable(users.get(id));
  }

  public List<User> get() {
    return users.stream().toList();
  }

  public User get(Integer id) {

    var opt = findById(id);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      throw new NoSuchElementException("Registration with ticket code " + id + " not found");
    }
  }

  public void delete(Integer id) {
    users.remove(id);
  }
}
