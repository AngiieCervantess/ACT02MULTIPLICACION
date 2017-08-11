/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act2multiplicacionvector;

/**
 *
 * @author Familia Andrade
 */
public class ACT2MULTIPLICACIONVECTOR {
  
        public static int mult(int v[], int n){
       
            if (n == 0) {
            return v [n];
        }else {
            return mult(v, n - 1) * v [n];
        }
        }
        public static void main(String[] args) {
        }
    }
    
