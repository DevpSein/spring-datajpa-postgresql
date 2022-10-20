package com.devpsein.springdatajpapostgresql.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"}) //Eğer idleri eşitse bunlar birbirinin aynıdır
@ToString
public class Kisi {
    @Id
    @SequenceGenerator(name = "seq_kisi",allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE )
    private Long id;

    @Column(length = 100, name = "ad")
    private String ad ;
    @Column(length = 100, name = "soyad")
    private String soyad;

    @OneToMany //Bir kişi bircok adrese gidebilir // @OneToOne: Bir kişi bir adrese gidebilir.
    @JoinColumn(name = "kişi_adres_id" ) // aynı tarafta karşılığı olacak tam tersi olacak(ManyToOne)
    private List<Adres> adresleri;

}
