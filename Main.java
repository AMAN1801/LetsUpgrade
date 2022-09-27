import java.util.Scanner;

class Main{    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 += num2;
        num2 = num1-num2;
        num1 -= num2;

        System.out.println("First number is " + num1);
        System.out.println("Second number is " + num2);

        return;
    }
}