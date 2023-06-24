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
public class Fakulteti {

    private String drejtimi;
    private Mesimdhenesi[] mesimdhenesit;
    private int index=0;
    
    public Fakulteti (String drejtimi, int nrM){
        this.drejtimi=drejtimi;
        mesimdhenesit=new Mesimdhenesi[nrM];
    }
    
    public boolean ekziston(Mesimdhenesi m){
        for(int i=0; i <index;i++){
            if(mesimdhenesit[i].equals(m)){
                return true;
            }
        }return false;
    }
    
    public void shtoMesimdhenesin(Mesimdhenesi m){
        if(m==null){
            System.out.println("Mesimdhenesi nuk eshte inicialzuar");
            return;
        }
        if(index == mesimdhenesit.length){
            System.out.println("Nuk ka vend ne varg");
            return;
        }
        if(ekziston(m)){
            System.out.println("Mesimdheneis ne varg ekziston");
            return;
        }
        mesimdhenesit[index++]=m;
    }
    
    
    public Profesori profesoriMeIRi(){
        if(index ==0){
            System.out.println("Nuk ka asnje mesimdhenes ne fakultet");
            return null;
        }
        Profesori meIRiu=null;
        for(int i=0; i<index;i++){
            if(mesimdhenesit[i] instanceof Profesori){
                Profesori aktual =(Profesori)mesimdhenesit[i];
                if(meIRiu == null || aktual.getVitiLindjes()>= meIRiu.getVitiLindjes()){
                    meIRiu= aktual;
                }
            }
        }
        if(meIRiu== null){
            System.out.println("NUk ka asnje profesor ne fakultet");
        }return meIRiu;
    }
    
    public void shtypLlojinEUshtrimeve(String llu){
        if(index ==0){
            System.out.println("Nuk ka asnnje mesimdhenes ne fakultet");
            return;
            
        }
        for(int i =0;i<index;i++){
            if(mesimdhenesit[i] instanceof Asistenti){
                Asistenti a = (Asistenti) mesimdhenesit[i];
                if(a.getLlojiUshtrimeve().equals(llu)){
                    System.out.println(a);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Fakulteti f=new Fakulteti("Shkenca Kompjuterike", 10);
        Profesori meIRiu1=f.profesoriMeIRi();
        f.shtoMesimdhenesin(new Asistenti ("Giao Pao " , 1987,"Lboratorike"));
        Profesori meIRiu2= f.profesoriMeIRi();
        f.shtoMesimdhenesin(new Profesori("Jon Goga",1999,"Prof boss"));
        Mesimdhenesi m = new Asistenti("Jao Cao ", 1984,"Laboratorike");
        System.out.println();
        System.out.println("Mesimdhenesi: "+m+ (f.ekziston(m)? " " : " nuk "+ " ekziston " ) );
        System.out.println();
        Profesori meIRiu=f.profesoriMeIRi();
        if(meIRiu != null )
            System.out.println("Profesori me i ri "+ meIRiu);
        System.out.println();
        System.out.println("Asistentet mme ushtrime laboratorike :");
        f.shtypLlojinEUshtrimeve("Lboratorike");
        
    }
    
}
