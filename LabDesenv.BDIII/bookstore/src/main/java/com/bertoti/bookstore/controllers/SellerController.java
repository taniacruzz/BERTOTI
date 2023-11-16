package com.bertoti.bookstore.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bertoti.bookstore.domain.seller.Seller;
import com.bertoti.bookstore.repositories.SellerRepository;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private final SellerRepository sellerRepository;

    public SellerController(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }
    
    @GetMapping
    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }
}
