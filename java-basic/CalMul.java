import java.util.Scanner;
class CalMul{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("곱하고 싶은 숫자, 2개를 입력해주세요.");
        int a = 0;
        int b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a * b);
    }
}