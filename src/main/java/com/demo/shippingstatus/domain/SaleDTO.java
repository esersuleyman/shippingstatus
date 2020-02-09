package com.demo.shippingstatus.domain;

public class SaleDTO {

    private Integer id;

    private String saleCode;

    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
