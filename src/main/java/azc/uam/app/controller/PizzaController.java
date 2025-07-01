package azc.uam.app.controller;

import azc.uam.app.model.FabricaIngredientesPizza;
import azc.uam.app.model.FabricaIngredientesPizzaIL;
import azc.uam.app.model.FabricaIngredientesPizzaNY;
import azc.uam.app.model.masa.Masa;
import azc.uam.app.model.queso.Queso;
import azc.uam.app.model.salsa.Salsa;
import azc.uam.app.view.ConsoleView;

import java.util.List;

public class PizzaController {
    private FabricaIngredientesPizza fabricaIngredientesPizza;
    private ConsoleView consoleView;

    public PizzaController(ConsoleView consoleView) {
        this.consoleView = consoleView;
    }

    public void prepararPizza() {

        boolean finalizarOrden = false;
        while (!finalizarOrden) {
            consoleView.menu();
            int opcion = consoleView.opcion();
            switch (opcion) {
                case 1 -> {
                    FabricaIngredientesPizzaNY fabricaIngredientesPizzaNY = new FabricaIngredientesPizzaNY();
                    Masa masa = fabricaIngredientesPizzaNY.crearMasa();
                    Queso queso = fabricaIngredientesPizzaNY.crearQueso();
                    Salsa salsa = fabricaIngredientesPizzaNY.crearSalsa();
                    System.out.println("Pizza preparada con: "
                            + masa.getClass().getSimpleName() + ", "
                            + salsa.getClass().getSimpleName() + ", "
                            + queso.getClass().getSimpleName());
                }
                case 2 -> {
                    FabricaIngredientesPizzaIL fabricaIngredientesPizzaIL = new FabricaIngredientesPizzaIL();
                    Masa masa = fabricaIngredientesPizzaIL.crearMasa();
                    Queso queso = fabricaIngredientesPizzaIL.crearQueso();
                    Salsa salsa = fabricaIngredientesPizzaIL.crearSalsa();
                    System.out.println("Pizza preparada con: "
                            + masa.getClass().getSimpleName() + ", "
                            + salsa.getClass().getSimpleName() + ", "
                            + queso.getClass().getSimpleName());
                }
                case 3 -> finalizarOrden = true;
                case -1 -> System.out.println("Opcion invalida.");
                default -> System.out.println("Opcion invalida.");
            }
        }
    }
}
