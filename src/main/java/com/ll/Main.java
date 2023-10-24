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


    String delete;
    String id;
    int indexId;

    void orderRun() {
        while(cond == 0) {
            System.out.print("명령) ");
            Scanner sc = new Scanner(System.in);
            String order = sc.nextLine();
            delete = order.substring(0,2);
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
                names.add(order3);
                words.add(order2);
                System.out.println(count + "번 명언이 등록되었습니다.");
            }
            if (order.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i=listNum.size()-1; i>=0 ; i--){
                    if(listNum.get(i) != 0)
                        System.out.println(listNum.get(i) +" / "+ names.get(i)+" / "+words.get(i));
                }
            }
            if (delete.equals("삭제")){
                id = order.substring(6);
                indexId = Integer.parseInt(id);
                if(listNum.get(indexId-1) == 0) {
                    System.out.println(id + "번 명언은 존재하지 않습니다.");
                }else {
                    listNum.set(indexId - 1, 0);
                    System.out.println(id + "번 명언이 삭제되었습니다.");
                }
            }

            if(delete.equals("수정")){
                id = order.substring(6);
                indexId = Integer.parseInt(id);
                if(listNum.get(indexId-1) == 0) {
                    System.out.println(id + "번 명언은 존재하지 않습니다.");
                }else {
                    System.out.println("명언(기존) : " + words.get(indexId-1) );
                    System.out.print("명언 : ");
                    words.set(indexId-1,sc.nextLine());
                    System.out.println("작가(기존) : " + names.get(indexId-1) );
                    System.out.print("작가 : ");
                    names.set(indexId-1,sc.nextLine());
                }
            }

        }
    }
}


