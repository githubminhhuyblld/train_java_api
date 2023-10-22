package app.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import app.mapper.CouponRowMapper;
import app.models.Coupon;
import app.services.ICouponService;

@Service
public class CouponServiceImpl implements ICouponService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Coupon> getCouponsByUserId(Long userId) {
		String sql = "SELECT * FROM coupon " + "WHERE status = 'ACTIVE' " + "AND id IN ( "
				+ "SELECT coupon_id FROM user_coupon " + "WHERE user_id = ? " + ")";

		return jdbcTemplate.query(sql, new Object[] { userId }, new CouponRowMapper());
	}


	
	public List<Coupon> getCoupons(Long userId, Long storeId, Long productId) {
	    String sql = "SELECT * FROM coupon " +
	            "WHERE status = 'ACTIVE' ";

	    List<Object> params = new ArrayList<>();
	    
	    if (userId != null) {
	        sql += "AND id IN (" +
	                "SELECT coupon_id FROM user_coupon " +
	                "WHERE user_id = ? " +
	                ")";
	        params.add(userId);
	    }
	    
	    if (storeId != null) {
	        sql += "AND id IN (" +
	                "SELECT coupon_id FROM store_coupon " +
	                "WHERE store_id = ? " +
	                ")";
	        params.add(storeId);
	    }
	    
	    if (productId != null) {
	        sql += "AND id IN (" +
	                "SELECT coupon_id FROM product_coupon " +
	                "WHERE product_id = ?" +
	                ")";
	        params.add(productId);
	    }
	    
	    return jdbcTemplate.query(sql, params.toArray(), new CouponRowMapper());
	}



}
