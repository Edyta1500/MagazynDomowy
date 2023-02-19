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
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 5, max = 2000, message = "Adres url musi mieć od 5 do 2000 znaków")
    @Column(nullable = false)
    private String url;

}

