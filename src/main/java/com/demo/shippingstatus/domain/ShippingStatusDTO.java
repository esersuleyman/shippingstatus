package com.demo.shippingstatus.domain;

public class ShippingStatusDTO {

    Status status;

    ProductDTO productDTO;

    SaleDTO saleDTO;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public SaleDTO getSaleDTO() {
        return saleDTO;
    }

    public void setSaleDTO(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
    }
}
