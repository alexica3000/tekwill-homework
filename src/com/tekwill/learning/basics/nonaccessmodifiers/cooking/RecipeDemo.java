package com.tekwill.learning.basics.nonaccessmodifiers.cooking;

public class RecipeDemo {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("chocolate", "my favorite recipe with chocolate");

        System.out.println("title of recipe: " + recipe.getTitle());
        System.out.println("description: " + recipe.getDescription());
        System.out.println("url recipe: " + Recipe.sourceUrl);
        recipe.update();
        System.out.println(recipe.toString());
        Recipe.markAsCooked();
    }
}
