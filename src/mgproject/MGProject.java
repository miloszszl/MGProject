/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author milosz
 */
public class MGProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SquaresParser fr = new SquaresParser();
        List<Square> squares = fr.readFromFile("dane_prostokaty.txt");
        
        System.out.print("Podaj numer wierzcholka:");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        PSDrawer.draw(squares,n);
        reader.close();
        // TODO code application logic here
    }
}
