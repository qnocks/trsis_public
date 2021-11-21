package com.example.lab5.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String brand;

    @NonNull
    private Integer year;

    @NonNull
    private Integer price;

    @OneToOne(mappedBy = "car")
    private Purchase purchase;
}
