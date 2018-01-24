package pl.astedler.finmanager.financemanager.service.api;

import pl.astedler.finmanager.financemanager.dto.KursyWalutDTO;
import pl.astedler.finmanager.financemanager.model.Waluta;

import java.util.List;

public interface WalutaService {
    Waluta zapiszWalute(Waluta waluta);
    Waluta zapiszWalute(KursyWalutDTO kursyWalutDTO);
    public List<Waluta> findAll();
}
