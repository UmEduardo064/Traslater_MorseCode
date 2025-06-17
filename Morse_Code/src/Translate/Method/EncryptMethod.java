package Translate.Method;

import Translate.DataBase.WordToMorse;
import Translate.DataBase.NumberToMorse;
import Translate.DataBase.SymbolsToMorse;

import java.util.ArrayList;

public class EncryptMethod {
    public static class encryptMethod {

        public ArrayList<String> code;

        public encryptMethod(){
            this.code = new ArrayList<>();

        }

        public void encryptmethod(char caracter) {

            StringBuilder sb = new StringBuilder();
            WordToMorse wm = new WordToMorse();
            NumberToMorse nm = new NumberToMorse();
            SymbolsToMorse sm = new SymbolsToMorse();

            switch (caracter){
                case ' ':
                    if (sb.isEmpty()) {
                        sb.append(" / ");
                    } else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, " / ");
                    }

                    code.add(sb.toString());
                    break;

                case 'a':
                    if (sb.isEmpty()) {
                        sb.append(wm.getA());
                    }else {
                    int position = 0;
                    while (position < sb.length()){
                        position++;
                    }

                    sb.insert(position, wm.getA());
                    }

                    code.add(sb.toString());
                    break;

                case 'b':
                    if (sb.isEmpty()) {
                        sb.append(wm.getB());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getB());
                    }

                    code.add(sb.toString());
                    break;

                case 'c':
                    if (sb.isEmpty()) {
                        sb.append(wm.getC());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getC());
                    }

                    code.add(sb.toString());
                    break;

                case 'd':
                    if (sb.isEmpty()) {
                        sb.append(wm.getD());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getD());
                    }

                    code.add(sb.toString());
                    break;

                case 'e':
                    if (sb.isEmpty()) {
                        sb.append(wm.getE());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getE());
                    }

                    code.add(sb.toString());
                    break;

                case 'f':
                    if (sb.isEmpty()) {
                        sb.append(wm.getF());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getF());
                    }

                    code.add(sb.toString());
                    break;

                case 'g':
                    if (sb.isEmpty()) {
                        sb.append(wm.getG());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getG());
                    }

                    code.add(sb.toString());
                    break;

                case 'h':
                    if (sb.isEmpty()) {
                        sb.append(wm.getH());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getH());
                    }

                    code.add(sb.toString());
                    break;

                case 'i':
                    if (sb.isEmpty()) {
                        sb.append(wm.getI());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getI());
                    }

                    code.add(sb.toString());
                    break;

                case 'j':
                    if (sb.isEmpty()) {
                        sb.append(wm.getJ());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getJ());
                    }

                    code.add(sb.toString());
                    break;

                case 'k':
                    if (sb.isEmpty()) {
                        sb.append(wm.getK());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getK());
                    }

                    code.add(sb.toString());
                    break;

                case 'l':
                    if (sb.isEmpty()) {
                        sb.append(wm.getL());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getL());
                    }

                    code.add(sb.toString());
                    break;

                case 'm':
                    if (sb.isEmpty()) {
                        sb.append(wm.getM());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getM());
                    }

                    code.add(sb.toString());
                    break;

                case 'n':
                    if (sb.isEmpty()) {
                        sb.append(wm.getN());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getN());
                    }

                    code.add(sb.toString());
                    break;

                case 'o':
                    if (sb.isEmpty()) {
                        sb.append(wm.getO());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getO());
                    }

                    code.add(sb.toString());
                    break;

                case 'p':
                    if (sb.isEmpty()) {
                        sb.append(wm.getP());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getP());
                    }

                    code.add(sb.toString());
                    break;

                case 'q':
                    if (sb.isEmpty()) {
                        sb.append(wm.getQ());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getQ());
                    }

                    code.add(sb.toString());
                    break;

                case 'r':
                    if (sb.isEmpty()) {
                        sb.append(wm.getR());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getR());
                    }

                    code.add(sb.toString());
                    break;
                case 's':
                    if (sb.isEmpty()) {
                        sb.append(wm.getS());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getS());
                    }

                    code.add(sb.toString());
                    break;

                case 't':
                    if (sb.isEmpty()) {
                        sb.append(wm.getT());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getT());
                    }

                    code.add(sb.toString());
                    break;

                case 'u':
                    if (sb.isEmpty()) {
                        sb.append(wm.getU());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getU());
                    }

                    code.add(sb.toString());
                    break;

                case 'v':
                    if (sb.isEmpty()) {
                        sb.append(wm.getV());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getV());
                    }

                    code.add(sb.toString());
                    break;

                case 'w':
                    if (sb.isEmpty()) {
                        sb.append(wm.getW());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getW());
                    }

                    code.add(sb.toString());
                    break;

                case 'x':
                    if (sb.isEmpty()) {
                        sb.append(wm.getX());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getX());
                    }

                    code.add(sb.toString());
                    break;

                case 'y':
                    if (sb.isEmpty()) {
                        sb.append(wm.getY());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getY());
                    }

                    code.add(sb.toString());
                    break;

                case 'z':
                    if (sb.isEmpty()) {
                        sb.append(wm.getZ());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, wm.getZ());
                    }

                    code.add(sb.toString());
                    break;

                case '0':
                    if (sb.isEmpty()) {
                        sb.append(nm.getZero());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getZero());
                    }

                    code.add(sb.toString());
                    break;

                case '1':
                    if (sb.isEmpty()) {
                        sb.append(nm.getOne());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getOne());
                    }

                    code.add(sb.toString());
                    break;

                case '2':
                    if (sb.isEmpty()) {
                        sb.append(nm.getTwo());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getTwo());
                    }

                    code.add(sb.toString());
                    break;

                case '3':
                    if (sb.isEmpty()) {
                        sb.append(nm.getThree());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getThree());
                    }

                    code.add(sb.toString());
                    break;

                case '4':
                    if (sb.isEmpty()) {
                        sb.append(nm.getFour());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getFour());
                    }

                    code.add(sb.toString());
                    break;

                case '5':
                    if (sb.isEmpty()) {
                        sb.append(nm.getFive());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getFive());
                    }

                    code.add(sb.toString());
                    break;

                case '6':
                    if (sb.isEmpty()) {
                        sb.append(nm.getSix());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getSix());
                    }

                    code.add(sb.toString());
                    break;

                case '7':
                    if (sb.isEmpty()) {
                        sb.append(nm.getSeven());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getSeven());
                    }

                    code.add(sb.toString());
                    break;

                case '8':
                    if (sb.isEmpty()) {
                        sb.append(nm.getEight());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getEight());
                    }

                    code.add(sb.toString());
                    break;

                case '9':
                    if (sb.isEmpty()) {
                        sb.append(nm.getNine());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, nm.getNine());
                    }

                    code.add(sb.toString());
                    break;

                case '.':
                    if (sb.isEmpty()) {
                        sb.append(sm.getPeriod());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, sm.getPeriod());
                    }

                    code.add(sb.toString());
                    break;

                case ',':
                    if (sb.isEmpty()) {
                        sb.append(sm.getComma());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, sm.getComma());
                    }

                    code.add(sb.toString());
                    break;

                case '?':
                    if (sb.isEmpty()) {
                        sb.append(sm.getQuestionMark());
                    }else {
                        int position = 0;
                        while (position < sb.length()){
                            position++;
                        }

                        sb.insert(position, sm.getQuestionMark());
                    }

                    code.add(sb.toString());
                    break;
            }
        }
    }
}