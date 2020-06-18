package com.tech.and.project.tech.and.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="developer")
public class Developer {

    @EmbeddedId
    private DeveloperPK id;

    @Column(name="developer_name")
    private String developerName;

    @Column(name="developer_last_name")
    private String developerLastName;

    @Column(name="email")
    private String email;
}
