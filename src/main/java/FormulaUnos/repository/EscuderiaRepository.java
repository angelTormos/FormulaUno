package FormulaUnos.repository;

import FormulaUnos.entity.Escuderia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EscuderiaRepository extends CrudRepository<Escuderia, Long> {

}