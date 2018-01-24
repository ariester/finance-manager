package pl.astedler.finmanager.financemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.astedler.finmanager.financemanager.model.Waluta;
import pl.astedler.finmanager.financemanager.model.Operacje;

import java.util.List;

public interface OperacjeRepository extends JpaRepository<Operacje, Long> {
    List<Operacje> findAllByWaluta(Waluta waluta);
}
