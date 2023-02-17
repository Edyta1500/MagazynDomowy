package pl.dudekonline.magazyndomowy.models;

import javax.persistence.*;

@Entity
public class Units {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10)
    private String name;

    public Units() {

    }

}
