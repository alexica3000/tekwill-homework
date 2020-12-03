package com.tekwill.learning.basics;

public class FightSong {
    public static void main(String[] args) {
        System.out.println(goTeamGo() + "\n\n" + goTeamGo() + youReTheBest());
        System.out.println(goTeamGo() + "\n\n" + goTeamGo() + youReTheBest());
        System.out.println(goTeamGo() + "\n\n" + goTeamGo());
    }

    private static String goTeamGo() {
        return "Go, team, go!\nYou can do it.";
    }

    private static String youReTheBest() {
        return "You're the best,\nIn the West.";
    }
}
