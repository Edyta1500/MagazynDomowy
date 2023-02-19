package pl.dudekonline.magazyndomowy.models;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 2, max = 100, message = "Nazwa musi mieć od 2 do 100 znaków")
    @Column(length = 100, nullable = false)
    private String name;

    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 5, max = 2000, message = "Opis musi mieć od 5 do 2000 znaków")
    @Column(length = 2000)
    private String description;

    private Integer amount;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Image> image;

    @NotBlank(message = "Pole jest wymagane")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @NotBlank(message = "Pole jest wymagane")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id")
    private Units units;


}