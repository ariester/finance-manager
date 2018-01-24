package pl.astedler.finmanager.financemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.astedler.finmanager.financemanager.dto.ListaOperacjiDTO;
import pl.astedler.finmanager.financemanager.dto.TworzenieOperacjiDTO;
import pl.astedler.finmanager.financemanager.model.Operacje;
import pl.astedler.finmanager.financemanager.repository.OperacjeRepository;
import pl.astedler.finmanager.financemanager.service.api.OperacjaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OperacjaServiceImpl implements OperacjaService {

    @Autowired
    private OperacjeRepository operacjeRepository;

    @Override
    public Operacje zapiszOperacje(Operacje operacje) {
        return operacjeRepository.save(operacje);
    }

    @Override
    public Operacje zapiszOperacje(TworzenieOperacjiDTO tworzenieOperacjiDTO) {
        Operacje operacja = new Operacje();
        operacja.setKwota(tworzenieOperacjiDTO.getKwota()*tworzenieOperacjiDTO.getWaluta().getKurs());
        operacja.setDataOperacji(tworzenieOperacjiDTO.getDataOperacji());
        operacja.setOpisOperacji(tworzenieOperacjiDTO.getOpisOperacji());
        operacja.setWaluta(tworzenieOperacjiDTO.getWaluta());
        return operacjeRepository.save(operacja);
    }

    @Override
    public List<ListaOperacjiDTO> znajdzWszystkie() {
        List<Operacje> operacje = operacjeRepository.findAll();
        List<ListaOperacjiDTO> listaOperacjiDTO = new ArrayList<>();
        for(Operacje o: operacje){
            ListaOperacjiDTO tmp = new ListaOperacjiDTO();
            tmp.setId(o.getId());
            tmp.setKwota(o.getKwota());
            tmp.setDataOperacji(o.getDataOperacji());
            tmp.setOpisOperacji(o.getOpisOperacji());
            listaOperacjiDTO.add(tmp);
        }
        return listaOperacjiDTO;
    }

    @Override
    public void usunOperacje(Long id) {
        operacjeRepository.delete(id);
    }
}
