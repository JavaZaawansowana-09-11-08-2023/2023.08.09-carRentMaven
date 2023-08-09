package pl.comarch.szkolenia.car.rent;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Authenticator implements IAuthenticator {

    @Autowired
    IUserRepository userRepository;
    @Override
    public boolean authenticate(String login, String password) {
        Optional<User> userBox = userRepository.getUserByLogin(login);
        if(userBox.isPresent() &&
                userBox.get().getPassword().equals(DigestUtils.md5Hex(password))) {
            return true;
        }
        return false;
    }
}
