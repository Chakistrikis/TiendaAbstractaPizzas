package azc.uam.app.model;

import azc.uam.app.model.masa.Masa;
import azc.uam.app.model.masa.MasaGruesa;
import azc.uam.app.model.queso.Queso;
import azc.uam.app.model.queso.QuesoMozzarella;
import azc.uam.app.model.salsa.Salsa;
import azc.uam.app.model.salsa.SalsaEspecial;

public class FabricaIngredientesPizzaIL implements FabricaIngredientesPizza{
    @Override
    public Masa crearMasa() {
        return new MasaGruesa();
    }

    @Override
    public Salsa crearSalsa() {
        return new SalsaEspecial();
    }

    @Override
    public Queso crearQueso() {
        return new QuesoMozzarella();
    }
}
