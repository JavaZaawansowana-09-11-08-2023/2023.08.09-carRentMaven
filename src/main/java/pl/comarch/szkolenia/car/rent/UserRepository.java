package pl.comarch.szkolenia.car.rent;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository implements IUserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        this.users.add(new User("janusz", "087d9c5e13bdd64a82bef8e013625c32"));
        this.users.add(new User("admin", "21232f297a57a5a743894a0e4a801fc3"));
    }

    @Override
    public Optional<User> getUserByLogin(final String login) {
        return this.users.stream().filter(u -> u.getLogin().equals(login)).findFirst();
    }
}
