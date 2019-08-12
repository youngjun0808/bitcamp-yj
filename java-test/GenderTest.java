import java.util.Scanner;
class GenderTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호를 입력해주세요.");
        String ssn = "";
        ssn = scan.next();
        String num = ssn.substring(7,8);
        System.out.println(num);
    }
}