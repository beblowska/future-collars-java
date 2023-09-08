package task112;

import java.util.List;

public class Pizza {
    private boolean isVegetarian;
    private List<Ingredients> ingredients;
    private int calories;
    private String name;

    public Pizza(boolean isVegetarian, List<Ingredients> ingredients, int calories, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
