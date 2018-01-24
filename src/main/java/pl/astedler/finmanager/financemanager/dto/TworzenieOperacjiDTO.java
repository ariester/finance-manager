package pl.astedler.finmanager.financemanager.dto;

import lombok.Getter;
import lombok.Setter;
import pl.astedler.finmanager.financemanager.model.Waluta;

import java.util.Date;

@Getter
@Setter
public class TworzenieOperacjiDTO {
    private double kwota;
    private Date dataOperacji;
    private String opisOperacji;
    private Waluta waluta;
}
