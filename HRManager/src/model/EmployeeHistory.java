/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class EmployeeHistory {
    
    private ArrayList<ManagerVar> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<ManagerVar>();
    }

    public ArrayList<ManagerVar> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ManagerVar> history) {
        this.history = history;
    }
    
    public ManagerVar getHistoryValues(int index){
        ManagerVar newEmployee = new ManagerVar();
        newEmployee = history.get(index);
        return newEmployee;
    }
    
    public ManagerVar addEmployeeDetails(){
        ManagerVar newEmployee = new ManagerVar();
        history.add(newEmployee);
        
        return newEmployee;
    }
    
    public void deleteEmployee(ManagerVar mv){
        history.remove(mv);
    }
    
}
