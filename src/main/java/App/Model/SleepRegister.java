package App.Model;

import java.time.LocalDate;

public class SleepRegister extends Register {
    private int Hours;
    private String calidad;  //

    public SleepRegister(LocalDate fecha, int Hours, String calidad) {
        super(fecha);
        this.Hours = Hours;
        this.calidad = calidad;
    }

    public int getHours() {
        return Hours;
    }

    public String getCalidad() {
        return calidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Horas dormidas: " + Hours +
                ", Calidad: " + calidad;
    }
}