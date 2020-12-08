package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

public class Recipe {
    final private String title;
    final private String description;
    public static String sourceUrl = "https://test.com";

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void update() {
        System.out.println("Updating...");
    }

    public static void markAsCooked() {
        System.out.println("Cooooked!");
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Recipe: " + this.title + ", description - " + this.description;
    }
}
