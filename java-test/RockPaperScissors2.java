import java.util.Scanner;
import java.util.Random;
class RockPaperScissors2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("가위바위보 한판 승부! 1.가위 2.바위 3.보 ");
        Random ran = new Random();
        int com = 0;
        com = ran.nextInt(3)+1;

        System.out.println(com);
        if(com == 1){
            System.out.println("1.가위");
        }else if(com == 2){
            System.out.println("2.바위");
        }else {
            System.out.println("3.보");
        }

        int p = 0;
        p = scan.nextInt();
        if(com == p){
            System.out.print(com);
            System.out.println("비겼습니다.");
        }else if(com < 3){
            if(com < p){
                System.out.println("YOU WIN");
            }else {
                System.out.println("You Lose");
            }
        }else {
            p = p + 2;
            if(com < p){
                System.out.println("You Lose");
            }else {
                System.out.println("You Win");
            }
        }
    }
}
