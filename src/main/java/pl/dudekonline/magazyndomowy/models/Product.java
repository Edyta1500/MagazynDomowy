package pl.dudekonline.magazyndomowy.models;




import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 2,max = 100, message = "Nazwa musi mieć od 2 do 100 znaków")
    @Column(length = 100, nullable = false)
    private String name;

    @NotBlank(message = "Pole jest wymagane")
    @Size(min = 5,max = 2000, message = "Opis musi mieć od 5 do 2000 znaków")
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

    public Product() {

    }

    public Product(Integer id, String name, String description, Integer amount,Units units,  List<Image> image,Category category ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.units = units;
        this.image = image;
        this.category = category;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
