package pl.astedler.finmanager.financemanager.model;

import lombok.*;
import java.util.Date;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "OPERACJE")
public class Operacje {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="KWOTA")
    private double kwota;

    @Column(name="DATA_OPERACJI")
    private Date dataOperacji;

    @Column(name="OPIS_OPERACJI")
    private String opisOperacji;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WALUTA_ID")
    private Waluta waluta;
}
