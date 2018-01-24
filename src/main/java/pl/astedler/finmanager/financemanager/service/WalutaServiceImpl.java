package pl.astedler.finmanager.financemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.astedler.finmanager.financemanager.dto.KursyWalutDTO;
import pl.astedler.finmanager.financemanager.model.Waluta;
import pl.astedler.finmanager.financemanager.repository.WalutaRepository;
import pl.astedler.finmanager.financemanager.service.api.WalutaService;

import java.util.List;

@Service
public class WalutaServiceImpl implements WalutaService {

    @Autowired
    private WalutaRepository walutaRepository;

    @Override
    public Waluta zapiszWalute(Waluta waluta) {
        return walutaRepository.save(waluta);
    }

    @Override
    public Waluta zapiszWalute(KursyWalutDTO kursyWalutDTO) {
        Waluta waluta = new Waluta();
        waluta.setNazwaWaluty(kursyWalutDTO.getNazwaWaluty());
        waluta.setKurs(kursyWalutDTO.getKurs());
        return walutaRepository.save(waluta);
    }

    @Override
    public List<Waluta> findAll() {
        return walutaRepository.findAll();
    }
}
