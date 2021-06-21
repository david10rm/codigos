/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import Objetos.CPU;
import Objetos.Monitor;
import Objetos.Mouse;
import Objetos.Teclado;
import Partes.Computadora;

/**
 *
 * @author adria
 */
public class ComposicionComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadora1= new Computadora();
        computadora1.setTeclado(new Teclado("lenovo", "2005", 81, 5));
        computadora1.setMouse(new Mouse("lenovo", "2008", "inalambrico"));
        computadora1.setMonitor(new Monitor("samsung", "freeSync", 18));
        computadora1.setCpu(new CPU("dell", "optiplex", 3));
        computadora1.setMarca("lenovo");
        computadora1.setModelo("Idea centre 3");
        System.out.println(computadora1);
    }
    
}
