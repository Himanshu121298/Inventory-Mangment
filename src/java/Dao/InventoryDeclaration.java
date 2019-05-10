/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Inventory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public interface InventoryDeclaration {
   public long insert(Inventory st);
   public long upDate(long id,Inventory st);
   public boolean deleteinfo(long id);
   public Inventory select(long id);
   public List selectAll();

}
