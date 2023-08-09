package pl.comarch.szkolenia.car.rent;

public interface IAuthenticator {
    boolean authenticate(String login, String password);
}
