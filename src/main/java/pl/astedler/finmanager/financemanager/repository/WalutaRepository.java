package pl.astedler.finmanager.financemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.astedler.finmanager.financemanager.model.Waluta;

import java.util.List;

public interface WalutaRepository extends JpaRepository<Waluta, Long> {
}
