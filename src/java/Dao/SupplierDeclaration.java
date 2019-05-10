/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Suppliers;
import java.util.*;

/**
 *
 * @author hp
 */
public interface SupplierDeclaration {

    public long insertStudent(Suppliers st);

    public long upDate(long id, Suppliers st);

    public boolean deleteinfo(long id);

    public Suppliers selectStudent(long id);

    public List selectAllStudents();

}
