package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;

/**
 * @author Elroy Kanye
 */
public class R1Elroy {
    private final Scanner scanner = new Scanner(System.in);
    public int add(int a, int b) {
        return a + b;
    }

    public void r1InputAllBaseTypes() {
        System.out.println("Enter byte");
        byte byteVal = scanner.nextByte();

        System.out.println("Enter int");
        int intVal = scanner.nextInt();

        System.out.println("Enter long");
        long longVal = scanner.nextLong();

        System.out.println("Enter double");
        double doubleVal = scanner.nextDouble();

        System.out.println("Enter char");
        char charVal = scanner.nextLine().toCharArray()[0];
    }

    public boolean r3IsMultiple(long n, long m) {
        if (m == 0) return false;
        return n % m == 0;
    }

    public boolean r4IsEven(int i) {
        boolean flag = false;
        for(int a = 0; a <= i; a++) {
            flag = !flag;
        }
        return flag;
    }

    public int r5SumUptoN(int n) {
        var s = 0;
        for (int i = 0; i <= n; i++) s += i;
        return s;
    }

    public int r6SumOddUptoN(int n) {
        var s = 0;
        for (int i = 0; i <= n; i++) if(i % 2 == 1) s += i;
        return s;
    }

    public int r7SumSquaresUptoN(int n) {
        var s = 0;
        for (int i = 0; i <= n; i++) s += i * i;
        return s;
    }

    public int r8CountVowels(String arg) {
        var vowelCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char c: arg.toCharArray()) {
            for(char v: vowels) {
                vowelCount = c == v ? vowelCount + 1 : vowelCount;
            }
        }

        return vowelCount;
    }

    public String r9RemovePunctuation(String input) {
        var inputSb = new StringBuilder(input);
        for(int i = 0; i <= inputSb.length(); i++) {
            char curr = inputSb.charAt(i);
            if(curr == ',' || curr == '.' || curr == ';' || curr == ':' || curr == '\'' || curr == '!' || curr == '"'
                    || curr == '$' || curr == '&' || curr == '/' || curr == '(' || curr == ')' || curr == '='
                    || curr == '?' || curr == '`' || curr == '´' || curr == '}' || curr == '{' || curr == '['
                    || curr == ']' || curr == '+' || curr == '*' || curr == '~' ||  curr == '#' || curr == '-'
                    || curr == '_' || curr == '@' || curr == '|' ) {
                inputSb.deleteCharAt(i);
            }
        }
        return inputSb.toString();
    }

}
