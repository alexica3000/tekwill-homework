package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class Knight {
    private int age;
    private String nickname;
    public static String guild = "My kingdom";

    public Knight(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public void fight() {
        System.out.println("Fight!!!");
    }

    public static void invokeMagic() {
        System.out.println("Maaaagic!!!");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Knight: nickname is " + this.nickname + ", age - " + this.age + ".";
    }
}
