package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location Field can not be blank.")
    private String location;

    @ManyToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<Job>();

    public Employer() { }
    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
