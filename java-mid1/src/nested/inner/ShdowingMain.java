package com.example.nested.inner;

public class ShdowingMain {

    public int val = 11;

    class Inner{
        public int val = 2;

        void go(){
            int val3 = 33;
            System.out.println(val3);
            System.out.println("this.val : " + this.val);
            System.out.println("ShdowingMain.val : " + ShdowingMain.this.val);
        }
    }


    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }
}
