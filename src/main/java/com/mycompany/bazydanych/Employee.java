
package com.mycompany.bazydanych;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Employee {
    
    public void IUDEmployee(char operation, String id, String fname, String lname, String email, String phone,
                            String hire_date, String job_id, String salary, String comm_pct, String manager, 
                            String department)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if(operation == 'i') // wstawianie
        {
            try {
                ps = con.prepareStatement("INSERT INTO empl_demo VALUES (?, ?, ?, ?, ?, ? ,? ,? ,? ,? ,?)");
                ps.setString(1, id);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, email);
                ps.setString(5, phone);
                ps.setString(6, hire_date);
                ps.setString(7, job_id);
                ps.setString(8, salary);
                ps.setString(9, comm_pct);
                ps.setString(10, manager);
                ps.setString(11, department);
                
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Nowy pracownik dodany");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Błędne dane");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(operation == 'u') // edytowanie
        {
            try {
                ps = con.prepareStatement("UPDATE empl_demo SET first_name = ?, last_name= ?, email = ?, phone_number = ?, hire_date = ?, job_id= ?, salary= ?,commission_pct = ?, manager_id = ?, department_id = ? WHERE employee_id= ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, email);
                ps.setString(4, phone);
                ps.setString(5, hire_date);
                ps.setString(6, job_id);
                ps.setString(7, salary);
                ps.setString(8, comm_pct);
                ps.setString(9, manager);
                ps.setString(10, department);
                ps.setString(11, id);
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Pracownik Edytowany");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Błędne dane");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         if(operation == 'd') // usuwanie
        {
            try {
                ps = con.prepareStatement("DELETE FROM empl_demo WHERE employee_id = ?");
                ps.setString(1, id);
                if (ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Pracownik usuniety");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Błędne dane");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void fillEmployeeJTable(JTable table, int statement)
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        if (statement == 1){ // wyswietl wszystkich
        try {
            ps = con.prepareStatement("SELECT * FROM empl_demo ORDER BY employee_id");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                row = new Object[11];
                for(int i=0; i<11; i++){
                row[i] = rs.getString(i+1);
                if (row[i]==null)row[i]="null";
                }
                 model.addRow(row);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
        
       if (statement == 2){ //wyswietl 3 najlepiej zarabiajacych
           try {
            ps = con.prepareStatement("SELECT * from empl_demo e WHERE 3 > ( SELECT COUNT(*)FROM empl_demo WHERE e.salary < salary)");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                row = new Object[11];
                for(int i=0; i<11; i++){
                row[i] = rs.getString(i+1);
                if (row[i]==null)row[i]="null";
                }
                 model.addRow(row);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       if (statement == 3){ //wyswietl pracowników zatrudnionych w lutym
           try {
            ps = con.prepareStatement("SELECT * from empl_demo where EXTRACT(MONTH FROM hire_date)= 02");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                row = new Object[11];
                for(int i=0; i<11; i++){
                row[i] = rs.getString(i+1);
                if (row[i]==null)row[i]="null";
                }
                 model.addRow(row);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       if (statement == 4){ //Pracownikow z pensją  powyzej sredniej
           try {
            ps = con.prepareStatement("SELECT * FROM empl_demo WHERE salary > (SELECT AVG(salary) FROM empl_demo) ORDER BY salary");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                row = new Object[11];
                for(int i=0; i<11; i++){
                row[i] = rs.getString(i+1);
                if (row[i]==null)row[i]="null";
                }
                 model.addRow(row);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       if (statement == 5){ //Departamenty
           try {
            ps = con.prepareStatement("SELECT * FROM departments");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
                row = new Object[4];
                for(int i=0; i<4; i++){
                row[i] = rs.getString(i+1);
                if (row[i]==null)row[i]="null";
                }
                 model.addRow(row);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
}
