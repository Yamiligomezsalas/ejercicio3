package c2ejercicio3;

import c2ejercicio3.EmpleadoPorComision;


public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase; //salario base por semana
    private int egreso = 10;
    
    //constructor por defecto
    public EmpleadoBaseMasComision(){
    }
    
    // constructor con seis argumentos
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public EmpleadoBaseMasComision( String nombre, String apellido,String nss, double ventas, 
        double tarifa, double salario ){
        super( nombre, apellido, nss, ventas, tarifa );
        setSalarioBase(salario); // valida y almacena el salario base

    } // fin del constructor de EmpleadoBaseMasComision4 con seis argumentos// fin del constructor de EmpleadoBaseMasComision4 con seis argumentos

  // establece el salario base
    public void setSalarioBase( double salario ){
     salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    } // fin del método establecerSalarioBase// fin del método establecerSalarioBase

  // devuelve el salario base
    public double getSalarioBase(){
     return salarioBase;
    } // fin del método obtenerSalarioBase// fin del método obtenerSalarioBase

    //calcula los ingresos
    @Override
    public double ingresos(){
     return getSalarioBase() + super.ingresos();
    } // fin del método ingresos// fin del método ingresos
    
   
  // devuelve representación String de EmpleadoBaseMasComision4
    @Override
   public String toString(){
     return String.format( "%s %s\n%s: %.2f", "con sueldo base",
             super.toString(), "sueldo base", getSalarioBase());
    } // fin del método toString// fin del método toString*/
   
    
}