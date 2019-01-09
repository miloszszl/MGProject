/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milosz
 */
public class PSDrawer {

    public static void draw(List<Square> squares,int n){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("siatka.ps"), "utf-8"))) {
            writer.write("1 setlinewidth\n\n");
            writer.write("0 0 moveto\n");
            
            List<Square> highlightedSquares = new ArrayList<Square>();
            Vertex v = null;
            
            List<Vertex> vList = new ArrayList<Vertex>();
            for(Square s:squares){
                boolean flag=true;
                for(int i=0;i<4;i++){
                    if(s.getVertexesNumbers()[i]==n){
                        highlightedSquares.add(s);
                        flag = false;
                        if(v ==null){
                            v = s.getVertexes()[i];
                        }
                    }
                }
                
                if(flag)
                    writer.write(s.getDrawFormula()+"\n");
                else{
                    for(int i=0;i<4;i++){
                        if(s.getVertexesNumbers()[i]!=n && !vList.contains(s.getVertexes()[i]))
                            vList.add(s.getVertexes()[i]);
                    }
                }
            }
            
            for(Square s:highlightedSquares){
                writer.write(s.getDrawSpecialFormula());
            }
            
            for(Vertex vx:vList){
                writer.write(vx.getVertexFormulaGreen());
            }
            
            writer.write(v.getVertexFormulaRed());
            
            writer.write("\nshowpage\n");
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PSDrawer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PSDrawer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
