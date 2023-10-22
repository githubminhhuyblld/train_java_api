package app.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.models.Coupon;
import app.repository.CouponRepository;
import app.services.impl.CouponServiceImpl;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {
	@Autowired
	private CouponServiceImpl couponService;

	@GetMapping("/{userId}")
	public List<Coupon> getCouponsByUserId(@PathVariable Long userId) {
		return couponService.getCouponsByUserId(userId);
	}
	
	@GetMapping("")
	public List<Coupon> getCouponsByUserIdAndStoreId(
	        @RequestParam(required = false) Long userId,
	        @RequestParam(required = false) Long storeId,
	        @RequestParam(required = false) Long productId) {
        return couponService.getCoupons(userId, storeId, productId);

	}


}
