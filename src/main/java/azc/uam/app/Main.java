package azc.uam.app;

import azc.uam.app.controller.PizzaController;
import azc.uam.app.view.ConsoleView;

/**
 * @author Christian Aguilera - 2203032706
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        PizzaController controller = new PizzaController(view);
        controller.prepararPizza();
    }
}