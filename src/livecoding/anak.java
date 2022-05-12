/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livecoding;

/**
 *
 * @author LENOVO
 */
public class anak extends LiveCoding{
    public String nama;
    public String nomor;
    //overridiing
    @Override
    public void SetNama(){
            System.out.println("nama: "+nama);
    }       
   
    @Override
     public void SetNomor() {
        System.out.println("nomor:"+nomor);
    }
    
}
