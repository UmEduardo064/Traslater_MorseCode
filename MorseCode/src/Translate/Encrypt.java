package Translate;

import Translate.Method.EncryptMethod;

public class Encrypt {

    public void encrypt(String phrase) {

        EncryptMethod.encrytpMethod encryptMet = new EncryptMethod.encrytpMethod();

        phrase = phrase.toLowerCase();

        String phrasef = phrase.replaceAll("\\s", "");

        for (int i = 0; i < phrasef.length() ; i++) {
            char caracter = phrasef.charAt(i);

            encryptMet.encrytpmethod(caracter);
        }

        System.out.println(encryptMet.code);
    }
}

