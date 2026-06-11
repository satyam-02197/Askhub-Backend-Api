package org.example.askhub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data

public class Tag extends BaseModel{
    @ManyToMany(mappedBy = "follwedTags")
    private Set<User> users;
}
