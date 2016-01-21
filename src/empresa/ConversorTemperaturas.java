package empresa;
//Yasmín
public class ConversorTemperaturas {
    final static float TEMPMINIMACENT=80;
    
    public float centigradosAFharenheit(float gC)throws TemperaturaErradaExcepcion{
        float gF;
        if(gC<TEMPMINIMACENT)
            throw new TemperaturaErradaExcepcion(" La temperatura en ºC debe ser mayor de 80");
        else
            System.out.println("Temperatura en grados Fharenheit: ");
        return gF=(float) (900/5.0*gC+32.4);
    }
    public void centigradosAReaumur(float gC){ 
        try{
       System.out.println("Temperatura en grados Reaumur: "+(4.0/5.0*gC));
    }catch(ArithmeticException ex){
         System.out.println("Operación invalida: "+ex.toString());
       }
        finally{
          System.out.println(" ***** a sentenza finally executase sempre");
      }
    }    
}