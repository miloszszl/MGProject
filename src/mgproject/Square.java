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
public class Square {
    private int[] vertexesNumbers;
    private Vertex[] vertexes;
    
    public Square(){
        vertexesNumbers = new int[4];
        vertexes = new Vertex[4];
    }

    public int[] getVertexesNumbers() {
        return vertexesNumbers;
    }

    public void setVertexesNumbers(int[] vertexesNumbers) {
        this.vertexesNumbers = vertexesNumbers;
    }

    public Vertex[] getVertexes() {
        return vertexes;
    }

    public void setVertexes(Vertex[] vertexes) {
        this.vertexes = vertexes;
    }
    
    public String getDrawFormula(){
        
        double r = Math.random(),g = Math.random(),b =Math.random();
        
        String s = 
            vertexes[0].getX()+" "+vertexes[0].getY()+" moveto\n" +
            vertexes[1].getX()+" "+vertexes[1].getY()+" lineto\n" +
            vertexes[2].getX()+" "+vertexes[2].getY()+" lineto\n" +
            vertexes[3].getX()+" "+vertexes[3].getY()+" lineto\n" +
            vertexes[0].getX()+" "+vertexes[0].getY()+" lineto\n" +
            "gsave\n"+
            r+" "+g+" "+b+" setrgbcolor\n" +
            "fill\n"+
            "grestore\n"+
            "0 0 0 setrgbcolor\n"+
            "stroke\n";
        return s;
    }
    
    public String getDrawSpecialFormula(){
        
        double r = Math.random(),g = Math.random(),b =Math.random();
        
        String s = 
            vertexes[0].getX()+" "+vertexes[0].getY()+" moveto\n" +
            vertexes[1].getX()+" "+vertexes[1].getY()+" lineto\n" +
            vertexes[2].getX()+" "+vertexes[2].getY()+" lineto\n" +
            vertexes[3].getX()+" "+vertexes[3].getY()+" lineto\n" +
            vertexes[0].getX()+" "+vertexes[0].getY()+" lineto\n" +
            "gsave\n"+
            r+" "+g+" "+b+" setrgbcolor\n" +
            "fill\n"+
            "grestore\n"+
            "3 setlinewidth\n"+
            "0 0 0 setrgbcolor\n"+
            "stroke\n";
        return s;
    }
}
