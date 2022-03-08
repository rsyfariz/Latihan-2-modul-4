/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2.pkginterface.line;

/**
 *
 * @author asus
 */
public class coba {
    
    public static void main(String[] args) {
        ClassLine coba = new ClassLine(2.5,3,4,5);
        ClassLine pertama = new ClassLine(3,4,5,6);
        coba.getLength();
        coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba,pertama));
        
    }
    
}
