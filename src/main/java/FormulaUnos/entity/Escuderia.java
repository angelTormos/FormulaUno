package FormulaUnos.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private String Nacionalidad;
    private String Mundiales;
    private String Motor;

    @OneToMany(mappedBy = "escuderia", fetch=FetchType.EAGER)
    private List<Piloto> pilotos;

    public Escuderia(Long id, String nombre, String nacionalidad, String mundiales, String motor) {
        this.id = id;
        Nombre = nombre;
        Nacionalidad = nacionalidad;
        Mundiales = mundiales;
        Motor = motor;
        this.pilotos = new ArrayList<>();
    }

    public Escuderia() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getMundiales() {
        return Mundiales;
    }

    public void setMundiales(String mundiales) {
        Mundiales = mundiales;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    @Override
    public String toString(){
        return this.Nombre + "-" + this.Nacionalidad + "-" + this.Mundiales + "-" + this.Motor;
    }
}
