package empresa;
//Yasmin
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("A temperatura non pode ser <80ºC");
    }

    public TemperaturaErradaExcepcion(String mensaxe) {
        super(mensaxe);
    }
    
    
}

