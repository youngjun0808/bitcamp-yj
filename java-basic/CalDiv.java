import java.util.Scanner;
class CalDiv{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("나누고 싶은 숫자를 2개 입력해주세요");
        int a = 0;
        int b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(a / b);
    }
}