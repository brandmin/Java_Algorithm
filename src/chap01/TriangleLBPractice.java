package chap01;

import java.util.Scanner;

public class TriangleLBPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? ");
            n = sc.nextInt();
        } while (n <= 0);
        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        triangleRB(n);
    }
    public static void triangleLB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangleLU(int n) {
        for(int i=5; i>0; i--) {
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = i; k < n; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void triangleRB(int n) {
        for(int i = 5; i > 0; i--) {
            for(int j = 1; j < i; j++)
                System.out.print(" ");
            for(int k = i; k <= n; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
