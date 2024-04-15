package FormulaUnos;

import FormulaUnos.entity.Piloto;
import FormulaUnos.repository.EscuderiaRepository;
import FormulaUnos.repository.PilotoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App implements CommandLineRunner {
    private final PilotoRepository pilotoRepository;
    private final EscuderiaRepository escuderiaRepository;
    public App(PilotoRepository pilotoRepository, EscuderiaRepository escuderiaRepository) {
        this.pilotoRepository = pilotoRepository;
        this.escuderiaRepository = escuderiaRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) {
        pilotoRepository.findPilotoByNombreAndEscuderia("Fernando", "Aston Martin").forEach(System.out::println);


        Piloto p = pilotoRepository.findById(2L).get();
        System.out.println("*********************************");
        System.out.println(p.getEscuderia().getNombre());


        escuderiaRepository.findById(2L).get().getPilotos().forEach(System.out::println);

        System.out.println("*********************************");

    }
}
