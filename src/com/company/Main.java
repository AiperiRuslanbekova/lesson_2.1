package com.company;

public class Main {

    public static void main(String[] args) {
//        String color = "белый";
//        switch (color) {
//            case "красный":
//                System.out.println("Вы инициативный и страстный!");
//                break;
//            case "белый":
//                System.out.println("Вы мягкий и добрый!");
//                break;
//            case "черный":
//                System.out.println("Вы стильный и загадочный!");
//                break;


//        int num = 10;
//        int age = 20;
//        if (num > 5 && age > 18) {
//            System.out.println("Можешь выходить на улицу!");
//        }
//        if (num == 10 || age > 18) { //оператор или
//            System.out.println("Success!");
//        }
        print ();
        printOurWord("Привет");
        System.out.println("Сумма двух чисел: " + getSumOfValues(6,3));
    }


    public static void print(){
        System.out.println("Hello world!");
    }

    public static void printOurWord(String word){
        System.out.println("Ваше слово: " + word);
    }

    public static int getSumOfValues(int num1, int num2){
        return num1 + num2;

    }
}

