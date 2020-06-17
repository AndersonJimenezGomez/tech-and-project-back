package com.tech.and.project.tech.and.project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class DeveloperPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name = "developer_id")
    private String customerId;

    @Column(name="id_type")
    private String idType;

}
