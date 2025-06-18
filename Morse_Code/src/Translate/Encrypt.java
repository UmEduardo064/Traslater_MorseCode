package Translate;

import Translate.Method.EncryptMethod;

public class Encrypt {

    public void encrypt(String phrase) {

        EncryptMethod.encryptMethod encryptMet = new EncryptMethod.encryptMethod();

        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length() ; i++) {
            char characterChar = phrase.charAt(i);

            if(phrase.equals("sos")){
                encryptMet.encryptmethod(phrase);
                return;
            }
            if(phrase.equals("eot")){
                encryptMet.encryptmethod(phrase);
                return;
            }
            if(phrase.equals("lf")){
                encryptMet.encryptmethod(phrase);
                return;
            }
            if(phrase.equals("error")){
                encryptMet.encryptmethod(phrase);
                return;
            }
            if(phrase.equals("kn")){
                encryptMet.encryptmethod(phrase);
                return;
            }

            String character = String.valueOf(characterChar);

            encryptMet.encryptmethod(character);
        }

        /*System.out.println(encryptMet);*/
    }
}