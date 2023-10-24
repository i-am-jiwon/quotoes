package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        Scanner sc = new Scanner(System.in);
        String order = sc.next();

        if(order.equals("종료")){
            return;
        }
    }
}