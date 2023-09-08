package task112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza(true, Arrays.asList("mozarella", "tomato", "peppers"), 300, "Vegetariana"));
        menu.add(new Pizza(false, Arrays.asList("mozarella", "salami", "onion"), 400, "Salami"));
        menu.add(new Pizza(true, Arrays.asList("mozarella", "tomato", "peppers"), 350, "Margherita"));

        PizzaOperations pizzaOperations = new PizzaOperations();

        List<String> vegetarianPizzas = pizzaOperations.getVegetarianPizzas(menu);
        System.out.println("Vegetarian Pizzas: " + vegetarianPizzas);

        List<String> pizzasWithCelery = pizzaOperations.getPizzasWithCelery(menu);
        System.out.println("Pizzas with celery: " + pizzasWithCelery);

        boolean containsTomatoAndPeppers = pizzaOperations.containsVegetarianPizzaWithTomatoAndPeppers(menu);
        System.out.println("Contains vegetarian pizza with tomato and peppers: " + containsTomatoAndPeppers);

        boolean allPizzasContainMozzarella = pizzaOperations.allPizzasContainMozzarella(menu);
        System.out.println("All pizzas contain mozzarella: " + allPizzasContainMozzarella);

        Optional<Pizza> maxCaloriesPizza = pizzaOperations.getPizzaWithMaxCalories(menu);
        maxCaloriesPizza.ifPresent(pizza -> System.out.println("Pizza with max calories: " + pizza.getName()));

        Optional<Pizza> minCaloriesPizza = pizzaOperations.getPizzaWithMinCalories(menu);
        minCaloriesPizza.ifPresent(pizza -> System.out.println("Pizza with min calories: " + pizza.getName()));
    }
}
