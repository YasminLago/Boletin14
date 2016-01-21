package empresa;
//Yasmin
public class Empresa {
    public static void main(String[] args) {
        ConversorTemperaturas obx=new ConversorTemperaturas();
        obx.centigradosAReaumur(30);
        try{
            System.out.println(obx.centigradosAFharenheit(82));
        }catch(TemperaturaErradaExcepcion e){
            System.out.println("erro en main"+e.getMessage());
        }
    }
    
}
