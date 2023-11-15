package com.bertoti.bookstore.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bertoti.bookstore.domain.seller.Seller;

@RepositoryRestResource
public interface SellerRepository extends JpaRepository<Seller, Long>{
    public Seller save(Seller book);
  

}