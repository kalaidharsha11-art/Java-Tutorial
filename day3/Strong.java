package day3;


import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (n > 0) {
            int r = n % 10;
            int fact = 1;

            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}