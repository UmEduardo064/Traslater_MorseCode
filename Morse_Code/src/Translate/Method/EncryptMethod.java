package Translate.Method;

import Translate.DataBase.WordToMorse;
import Translate.DataBase.NumberToMorse;
import Translate.DataBase.SymbolsToMorse;
import java.util.ArrayList;

public class EncryptMethod {
    public static class encrytpMethod {

        public ArrayList<String> code;

        public encrytpMethod(){
            this.code = new ArrayList<>();

        }

        public void encrytpmethod(char caracter) {

            WordToMorse wm = new WordToMorse();
            NumberToMorse nm = new NumberToMorse();
            SymbolsToMorse sm = new SymbolsToMorse();

            switch (caracter) {
                case 'a':
                    code.add(wm.getA());
                    break;
                case 'b':
                    code.add(wm.getB());
                    break;
                case 'c':
                    code.add(wm.getC());
                    break;
                case 'd':
                    code.add(wm.getD());
                    break;
                case 'e':
                    code.add(wm.getE());
                    break;
                case 'f':
                    code.add(wm.getF());
                    break;
                case 'g':
                    code.add(wm.getG());
                    break;
                case 'h':
                    code.add(wm.getH());
                    break;
                case 'i':
                    code.add(wm.getI());
                    break;
                case 'j':
                    code.add(wm.getJ());
                    break;
                case 'k':
                    code.add(wm.getK());
                    break;
                case 'l':
                    code.add(wm.getL());
                    break;
                case 'm':
                    code.add(wm.getM());
                    break;
                case 'n':
                    code.add(wm.getN());
                    break;
                case 'o':
                    code.add(wm.getO());
                    break;
                case 'p':
                    code.add(wm.getP());
                    break;
                case 'q':
                    code.add(wm.getQ());
                    break;
                case 'r':
                    code.add(wm.getR());
                    break;
                case 's':
                    code.add(wm.getS());
                    break;
                case 't':
                    code.add(wm.getT());
                    break;
                case 'u':
                    code.add(wm.getU());
                    break;
                case 'v':
                    code.add(wm.getV());
                    break;
                case 'w':
                    code.add(wm.getW());
                    break;
                case 'x':
                    code.add(wm.getX());
                    break;
                case 'y':
                    code.add(wm.getY());
                    break;
                case 'z':
                    code.add(wm.getZ());
                    break;
                case '0':
                    code.add(nm.getZero());
                    break;
                case '1':
                    code.add(nm.getOne());
                    break;
                case '2':
                    code.add(nm.getTwo());
                    break;
                case '3':
                    code.add(nm.getThree());
                    break;
                case '4':
                    code.add(nm.getFour());
                    break;
                case '5':
                    code.add(nm.getFive());
                    break;
                case '6':
                    code.add(nm.getSix());
                    break;
                case '7':
                    code.add(nm.getSeven());
                    break;
                case '8':
                    code.add(nm.getEight());
                    break;
                case '9':
                    code.add(nm.getNine());
                    break;
                case '.':
                    code.add(sm.getPeriod());
                    break;
                case ',':
                    code.add(sm.getComma());
                    break;
                case '?':
                    code.add(sm.getQuestionMark());
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}