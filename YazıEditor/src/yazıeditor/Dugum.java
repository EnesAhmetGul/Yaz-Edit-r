/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yazıeditor;

/**
 *
 * @author Lenovo
 */
public class Dugum {
    public Dugum sonraki;
    int index;
    String kelime;
    
    public Dugum(int i, String s){
        index = i;
        kelime = s;
    }
    
    public String ToString(){
       return kelime;
    }
}
