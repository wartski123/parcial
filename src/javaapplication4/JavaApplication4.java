/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JOptionPane;



/**
 *
 * @author pedro
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    JOptionPane.showMessageDialog(null, a + "" + b + "" + "" + c);
                } else {
                    JOptionPane.showMessageDialog(null, a + "" + c + "" + "" + b);
                }

            } else {
                JOptionPane.showMessageDialog(null, c + "" + a + "" + "" + b);
            }

        } else {
            if (b > c) {
                if (c > a) {
                    JOptionPane.showMessageDialog(null, b + "" + c + "" + "" + a);
                } else {
                    JOptionPane.showMessageDialog(null, b + "" + a + "" + "" + c);
                }
            } else {
                JOptionPane.showMessageDialog(null, c + "" + b + "" + "" + a);
            }
        }

    }
    
    
}
