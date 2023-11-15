package com.bertoti.bookstore.domain.book;

import com.bertoti.bookstore.domain.author.Author;
import com.bertoti.bookstore.domain.seller.Seller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="books")
@Table(name="books")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private Long id;

    @Column(name="book_title")
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name="book_type")
    private BookType type;

    @ManyToOne
    @JoinColumn(name="sel_id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name="aut_id")
    private Author author;

    @Column(name="book_description")
    private String description;

    @Column(name="forSale")
    private Boolean forSale;
}
