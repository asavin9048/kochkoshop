package com.magosdominus.kochkoshop.repositoty;


import com.magosdominus.kochkoshop.entity.PayOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<PayOrder,Integer> {
}
