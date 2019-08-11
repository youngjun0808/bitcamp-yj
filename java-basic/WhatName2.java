import java.util.Scanner;
class WhatName2{
    public static void main(String[] args){
        System.out.println("이름 뭐니?");
        String name = "자바맨";
        int age = 999;
        //값을 입력하는 지점
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        
        System.out.print("이름은 " + name + "이다");
    }
}