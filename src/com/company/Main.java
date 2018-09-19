package com.company;

public class Main {

    public static void main(String[] args) {
        String input="abcdefg";
        System.out.println("input="+input);
        System.out.println("oddCharacters="+odd(input));
        System.out.println("evenCharacters="+even(input));
        System.out.println("evenFirstOddSecond="+evenOdd(input));
    }
    public static String odd(String str){
        int c=1;
        String out="";
        while(c<str.length()){
            if (c % 2 == 1) {
                out=out+str.substring(c,c+1);
            }
            c++;
        }
        return out;
    }
    public static String even(String str){
        int c=0;
        String out="";
        while(c<str.length()){
            if (c % 2 == 0) {
                out=out+str.substring(c,c+1);
            }
            c++;
        }
        return out;
    }
    public static String evenOdd(String str){
        return even(str)+odd(str);
    }
}
