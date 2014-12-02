grammar ANNDL;

model : deskripsi | instruksi;

deskripsi : definisi struktur;

definisi : 'buat' 'ann' tipe=jenis newline
			'namakan' nama=ID newline;

jenis : 'single' | 'multilayer';

struktur :  'struktur' ':' newline
			learningrate
			momentum
			aktivasi
			jumlahlayer
			jumlahneuron;

learningrate : 'learning' 'rate' '=' learnrate=real newline;
momentum : 'momemntum' 'factor' '=' momen=real newline;
aktivasi : 'aktivasi' '=' 'sigmoid' newline;
jumlahlayer :'jumlah' 'layer' '=' totallayers=INT newline;
jumlahneuron : 'jumlah' 'neuron' '=' totalneurons=neurons newline;

neurons : '{' (INT ',' )* INT '}';

instruksi : perintah dataset;

perintah : 'klasifikasikan' 'data' 'ini' 'dengan' 'model' modelname=namafile 'simpan' 'hasilnya' 'dalam' 'file' outputname=namafile newline;
dataset :  (rowdata newline)+;
rowdata : (INT ',')* INT;


namafile : ID '.' (ID) {1};
real : '-'? (INT? '.')? INT;
WS : [\r\t]+ -> skip;
INT : [0-9]+;
ID: [A-Za-z_]+[0-9A-Za-z_]*;
newline : '\n'+;