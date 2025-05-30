/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.DTO;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class ProductBatchDTO {
    private int batchID;
    private int medicineID;
    private LocalDate manufacturingDate;
    private LocalDate expirationDate;
    private int quantityInStock;
    private int quantityReceived;
    private double sellPrice;

    public ProductBatchDTO(int batchID, int medicineID, LocalDate manufacturingDate, LocalDate expirationDate, int quantityInStock, int quantityReceived, double sellPrice) {
        this.batchID = batchID;
        this.medicineID = medicineID;
        this.manufacturingDate = manufacturingDate;
        this.expirationDate = expirationDate;
        this.quantityInStock = quantityInStock;
        this.quantityReceived = quantityReceived;
        this.sellPrice = sellPrice;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public int getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID = medicineID;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(int quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    
    
    
}
