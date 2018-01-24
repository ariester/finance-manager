package pl.astedler.finmanager.financemanager.model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "WALUTA")
public class Waluta {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAZWA_WALUTY")
    private String nazwaWaluty;

    @Column(name = "KURS", nullable = false)
    private double kurs;
}
