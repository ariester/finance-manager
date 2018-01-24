package pl.astedler.finmanager.financemanager.service.api;

import pl.astedler.finmanager.financemanager.dto.ListaOperacjiDTO;
import pl.astedler.finmanager.financemanager.dto.TworzenieOperacjiDTO;
import pl.astedler.finmanager.financemanager.model.Operacje;

import java.util.List;

public interface OperacjaService {
    Operacje zapiszOperacje(Operacje operacje);
    Operacje zapiszOperacje(TworzenieOperacjiDTO tworzenieOperacjiDTO);
    List<ListaOperacjiDTO> znajdzWszystkie();
    void usunOperacje(Long id);
}
