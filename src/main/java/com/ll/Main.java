package com.ll;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");

        order order1 = new order();

        order1.orderRun();

    }
}

class order{
    int cond = 0;
    void orderRun() {
        while(cond == 0) {
            System.out.print("명령) ");
            Scanner sc = new Scanner(System.in);
            String order = sc.nextLine();
            if (order.equals("종료")) {
                cond = 1;
            } else if (order.equals("등록")) {
                System.out.print("명언 : ");
                String order2 = sc.nextLine();
                System.out.print("작가 : ");
                String order3 = sc.nextLine();
            }
        }
    }
}