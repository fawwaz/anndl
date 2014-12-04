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
			jumlahneuron
                        epoch
			trainingdata;

learningrate : 'learning' 'rate' '=' learnrate=real newline;
momentum : 'momentum' 'factor' '=' momen=real newline;
aktivasi : 'aktivasi' '=' 'sigmoid' newline;
jumlahlayer :'jumlah' 'layer' '=' totallayers=INT newline;
jumlahneuron : 'jumlah' 'neuron' '=' totalneurons=neurons newline;
epoch : 'jumlah' 'epoch' '=' epochs = INT newline;
trainingdata : 'dengan' 'data' 'latih' 'bersumber' 'dari' 'file' trainingfile=namafile;



neurons : '{' (INT ',' )* INT '}';

instruksi : 'klasifikasikan' 'data' 'ini' 'dengan' 'model' modelname=namafile 'simpan' 'hasilnya' 'dalam' 'file' outputname=namafile;



namafile : ID '.' (ID);
real : '-'? (INT? '.')? INT;
WS : [ \r\t]+ -> skip;
INT : [0-9]+;
ID: [A-Za-z_]+[0-9A-Za-z_]*;
newline : '\n'+;