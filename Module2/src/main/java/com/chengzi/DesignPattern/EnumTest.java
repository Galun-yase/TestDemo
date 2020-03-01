package com.chengzi.DesignPattern;


public class EnumTest {
    public static void main(String[] args){
        Weekday day= Weekday.SAT;
        switch(day){
            case MON:;
            case TUE:;
            case WED:;
            case THU:;
            case FRI:;
            case SAT:
                System.out.println("Today is "+day+" . Work at office!");
                break;
            case SUN:;
            default:
                throw new RuntimeException("cannot process"+day);

        }
    }
}

enum Weekday{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
