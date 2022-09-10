package curso.clases.recyclerview.Models;

public class Persona {
    String imagen;
    String nombre;
    String direccion;
    String color;

    public Persona(String imagen, String nombre, String direccion, String color) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.direccion = direccion;
        this.color = color;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
