package pl.astedler.finmanager.financemanager.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ListaOperacjiDTO {
    private Long id;
    private double kwota;
    private Date dataOperacji;
    private String opisOperacji;
}
