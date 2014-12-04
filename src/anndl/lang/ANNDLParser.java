// Generated from ANNDL.g4 by ANTLR 4.4
package anndl.lang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANNDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, WS=31, INT=32, ID=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'latih'", "'momentum'", "','", "'\n'", "'buat'", "'jumlah'", 
		"'-'", "':'", "'dengan'", "'epoch'", "'multilayer'", "'namakan'", "'sigmoid'", 
		"'{'", "'neuron'", "'dari'", "'single'", "'}'", "'layer'", "'struktur'", 
		"'data'", "'.'", "'factor'", "'file'", "'learning'", "'ann'", "'aktivasi'", 
		"'='", "'bersumber'", "'rate'", "WS", "INT", "ID"
	};
	public static final int
		RULE_model = 0, RULE_definisi = 1, RULE_jenis = 2, RULE_struktur = 3, 
		RULE_learningrate = 4, RULE_momentum = 5, RULE_aktivasi = 6, RULE_jumlahlayer = 7, 
		RULE_jumlahneuron = 8, RULE_epoch = 9, RULE_trainingdata = 10, RULE_neurons = 11, 
		RULE_namafile = 12, RULE_real = 13, RULE_newline = 14;
	public static final String[] ruleNames = {
		"model", "definisi", "jenis", "struktur", "learningrate", "momentum", 
		"aktivasi", "jumlahlayer", "jumlahneuron", "epoch", "trainingdata", "neurons", 
		"namafile", "real", "newline"
	};

	@Override
	public String getGrammarFileName() { return "ANNDL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANNDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public DefinisiContext definisi() {
			return getRuleContext(DefinisiContext.class,0);
		}
		public StrukturContext struktur() {
			return getRuleContext(StrukturContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); definisi();
			setState(31); struktur();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinisiContext extends ParserRuleContext {
		public JenisContext tipe;
		public Token nama;
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public JenisContext jenis() {
			return getRuleContext(JenisContext.class,0);
		}
		public TerminalNode ID() { return getToken(ANNDLParser.ID, 0); }
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public DefinisiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definisi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitDefinisi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinisiContext definisi() throws RecognitionException {
		DefinisiContext _localctx = new DefinisiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definisi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(T__25);
			setState(34); match(T__4);
			setState(35); ((DefinisiContext)_localctx).tipe = jenis();
			setState(36); newline();
			setState(37); match(T__18);
			setState(38); ((DefinisiContext)_localctx).nama = match(ID);
			setState(39); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JenisContext extends ParserRuleContext {
		public JenisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jenis; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitJenis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JenisContext jenis() throws RecognitionException {
		JenisContext _localctx = new JenisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jenis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrukturContext extends ParserRuleContext {
		public TrainingdataContext trainingdata() {
			return getRuleContext(TrainingdataContext.class,0);
		}
		public LearningrateContext learningrate() {
			return getRuleContext(LearningrateContext.class,0);
		}
		public EpochContext epoch() {
			return getRuleContext(EpochContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public AktivasiContext aktivasi() {
			return getRuleContext(AktivasiContext.class,0);
		}
		public JumlahneuronContext jumlahneuron() {
			return getRuleContext(JumlahneuronContext.class,0);
		}
		public JumlahlayerContext jumlahlayer() {
			return getRuleContext(JumlahlayerContext.class,0);
		}
		public MomentumContext momentum() {
			return getRuleContext(MomentumContext.class,0);
		}
		public StrukturContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struktur; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitStruktur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrukturContext struktur() throws RecognitionException {
		StrukturContext _localctx = new StrukturContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_struktur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(T__10);
			setState(44); match(T__22);
			setState(45); newline();
			setState(46); learningrate();
			setState(47); momentum();
			setState(48); aktivasi();
			setState(49); jumlahlayer();
			setState(50); jumlahneuron();
			setState(51); epoch();
			setState(52); trainingdata();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LearningrateContext extends ParserRuleContext {
		public RealContext learnrate;
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public LearningrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_learningrate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitLearningrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LearningrateContext learningrate() throws RecognitionException {
		LearningrateContext _localctx = new LearningrateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_learningrate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(T__5);
			setState(55); match(T__0);
			setState(56); match(T__2);
			setState(57); ((LearningrateContext)_localctx).learnrate = real();
			setState(58); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MomentumContext extends ParserRuleContext {
		public RealContext momen;
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public MomentumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_momentum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitMomentum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MomentumContext momentum() throws RecognitionException {
		MomentumContext _localctx = new MomentumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_momentum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(T__28);
			setState(61); match(T__7);
			setState(62); match(T__2);
			setState(63); ((MomentumContext)_localctx).momen = real();
			setState(64); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AktivasiContext extends ParserRuleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public AktivasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aktivasi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitAktivasi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AktivasiContext aktivasi() throws RecognitionException {
		AktivasiContext _localctx = new AktivasiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aktivasi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(T__3);
			setState(67); match(T__2);
			setState(68); match(T__17);
			setState(69); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumlahlayerContext extends ParserRuleContext {
		public Token totallayers;
		public TerminalNode INT() { return getToken(ANNDLParser.INT, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public JumlahlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumlahlayer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitJumlahlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumlahlayerContext jumlahlayer() throws RecognitionException {
		JumlahlayerContext _localctx = new JumlahlayerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jumlahlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__24);
			setState(72); match(T__11);
			setState(73); match(T__2);
			setState(74); ((JumlahlayerContext)_localctx).totallayers = match(INT);
			setState(75); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumlahneuronContext extends ParserRuleContext {
		public NeuronsContext totalneurons;
		public NeuronsContext neurons() {
			return getRuleContext(NeuronsContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public JumlahneuronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumlahneuron; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitJumlahneuron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumlahneuronContext jumlahneuron() throws RecognitionException {
		JumlahneuronContext _localctx = new JumlahneuronContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jumlahneuron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__24);
			setState(78); match(T__15);
			setState(79); match(T__2);
			setState(80); ((JumlahneuronContext)_localctx).totalneurons = neurons();
			setState(81); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpochContext extends ParserRuleContext {
		public Token epochs;
		public TerminalNode INT() { return getToken(ANNDLParser.INT, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public EpochContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epoch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitEpoch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpochContext epoch() throws RecognitionException {
		EpochContext _localctx = new EpochContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_epoch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__24);
			setState(84); match(T__20);
			setState(85); match(T__2);
			setState(86); ((EpochContext)_localctx).epochs = match(INT);
			setState(87); newline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrainingdataContext extends ParserRuleContext {
		public NamafileContext trainingfile;
		public NamafileContext namafile() {
			return getRuleContext(NamafileContext.class,0);
		}
		public TrainingdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trainingdata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitTrainingdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrainingdataContext trainingdata() throws RecognitionException {
		TrainingdataContext _localctx = new TrainingdataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trainingdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(T__21);
			setState(90); match(T__9);
			setState(91); match(T__29);
			setState(92); match(T__1);
			setState(93); match(T__14);
			setState(94); match(T__6);
			setState(95); ((TrainingdataContext)_localctx).trainingfile = namafile();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NeuronsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ANNDLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ANNDLParser.INT, i);
		}
		public NeuronsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neurons; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitNeurons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeuronsContext neurons() throws RecognitionException {
		NeuronsContext _localctx = new NeuronsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_neurons);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__16);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98); match(INT);
					setState(99); match(T__27);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(105); match(INT);
			setState(106); match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamafileContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ANNDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ANNDLParser.ID, i);
		}
		public NamafileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namafile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitNamafile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamafileContext namafile() throws RecognitionException {
		NamafileContext _localctx = new NamafileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namafile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(ID);
			setState(109); match(T__8);
			{
			setState(110); match(ID);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ANNDLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ANNDLParser.INT, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(112); match(T__23);
				}
			}

			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(116);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(115); match(INT);
					}
				}

				setState(118); match(T__8);
				}
				break;
			}
			setState(121); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123); match(T__26);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__26 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0083\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rg\n\r\f\r"+
		"\16\rj\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\5\17t\n\17\3\17\5\17"+
		"w\n\17\3\17\5\17z\n\17\3\17\3\17\3\20\6\20\177\n\20\r\20\16\20\u0080\3"+
		"\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2\r\r\23\23x\2"+
		" \3\2\2\2\4#\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n8\3\2\2\2\f>\3\2\2\2\16D\3"+
		"\2\2\2\20I\3\2\2\2\22O\3\2\2\2\24U\3\2\2\2\26[\3\2\2\2\30c\3\2\2\2\32"+
		"n\3\2\2\2\34s\3\2\2\2\36~\3\2\2\2 !\5\4\3\2!\"\5\b\5\2\"\3\3\2\2\2#$\7"+
		"\7\2\2$%\7\34\2\2%&\5\6\4\2&\'\5\36\20\2\'(\7\16\2\2()\7#\2\2)*\5\36\20"+
		"\2*\5\3\2\2\2+,\t\2\2\2,\7\3\2\2\2-.\7\26\2\2./\7\n\2\2/\60\5\36\20\2"+
		"\60\61\5\n\6\2\61\62\5\f\7\2\62\63\5\16\b\2\63\64\5\20\t\2\64\65\5\22"+
		"\n\2\65\66\5\24\13\2\66\67\5\26\f\2\67\t\3\2\2\289\7\33\2\29:\7 \2\2:"+
		";\7\36\2\2;<\5\34\17\2<=\5\36\20\2=\13\3\2\2\2>?\7\4\2\2?@\7\31\2\2@A"+
		"\7\36\2\2AB\5\34\17\2BC\5\36\20\2C\r\3\2\2\2DE\7\35\2\2EF\7\36\2\2FG\7"+
		"\17\2\2GH\5\36\20\2H\17\3\2\2\2IJ\7\b\2\2JK\7\25\2\2KL\7\36\2\2LM\7\""+
		"\2\2MN\5\36\20\2N\21\3\2\2\2OP\7\b\2\2PQ\7\21\2\2QR\7\36\2\2RS\5\30\r"+
		"\2ST\5\36\20\2T\23\3\2\2\2UV\7\b\2\2VW\7\f\2\2WX\7\36\2\2XY\7\"\2\2YZ"+
		"\5\36\20\2Z\25\3\2\2\2[\\\7\13\2\2\\]\7\27\2\2]^\7\3\2\2^_\7\37\2\2_`"+
		"\7\22\2\2`a\7\32\2\2ab\5\32\16\2b\27\3\2\2\2ch\7\20\2\2de\7\"\2\2eg\7"+
		"\5\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7"+
		"\"\2\2lm\7\24\2\2m\31\3\2\2\2no\7#\2\2op\7\30\2\2pq\7#\2\2q\33\3\2\2\2"+
		"rt\7\t\2\2sr\3\2\2\2st\3\2\2\2ty\3\2\2\2uw\7\"\2\2vu\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xz\7\30\2\2yv\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\"\2\2|\35\3\2"+
		"\2\2}\177\7\6\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\37\3\2\2\2\7hsvy\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}