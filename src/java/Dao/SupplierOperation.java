/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Suppliers;
import HelpingClasses.BCrypt;
import java.util.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hp
 */
public class SupplierOperation implements SupplierDeclaration {

    SessionFactory sf;
    Session ss;
    Transaction tr;

    public SupplierOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insertStudent(Suppliers st) {
        tr = ss.beginTransaction();
        System.err.println(" " + st.getSName());
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Suppliers st) {
        tr=ss.beginTransaction();
        st.setS_id(id);
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
        Suppliers st = new Suppliers();
        st.setS_id(id);
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
    public Suppliers selectStudent(long id) {
        Suppliers st=(Suppliers)ss.get(Suppliers.class,id);
        if(st!=null)
        {
            return st;
        }
        return null;
    }

    @Override
    public List selectAllStudents() {
        tr = ss.beginTransaction();
        String hql = "from Bean.Suppliers";
        Query query = ss.createQuery(hql);
        List<Suppliers> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }
}
