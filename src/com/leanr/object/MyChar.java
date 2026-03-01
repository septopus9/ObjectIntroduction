package com.leanr.object;

public class MyChar {

    private char aChar ;

    public MyChar(char aChar) {
        this.aChar = aChar;
    }

    private boolean isAlphabet(){
        if ((this.aChar > 97 && this.aChar < 122 )||(this.aChar > 65 && this.aChar < 90 )){
            return true;
        }else return false;
    }
    private void isLowerCaseAlphabet(){
        for (int i= 97 ; i <= 122 ; i++){
            char ch = (char) i;
            System.out.print(ch+" ");
        }
    }
    private void isHigherCaseAlphabet(){
        for (int i= 65 ; i <= 90 ; i++){
            char ch = (char) i;
            System.out.print(ch+" ");
        }
    }

    private boolean isVowel(){
        if (this.aChar == 'a'||this.aChar == 'A'||
                this.aChar == 'e'||this.aChar == 'E'||
                this.aChar == 'i'||this.aChar == 'I'||
                this.aChar == 'o'||this.aChar == 'O'||
                this.aChar == 'u'||this.aChar == 'U'){
            return true;
        }else {
            return false;
        }
    }
    private boolean isNumber (){
        if (  aChar >= 48 &&  aChar <=57){
            return true;

        }
        else return false;
    }

    public static void main(String[] args) {
        MyChar myChar = new MyChar('e');

        myChar.isLowerCaseAlphabet();
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isVowel());

    }

}
