package com.company;

import java.util.*;

public class Letcode690 {

// Definition for Employee.
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    private Map<Integer, Employee> myMap = new HashMap<>();
    private Set<Integer> daDuyet = new HashSet<>();
    int totalImportance = 0;

    private void DFS(List<Employee> allEmployee, int id){
        Employee curEmployee = null;
//        for (Employee e:allEmployee) {
//            if (e.id == id){
//                curEmployee = e;
//                break;
//            }
//        }
        curEmployee = myMap.get(id);
        if (curEmployee == null){
            return;
        }
        if (daDuyet.contains(id) == true){
            return;
        }
       // Xử lý tăng totalImportance = id.importance
        totalImportance += curEmployee.importance;
        daDuyet.add(id);
        for (Integer capDuoiID:curEmployee.subordinates) {
            DFS(allEmployee, capDuoiID);
        }
    }

    public int getImportance(List<Employee> allEmployee, int id) {
        for (Employee e:allEmployee) {
            myMap.put(e.id, e);
        }
        DFS(allEmployee, id);
        return totalImportance;
    }
}
