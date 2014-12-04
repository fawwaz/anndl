/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anndl;

/**
 *
 * @author Asus
 */

import anndl.lang.*;
import anndl.model.ModelClassifier;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
        
public class Anndl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /*if(args.length == 1){*/
        String namafile = "tes.anndl";
//            buildModel(new FileInputStream(new File(args[0])));
        buildModel(new FileInputStream(new File(namafile)));
        /*}else{
            System.out.println("Wrong Command, usage  : java -jar ANNDL.jar <ANNDL File> ");
        }*/
    }
    

    private static void buildModel(InputStream input) throws Exception{
        ANNDLLexer lexer = new ANNDLLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ANNDLParser parser = new ANNDLParser(tokens);
        ParseTree tree = parser.model();
        
        ModelVisitor visitor = new ModelVisitor();
        
        //System.out.println(visitor.visit(tree));
        ModelClassifier themodel = (ModelClassifier) visitor.visit(tree);
        themodel.PrintInfo();
        System.out.println("");
                
    }
    
}
