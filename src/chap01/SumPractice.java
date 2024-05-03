package chap01;

import java.util.Scanner;

public class SumPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("a와 b값을 입력해주세요.");
        do {
            System.out.print("a값: ");
            a = sc.nextInt();
            System.out.print("b값: ");
            b = sc.nextInt();

            if(a >= b) {
                System.out.println("a보다 큰 값을 입력하세요!");
                System.out.print("b값: ");
                b = sc.nextInt();
            }
        } while(a >= b);

        System.out.println("b-a는 " + (b-a) + "입니다.");


    }
}
