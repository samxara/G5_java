package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Classwork3 {
    public static void main(String[] args) {
            ArrayList arrayList1 =  new ArrayList();
            ArrayList New1 = new ArrayList();
            Random rand = new Random();

            for (int j = 0; j<12; j++) {
                New1.add(rand.nextInt(11 - 6 + 1) + 6);
                arrayList1.add(rand.nextInt(50));
            }
            EvenNums(arrayList1);
            _3MultipleNums(New1,rand);

        }
        //First Classwork
        public static void  EvenNums(ArrayList newlist){
            ArrayList ResultList = newlist;
            System.out.println("Even Function(First)");
            System.out.println(newlist);
            for (int i=0; i < ResultList.size();){
                ResultList.remove(i);
                i++;
            }
            Collections.sort(ResultList);
            System.out.println(ResultList);
            System.out.println("");
            System.out.println("");
        }
        //Second classwork
        public static void _3MultipleNums(ArrayList New1, Random rand){
            ArrayList SecondList = new ArrayList();
            SecondList = New1;
            System.out.println("3multiple function(Second)");
            System.out.println(New1);

            for (int i=0; i < 12;i++){
                i++;
                i++;
                SecondList.add(i,rand.nextInt(25 - 19 + 1) + 19);

            }

            System.out.println(SecondList);

        }
    }