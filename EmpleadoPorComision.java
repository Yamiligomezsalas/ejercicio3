package c2ejercicio3;


public class EmpleadoPorComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    //Constructor por defecto
    public EmpleadoPorComision(){   
    }
    
    // constructor con cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) { // la llamada implícita al constructor de Object ocurre aquí
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        setVentasBrutas(ventas); // valida y almacena las ventas brutas
        setTarifaComision(tarifa); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision3 con cinco argumentos

    public void setNombre(String nombre ){
        primerNombre = nombre;
    } // fin del mÃ©todo establecerPrimerNombre

    // devuelve el primer nombre
    public String getNombre(){
        return primerNombre;
    } // fin del mÃ©todo obtenerPrimerNombre

    // establece el apellido paterno
    public void setApellido(String apellido ){
        apellidoPaterno = apellido;
    } // fin del mÃ©todo establecerApellidoPaterno

    // devuelve el apellido paterno
    public String getApellido(){
        return apellidoPaterno;
    } // fin del mÃ©todo obtenerApellidoPaterno

    // establece el nÃºmero de seguro social
    public void setNumeroSeguroSocial(String nss ){
        numeroSeguroSocial = nss; // debe validar
    } // fin del mÃ©todo establecerNumeroSeguroSocial

    // devuelve el nÃºmero de seguro social
    public String getNumeroSeguroSocial(){
        return numeroSeguroSocial;
    } // fin del mÃ©todo obtenerNumeroSeguroSocial

    // establece el monto de ventas brutas
    public void setVentasBrutas( double ventas ){
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } // fin del mÃ©todo establecerVentasBrutas

    // devuelve el monto de ventas brutas
    public double getVentasBrutas(){
        return ventasBrutas;
    } // fin del mÃ©todo obtenerVentasBrutas

    // establece la tarifa de comisiÃ³n
    public void setTarifaComision( double tarifa ){
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } // fin del mÃ©todo establecerTarifaComision

    // devuelve la tarifa de comisiÃ³n
    public double getTarifaComision(){
        return tarifaComision;
    } // fin del mÃ©todo obtenerTarifaComision

    // calcula los ingresos
    //mÃ©todo polimÃ³rfico
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    } // fin del mÃ©todo ingresos

    // devuelve representaciÃ³n String del objeto EmpleadoPorComision3
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "empleado por comision", getNombre(), getApellido(),
                "numero de seguro social", getNumeroSeguroSocial(),
                "ventas brutas", getVentasBrutas(),
                "tarifa de comision", getTarifaComision(),
                "sueldo mÃ¡s comisiÃ³n",ingresos()); 
    } // fin del mÃ©todo toString
}