package app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.models.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	

}
