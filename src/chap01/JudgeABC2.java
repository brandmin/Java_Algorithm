package chap01;

import java.util.Scanner;

public class JudgeABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해주세요.: ");
        int n = sc.nextInt();

        if(n == 1)
            System.out.println("A");
        else if(n == 2)
            System.out.println("B");
        else if(n == 3)
            System.out.println("C");
        else
            ; // 생략
    }
}
