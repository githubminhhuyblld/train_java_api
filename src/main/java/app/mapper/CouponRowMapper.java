package app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import app.models.Coupon;

public class CouponRowMapper implements RowMapper<Coupon> {

	@Override
    public Coupon mapRow(ResultSet rs, int rowNum) throws SQLException {
        Coupon coupon = new Coupon();
        coupon.setId(rs.getInt("id"));
        coupon.setCouponCode(rs.getString("coupon_code"));
        coupon.setDescription(rs.getString("description"));
        coupon.setDiscountAmount(rs.getInt("discount_amount"));
        coupon.setStartDate(rs.getTimestamp("start_date").toLocalDateTime());
        coupon.setEndDate(rs.getTimestamp("end_date").toLocalDateTime());
        coupon.setExpirationDate(rs.getTimestamp("expiration_date").toLocalDateTime());
        coupon.setStatus(rs.getString("status"));
        coupon.setDeleteFlag(rs.getInt("delete_flag"));
        return coupon;
    }
}

