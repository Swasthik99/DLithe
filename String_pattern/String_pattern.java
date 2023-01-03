import java.util.*;

public class String_pattern {
    public static void main(String args[]) {
        int len = new java.util.Scanner(System.in).nextInt();
        char s1[] = new char[len];
        for (int i = 0; i < len; i++)
            s1[i] = (char) ('A' + i);
        int count = 1;
        String inter = new String("A");
        for (int i = 1; i <= len; i++) {
            char s2[] = new char[count];
            if (i == len)
                System.out.printf("%-" + len + "." + (i) + "s" + "%s" + "\n", new String(s1), inter);
            else {
                for (int j = 0; j < i; j++)
                    s2[i - j - 1] = (char) ('A' + j);
                inter = new String(s2);
                System.out.printf("%-" + len + "." + i + "s" + " ".repeat(len - i - 1) + "%s" + "\n", new String(s1),
                        inter);
            }
            if (i != len - 1)
                count++;
        }
    }
}

output: 6
A         A
AB       BA
ABC     CBA
ABCD   DCBA
ABCDE EDCBA
ABCDEFEDCBA


