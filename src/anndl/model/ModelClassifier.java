/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anndl.model;

/**
 *
 * @author Asus
 */
public class ModelClassifier{
    public String namamodel;
    public String jenis;
    public double learningrate;
    public double momentum;
    public int jumlahlayer;
    public String jumlahneuron;
    public int epoch;
    public String filetraining;
    
    public String namafilemodel;
    
    
    
    public void PrintInfo(){
        System.out.println("Model name: "+namamodel);
        System.out.println("Jenis \t: "+jenis);
        System.out.println("Learning Rate : "+learningrate);
        System.out.println("Momentum \t: "+momentum);
        System.out.println("Jumlah Layer \t: " + jumlahlayer);
        System.out.println("Struktur Neuron : " +jumlahneuron);
        System.out.println("Epoch \t : " + epoch);
        System.out.println("File Training : " + filetraining);
    }
}
