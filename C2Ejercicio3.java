package c2ejercicio3;

import javax.swing.JOptionPane;

public class C2Ejercicio3 {
    
    String nombre,apellido,nss;
    double ventas,tarifa,sueldo;
    

    public static void main(String[] args) {
        // TODO code application logic here
        boolean condicion = true;
        do{
        
            int ventana;
            String [] botones = {"Soy empleado base mas comision", "Soy empleado por comision", "Cancelar"};
       
            ventana = JOptionPane.showOptionDialog(null,"Elige una opcion","Empleados", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
            int opcion = ventana;
       
            switch(opcion)
            {
                case 0:
                    EmpleadoBaseMasComision baseMasComision = new EmpleadoBaseMasComision();
                    String nombre = JOptionPane.showInputDialog(null, "Escribe el nombre del empleado: ");
                    String apellido = JOptionPane.showInputDialog(null, "Escribe el apellido del empleado: ");
                    String nss = JOptionPane.showInputDialog(null,"Escribe el NSS: ");
                    double ventas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ventas por semana: "));
                    baseMasComision.setNombre(nombre);
                    baseMasComision.setApellido(apellido);
                    baseMasComision.setNumeroSeguroSocial(nss);
                    baseMasComision.setVentasBrutas(ventas);
                    double tarifa = 0.04;
                    baseMasComision.setTarifaComision(tarifa);
                    double sueldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Sueldo base del empleado: "));
                    baseMasComision.setSalarioBase(sueldo);
                    JOptionPane.showMessageDialog(null, baseMasComision);
                    condicion = true;
                    break;
                case 1: 
                    String nombreComision = JOptionPane.showInputDialog(null, "Escribe el nombre del empleado: ");
                    String apellidoPcomision = JOptionPane.showInputDialog(null, "Escribe el apellido del empleado: ");
                    String nssComision = JOptionPane.showInputDialog(null,"Escribe el NSS: ");
                    double ventasComision = Double.parseDouble(JOptionPane.showInputDialog(null, "Ventas por semana: "));
                    double tarifaComision = 0.06;
            
                    EmpleadoPorComision comision = new EmpleadoPorComision(nombreComision,apellidoPcomision,nssComision,ventasComision,tarifaComision);
                    comision.setNombre(nombreComision);
                    comision.setApellido(apellidoPcomision);
                    comision.setNumeroSeguroSocial(nssComision);
                    comision.setVentasBrutas(ventasComision);
                    tarifa=.06;
                    comision.setTarifaComision(tarifa);
                    JOptionPane.showMessageDialog(null,comision.toString());
                    condicion = true;
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
       }while(condicion == true);
        
    }
}
