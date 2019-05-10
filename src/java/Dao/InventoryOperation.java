/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Inventory;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class InventoryOperation implements InventoryDeclaration {
     SessionFactory sf;
    Session ss;
    Transaction tr;

    public InventoryOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insert(Inventory st) {
       tr = ss.beginTransaction();
       
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Inventory st) {
    tr=ss.beginTransaction();
        st.setB_id(id);
        try{
            ss.update(st);
            tr.commit();
            return id;  
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean deleteinfo(long id) {
    tr = ss.beginTransaction();
        Inventory st = new Inventory();
        st.setB_id(id);
        try {
            ss.delete(st);
            tr.commit();
            return true; 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Inventory select(long id) {
    Inventory st=(Inventory)ss.get(Inventory.class,id);
        if(st!=null)
        {
            return st;
        }
        return null;
    }

    @Override
    public List selectAll() {
      tr = ss.beginTransaction();
        String hql = "from Bean.Buses";
        Query query = ss.createQuery(hql);
        List<Inventory> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }
}
