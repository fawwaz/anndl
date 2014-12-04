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
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, WS=37, INT=38, ID=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'latih'", "'momentum'", "','", "'\n'", "'buat'", "'jumlah'", 
		"'-'", "':'", "'dengan'", "'epoch'", "'multilayer'", "'namakan'", "'sigmoid'", 
		"'{'", "'klasifikasikan'", "'neuron'", "'dari'", "'single'", "'}'", "'layer'", 
		"'struktur'", "'data'", "'.'", "'factor'", "'ini'", "'file'", "'learning'", 
		"'ann'", "'aktivasi'", "'='", "'dalam'", "'model'", "'bersumber'", "'rate'", 
		"'simpan'", "'hasilnya'", "WS", "INT", "ID"
	};
	public static final int
		RULE_model = 0, RULE_deskripsi = 1, RULE_definisi = 2, RULE_jenis = 3, 
		RULE_struktur = 4, RULE_learningrate = 5, RULE_momentum = 6, RULE_aktivasi = 7, 
		RULE_jumlahlayer = 8, RULE_jumlahneuron = 9, RULE_epoch = 10, RULE_trainingdata = 11, 
		RULE_neurons = 12, RULE_instruksi = 13, RULE_namafile = 14, RULE_real = 15, 
		RULE_newline = 16;
	public static final String[] ruleNames = {
		"model", "deskripsi", "definisi", "jenis", "struktur", "learningrate", 
		"momentum", "aktivasi", "jumlahlayer", "jumlahneuron", "epoch", "trainingdata", 
		"neurons", "instruksi", "namafile", "real", "newline"
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
		public DeskripsiContext deskripsi() {
			return getRuleContext(DeskripsiContext.class,0);
		}
		public InstruksiContext instruksi() {
			return getRuleContext(InstruksiContext.class,0);
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
			setState(36);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); deskripsi();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); instruksi();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeskripsiContext extends ParserRuleContext {
		public DefinisiContext definisi() {
			return getRuleContext(DefinisiContext.class,0);
		}
		public StrukturContext struktur() {
			return getRuleContext(StrukturContext.class,0);
		}
		public DeskripsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deskripsi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitDeskripsi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeskripsiContext deskripsi() throws RecognitionException {
		DeskripsiContext _localctx = new DeskripsiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_deskripsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); definisi();
			setState(39); struktur();
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
		enterRule(_localctx, 4, RULE_definisi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(T__31);
			setState(42); match(T__8);
			setState(43); ((DefinisiContext)_localctx).tipe = jenis();
			setState(44); newline();
			setState(45); match(T__24);
			setState(46); ((DefinisiContext)_localctx).nama = match(ID);
			setState(47); newline();
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
		enterRule(_localctx, 6, RULE_jenis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__18) ) {
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
		enterRule(_localctx, 8, RULE_struktur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(T__15);
			setState(52); match(T__28);
			setState(53); newline();
			setState(54); learningrate();
			setState(55); momentum();
			setState(56); aktivasi();
			setState(57); jumlahlayer();
			setState(58); jumlahneuron();
			setState(59); epoch();
			setState(60); trainingdata();
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
		enterRule(_localctx, 10, RULE_learningrate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(T__9);
			setState(63); match(T__2);
			setState(64); match(T__6);
			setState(65); ((LearningrateContext)_localctx).learnrate = real();
			setState(66); newline();
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
		enterRule(_localctx, 12, RULE_momentum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__34);
			setState(69); match(T__12);
			setState(70); match(T__6);
			setState(71); ((MomentumContext)_localctx).momen = real();
			setState(72); newline();
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
		enterRule(_localctx, 14, RULE_aktivasi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__7);
			setState(75); match(T__6);
			setState(76); match(T__23);
			setState(77); newline();
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
		enterRule(_localctx, 16, RULE_jumlahlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(T__30);
			setState(80); match(T__16);
			setState(81); match(T__6);
			setState(82); ((JumlahlayerContext)_localctx).totallayers = match(INT);
			setState(83); newline();
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
		enterRule(_localctx, 18, RULE_jumlahneuron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(T__30);
			setState(86); match(T__20);
			setState(87); match(T__6);
			setState(88); ((JumlahneuronContext)_localctx).totalneurons = neurons();
			setState(89); newline();
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
		enterRule(_localctx, 20, RULE_epoch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__30);
			setState(92); match(T__26);
			setState(93); match(T__6);
			setState(94); ((EpochContext)_localctx).epochs = match(INT);
			setState(95); newline();
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
		enterRule(_localctx, 22, RULE_trainingdata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__27);
			setState(98); match(T__14);
			setState(99); match(T__35);
			setState(100); match(T__3);
			setState(101); match(T__19);
			setState(102); match(T__10);
			setState(103); ((TrainingdataContext)_localctx).trainingfile = namafile();
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
		enterRule(_localctx, 24, RULE_neurons);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(T__22);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106); match(INT);
					setState(107); match(T__33);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(113); match(INT);
			setState(114); match(T__17);
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

	public static class InstruksiContext extends ParserRuleContext {
		public NamafileContext modelname;
		public NamafileContext outputname;
		public List<NamafileContext> namafile() {
			return getRuleContexts(NamafileContext.class);
		}
		public NamafileContext namafile(int i) {
			return getRuleContext(NamafileContext.class,i);
		}
		public InstruksiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruksi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitInstruksi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruksiContext instruksi() throws RecognitionException {
		InstruksiContext _localctx = new InstruksiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruksi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__21);
			setState(117); match(T__14);
			setState(118); match(T__11);
			setState(119); match(T__27);
			setState(120); match(T__4);
			setState(121); ((InstruksiContext)_localctx).modelname = namafile();
			setState(122); match(T__1);
			setState(123); match(T__0);
			setState(124); match(T__5);
			setState(125); match(T__10);
			setState(126); ((InstruksiContext)_localctx).outputname = namafile();
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
		enterRule(_localctx, 28, RULE_namafile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(ID);
			setState(129); match(T__13);
			{
			setState(130); match(ID);
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
		enterRule(_localctx, 30, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(132); match(T__29);
				}
			}

			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(136);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(135); match(INT);
					}
				}

				setState(138); match(T__13);
				}
				break;
			}
			setState(141); match(INT);
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
		enterRule(_localctx, 32, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143); match(T__32);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__32 );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\5\21\u0088\n\21\3\21\5\21\u008b\n\21\3\21\5\21\u008e\n"+
		"\21\3\21\3\21\3\22\6\22\u0093\n\22\r\22\16\22\u0094\3\22\2\2\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\4\2\r\r\24\24\u008b\2&\3\2\2"+
		"\2\4(\3\2\2\2\6+\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f@\3\2\2\2\16F\3\2"+
		"\2\2\20L\3\2\2\2\22Q\3\2\2\2\24W\3\2\2\2\26]\3\2\2\2\30c\3\2\2\2\32k\3"+
		"\2\2\2\34v\3\2\2\2\36\u0082\3\2\2\2 \u0087\3\2\2\2\"\u0092\3\2\2\2$\'"+
		"\5\4\3\2%\'\5\34\17\2&$\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2()\5\6\4\2)*\5\n"+
		"\6\2*\5\3\2\2\2+,\7\7\2\2,-\7\36\2\2-.\5\b\5\2./\5\"\22\2/\60\7\16\2\2"+
		"\60\61\7)\2\2\61\62\5\"\22\2\62\7\3\2\2\2\63\64\t\2\2\2\64\t\3\2\2\2\65"+
		"\66\7\27\2\2\66\67\7\n\2\2\678\5\"\22\289\5\f\7\29:\5\16\b\2:;\5\20\t"+
		"\2;<\5\22\n\2<=\5\24\13\2=>\5\26\f\2>?\5\30\r\2?\13\3\2\2\2@A\7\35\2\2"+
		"AB\7$\2\2BC\7 \2\2CD\5 \21\2DE\5\"\22\2E\r\3\2\2\2FG\7\4\2\2GH\7\32\2"+
		"\2HI\7 \2\2IJ\5 \21\2JK\5\"\22\2K\17\3\2\2\2LM\7\37\2\2MN\7 \2\2NO\7\17"+
		"\2\2OP\5\"\22\2P\21\3\2\2\2QR\7\b\2\2RS\7\26\2\2ST\7 \2\2TU\7(\2\2UV\5"+
		"\"\22\2V\23\3\2\2\2WX\7\b\2\2XY\7\22\2\2YZ\7 \2\2Z[\5\32\16\2[\\\5\"\22"+
		"\2\\\25\3\2\2\2]^\7\b\2\2^_\7\f\2\2_`\7 \2\2`a\7(\2\2ab\5\"\22\2b\27\3"+
		"\2\2\2cd\7\13\2\2de\7\30\2\2ef\7\3\2\2fg\7#\2\2gh\7\23\2\2hi\7\34\2\2"+
		"ij\5\36\20\2j\31\3\2\2\2kp\7\20\2\2lm\7(\2\2mo\7\5\2\2nl\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7(\2\2tu\7\25\2\2u\33\3"+
		"\2\2\2vw\7\21\2\2wx\7\30\2\2xy\7\33\2\2yz\7\13\2\2z{\7\"\2\2{|\5\36\20"+
		"\2|}\7%\2\2}~\7&\2\2~\177\7!\2\2\177\u0080\7\34\2\2\u0080\u0081\5\36\20"+
		"\2\u0081\35\3\2\2\2\u0082\u0083\7)\2\2\u0083\u0084\7\31\2\2\u0084\u0085"+
		"\7)\2\2\u0085\37\3\2\2\2\u0086\u0088\7\t\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u008b\7(\2\2\u008a\u0089\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\31\2\2\u008d"+
		"\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7("+
		"\2\2\u0090!\3\2\2\2\u0091\u0093\7\6\2\2\u0092\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095#\3\2\2\2\b&p\u0087"+
		"\u008a\u008d\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}