package com.tech.and.project.tech.and.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idProject;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="developer_id_fk", referencedColumnName="developer_id"),
            @JoinColumn(name="developer_id_type", referencedColumnName="id_type")
    })
    private Developer developer;

    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="customer_id_fk", referencedColumnName="customer_id")
    })
    private Customer customer;

    @Column(name="project_description")
    private String projectDescription;


}
