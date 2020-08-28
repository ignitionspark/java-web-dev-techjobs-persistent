package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Description Field can not be blank.")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String Description;
@ManyToMany(mappedBy = "skills")
    public List<Job> jobs= new ArrayList<Job>();
    public Skill() { }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
