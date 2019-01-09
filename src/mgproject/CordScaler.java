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
public class CordScaler {
    
    public static void scaleVertex(Vertex v,double lambdaX,double lambdaY){
        v.setX(v.getX()*500/lambdaX + 30);
        v.setY(v.getY()*500/lambdaY + 30);
    }
    
    public static void scaleVertexes(List<Vertex> vertexes){
        
        double lambdaX = findLambdaX(vertexes);
        double lambdaY = findLambdaY(vertexes);
        
        for(Vertex vx:vertexes){
            scaleVertex(vx,lambdaX,lambdaY);
        }
    }
    
    private static double findMinX(List<Vertex> vertexes){
        double min = 99999.999;
        for(Vertex vx:vertexes){
            if(vx.getX()<min)
                min=vx.getX();
        }
        
        return min;
    }
    
    private static double findMinY(List<Vertex> vertexes){
        double min = 99999.999;
        for(Vertex vx:vertexes){
            if(vx.getY()<min)
                min=vx.getY();
        }
        
        return min;
    }
    
    private static double findMaxX(List<Vertex> vertexes){
        double max = -99999.999;
        for(Vertex vx:vertexes){
            if(vx.getX()>max)
                max=vx.getX();
        }
        
        return max;
    }
    
    private static double findMaxY(List<Vertex> vertexes){
        double max = -99999.999;
        for(Vertex vx:vertexes){
            if(vx.getY()>max)
                max=vx.getY();
        }
        return max;
    }
    
    public static double findLambdaX(List<Vertex> vertexes){
        return findMaxX(vertexes)-findMinX(vertexes);
    }
    
    public static double findLambdaY(List<Vertex> vertexes){
        return findMaxY(vertexes)-findMinY(vertexes);
    }
}
