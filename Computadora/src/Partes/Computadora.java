/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partes;

import Objetos.CPU;
import Objetos.Monitor;
import Objetos.Mouse;
import Objetos.Teclado;

/**
 *
 * @author adria
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Teclado teclado;
    private Mouse mouse;
    private CPU cpu;
    private Monitor monitor;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Teclado teclado, Mouse mouse, CPU cpu, Monitor monitor) {
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
        this.mouse = mouse;
        this.cpu = cpu;
        this.monitor = monitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", teclado=" + teclado + ", mouse=" + mouse + ", cpu=" + cpu + ", monitor=" + monitor + '}';
    }
    

   
    
    
}
