package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    public void setCedula(String cedula){
        this.cedula=cedula;

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getCedula(){
        return cedula;
    }
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public String getDireccion(){return direccion;}


    public Persona(String cedula, String nombre, String apellido, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Persona(){

    }

    @Override
    public String toString(){
        return "\t Cedula: "+ cedula+ "\n\t Nombre: "+nombre+"\n\t Apellido: "+apellido+"\n\t Direccion: "+direccion;
    }





}
