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
public class Suppliers implements Serializable {
   @Id
   @GeneratedValue
   private long s_id;
 
   @Column(unique=true)
   private String SName;
   
   private String Email;
   private String Phone;
   private String Office;
   private String Category;

    public Suppliers() {
    }

    public Suppliers(String SName, String Email, String Phone, String Office, String Category) {
        this.SName = SName;
        this.Email = Email;
        this.Phone = Phone;
        this.Office = Office;
        this.Category = Category;
    }

    public long getS_id() {
        return s_id;
    }

    public void setS_id(long s_id) {
        this.s_id = s_id;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
    
}
