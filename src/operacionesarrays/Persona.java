package operacionesarrays;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    public String nombre, apellido, telefono, direccion, fecha_de_nacimiento;
    
    //constructor
    public void persona (String nom, String ape, String tel, String dir, String fec){
        
            this.nombre = nom;
            this.apellido = ape;
            this.direccion = dir;
            this.telefono = tel;
            this.fecha_de_nacimiento = fec;
    }        
                    
    
public int calcEdad() {
        //01/01/2000
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(this.fecha_de_nacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period period = Period.between(dob, ahora);
        return period.getYears();

    }

}