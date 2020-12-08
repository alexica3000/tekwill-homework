package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class KnightDemo {
    public static void main(String[] args) {
        Knight knight = new Knight(54, "Michael");
        System.out.println("Name is " + knight.getNickname() + ", age - " + knight.getAge());
        knight.fight();

        Knight.invokeMagic();
        System.out.println(Knight.guild);

        knight.setAge(59);
        knight.setNickname("Michael II");
        System.out.println("Name is " + knight.getNickname() + ", age - " + knight.getAge());

        System.out.println(knight.toString());
    }
}
