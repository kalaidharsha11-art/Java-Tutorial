package day2;

public class greatest {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a > b && a > c)
            System.out.println(a + " is greatest");
        else if (b > c)
            System.out.println(b + " is greatest");
        else
            System.out.println(c + " is greatest");
    }
}

