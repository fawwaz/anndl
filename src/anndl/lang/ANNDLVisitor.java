// Generated from ANNDL.g4 by ANTLR 4.4
package anndl.lang;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ANNDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ANNDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(@NotNull ANNDLParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#namafile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamafile(@NotNull ANNDLParser.NamafileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#struktur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruktur(@NotNull ANNDLParser.StrukturContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#learningrate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLearningrate(@NotNull ANNDLParser.LearningrateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#trainingdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrainingdata(@NotNull ANNDLParser.TrainingdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#epoch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpoch(@NotNull ANNDLParser.EpochContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#momentum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMomentum(@NotNull ANNDLParser.MomentumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#aktivasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAktivasi(@NotNull ANNDLParser.AktivasiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(@NotNull ANNDLParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(@NotNull ANNDLParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#jenis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJenis(@NotNull ANNDLParser.JenisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#jumlahneuron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumlahneuron(@NotNull ANNDLParser.JumlahneuronContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#jumlahlayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumlahlayer(@NotNull ANNDLParser.JumlahlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#neurons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeurons(@NotNull ANNDLParser.NeuronsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANNDLParser#definisi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinisi(@NotNull ANNDLParser.DefinisiContext ctx);
}