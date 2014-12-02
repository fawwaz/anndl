// Generated from ANNDL.g4 by ANTLR 4.4
package ANNDL.anndl;
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
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		WS=33, INT=34, ID=35;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'\n'", "'buat'", "'jumlah'", "'-'", "':'", "'dengan'", 
		"'multilayer'", "'namakan'", "'{'", "'sigmoid'", "'klasifikasikan'", "'neuron'", 
		"'single'", "'}'", "'layer'", "'struktur'", "'data'", "'.'", "'ini'", 
		"'factor'", "'learning'", "'file'", "'ann'", "'aktivasi'", "'='", "'dalam'", 
		"'model'", "'rate'", "'momemntum'", "'simpan'", "'hasilnya'", "WS", "INT", 
		"ID"
	};
	public static final int
		RULE_model = 0, RULE_deskripsi = 1, RULE_definisi = 2, RULE_jenis = 3, 
		RULE_struktur = 4, RULE_learningrate = 5, RULE_momentum = 6, RULE_aktivasi = 7, 
		RULE_jumlahlayer = 8, RULE_jumlahneuron = 9, RULE_neurons = 10, RULE_instruksi = 11, 
		RULE_perintah = 12, RULE_dataset = 13, RULE_rowdata = 14, RULE_namafile = 15, 
		RULE_real = 16, RULE_newline = 17;
	public static final String[] ruleNames = {
		"model", "deskripsi", "definisi", "jenis", "struktur", "learningrate", 
		"momentum", "aktivasi", "jumlahlayer", "jumlahneuron", "neurons", "instruksi", 
		"perintah", "dataset", "rowdata", "namafile", "real", "newline"
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
			setState(38);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); deskripsi();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); instruksi();
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
			setState(40); definisi();
			setState(41); struktur();
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
			setState(43); match(T__29);
			setState(44); match(T__8);
			setState(45); ((DefinisiContext)_localctx).tipe = jenis();
			setState(46); newline();
			setState(47); match(T__23);
			setState(48); ((DefinisiContext)_localctx).nama = match(ID);
			setState(49); newline();
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
			setState(51);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__18) ) {
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
		public LearningrateContext learningrate() {
			return getRuleContext(LearningrateContext.class,0);
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
			setState(53); match(T__15);
			setState(54); match(T__26);
			setState(55); newline();
			setState(56); learningrate();
			setState(57); momentum();
			setState(58); aktivasi();
			setState(59); jumlahlayer();
			setState(60); jumlahneuron();
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
			setState(62); match(T__10);
			setState(63); match(T__3);
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
			setState(68); match(T__2);
			setState(69); match(T__11);
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
			setState(76); match(T__21);
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
			setState(79); match(T__28);
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
			setState(85); match(T__28);
			setState(86); match(T__19);
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
		enterRule(_localctx, 20, RULE_neurons);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(T__22);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92); match(INT);
					setState(93); match(T__31);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(99); match(INT);
			setState(100); match(T__17);
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
		public DatasetContext dataset() {
			return getRuleContext(DatasetContext.class,0);
		}
		public PerintahContext perintah() {
			return getRuleContext(PerintahContext.class,0);
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
		enterRule(_localctx, 22, RULE_instruksi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); perintah();
			setState(103); dataset();
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

	public static class PerintahContext extends ParserRuleContext {
		public NamafileContext modelname;
		public NamafileContext outputname;
		public List<NamafileContext> namafile() {
			return getRuleContexts(NamafileContext.class);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public NamafileContext namafile(int i) {
			return getRuleContext(NamafileContext.class,i);
		}
		public PerintahContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perintah; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitPerintah(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerintahContext perintah() throws RecognitionException {
		PerintahContext _localctx = new PerintahContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perintah);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(T__20);
			setState(106); match(T__14);
			setState(107); match(T__12);
			setState(108); match(T__25);
			setState(109); match(T__4);
			setState(110); ((PerintahContext)_localctx).modelname = namafile();
			setState(111); match(T__1);
			setState(112); match(T__0);
			setState(113); match(T__5);
			setState(114); match(T__9);
			setState(115); ((PerintahContext)_localctx).outputname = namafile();
			setState(116); newline();
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

	public static class DatasetContext extends ParserRuleContext {
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<RowdataContext> rowdata() {
			return getRuleContexts(RowdataContext.class);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public RowdataContext rowdata(int i) {
			return getRuleContext(RowdataContext.class,i);
		}
		public DatasetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitDataset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetContext dataset() throws RecognitionException {
		DatasetContext _localctx = new DatasetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118); rowdata();
				setState(119); newline();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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

	public static class RowdataContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ANNDLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ANNDLParser.INT, i);
		}
		public RowdataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowdata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ANNDLVisitor ) return ((ANNDLVisitor<? extends T>)visitor).visitRowdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowdataContext rowdata() throws RecognitionException {
		RowdataContext _localctx = new RowdataContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rowdata);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125); match(INT);
					setState(126); match(T__31);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(132); match(INT);
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
		enterRule(_localctx, 30, RULE_namafile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(ID);
			setState(135); match(T__13);
			{
			setState(136); match(ID);
			}
			1
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
		enterRule(_localctx, 32, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(139); match(T__27);
				}
			}

			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(143);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(142); match(INT);
					}
				}

				setState(145); match(T__13);
				}
				break;
			}
			setState(148); match(INT);
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
		enterRule(_localctx, 34, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); match(T__30);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u009e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fa\n\f\f\f\16\fd\13\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\6\17|\n\17\r\17\16\17}\3\20\3\20\7\20\u0082"+
		"\n\20\f\20\16\20\u0085\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\5"+
		"\22\u008f\n\22\3\22\5\22\u0092\n\22\3\22\5\22\u0095\n\22\3\22\3\22\3\23"+
		"\6\23\u009a\n\23\r\23\16\23\u009b\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\3\4\2\n\n\20\20\u0093\2(\3\2\2\2\4*\3\2\2\2\6-\3"+
		"\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f@\3\2\2\2\16F\3\2\2\2\20L\3\2\2\2\22"+
		"Q\3\2\2\2\24W\3\2\2\2\26]\3\2\2\2\30h\3\2\2\2\32k\3\2\2\2\34{\3\2\2\2"+
		"\36\u0083\3\2\2\2 \u0088\3\2\2\2\"\u008e\3\2\2\2$\u0099\3\2\2\2&)\5\4"+
		"\3\2\')\5\30\r\2(&\3\2\2\2(\'\3\2\2\2)\3\3\2\2\2*+\5\6\4\2+,\5\n\6\2,"+
		"\5\3\2\2\2-.\7\5\2\2./\7\32\2\2/\60\5\b\5\2\60\61\5$\23\2\61\62\7\13\2"+
		"\2\62\63\7%\2\2\63\64\5$\23\2\64\7\3\2\2\2\65\66\t\2\2\2\66\t\3\2\2\2"+
		"\678\7\23\2\289\7\b\2\29:\5$\23\2:;\5\f\7\2;<\5\16\b\2<=\5\20\t\2=>\5"+
		"\22\n\2>?\5\24\13\2?\13\3\2\2\2@A\7\30\2\2AB\7\37\2\2BC\7\34\2\2CD\5\""+
		"\22\2DE\5$\23\2E\r\3\2\2\2FG\7 \2\2GH\7\27\2\2HI\7\34\2\2IJ\5\"\22\2J"+
		"K\5$\23\2K\17\3\2\2\2LM\7\33\2\2MN\7\34\2\2NO\7\r\2\2OP\5$\23\2P\21\3"+
		"\2\2\2QR\7\6\2\2RS\7\22\2\2ST\7\34\2\2TU\7$\2\2UV\5$\23\2V\23\3\2\2\2"+
		"WX\7\6\2\2XY\7\17\2\2YZ\7\34\2\2Z[\5\26\f\2[\\\5$\23\2\\\25\3\2\2\2]b"+
		"\7\f\2\2^_\7$\2\2_a\7\3\2\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce"+
		"\3\2\2\2db\3\2\2\2ef\7$\2\2fg\7\21\2\2g\27\3\2\2\2hi\5\32\16\2ij\5\34"+
		"\17\2j\31\3\2\2\2kl\7\16\2\2lm\7\24\2\2mn\7\26\2\2no\7\t\2\2op\7\36\2"+
		"\2pq\5 \21\2qr\7!\2\2rs\7\"\2\2st\7\35\2\2tu\7\31\2\2uv\5 \21\2vw\5$\23"+
		"\2w\33\3\2\2\2xy\5\36\20\2yz\5$\23\2z|\3\2\2\2{x\3\2\2\2|}\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\35\3\2\2\2\177\u0080\7$\2\2\u0080\u0082\7\3\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087\37"+
		"\3\2\2\2\u0088\u0089\7%\2\2\u0089\u008a\7\25\2\2\u008a\u008b\7%\2\2\u008b"+
		"\u008c\b\21\1\2\u008c!\3\2\2\2\u008d\u008f\7\7\2\2\u008e\u008d\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0094\3\2\2\2\u0090\u0092\7$\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\25\2\2"+
		"\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\7$\2\2\u0097#\3\2\2\2\u0098\u009a\7\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c%\3\2\2\2\n(b}\u0083"+
		"\u008e\u0091\u0094\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}