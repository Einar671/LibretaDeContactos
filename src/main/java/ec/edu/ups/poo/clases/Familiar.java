package ec.edu.ups.poo.clases;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona{
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;
    private int edad;

    public Familiar() {

    }
    public Familiar(String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento, int edad) {
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad= edad;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {

        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularEdad(){
        Calendar hoy= Calendar.getInstance();
        int año=hoy.get(Calendar.YEAR);
        int edadfinal=año-edad;
        return edadfinal;
    }

    @Override
    public String toString(){
        return super.toString()+ tipoDeSangre+ "\n\t Parentesco: "+parentesco+"\n\t Edad: "+edad;
    }
}
