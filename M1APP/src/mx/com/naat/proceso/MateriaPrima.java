package app;

import java.time.LocalDate;

public class MateriaPrima {

    LocalDate fechaActual;
    private LocalDate fechaCaducidad;

    public MateriaPrima(LocalDate fechaCaducidad){
        fechaActual = LocalDate.now();
        this.fechaCaducidad = fechaCaducidad;
    }

    public boolean estaCaducado(){
        if(fechaCaducidad.isBefore(fechaActual)){
            return true;
        }else{
            return false;
        }
    }
}
