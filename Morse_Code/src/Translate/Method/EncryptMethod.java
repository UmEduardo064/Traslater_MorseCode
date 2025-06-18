package Translate.Method;

import Translate.DataBase.*;

import java.util.ArrayList;

public class EncryptMethod {
    public static class encryptMethod {

        public void encryptmethod(String caracter) {

            StringBuilder sb = new StringBuilder();
            WordToMorse wm = new WordToMorse();
            NumberToMorse nm = new NumberToMorse();
            SymbolsToMorse sm = new SymbolsToMorse();
            SpecialCharacterToMorse scm = new SpecialCharacterToMorse();
            ControlSigns cs = new ControlSigns();

            switch (caracter){
                case " ":
                        sb.append(" / ");
                    break;
                case "sos":
                    sb.append(cs.getSOS());
                    break;
                case "eot":
                    sb.append(cs.getEOT());
                    break;
                case "lf":
                    sb.append(cs.getLF());
                    break;
                case "error":
                    sb.append(cs.getERROR());
                    break;
                case "kn":
                    sb.append(cs.getKN());
                    break;
                    // SpecialCharacter-below
                case "á":
                    sb.append(scm.getA_WithAccent());
                    break;
                case "é":
                    sb.append(scm.getE_WithAccent());
                    break;
                case "ñ":
                    sb.append(scm.getNH_Spanish());
                    break;
                case "ü":
                    sb.append(scm.getU_WithUmlaut());
                    break;
                case "ç":
                    sb.append(scm.getCe_cedilla());
                    break;
                    // Words-below
                case "a":
                        sb.append(wm.getA());
                    break;
                case "b":
                        sb.append(wm.getB());
                    break;
                case "c":
                        sb.append(wm.getC());
                    break;
                case "d":
                        sb.append(wm.getD());
                    break;
                case "e":
                        sb.append(wm.getE());
                    break;
                case "f":
                        sb.append(wm.getF());
                    break;
                case "g":
                        sb.append(wm.getG());
                    break;
                case "h":
                        sb.append(wm.getH());
                    break;
                case "i":
                        sb.append(wm.getI());
                    break;
                case "j":
                        sb.append(wm.getJ());
                    break;
                case "k":
                        sb.append(wm.getK());
                    break;
                case "l":
                        sb.append(wm.getL());
                    break;
                case "m":
                        sb.append(wm.getM());
                    break;
                case "n":
                        sb.append(wm.getN());
                    break;
                case "o":
                        sb.append(wm.getO());
                    break;
                case "p":
                        sb.append(wm.getP());
                    break;
                case "q":
                        sb.append(wm.getQ());
                    break;
                case "r":
                        sb.append(wm.getR());
                    break;
                case "s":
                        sb.append(wm.getS());
                    break;
                case "t":
                        sb.append(wm.getT());
                    break;
                case "u":
                        sb.append(wm.getU());
                    break;

                case "v":
                        sb.append(wm.getV());
                    break;
                case "w":
                        sb.append(wm.getW());
                    break;
                case "x":
                        sb.append(wm.getX());
                    break;
                case "y":
                        sb.append(wm.getY());
                    break;
                case "z":
                        sb.append(wm.getZ());
                    break;
                    //Numbers-Below
                case "0":
                        sb.append(nm.getZero());
                    break;
                case "1":
                        sb.append(nm.getOne());
                    break;
                case "2":
                        sb.append(nm.getTwo());
                    break;
                case "3":
                        sb.append(nm.getThree());
                    break;
                case "4":
                        sb.append(nm.getFour());
                    break;
                case "5":
                        sb.append(nm.getFive());
                    break;
                case "6":
                        sb.append(nm.getSix());
                    break;
                case "7":
                        sb.append(nm.getSeven());
                    break;
                case "8":
                        sb.append(nm.getEight());
                    break;
                case "9":
                    //Symbols-Below
                        sb.append(nm.getNine());
                    break;
                case ".":
                        sb.append(sm.getPeriod());
                    break;
                case ",":
                        sb.append(sm.getComma());
                    break;
                case "?":
                        sb.append(sm.getQuestionMark());
                    break;
                case "'":
                    sb.append(sm.getApostrophe());
                    break;
                case "!":
                    sb.append(sm.getExclamation());
                    break;
                case "/":
                    sb.append(sm.getSlash());
                    break;
                case "(":
                    sb.append(sm.getLeftParenthesis());
                    break;
                case ")":
                    sb.append(sm.getRightParenthesis());
                    break;
                case "&":
                    sb.append(sm.getAmpersand());
                    break;
                case ":":
                    sb.append(sm.getColon());
                    break;
                case ";":
                    sb.append(sm.getSemicolon());
                    break;
                case "=":
                    sb.append(sm.getEquals());
                    break;
                case "+":
                    sb.append(sm.getPlus());
                    break;
                case "-":
                    sb.append(sm.getHyphen());
                    break;
                case "_":
                    sb.append(sm.getUnderscore());
                    break;
                case "@":
                    sb.append(sm.getAtSign());
                    break;
                case "$":
                    sb.append(sm.getDollar());
                    break;
            }
            System.out.print(sb.toString());
        }
    }
}