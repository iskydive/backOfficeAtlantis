package hello.model;

import javax.persistence.*;

@Entity(name = "deviceType")
@Table(name = "devicetype")
public class DeviceType {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
