package day1;

public class ddd {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a > b && a > c) {
            System.out.println("A is the largest");
        } else if (b > a && b > c) {
            System.out.println("B is the largest");
        } else {
            System.out.println("C is the largest");
        }
    }
}