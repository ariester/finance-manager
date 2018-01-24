package pl.astedler.finmanager.financemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.astedler.finmanager.financemanager.dto.ListaOperacjiDTO;
import pl.astedler.finmanager.financemanager.dto.TworzenieOperacjiDTO;
import pl.astedler.finmanager.financemanager.model.Operacje;
import pl.astedler.finmanager.financemanager.model.Waluta;
import pl.astedler.finmanager.financemanager.service.api.OperacjaService;
import pl.astedler.finmanager.financemanager.service.api.WalutaService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OperacjeController {

    @Autowired
    private OperacjaService operacjaService;

    @Autowired
    private WalutaService walutaService;

    @DeleteMapping("/usunOperacje/{id}")
    public void usunOperacje(@PathVariable(value = "id") Long id){
        operacjaService.usunOperacje(id);
    }

    @PostMapping("/dodajOperacje")
    public Operacje dodajOperacje(@RequestBody TworzenieOperacjiDTO tworzenieOperacjiDTO){
        Operacje operacja;
        operacja = operacjaService.zapiszOperacje(tworzenieOperacjiDTO);
        return operacja;
    }

    @GetMapping(value ="/findWaluty", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Waluta> findWaluty(){
        List<Waluta> waluty = walutaService.findAll();
        return waluty;
    }


    @GetMapping("/pobierzOperacje")
    public List<ListaOperacjiDTO> pobierzOperacje(){
        return operacjaService.znajdzWszystkie();
    }

}
