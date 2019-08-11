/**
 * 값을 입력받아서 출력하는 예제 comment (주석)
 */
import java.util.Scanner;
class WhatName{
    public static void main(String[] args){
        System.out.println("이름 뭐니?");
        String name = "자바맨";
        //값을 입력하는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        
        System.out.println("이름은 " + name + "이다");
        System.out.print("몇살이에요?");
        int age = 0;
        age = scanner.nextInt();
        System.out.print("나이는 "+ age +" 이다.");
    }
}