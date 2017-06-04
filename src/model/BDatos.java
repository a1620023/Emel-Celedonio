package model;

/**
 *
 * @author Bl4kz0
 */
public class BDatos {
    
    private String dni;
    private String nombre;
    private int edad;
    private int nivel;
    private String distrito;
    private String password;
    private String celular;

    public BDatos(String dni, String nombre, int edad, int nivel, String distrito, String password, String celular) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.distrito = distrito;
        this.password = password;
        this.celular = celular;
    }
    
    public BDatos(String dni,String nombre,int edad, String distrito){}

    public BDatos() {
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
}
