package chap01;

public class MaxPractice {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        return max;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;
        return min;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("max4(4, 3, 2, 1) = " + max4(4, 3, 2, 1));
        System.out.println("max4(4, 3, 3, 3) = " + max4(4, 3, 3, 3));
        System.out.println("max4(4, 4, 3, 2) = " + max4(4, 4, 3, 2));
        System.out.println("min4(1, 2, 3, 4) = " + min4(1, 2, 3, 4));
        System.out.println("min4(1, 1, 2, 3) = " + min4(1, 1, 2, 3));
        System.out.println("min4(1, 2, 2, 2) = " + min4(1, 2, 2, 2));
        System.out.println("min3(1, 2, 3) = " + min3(1, 2, 3));

    }
}
