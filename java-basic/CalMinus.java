import java.util.Scanner;
class CalMinus{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to exclude");
        int a = 0;
        int b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a - b);
    }
}