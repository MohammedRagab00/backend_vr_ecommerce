package com.gotrid.trid.core.review.repository;

import com.gotrid.trid.core.product.model.Product;
import com.gotrid.trid.core.review.model.Review;
import com.gotrid.trid.core.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByProduct_Id(Integer productId);

    boolean existsByUserAndProduct(Users user, Product product);
}
