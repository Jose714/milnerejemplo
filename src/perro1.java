
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J Milner
 */
class perro1 {
    int size;
    String nombre;
    
    public void ladrar(){//metodo no devuelve nada y no recibe parametros
        Scanner teclado = new Scanner(System.in);
        if (size>60){
            System.out.println("Woooof! Woooof");
        }
        else if(size>14){
            System.out.println("Ruuuf! Ruuuuf!");
        }
        else{
            System.out.println("Yiiip! Yiiip!");
            
        }
    }
    
    public void ladrarMuchasveces(int numeroveces){
        while (numeroveces>0){
            ladrar();
            numeroveces--;
        }
    }
    

    }
    
