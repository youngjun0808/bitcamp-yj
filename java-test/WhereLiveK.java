import java.util.Scanner;
class WhereLiveK{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("어디에 사시나요?");
        String place = "";
        place = scan.next();
        System.out.println("나는" + place + "에 삽니다.");
        
    }
}