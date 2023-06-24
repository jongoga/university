/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakulteti;

/**
 *
 * @author Jon
 */
public class Profesori extends Mesimdhenesi {
    
    private String thirrjaAkademike;
    
    public Profesori(String emri, int vitiLindjes, String thirrjaAkademike){
        super(emri, vitiLindjes, "Ligjerata");
        this.thirrjaAkademike=thirrjaAkademike;
    }
    
    public String getThirrjaAkademike(){
        return thirrjaAkademike;
    }
    
    public void setThirrjaAkademike(String thirrjAkademike){
        this.thirrjaAkademike = thirrjaAkademike;
    }
    
    @Override
    public String toString(){
        return "Profesori "+ super.toString()+ ", ka thirrje "+ thirrjaAkademike;
    }
}
