package com.tech.and.project.tech.and.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long customerId;

    @Column(name="customer_name")
    private String customerName;

}
