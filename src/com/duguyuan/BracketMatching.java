package com.duguyuan;

import java.util.Scanner;

public class BracketMatching {

    public static void bracketMatching(String text) {
        boolean isContain = false;
        int leftBracket = 0;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                if (!isContain) {
                    isContain = true;
                }
                leftBracket++;
            }else if (chars[i] == ')') {
                if (!isContain) {
                    isContain = true;
                }
                leftBracket--;
                if (leftBracket < 0) {
                    break;
                }
            }
        }
        if (isContain) {
            if (leftBracket == 0) {
                System.out.println("您输入的内容，括号完全配对");
            }else {
                System.out.println("您输入的内容，括号不配对");
            }
        }else {
            System.out.println("您输入的内容没有括号");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        bracketMatching(input);
    }

}
