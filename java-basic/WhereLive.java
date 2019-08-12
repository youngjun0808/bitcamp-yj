import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("Where do you live?");
        String place = "place";
        Scanner scan = new Scanner(System.in);
        place = scan.next();

        System.out.println(String.format("I live in %s.", place));
    }
}