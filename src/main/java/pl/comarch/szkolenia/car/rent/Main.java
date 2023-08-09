package pl.comarch.szkolenia.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String s = "janusz";
        String hash = DigestUtils.md5Hex(s);
        System.out.println(hash);
    }
}
