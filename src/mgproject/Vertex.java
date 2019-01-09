/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject;

/**
 *
 * @author milosz
 */
public class Vertex {
    private double x;
    private double y;
    
    public Vertex(){}
    
    public Vertex(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public String getVertexFormulaRed(){
        String s = x+" "+y+" moveto\n" +
                "0.01 setlinewidth\n"+
            x+" "+y+" 10 0 360 arc\n" +
            "stroke\n" +
            "1 0 0 setrgbcolor\n" +
            x+" "+y+" 10 0 360 arc\n" +
            "closepath\n" +
            "fill\n";
        return s;
    }
    
    public String getVertexFormulaGreen(){
        String s = x+" "+y+" moveto\n" +
                "0.01 setlinewidth\n"+
            x+" "+y+" 10 0 360 arc\n" +
            "stroke\n" +
            "0 1 0 setrgbcolor\n" +
            x+" "+y+" 10 0 360 arc\n" +
            "closepath\n" +
            "fill\n";
        return s;
    }
}
