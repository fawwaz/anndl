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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import weka.classifiers.Classifier;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Debug;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
        
public class Anndl {
    
    public Scanner scanner;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int pilihan = 0;
        Anndl anndl = new Anndl();
        
        do {            
            anndl.PrintMenu();
            pilihan = anndl.scanner.nextInt();
            anndl.doAction(pilihan);
        } while (pilihan!=3);
        System.out.println("Bye .. !");
        // TODO code application logic here
        /*if(args.length == 1){*/
        //String namafile = "tes.anndl";
//            buildModel(new FileInputStream(new File(args[0])));
        //buildModel(new FileInputStream(new File(namafile)));
        /*}else{
            System.out.println("Wrong Command, usage  : java -jar ANNDL.jar <ANNDL File> ");
        }*/
    }

    public Anndl() {
        scanner = new Scanner(System.in);
    }
    
    
       
    
    private void PrintMenu(){
        System.out.println("\n");
        System.out.println("=== MENU ANN Description Langguage ===");
        System.out.println("1. Build Model");
        System.out.println("2. Classify Data");
        System.out.println("3. Exit");
        System.out.println("Your Choice \t : ");
        System.out.println("======================================");
    }
    
    private void doAction(int pilihan) throws Exception{
        switch(pilihan){
            case 1 :
                System.out.println("Pilihan 1 Dipilih");
                makeModel();
                break;
            case 2 :
                System.out.println("Pilihan 2 dipilih");
                classifyTest();
                break;
            case 3 :
                break;
            default:
                System.out.println("\n-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX ");
                System.out.println("Tidak Terdapat Pilihan yang anda pilih.. ulangi lagi..");
                System.out.println("-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX \n");
                break;
        }
                
    }
    
    private void makeModel(){
        System.out.println("Masukan Nama File *.anndl (Artificial Neural Network Description Langguagge)");
        String inputfile = scanner.nextLine();
        try {
            buildModel(new FileInputStream(new File(inputfile)));
        } catch (Exception e) {
            System.out.println("\n-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX");
            System.out.println("Terjadi Kesalahan, mungkin karena file tersebut tidak ada atau kesalahan lainya");
            System.out.println("-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX \n");
        }
    }
   
    
    private static void buildModel(InputStream input) throws Exception{
        ANNDLLexer lexer = new ANNDLLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ANNDLParser parser = new ANNDLParser(tokens);
        ParseTree tree = parser.model();
        
        ModelVisitor visitor = new ModelVisitor();
        
        ModelClassifier themodel = (ModelClassifier) visitor.visit(tree);
        //themodel.PrintInfo();
        themodel.extracthidden();        
        
        System.out.println("Membaca File Training...");
        DataSource trainingsoure = new DataSource(themodel.filetraining);
        Instances trainingdata = trainingsoure.getDataSet();
        if(trainingdata.classIndex() == - 1) {
            trainingdata.setClassIndex(trainingdata.numAttributes()-1);
        }
        
        System.out.println("Melakukan konfigurasi ANN ... ");
        MultilayerPerceptron mlp = new MultilayerPerceptron();
        mlp.setLearningRate(themodel.learningrate);
        mlp.setMomentum(themodel.momentum);
        mlp.setTrainingTime(themodel.epoch);
        mlp.setHiddenLayers(themodel.hidden);
        
        System.out.println("Melakukan Training data ...");
        mlp.buildClassifier(trainingdata);
        
        Debug.saveToFile(themodel.namamodel+".model", mlp);
        
        System.out.println("\n~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ ..");
        System.out.println("Model ANN Berhasil Diciptakan dengan nama file : "+ themodel.namamodel+".model");
        System.out.println("~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. ~~ .. \n");
        
    }
    
    private void classifyTest() throws Exception{
        System.out.println("Masukan nama file model yang akan dijadikan Classifier :");
        String fileinput = scanner.next();
        //try {
            ClassifyInstance(fileinput);
        //} catch (Exception ex) {
            System.out.println("\n-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX");
            System.out.println("Terjadi Kesalahan, mungkin karena file tersebut tidak ada atau kesalahan lainya");
            System.out.println("Silahkan load di Weka .. ");
            System.out.println("-- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX -- XX \n");
        //}
        
    }
    
    private void ClassifyInstance(String fileinput) throws Exception{        
        System.out.println("Membaca File Model ..");
        Classifier cls = (Classifier) weka.core.SerializationHelper.read(fileinput);
        
        System.out.println("Masukan Data yang ingin diklasifikasikan, pisahkan dengan spasi :");
        String testset = scanner.nextLine();
        testset = "1 1 0";
        String[] exploded = testset.split(" ");
        
        Instance newinstance = new Instance(exploded.length);        
        for (int i = 0; i < exploded.length; i++) {
            String exploded1 = exploded[i];
            System.out.println(exploded[i]+";");
                    
            newinstance.setValue(i, Integer.valueOf(exploded[i]));
        }
        
        System.out.println("Melakukan klasifikasi ... ");
        double result = cls.classifyInstance(newinstance);
        System.out.println("Data ini:");
        System.out.println(testset);
        System.out.println("memiliki label :");
        System.out.println(newinstance.value(newinstance.classIndex()));
    }
}
