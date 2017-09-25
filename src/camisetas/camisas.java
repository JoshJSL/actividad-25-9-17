/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camisetas;

import java.util.Random;

/**
 *
 * @author Alumno
 */
public class camisas {
    
    private String _color="";
    private String _talla="";
    private int _estampado=0;
    
    camisas(){
    }
    
    camisas(String _color, String _talla, int _estampado){
        this._color=_color;
        this._talla=_talla;
        this._estampado=_estampado;
    }
    
    camisas(String _talla){
        this._talla=_talla;
        this._color=colorRnd();
        this._estampado=estampadoRnd();
        
    }
    
    camisas(String _talla, String _color){
        this._talla=_talla;
        this._color=_color;
        this._estampado=estampadoRnd();
    }
    
    camisas(String _talla, int _estampado){
        
        this._talla=_talla;
        this._color=colorRnd();
    }
    
        
    public String colorRnd(){
        Random rnd= new Random();
        String colorRnd="";
        String[]colores={"rojo","azul","rosa","morado","amarillo"};
        colorRnd=colores[rnd.nextInt()*5+1];
                
        return  colorRnd;
    }
    
    public int estampadoRnd(){
        int estampadoRnd=0;
                
        return  estampadoRnd;
    }
    
}
