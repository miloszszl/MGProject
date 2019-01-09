/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject;

import java.util.List;

/**
 *
 * @author milosz
 */
public class SquaresGenerator {
    
    public static List<Square> asignVerexesToSquares(List<Square> squares,List<Vertex> vertexes){
        
        for(Square s:squares){
            for(int i=0;i<s.getVertexesNumbers().length;i++){
                int index = s.getVertexesNumbers()[i];
                s.getVertexes()[i]=vertexes.get(index);
            }
        }
        return squares;
    }
    
    
}
