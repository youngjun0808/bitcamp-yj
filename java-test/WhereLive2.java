import java.util.Scanner;
class WhereLive2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Where do you live?");
        String place = "p";
        place = scan.next();
        System.out.println("I live in" + place + ".");
    }
}