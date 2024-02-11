package io.odyssey.user.user;

import jakarta.validation.constraints.NotNull;

public record User(
  Integer id,
  @NotNull(message = "firstName is required") String firstName,
  @NotNull(message = "lastName is required") String lastName,
  @NotNull(message = "email is required") String email) {
}
