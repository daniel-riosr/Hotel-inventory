/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;


class Customer {
    private final String name;
    private final String lastname;
    private final String identificacion;
    private final String telefono;
    private final String email;

    public Customer (String name, String lastname, String identificacion, String telefono, String email) {
        this.name = name;
        this.lastname = lastname;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n" +
               "Apellido: " + lastname + "\n" +
               "Identificación: " + identificacion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Email: " + email + "\n";
    }

  
}

