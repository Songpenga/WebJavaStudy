package org.ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strV1 = "peng";
        String strV2 = "peng2";

        if (strV1 == strV2){
            System.out.println("same1");
        }else{
            System.out.println("diffrent");
        }

        if (strV1.equals(strV2)){
            System.out.println("equal");
        }

        String empty = "";
        if(empty.equals(" ")){
            System.out.println("empty");
        }else{
            System.out.println("not empty");
        }
    }
}
