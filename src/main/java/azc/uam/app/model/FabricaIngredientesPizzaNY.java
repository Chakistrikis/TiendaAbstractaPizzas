package azc.uam.app.model;

import azc.uam.app.model.masa.Masa;
import azc.uam.app.model.masa.MasaDelgada;
import azc.uam.app.model.queso.Queso;
import azc.uam.app.model.queso.QuesoParmesano;
import azc.uam.app.model.salsa.Salsa;
import azc.uam.app.model.salsa.SalsaMarinara;

public class FabricaIngredientesPizzaNY implements FabricaIngredientesPizza{
    @Override
    public Masa crearMasa() {
        return new MasaDelgada();
    }

    @Override
    public Salsa crearSalsa() {
        return new SalsaMarinara();
    }

    @Override
    public Queso crearQueso() {
        return new QuesoParmesano();
    }
}
