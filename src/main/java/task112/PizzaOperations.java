package task112;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;


public class PizzaOperations {
    public List<String> getVegetarianPizzas(List<Pizza> menu) {
        return menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .collect(Collectors.toList());
    }

    public List<String> getPizzasWithCelery(List<Pizza> menu) {
        return menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("celery"))
                .map(Pizza::getName)
                .collect(Collectors.toList());
    }

    public boolean containsVegetarianPizzaWithTomatoAndPeppers(List<Pizza> menu) {
        return menu.stream()
                .anyMatch(pizza -> pizza.isVegetarian() && pizza.getIngredients().containsAll(Arrays.asList("tomato", "peppers")));
    }

    public boolean allPizzasContainMozzarella(List<Pizza> menu) {
        return menu.stream()
                .allMatch(pizza -> pizza.getIngredients().contains("mozarella"));
    }

    public Optional<Pizza> getPizzaWithMaxCalories(List<Pizza> menu) {
        return menu.stream()
                .max(Comparator.comparingInt(Pizza::getCalories));
    }

    public Optional<Pizza> getPizzaWithMinCalories(List<Pizza> menu) {
        return menu.stream()
                .min(Comparator.comparingInt(Pizza::getCalories));
    }
}
