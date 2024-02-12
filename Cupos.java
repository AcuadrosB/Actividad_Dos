package co.edu.uniminuto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cupos {
    
     ArrayList<Object> cupos = new ArrayList<Object>();

    public void push(String s) {
        cupos.add(s);

    }

    public void pop() {
        if (cupos.size() == 0) {
            JOptionPane.showMessageDialog(null, "No ha ingresado usuario");
        } else {
            cupos.remove(0);

        }
    }   

    public String CupoN() {
       String P = "";
        for (int i= 1; i < cupos.size(); i++) {
            P= ("Cupo"+(i+1)+ "" + "\n");
        }

        return P;
    }
  

    public int numItem() {
        if(cupos.size()<=10){
             JOptionPane.showMessageDialog(null, "Cupos disponibles");
            
        }else{
            
             JOptionPane.showMessageDialog(null, "Cupos llenos");
            
        }
        return cupos.size();
    }

    public String Empty() {
        String e = "";
        if (cupos.size() == 0) {
            e = "Esta Vacia";

        } else {
            e = "NO esta Vacia";

        }
        return e;
    }

    public String PrimeroN() {
        String u = " ";
        if (cupos.size() == 0) {
            u = " ";

        } else {
            u+=cupos.get(0);
            

        }
        return u;
    }
    public String UltimoN(){
           String u = " ";
        if (cupos.size() == 0) {
          JOptionPane.showMessageDialog(null, "no hay usuarios");   

        } else {
            u+=cupos.get(cupos.size()-1);

        }
        return u;
    }
    
    
    public void VaciarPila(){
        cupos.clear();
        
    }
    
    }

    

