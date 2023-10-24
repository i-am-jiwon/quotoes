package com.ll;


import java.sql.Array;
import java.util.Scanner;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");

        order order1 = new order();

        order1.orderRun();

    }
}

class order{
    //종료인지 아닌지
    int cond = 0;
    //몇번 반복 됐는지
    int count =0;

    ArrayList<Integer> listNum = new ArrayList<Integer>();
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> words = new ArrayList<String>();


    void orderRun() {
        while(cond == 0) {
            System.out.print("명령) ");
            Scanner sc = new Scanner(System.in);
            String order = sc.nextLine();
            if (order.equals("종료")) {
                cond = 1;
            }
            if (order.equals("등록")) {
                System.out.print("명언 : ");
                String order2 = sc.nextLine();
                System.out.print("작가 : ");
                String order3 = sc.nextLine();
                count++;
                listNum.add(count);
                names.add(order2);
                words.add(order3);
                System.out.println(count + "번 명언이 등록되었습니다.");
            }
            if (order.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i=listNum.size()-1; i>=0 ; i--){
                    System.out.println(listNum.get(i) +" / "+ names.get(i)+" / "+words.get(i));
                }
            }
        }
    }
}


