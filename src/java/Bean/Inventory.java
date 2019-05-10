/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author hp
 */
@Entity
public class Inventory implements Serializable {
    @Id
    @GeneratedValue
   private long i_id;
   @Column(unique=true) 
   private String PName;
   private String Brand;
   private String Category;
   private String Stock;
   private String Price;

    public Inventory() {
    }

    public Inventory(String PName, String Brand, String Category, String Stock, String Price) {
        this.PName = PName;
        this.Brand = Brand;
        this.Category = Category;
        this.Stock = Stock;
        this.Price = Price;
    }

    public long getB_id() {
        return i_id;
    }

    public void setB_id(long i_id) {
        this.i_id = i_id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
}
