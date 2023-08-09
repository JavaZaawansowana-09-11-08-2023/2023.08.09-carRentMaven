package pl.comarch.szkolenia.car.rent;

import java.util.Optional;

public interface IUserRepository {
    Optional<User> getUserByLogin(String login);
}
