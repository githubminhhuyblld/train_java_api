package app.dto;

import java.time.LocalDateTime;

public class CouponDTO {
    private int id;
    private String couponCode;
    private String description;
    private int discountAmount;
    private String startDate;
    private String endDate;
    private String expirationDate;
    private String status;
    private int deleteFlag;

    public CouponDTO() {
    }

    public CouponDTO(int id, String couponCode, String description, int discountAmount, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime expirationDate, String status, int deleteFlag) {
        this.id = id;
        this.couponCode = couponCode;
        this.description = description;
        this.discountAmount = discountAmount;
        this.startDate = startDate.toString();
        this.endDate = endDate.toString();
        this.expirationDate = expirationDate.toString();
        this.status = status;
        this.deleteFlag = deleteFlag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}

