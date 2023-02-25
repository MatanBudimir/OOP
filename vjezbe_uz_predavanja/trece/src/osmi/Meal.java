package osmi;

import javax.swing.*;

public class Meal {
    private Food[] ingredients;


    public Meal(Food ...ingredients) {
        this.ingredients = new Food[ingredients.length];
        for (int i = 0; i < ingredients.length; i++)
            this.ingredients[i] = ingredients[i];
    }

    public int getNumberOfIngredients() {
        return ingredients.length;
    }

    public Food getIngredient(int index) {
        if (((ingredients.length - 1) < index) || index < 0)
            return null;

        return ingredients[index];
    }

    public void printIngredients() {
        for (int i = 0; i < ingredients.length; i++) {
            System.out.printf("Ingredient[%d] = %s\n", i, ingredients[i].toStringInGrams());
        }
    }
}
