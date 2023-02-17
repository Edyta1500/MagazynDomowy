package pl.dudekonline.magazyndomowy.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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

    public Category() {

    }

    public Category(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
