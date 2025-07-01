package azc.uam.app.model;

import azc.uam.app.model.masa.Masa;
import azc.uam.app.model.queso.Queso;
import azc.uam.app.model.salsa.Salsa;

public interface FabricaIngredientesPizza {
    Masa crearMasa();
    Salsa crearSalsa();
    Queso crearQueso();
}
