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
public class Asistenti extends Mesimdhenesi{
    
    private String llojiUshtrimeve;
    
    public Asistenti (String emri, int vitiLindjes, String llojiUshtrimeve){
        super(emri , vitiLindjes, "Ushtrime");
        this.llojiUshtrimeve=llojiUshtrimeve;
    }
    
    public String getLlojiUshtrimeve(){
        return llojiUshtrimeve;
    }
    
    public void setLlojiUshtrimeve(String llojiUshtrimeve){
        this.llojiUshtrimeve=llojiUshtrimeve;
    }
    
    @Override
    public String toString(){
        return "Asistenti " + super.toString()+ " "+ llojiUshtrimeve;
    }
    
}
