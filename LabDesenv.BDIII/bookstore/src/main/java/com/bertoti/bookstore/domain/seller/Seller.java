package com.bertoti.bookstore.domain.seller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="sellers")
@Table(name="sellers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sel_id")
    private Long id;

    @Column(name="sel_name")
    private String name;

    @Column(name="sel_email", unique=true)
    private String email;

    @Column(name="sel_celNumber", unique=true)
    private String celNumber;
    
}
