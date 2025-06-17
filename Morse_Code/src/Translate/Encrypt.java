package Translate;

import Translate.Method.EncryptMethod;

public class Encrypt {

    public void encrypt(String phrase) {

        EncryptMethod.encryptMethod encryptMet = new EncryptMethod.encryptMethod();

        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length() ; i++) {
            char caracter = phrase.charAt(i);

            encryptMet.encryptmethod(caracter);
        }

        /*System.out.println(encryptMet);*/
    }
}