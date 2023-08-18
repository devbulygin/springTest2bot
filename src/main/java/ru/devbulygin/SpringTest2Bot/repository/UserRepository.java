package ru.devbulygin.SpringTest2Bot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.devbulygin.SpringTest2Bot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}