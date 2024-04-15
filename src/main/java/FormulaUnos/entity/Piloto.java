package FormulaUnos.entity;

import jakarta.persistence.*;


@Entity
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Nombre;
    private String Apellidos;
    private String Nacimiento;
    private int Debut;
    private int Mundiales;
    private String Nacionalidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Escuderia")
    private Escuderia escuderia;

    public Piloto(Long ID, String nombre, String apellidos, String nacimiento, int debut, int mundiales, String nacionalidad) {
        this.ID = ID;
        Nombre = nombre;
        Apellidos = apellidos;
        Nacimiento = nacimiento;
        Debut = debut;
        Mundiales = mundiales;
        Nacionalidad = nacionalidad;
    }

    public Piloto() {

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        Nacimiento = nacimiento;
    }

    public int getDebut() {
        return Debut;
    }

    public void setDebut(int debut) {
        Debut = debut;
    }

    public int getMundiales() {
        return Mundiales;
    }

    public void setMundiales(int mundiales) {
        Mundiales = mundiales;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString(){
        return Nombre + "-" + Apellidos + "-" + Nacimiento + "-" + Debut + "-" + Mundiales + "-" + Nacionalidad;
    }
}