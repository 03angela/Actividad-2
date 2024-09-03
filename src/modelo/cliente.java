/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexP
 */
public class cliente extends persona {
    

    public cliente (){}

    public cliente(String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String nit) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento, nit);

    }


    
    @Override
    public void agregar()
    {
        try {
            System.out.println("Nit: " + getNit ());
            System.out.println("Nombres: " + getNombres());
            System.out.println("Apellidos: " + getApellidos());
            System.out.println("Direccion: " + getDireccion());
            System.out.println("Telefono: " + getTelefono());
            System.out.println("Fecha de nacimiento: " + getFecha_nacimiento());
            
            

        }
        catch (Exception ex){
            System.out.println("Error: " + ex);
        }
    }
    
}
