package FormulaUnos.repository;

import FormulaUnos.entity.Piloto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PilotoRepository extends CrudRepository<Piloto, Long> {
    List<Piloto> findPilotoByNombreContains(String Nombre);
    List<Piloto> findPilotoByNombreStartingWith(String Nombre);

    List<Piloto> findPilotoByNombreAndEscuderia(String Nombre, String Escuderia);

    List<Piloto> findPilotoByNombreStartingWithAndEscuderiaContains(String Nombre, String Escuderia);
}