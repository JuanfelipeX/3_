package Semillero;

import java.util.Scanner;

public class Cesar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { //se usa para mandar varios casos de entrada

            String text = sc.nextLine();

            System.out.println(encrypt(text, 3));

        }

    }

    private static StringBuilder encrypt(String text, int shift) {

        StringBuilder result = new StringBuilder();

        for (char i : text.toCharArray()) {

            if (i != ' ') {

                char ch = (char) (((int) i + shift - 65) % 26 + 65);
                result.append(ch);

            } else {
                result.append(" ");
            }
        }
        return result;
    }
}

