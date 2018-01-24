package pl.astedler.finmanager.financemanager.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KursyWalutDTO {
    private Long id;
    private String nazwaWaluty;
    private double kurs;
}
