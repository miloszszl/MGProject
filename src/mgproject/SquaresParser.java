/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author milosz
 */
public class SquaresParser {
    
    public List<Square> readFromFile(final String fileName){
        
        List<Square> squares = new ArrayList<Square>();
        List<Square> sq = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;
            int numOfVertexes=0;
            
            sCurrentLine = br.readLine();
            
            if(sCurrentLine!=null)
                numOfVertexes = Integer.parseInt(sCurrentLine) + 4;
            
            List<Vertex> vertexes = new ArrayList<Vertex>();
            Vertex v;
            
            for(int i=0;i<=numOfVertexes;i++){
                if((sCurrentLine=br.readLine())!=null){
                    String[] arr = sCurrentLine.split(" ");
                    
                    if(arr.length==2){
                        v = new Vertex();
                        v.setX(Double.parseDouble(arr[0]));
                        v.setY(Double.parseDouble(arr[1]));
                        vertexes.add(v);
                    }
                }
            }
            
            CordScaler.scaleVertexes(vertexes);
            
            sCurrentLine = br.readLine();
            sCurrentLine = br.readLine();
            int numberOfSquares=0;
            
            if(sCurrentLine!=null)
                numberOfSquares = Integer.parseInt(sCurrentLine) + 2;
            
            Square s;
            for(int i=0;i<=numberOfSquares;i++){
                if((sCurrentLine=br.readLine())!=null){
                    String[] arr = sCurrentLine.split(" ");
                    
                    if(arr.length==4){
                        s = new Square();
                        int[] sqarr = {Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3])};
                        s.setVertexesNumbers(sqarr);
                        squares.add(s);
                    }
                }
            }
            
            sq = SquaresGenerator.asignVerexesToSquares(squares,vertexes);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return sq;
    }
    
}
