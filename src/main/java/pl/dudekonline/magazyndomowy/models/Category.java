package pl.dudekonline.magazyndomowy.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 2, max = 150, message = "Name musi mieć od 5 do 150 znaków")
    @Column(length = 150, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name="image_id")
    private Image image;


    public Category(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
    }



}
