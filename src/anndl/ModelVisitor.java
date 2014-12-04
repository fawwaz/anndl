/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anndl;

import anndl.lang.ANNDLBaseVisitor;
import anndl.lang.ANNDLParser;
import anndl.model.ModelClassifier;

/**
 *
 * @author Asus
 */
public class ModelVisitor extends ANNDLBaseVisitor<Object>{
    private ModelClassifier modelc;

    @Override
    public Object visitDefinisi(ANNDLParser.DefinisiContext ctx) {
        modelc = new ModelClassifier();
        modelc.namamodel = ctx.nama.getText();
        modelc.jenis = ctx.tipe.getText();
        visitChildren(ctx);
        
        return modelc;
    }

    @Override
    public Object visitLearningrate(ANNDLParser.LearningrateContext ctx) {
        modelc.learningrate = Double.parseDouble(ctx.learnrate.getText());
        return Double.parseDouble(ctx.learnrate.getText());
    }

    @Override
    public Object visitMomentum(ANNDLParser.MomentumContext ctx) {
        modelc.momentum = Double.parseDouble(ctx.momen.getText());
        return Double.parseDouble(ctx.momen.getText());
    }

    @Override
    public Object visitJumlahlayer(ANNDLParser.JumlahlayerContext ctx) {
        modelc.jumlahlayer = Integer.parseInt(ctx.totallayers.getText());
        return Integer.parseInt(ctx.totallayers.getText()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitJumlahneuron(ANNDLParser.JumlahneuronContext ctx) {
       // modelc.jumlahneuron = ctx.totalneurons.getText();
        return ctx.totalneurons.getText();
    }

    @Override
    public Object visitEpoch(ANNDLParser.EpochContext ctx) {
        modelc.epoch = Integer.parseInt(ctx.epochs.getText());
        return Integer.parseInt(ctx.epochs.getText()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTrainingdata(ANNDLParser.TrainingdataContext ctx) {
        modelc.filetraining = ctx.trainingfile.getText();
        return ctx.trainingfile.getText(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Object visitNeurons(ANNDLParser.NeuronsContext ctx) {
        return ctx.getText();
    }
    
    @Override
    public Object visitReal(ANNDLParser.RealContext ctx) {
        return Float.valueOf(ctx.getText()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitNamafile(ANNDLParser.NamafileContext ctx) {
        return ctx.getText(); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    
}
