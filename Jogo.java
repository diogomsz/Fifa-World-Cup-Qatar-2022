public class Jogo {
	private int dia;
	private int mes;
	private int ano;
	private String etapa;
	private String selecao1;
	private String selecao2;
	private int placarSelecao1;
	private int placarSelecao2;
	private String local;
	
	private static String entradaPadrao = "1978#SEGUNDA FASE - GRUPO 1#21#6#Holanda#2#1#Itália#Buenos Aires\r\n"
			+ "1986#OITAVAS-DE-FINAL#16#6#Brasil#4#0#Polônia#Guadalajara\r\n"
			+ "1962#GRUPO C#6#6#Brasil#2#1#Espanha#Viña del Mar\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#3#7#Alemanha Ocidental#1#0#Polônia#Frankfurt\r\n"
			+ "1982#SEMIFINAL#8#7#Alemanha Ocidental#3#3#França#Sevilla\r\n"
			+ "1974#FINAL#7#7#Alemanha Ocidental#2#1#Holanda#Berlim\r\n"
			+ "1950#FASE FINAL#13#7#Brasil#6#1#Espanha#Rio de Janeiro\r\n"
			+ "2002#QUARTAS-DE-FINAL#21#6#Brasil#2#1#Inglaterra#Shizuoka\r\n"
			+ "1954#QUARTAS-DE-FINAL#26#6#Uruguai#4#2#Inglaterra#Basel\r\n"
			+ "1994#GRUPO D#21#6#Nigéria#3#0#Bulgária#Dallas\r\n"
			+ "2018#GRUPO B#25#6#Irã#1#1#Portugal#Mordovia Arena\r\n"
			+ "1982#GRUPO D#17#6#Tchecoslováquia#1#1#Kuwait#Valladolid\r\n"
			+ "1994#GRUPO C#27#6#Espanha#3#1#Bolivia#Chicago\r\n"
			+ "1978#GRUPO C#3#6#Áustria#2#1#Espanha#Buenos Aires\r\n"
			+ "2002#GRUPO D#10#6#Coreia do Sul#1#1#Estados Unidos#Daegu\r\n"
			+ "2014#OITAVAS-DE-FINAL#28#6#Brasil#1#1#Chile#Belo Horizonte\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#França#4#0#Irlanda do Norte#Norrkoping\r\n"
			+ "1982#GRUPO D#16#6#Inglaterra#3#1#França#Bilbau\r\n"
			+ "1930#GRUPO D#13#7#Estados Unidos#3#0#Bélgica#Montevidéu\r\n"
			+ "1950#GRUPO A#29#6#Iugoslávia#4#1#México#Porto Alegre\r\n"
			+ "1998#GRUPO H#20#6#Croácia#1#0#Japão#Nantes\r\n"
			+ "1934#OITAVAS-DE-FINAL#27#5#Áustria#3#2#França#Turim\r\n"
			+ "2002#GRUPO B#12#6#Espanha#3#2#África do Sul#Daejeon\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#Itália#1#1#Espanha#Florence\r\n"
			+ "1986#FINAL#29#6#Argentina#3#2#Alemanha Ocidental#Cidade do México\r\n"
			+ "1990#Disp. 3°. Lugar#7#7#Itália#2#1#Inglaterra#Bari\r\n"
			+ "2002#OITAVAS-DE-FINAL#15#6#Inglaterra#3#0#Dinamarca#Niigata\r\n"
			+ "2006#GRUPO H#19#6#Arábia Saudita#0#4#Ucrânia#Hamburgo\r\n"
			+ "1982#GRUPO C#19#6#Bélgica#1#0#El Salvador#Elche\r\n"
			+ "2002#GRUPO G#8#6#Croácia#2#1#Itália#Ibaraki\r\n"
			+ "1958#GRUPO C#12#6#Suécia#2#1#Hungria#Solna\r\n"
			+ "1982#GRUPO E#20#6#Espanha#2#1#Iugoslávia#Valência\r\n"
			+ "1970#GRUPO D#10#6#Alemanha Ocidental#3#1#Peru#León\r\n"
			+ "1990#GRUPO A#15#6#Tchecoslováquia#1#0#Áustria#Florence\r\n"
			+ "1998#GRUPO B#11#6#Áustria#1#1#Camarões#Toulouse\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 1#18#6#Holanda#2#2#Alemanha Ocidental#Cordoba\r\n"
			+ "1970#GRUPO B#7#6#Israel#1#1#Suécia#Toluca\r\n"
			+ "2014#GRUPO G#16#6#Gana#1#2#Estados Unidos#Natal\r\n"
			+ "1998#GRUPO A#10#6#Noruega#2#2#Marrocos#Montpellier\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#Suécia#2#0#União Soviética#Solna\r\n"
			+ "1982#GRUPO C#18#6#Argentina#4#1#Hungria#Alicante\r\n"
			+ "1990#GRUPO E#13#6#Espanha#0#0#Uruguai#Udine\r\n"
			+ "2006#GRUPO A#14#6#Alemanha#1#0#Polônia#Dortmund\r\n"
			+ "2018#OITAVAS-DE-FINAL#3#7#Colombia#3#4#Inglaterra#Spartak Stadium\r\n"
			+ "1986#GRUPO B#11#6#México#1#0#Iraque#Puebla\r\n"
			+ "1998#GRUPO A#16#6#Brasil#3#0#Marrocos#Nantes\r\n"
			+ "1954#GRUPO B#23#6#Alemanha Ocidental#7#2#Turquia#Zurique\r\n"
			+ "1998#GRUPO D#19#6#Espanha#0#0#Paraguai#St. Etienne\r\n"
			+ "1930#GRUPO A#13#7#França#4#1#México#Montevidéu\r\n"
			+ "1998#GRUPO C#24#6#Arábia Saudita#2#2#África do Sul#Bordeaux\r\n"
			+ "2010#GRUPO B#17#6#Argentina#4#1#Coreia do Sul#Joanesburgo\r\n"
			+ "2018#GRUPO A#25#6#Uruguai#3#0#Russia#Samara Arena\r\n"
			+ "1990#GRUPO F#16#6#Inglaterra#0#0#Holanda#Cagliari\r\n"
			+ "2014#QUARTAS-DE-FINAL#4#7#França#0#1#Alemanha#Rio de Janeiro\r\n"
			+ "1962#QUARTAS-DE-FINAL#14#6#Brasil#3#1#Inglaterra#Viña del Mar\r\n"
			+ "2002#OITAVAS-DE-FINAL#18#6#Coreia do Sul#2#1#Itália#Daejeon\r\n"
			+ "1994#GRUPO C#27#6#Alemanha#3#2#Coreia do Sul#Dallas\r\n"
			+ "1966#GRUPO D#13#7#Itália#2#0#Chile#Sunderland\r\n"
			+ "1978#GRUPO A#6#6#Itália#3#1#Hungria#Mar del Plata\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#Tchecoslováquia#3#2#Suíça#Turim\r\n"
			+ "1974#GRUPO A#18#6#Alemanha Ocidental#3#0#Austrália#Hamburgo\r\n"
			+ "1930#GRUPO C#18#7#Uruguai#1#0#Peru#Montevidéu\r\n"
			+ "1966#SEMIFINAL#26#7#Inglaterra#2#1#Portugal#Londres\r\n"
			+ "1998#SEMIFINAL#7#7#Brasil#1#1#Holanda#Marseille\r\n"
			+ "2006#GRUPO F#22#6#Croácia#2#2#Austrália#Stuttgart\r\n"
			+ "2006#GRUPO C#21#6#Holanda#0#0#Argentina#Frankfurt\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#Áustria#2#1#Hungria#Bologna\r\n"
			+ "1958#GRUPO D#11#6#União Soviética#2#0#Áustria#Boraas\r\n"
			+ "2018#GRUPO C#26#6#Dinamarca#0#0#França#Luzhniki Stadoum\r\n"
			+ "1986#GRUPO D#12#6#Brasil#3#0#Irlanda do Norte#Guadalajara\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#Itália#3#1#França#Paris\r\n"
			+ "2010#GRUPO C#12#6#Inglaterra#1#1#Estados Unidos#Rustemburgo\r\n"
			+ "2010#GRUPO F#20#6#Eslováquia#0#2#Paraguai#Bloemfontein\r\n"
			+ "1950#FASE FINAL#3#7#Brasil#7#1#Suécia#Rio de Janeiro\r\n"
			+ "1994#GRUPO D#26#6#Bulgária#4#0#Grécia#Chicago\r\n"
			+ "1978#GRUPO A#6#6#Argentina#2#1#França#Buenos Aires\r\n"
			+ "1966#GRUPO C#20#7#Hungria#3#1#Bulgária#Manchester\r\n"
			+ "2010#GRUPO G#20#6#Brasil#3#1#Costa do Marfim#Joanesburgo\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#26#6#Polônia#1#0#Suécia#Stuttgart\r\n"
			+ "1954#Disp. 3°. Lugar#3#7#Áustria#3#1#Uruguai#Zurique\r\n"
			+ "1990#GRUPO B#8#6#Camarões#1#0#Argentina#Milão\r\n"
			+ "2014#GRUPO F#16#6#Irã#0#0#Nigéria#Curitiba\r\n"
			+ "2014#GRUPO F#25#6#Nigéria#2#3#Argentina#Porto Alegre\r\n"
			+ "1970#SEMIFINAL#17#6#Itália#4#3#Alemanha Ocidental#Cidade do México\r\n"
			+ "2010#GRUPO F#20#6#Itália#1#1#Nova Zelândia#Nelspruit\r\n"
			+ "1958#SEMIFINAL#24#6#Suécia#3#1#Alemanha Ocidental#Gotemborg\r\n"
			+ "1974#GRUPO A#22#6#Alemanha Oriental#1#0#Alemanha Ocidental#Hamburgo\r\n"
			+ "1978#GRUPO A#10#6#Itália#1#0#Argentina#Buenos Aires\r\n"
			+ "1998#Disp. 3°. Lugar#11#7#Croácia#2#1#Holanda#Paris\r\n"
			+ "1970#GRUPO D#3#6#Alemanha Ocidental#2#1#Marrocos#León\r\n"
			+ "1994#GRUPO A#22#6#Estados Unidos#2#1#Colômbia#Los Angeles\r\n"
			+ "1986#QUARTAS-DE-FINAL#21#6#França#1#1#Brasil#Guadalajara\r\n"
			+ "2002#OITAVAS-DE-FINAL#17#6#Brasil#2#0#Bélgica#Kobe\r\n"
			+ "1962#GRUPO C#30#5#Brasil#2#0#México#Viña del Mar\r\n"
			+ "2014#GRUPO C#24#6#Japão#1#4#Colômbia#Cuiabá\r\n"
			+ "2010#OITAVAS-DE-FINAL#27#6#Alemanha#4#1#Inglaterra#Bloemfontein\r\n"
			+ "2006#GRUPO A#9#6#Alemanha#4#2#Costa Rica#Munique\r\n"
			+ "1986#GRUPO F#7#6#Polônia#1#0#Portugal#Monterrey\r\n"
			+ "2006#GRUPO G#13#6#França#0#0#Suíça#Stuttgart\r\n"
			+ "1954#GRUPO C#16#6#Uruguai#2#0#Tchecoslováquia#Berna\r\n"
			+ "1958#GRUPO D#17#6#União Soviética#1#0#Inglaterra#Gotemborg\r\n"
			+ "1986#GRUPO A#5#6#Bulgária#1#1#Coreia do Sul#Cidade do México\r\n"
			+ "1982#GRUPO A#23#6#Itália#1#1#Camarões#Vigo\r\n"
			+ "2018#GRUPO A#20#6#Uruguai#1#0#Arábia Saudita#Rostov Arena\r\n"
			+ "1974#GRUPO B#18#6#Brasil#0#0#Escócia#Frankfurt\r\n"
			+ "1986#OITAVAS-DE-FINAL#16#6#Argentina#1#0#Uruguai#Puebla\r\n"
			+ "1958#GRUPO D#8#6#Inglaterra#2#2#União Soviética#Gotemborg\r\n"
			+ "1994#GRUPO F#19#6#Bélgica#1#0#Marrocos#Orlando\r\n"
			+ "1974#GRUPO D#19#6#Argentina#1#1#Itália#Stuttgart\r\n"
			+ "1978#FINAL#25#6#Argentina#3#1#Holanda#Buenos Aires\r\n"
			+ "2018#GRUPO G#18#6#Bélgica#3#0#Panamá#Fisht Satdium\r\n"
			+ "1958#GRUPO D#8#6#Brasil#3#0#Áustria#Uddevalla\r\n"
			+ "2018#GRUPO E#22#6#Brasil#2#0#Costa Rica#Kaliningrad Stadium\r\n"
			+ "1990#OITAVAS-DE-FINAL#24#6#Argentina#1#0#Brasil#Turim\r\n"
			+ "1998#GRUPO B#23#6#Chile#1#1#Camarões#Nantes\r\n"
			+ "2018#GRUPO A#14#6#Russia#5#0#Arábia Saudita#Luzhnik Stadium\r\n"
			+ "2014#GRUPO A#17#6#Brasil#0#0#México#Fortaleza\r\n"
			+ "2018#GRUPO H#24#6#Japão#2#2#Senegal#Ekaterinburg Arena\r\n"
			+ "1974#Disp. 3°. Lugar#6#7#Polônia#1#0#Brasil#Berlim\r\n"
			+ "2010#GRUPO E#19#6#Holanda#1#0#Japão#Durban\r\n"
			+ "1974#GRUPO A#18#6#Alemanha Oriental#1#1#Chile#Berlim\r\n"
			+ "1998#GRUPO B#17#6#Itália#3#0#Camarões#Montpellier\r\n"
			+ "1958#FINAL#29#6#Brasil#5#2#Suécia#Solna\r\n"
			+ "1970#GRUPO B#10#6#Suécia#1#0#Uruguai#Puebla\r\n"
			+ "1978#GRUPO C#7#6#Brasil#0#0#Espanha#Mar del Plata\r\n"
			+ "1974#GRUPO C#19#6#Holanda#0#0#Suécia#Dortmund\r\n"
			+ "1978#GRUPO A#2#6#Argentina#2#1#Hungria#Buenos Aires\r\n"
			+ "2006#GRUPO C#11#6#Sérvia e Montenegro#0#1#Holanda#Leipzig\r\n"
			+ "2014#OITAVAS-DE-FINAL#1#7#Bélgica#2#1#Estados Unidos#Salvador\r\n"
			+ "1974#GRUPO D#15#6#Itália#3#1#Haiti#Berlim\r\n"
			+ "1966#QUARTAS-DE-FINAL#23#7#Inglaterra#1#0#Argentina#Londres\r\n"
			+ "2006#FINAL#9#7#Itália#1#1#França#Berlim\r\n"
			+ "2018#GRUPO H#19#6#Colombia#1#2#Japão#Mordovia Arena\r\n"
			+ "1998#GRUPO H#14#6#Croácia#3#1#Jamaica#Lens\r\n"
			+ "2010#GRUPO C#23#6#Estados Unidos#1#0#Argélia#Pretória\r\n"
			+ "2006#QUARTAS-DE-FINAL#30#6#Alemanha#1#1#Argentina#Berlim\r\n"
			+ "1994#GRUPO E#18#6#Irlanda#1#0#Itália#New York\r\n"
			+ "1986#SEMIFINAL#25#6#Alemanha Ocidental#2#0#França#Guadalajara\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 2#18#6#Argentina#0#0#Brasil#Rosario\r\n"
			+ "1930#SEMIFINAL#27#7#Uruguai#6#1#Iugoslávia#Montevidéu\r\n"
			+ "1962#GRUPO C#7#6#México#3#1#Tchecoslováquia#Viña del Mar\r\n"
			+ "1994#GRUPO A#26#6#Romênia#1#0#Estados Unidos#Los Angeles\r\n"
			+ "1930#GRUPO D#17#7#Estados Unidos#3#0#Paraguai#Montevidéu\r\n"
			+ "2018#GRUPO A#15#6#Egito#0#1#Uruguai#Ekaterinburg Arena\r\n"
			+ "1966#GRUPO A#20#7#Inglaterra#2#0#França#Londres\r\n"
			+ "2002#GRUPO A#6#6#Dinamarca#1#1#Senegal#Daegu\r\n"
			+ "1966#GRUPO A#16#7#Inglaterra#2#0#México#Londres\r\n"
			+ "2006#GRUPO E#22#6#República Tcheca#0#2#Itália#Hamburgo\r\n"
			+ "1974#GRUPO C#15#6#Holanda#2#0#Uruguai#Hanover\r\n"
			+ "2006#GRUPO B#10#6#Inglaterra#1#0#Paraguai#Frankfurt\r\n"
			+ "2014#GRUPO G#16#6#Alemanha#4#0#Portugal#Salvador\r\n"
			+ "1998#GRUPO C#18#6#Dinamarca#1#1#África do Sul#Toulouse\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 2#18#6#Polônia#1#0#Peru#Mendoza\r\n"
			+ "2006#QUARTAS-DE-FINAL#1#7#Brasil#0#1#França#Frankfurt\r\n"
			+ "1990#GRUPO A#10#6#Tchecoslováquia#5#1#Estados Unidos#Florence\r\n"
			+ "2010#GRUPO E#14#6#Japão#1#0#Camarões#Bloemfontein\r\n"
			+ "1930#GRUPO C#14#7#Romênia#3#1#Peru#Montevidéu\r\n"
			+ "1970#GRUPO B#2#6#Uruguai#2#0#Israel#Puebla\r\n"
			+ "1994#QUARTAS-DE-FINAL#10#7#Bulgária#2#1#Alemanha#New York\r\n"
			+ "2010#GRUPO A#11#6#África do Sul#1#1#México#Joanesburgo\r\n"
			+ "1982#GRUPO F#23#6#Brasil#4#0#Nova Zelândia#Sevilla\r\n"
			+ "1986#QUARTAS-DE-FINAL#21#6#Alemanha Ocidental#0#0#México#Monterrey\r\n"
			+ "1938#FINAL#19#6#Itália#4#2#Hungria#Paris\r\n"
			+ "2018#OITAVAS-DE-FINAL#3#7#Suécia#1#0#Suiça#Saint Petersburg Stadium\r\n"
			+ "1994#QUARTAS-DE-FINAL#9#7#Brasil#3#2#Holanda#Dallas\r\n"
			+ "1978#GRUPO C#11#6#Espanha#1#0#Suécia#Buenos Aires\r\n"
			+ "1954#QUARTAS-DE-FINAL#27#6#Alemanha Ocidental#2#0#Iugoslávia#Genebra\r\n"
			+ "2006#OITAVAS-DE-FINAL#25#6#Inglaterra#1#0#Equador#Stuttgart\r\n"
			+ "2002#QUARTAS-DE-FINAL#22#6#Coreia do Sul#0#0#Espanha#Gwangju\r\n"
			+ "2006#GRUPO G#19#6#Togo#0#2#Suíça#Dortmund\r\n"
			+ "1986#OITAVAS-DE-FINAL#18#6#Espanha#5#1#Dinamarca#Queretaro\r\n"
			+ "1950#GRUPO B#2#7#Chile#5#2#Estados Unidos#Recife\r\n"
			+ "1978#GRUPO C#7#6#Áustria#1#0#Suécia#Buenos Aires\r\n"
			+ "1994#GRUPO B#19#6#Suécia#2#2#Camarões#Los Angeles\r\n"
			+ "1986#GRUPO A#2#6#Argentina#3#1#Coreia do Sul#Cidade do México\r\n"
			+ "1954#GRUPO A#19#6#Brasil#1#1#Iugoslávia#Lausanne\r\n"
			+ "1994#GRUPO F#29#6#Arábia Saudita#1#0#Bélgica#Washington DC\r\n"
			+ "1998#OITAVAS-DE-FINAL#29#6#Alemanha#2#1#México#St. Denis\r\n"
			+ "1990#GRUPO B#14#6#Camarões#2#1#Romênia#Bari\r\n"
			+ "2002#GRUPO B#7#6#Espanha#3#1#Paraguai#Jeonju\r\n"
			+ "2014#GRUPO B#23#6#Holanda#2#0#Chile#São Paulo\r\n"
			+ "1998#GRUPO H#26#6#Argentina#1#0#Croácia#Bordeaux\r\n"
			+ "1990#GRUPO F#12#6#Egito#1#1#Holanda#Palermo\r\n"
			+ "1986#GRUPO A#10#6#Argentina#2#0#Bulgária#Cidade do México\r\n"
			+ "1982#GRUPO C#13#6#Bélgica#1#0#Argentina#Barcelona\r\n"
			+ "2006#GRUPO F#18#6#Japão#0#0#Croácia#Nuremberg\r\n"
			+ "1998#GRUPO F#21#6#Irã#2#1#Estados Unidos#Lyon\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 1#1#7#União Soviética#1#0#Bélgica#Barcelona\r\n"
			+ "2018#SEMIFINAL#10#7#França#1#0#Bélgica#Saint Petersburg Stadium\r\n"
			+ "2010#GRUPO F#24#6#Eslováquia#3#2#Itália#Joanesburgo\r\n"
			+ "1986#GRUPO A#31#5#Itália#1#1#Bulgária#Cidade do México\r\n"
			+ "2010#GRUPO E#19#6#Camarões#1#2#Dinamarca#Pretória\r\n"
			+ "1998#GRUPO C#18#6#França#4#0#Arábia Saudita#St. Denis\r\n"
			+ "1990#OITAVAS-DE-FINAL#23#6#Camarões#2#1#Colômbia#Napoli\r\n"
			+ "2010#GRUPO H#25#6#Suíça#0#0#Honduras#Bloemfontein\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#3#7#Suécia#2#1#Iugoslávia#Colônia\r\n"
			+ "1982#GRUPO B#16#6#Argélia#2#1#Alemanha Ocidental#Gijón\r\n"
			+ "1978#GRUPO D#7#6#Holanda#0#0#Peru#Mendoza\r\n"
			+ "1954#QUARTAS-DE-FINAL#26#6#Áustria#7#5#Suíça#Lausanne\r\n"
			+ "2018#GRUPO C#16#6#França#2#1#Australia#Kazan Arena\r\n"
			+ "2002#GRUPO A#1#6#Uruguai#1#2#Dinamarca#Ulsan\r\n"
			+ "2010#GRUPO A#22#6#México#0#1#Uruguai#Rustemburgo\r\n"
			+ "1990#OITAVAS-DE-FINAL#23#6#Tchecoslováquia#4#1#Costa Rica#Bari\r\n"
			+ "2002#GRUPO G#3#6#Itália#2#0#Equador#Sapporo\r\n"
			+ "1994#GRUPO E#19#6#Noruega#1#0#México#Washington DC\r\n"
			+ "2002#GRUPO B#8#6#África do Sul#1#0#Eslovênia#Daegu\r\n"
			+ "1982#GRUPO B#25#6#Alemanha Ocidental#1#0#Áustria#Vigo\r\n"
			+ "1994#GRUPO B#24#6#Suécia#3#1#Rússia#Detroit\r\n"
			+ "2018#GRUPO G#23#6#Belgica#5#2#Tunisia#Spartak Stadium\r\n"
			+ "1982#Disp. 3°. Lugar#10#7#Polônia#3#2#França#Alicante\r\n"
			+ "1958#GRUPO A#11#6#Argentina#3#1#Irlanda do Norte#Halmstad\r\n"
			+ "1982#GRUPO A#14#6#Itália#0#0#Polônia#Vigo\r\n"
			+ "2018#GRUPO E#22#6#Sérvia#1#2#Suiça#Saint Petersburg Stadium\r\n"
			+ "1962#GRUPO A#30#5#Uruguai#2#1#Colômbia#Arica\r\n"
			+ "1994#Disp. 3°. Lugar#16#7#Suécia#4#0#Bulgária#Los Angeles\r\n"
			+ "1954#GRUPO B#17#6#Alemanha Ocidental#4#1#Turquia#Berna\r\n"
			+ "1990#GRUPO C#16#6#Brasil#1#0#Costa Rica#Turim\r\n"
			+ "1998#GRUPO C#12#6#França#3#0#África do Sul#Marseilles\r\n"
			+ "2006#GRUPO H#14#6#Tunísia#2#2#Arábia Saudita#Munique\r\n"
			+ "2018#GRUPO B#15#6#Portugal#3#3#Espanha#Fisht Stadium\r\n"
			+ "1938#OITAVAS-DE-FINAL#5#6#Cuba#3#3#Romênia#Toulouse\r\n"
			+ "2018#OITAVAS-DE-FINAL#1#7#Espanha#3#4#Rússia#Luzhnik Stadium\r\n"
			+ "1974#GRUPO B#22#6#Escócia#1#1#Iugoslávia#Frankfurt\r\n"
			+ "2006#GRUPO H#23#6#Arábia Saudita#0#1#Espanha#Kaiserslautern\r\n"
			+ "1962#GRUPO C#31#5#Tchecoslováquia#1#0#Espanha#Viña del Mar\r\n"
			+ "2002#GRUPO F#12#6#Suécia#1#1#Argentina#Miyagi\r\n"
			+ "1998#OITAVAS-DE-FINAL#30#6#Argentina#2#2#Inglaterra#St. Etienne\r\n"
			+ "1974#GRUPO A#14#6#Alemanha Ocidental#1#0#Chile#Berlim\r\n"
			+ "1938#OITAVAS-DE-FINAL#5#6#Itália#2#1#Noruega#Marseilles\r\n"
			+ "2002#GRUPO D#4#6#Coreia do Sul#2#0#Polônia#Busan\r\n"
			+ "2014#GRUPO G#22#6#Estados Unidos#2#2#Portugal#Manaus\r\n"
			+ "2010#GRUPO G#25#6#Portugal#0#0#Brasil#Durban\r\n"
			+ "1938#OITAVAS-DE-FINAL#9#6#Suíça#4#2#Alemanha#Paris\r\n"
			+ "1990#FINAL#8#7#Alemanha Ocidental#1#0#Argentina#Roma\r\n"
			+ "1998#OITAVAS-DE-FINAL#28#6#França#1#0#Paraguai#Lens\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Alemanha Ocidental#3#2#Inglaterra#León\r\n"
			+ "1978#GRUPO D#7#6#Irã#1#1#Escócia#Cordoba\r\n"
			+ "1990#GRUPO E#17#6#Espanha#3#1#Coreia do Sul#Udine\r\n"
			+ "1998#GRUPO D#19#6#Nigéria#1#0#Bulgária#Paris\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 1#3#7#Argentina#1#1#Alemanha Oriental#Gelsenkirchen\r\n"
			+ "1994#GRUPO B#24#6#Brasil#3#0#Camarões#San Francisco\r\n"
			+ "1994#GRUPO A#26#6#Colômbia#2#0#Suíça#San Francisco\r\n"
			+ "2018#OITAVAS-DE-FINAL#2#7#Brasil#2#0#México#Samara Arena\r\n"
			+ "1958#GRUPO A#15#6#Alemanha Ocidental#2#2#Irlanda do Norte#Malmoe\r\n"
			+ "1962#GRUPO B#3#6#Alemanha Ocidental#2#1#Suíça#Santiago\r\n"
			+ "1990#GRUPO C#20#6#Brasil#1#0#Escócia#Turim\r\n"
			+ "1974#GRUPO D#19#6#Polônia#7#0#Haiti#Berlim\r\n"
			+ "2014#OITAVAS-DE-FINAL#30#6#França#2#0#Nigéria#Brasília\r\n"
			+ "1982#SEMIFINAL#8#7#Itália#2#0#Polônia#Barcelona\r\n"
			+ "1978#GRUPO A#2#6#Itália#2#1#França#Mar del Plata\r\n"
			+ "1958#GRUPO B#8#6#Escócia#1#1#Iugoslávia#Vasteraas\r\n"
			+ "1978#GRUPO C#3#6#Brasil#1#1#Suécia#Mar del Plata\r\n"
			+ "1986#GRUPO D#1#6#Brasil#1#0#Espanha#Guadalajara\r\n"
			+ "2006#OITAVAS-DE-FINAL#27#6#Espanha#1#3#França#Hannover\r\n"
			+ "1982#GRUPO D#20#6#Inglaterra#2#0#Tchecoslováquia#Bilbau\r\n"
			+ "1990#OITAVAS-DE-FINAL#25#6#Irlanda#0#0#Romênia#Genoa\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Uruguai#1#0#União Soviética#Cidade do México\r\n"
			+ "2002#GRUPO F#12#6#Inglaterra#0#0#Nigéria#Osaka\r\n"
			+ "1982#GRUPO F#22#6#Escócia#2#2#União Soviética#Málaga\r\n"
			+ "2018#OITAVAS-DE-FINAL#2#7#Bélgica#3#2#Japão#Rostov Arena\r\n"
			+ "1998#GRUPO E#20#6#Holanda#5#0#Coreia do Sul#Marseille\r\n"
			+ "1970#GRUPO C#6#6#Romênia#2#1#Tchecoslováquia#Guadalajara\r\n"
			+ "2002#GRUPO D#14#6#Coreia do Sul#1#0#Portugal#Incheon\r\n"
			+ "2002#GRUPO B#2#6#Paraguai#2#2#África do Sul#Busan\r\n"
			+ "2014#GRUPO C#24#6#Grécia#2#1#Costa do Marfim#Fortaleza\r\n"
			+ "1998#GRUPO F#21#6#Alemanha#2#2#Iugoslávia#Lens\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 1#26#6#Holanda#4#0#Argentina#Gelsenkirchen\r\n"
			+ "1994#GRUPO D#21#6#Argentina#4#0#Grécia#Boston\r\n"
			+ "1958#GRUPO A#8#6#Irlanda do Norte#1#0#Tchecoslováquia#Halmstad\r\n"
			+ "1950#GRUPO A#1#7#Brasil#2#0#Iugoslávia#Rio de Janeiro\r\n"
			+ "1998#GRUPO G#15#6#Inglaterra#2#0#Tunísia#Marseilles\r\n"
			+ "1950#GRUPO A#28#6#Brasil#2#2#Suíça#São Paulo\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#26#6#Alemanha Ocidental#2#0#Iugoslávia#Colônia\r\n"
			+ "2018#GRUPO D#26#6#Nigéria#1#2#Argentina#Saint Petersburg Stadium\r\n"
			+ "1990#QUARTAS-DE-FINAL#30#6#Itália#1#0#Irlanda#Roma\r\n"
			+ "1986#GRUPO E#4#6#Alemanha Ocidental#1#1#Uruguai#Queretaro\r\n"
			+ "2010#GRUPO B#22#6#Nigéria#2#2#Coreia do Sul#Durban\r\n"
			+ "1994#GRUPO F#29#6#Holanda#2#1#Marrocos#Orlando\r\n"
			+ "2002#GRUPO H#10#6#Bélgica#1#1#Tunísia#Oita\r\n"
			+ "2010#GRUPO D#13#6#Alemanha#4#0#Austrália#Durban\r\n"
			+ "1990#GRUPO D#9#6#Colômbia#2#0#Emirados Arabes#Bologna\r\n"
			+ "2014#GRUPO E#20#6#Honduras#1#2#Equador#Curitiba\r\n"
			+ "1950#GRUPO D#2#7#Uruguai#8#0#Bolivia#Belo Horizonte\r\n"
			+ "1994#OITAVAS-DE-FINAL#3#7#Suécia#3#1#Arábia Saudita#Dallas\r\n"
			+ "2002#GRUPO G#13#6#México#1#1#Itália#Oita\r\n"
			+ "1966#GRUPO D#20#7#União Soviética#2#1#Chile#Sunderland\r\n"
			+ "2018#GRUPO D#22#6#Nigéria#2#0#Islândia#Volgograd Arena\r\n"
			+ "2014#OITAVAS-DE-FINAL#28#6#Colômbia#2#0#Uruguai#Rio de Janeiro\r\n"
			+ "2010#GRUPO B#17#6#Grécia#2#1#Nigéria#Bloemfontein\r\n"
			+ "1994#GRUPO E#23#6#Itália#1#0#Noruega#New York\r\n"
			+ "1954#GRUPO B#17#6#Hungria#9#0#Coreia do Sul#Zurique\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#Brasil#1#0#País de Gales#Gotemborg\r\n"
			+ "1954#QUARTAS-DE-FINAL#27#6#Hungria#4#2#Brasil#Berna\r\n"
			+ "1970#GRUPO B#6#6#Uruguai#0#0#Itália#Puebla\r\n"
			+ "2002#GRUPO F#7#6#Suécia#2#1#Nigéria#Kobe\r\n"
			+ "1938#QUARTAS-DE-FINAL#14#6#Tchecoslováquia#1#2#Brasil#Bordeaux\r\n"
			+ "2014#GRUPO D#14#6#Uruguai#1#3#Costa Rica#Fortaleza\r\n"
			+ "1986#OITAVAS-DE-FINAL#17#6#Alemanha Ocidental#1#0#Marrocos#Monterrey\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 1#14#6#Itália#0#0#Alemanha Ocidental#Buenos Aires\r\n"
			+ "2006#SEMIFINAL#4#7#Alemanha#0#2#Itália#Dortmund\r\n"
			+ "1982#GRUPO A#19#6#Camarões#0#0#Polônia#Corunha\r\n"
			+ "2002#FINAL#30#6#Brasil#2#0#Alemanha#Yokohama\r\n"
			+ "1958#GRUPO D#11#6#Brasil#0#0#Inglaterra#Gotemborg\r\n"
			+ "2014#GRUPO G#26#6#Estados Unidos#0#1#Alemanha#Recife\r\n"
			+ "2014#SEMIFINAL#9#7#Holanda#0#0#Argentina#São Paulo\r\n"
			+ "1986#GRUPO E#8#6#Dinamarca#6#1#Uruguai#Nezahualcoyotl\r\n"
			+ "1930#GRUPO A#19#7#França#0#1#Chile#Montevidéu\r\n"
			+ "1990#GRUPO F#21#6#Inglaterra#1#0#Egito#Cagliari\r\n"
			+ "1990#GRUPO A#19#6#Itália#2#0#Tchecoslováquia#Roma\r\n"
			+ "1990#OITAVAS-DE-FINAL#25#6#Itália#2#0#Uruguai#Roma\r\n"
			+ "2014#GRUPO H#22#6#Bélgica#1#0#Rússia#Rio de Janeiro\r\n"
			+ "1998#GRUPO E#25#6#Holanda#2#2#México#St. Etienne\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 4#1#7#Áustria#2#2#Irlanda do Norte#Madri\r\n"
			+ "1962#GRUPO D#3#6#Hungria#6#1#Bulgária#Rancagua\r\n"
			+ "1966#GRUPO B#20#7#Alemanha Ocidental#2#1#Espanha#Birmingham\r\n"
			+ "2010#GRUPO F#14#6#Itália#1#1#Paraguai#Cidade do Cabo\r\n"
			+ "2018#GRUPO B#15#6#Marrocos#0#1#Irã#Saint Petersburg Stadium\r\n"
			+ "1978#GRUPO B#10#6#Polônia#3#1#México#Rosario\r\n"
			+ "1970#GRUPO D#2#6#Peru#3#2#Bulgária#León\r\n"
			+ "1970#GRUPO D#6#6#Peru#3#0#Marrocos#León\r\n"
			+ "1954#GRUPO A#16#6#Brasil#5#0#México#Genebra\r\n"
			+ "2006#QUARTAS-DE-FINAL#30#6#Itália#3#0#Ucrânia#Hamburgo\r\n"
			+ "2006#GRUPO A#15#6#Equador#3#0#Costa Rica#Hamburgo\r\n"
			+ "2018#GRUPO F#18#6#Suécia#1#0#Coréia do Sul#Nizhny Novgorod Stadium\r\n"
			+ "1986#GRUPO E#13#6#Escócia#0#0#Uruguai#Nezahualcoyotl\r\n"
			+ "2018#DISPUTA 3° LUGAR#14#7#Belgica#2#0#Inglaterra#Saint Petersburg Stadium\r\n"
			+ "1990#GRUPO A#19#6#Áustria#2#1#Estados Unidos#Florence\r\n"
			+ "2010#GRUPO H#16#6#Espanha#0#1#Suíça#Durban\r\n"
			+ "1950#FASE FINAL#16#7#Uruguai#2#1#Brasil#Rio de Janeiro\r\n"
			+ "1958#GRUPO D#15#6#Brasil#2#0#União Soviética#Gotemborg\r\n"
			+ "1962#SEMIFINAL#13#6#Tchecoslováquia#3#1#Iugoslávia#Viña del Mar\r\n"
			+ "2006#GRUPO F#12#6#Austrália#3#1#Japão#Kaiserslautern\r\n"
			+ "2018#QUARTAS-DE-FINAL#7#7#Rússia#3#4#Croácia#Fisht Stadium\r\n"
			+ "2002#QUARTAS-DE-FINAL#22#6#Turquia#1#0#Senegal#Osaka\r\n"
			+ "1982#GRUPO E#17#6#Irlanda do Norte#0#0#Iugoslávia#Zaragoza\r\n"
			+ "1966#SEMIFINAL#25#7#Alemanha Ocidental#2#1#União Soviética#Liverpool\r\n"
			+ "2018#GRUPO G#24#6#Inglaterra#6#1#Panamá#Nizhny Novgorod Stadium\r\n"
			+ "1974#GRUPO B#22#6#Brasil#3#0#Zaire#Gelsenkirchen\r\n"
			+ "1986#GRUPO B#11#6#Bélgica#2#2#Paraguai#Toluca\r\n"
			+ "2006#GRUPO E#17#6#Itália#1#1#Estados Unidos#Kaiserslautern\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#Hungria#2#0#Suíça#Lille\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Itália#4#1#México#Toluca\r\n"
			+ "1998#GRUPO G#26#6#Romênia#1#1#Tunísia#St. Denis\r\n"
			+ "1970#GRUPO A#3#6#Bélgica#3#0#El Salvador#Cidade do México\r\n"
			+ "2018#GRUPO D#21#6#Argentina#0#3#Croácia#Nizhny Novgorod Stadium\r\n"
			+ "2010#OITAVAS-DE-FINAL#28#6#Holanda#2#1#Eslováquia#Durban\r\n"
			+ "1986#GRUPO E#4#6#Dinamarca#1#0#Escócia#Nezahualcoyotl\r\n"
			+ "2014#GRUPO A#18#6#Camarões#0#4#Croácia#Manaus\r\n"
			+ "1958#GRUPO C#8#6#Hungria#1#1#País de Gales#Sandviken\r\n"
			+ "2006#OITAVAS-DE-FINAL#24#6#Alemanha#2#0#Suécia#Munique\r\n"
			+ "2014#GRUPO B#13#6#Chile#3#1#Austrália#Cuiabá\r\n"
			+ "1998#GRUPO C#12#6#Dinamarca#1#0#Arábia Saudita#Lens\r\n"
			+ "1930#GRUPO C#21#7#Uruguai#4#0#Romênia#Montevidéu\r\n"
			+ "1954#GRUPO D#17#6#Suíça#2#1#Itália#Lausanne\r\n"
			+ "1962#GRUPO A#7#6#Iugoslávia#5#0#Colômbia#Arica\r\n"
			+ "2006#GRUPO D#17#6#Portugal#2#0#Irã#Frankfurt\r\n"
			+ "2002#SEMIFINAL#26#6#Brasil#1#0#Turquia#Saitama\r\n"
			+ "1954#GRUPO B#20#6#Hungria#8#3#Alemanha Ocidental#Basel\r\n"
			+ "1950#GRUPO A#24#6#Brasil#4#0#México#Rio de Janeiro\r\n"
			+ "1982#GRUPO F#15#6#Escócia#5#2#Nova Zelândia#Málaga\r\n"
			+ "2006#GRUPO E#17#6#República Tcheca#0#2#Gana#Colônia\r\n"
			+ "1998#OITAVAS-DE-FINAL#27#6#Itália#1#0#Noruega#Marseille\r\n"
			+ "2006#GRUPO E#22#6#Gana#2#1#Estados Unidos#Nuremberg\r\n"
			+ "2010#GRUPO C#18#6#Eslovênia#2#2#Estados Unidos#Joanesburgo\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#Brasil#1#1#Tchecoslováquia#Bordeaux\r\n"
			+ "2014#GRUPO C#19#6#Colômbia#2#1#Costa do Marfim#Brasília\r\n"
			+ "1990#GRUPO C#11#6#Costa Rica#1#0#Escócia#Genoa\r\n"
			+ "1978#GRUPO B#10#6#Tunísia#0#0#Alemanha Ocidental#Cordoba\r\n"
			+ "2018#QUARTAS-DE-FINAL#6#7#Uruguai#0#2#França#Nizhny Novgorod Stadium\r\n"
			+ "2006#GRUPO D#11#6#México#3#1#Irã#Nuremberg\r\n"
			+ "2018#OITAVAS-DE-FINAL#30#6#França#4#3#Argentina#Kazan Arena\r\n"
			+ "2006#GRUPO F#22#6#Japão#1#4#Brasil#Dortmund\r\n"
			+ "2014#GRUPO H#17#6#Bélgica#2#1#Argélia#Belo Horizonte\r\n"
			+ "2018#GRUPO B#25#6#Espanha#2#2#Marrocos#Kaliningrad Stadium\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Brasil#4#2#Peru#Guadalajara\r\n"
			+ "2014#QUARTAS-DE-FINAL#5#7#Argentina#1#0#Bélgica#Brasília\r\n"
			+ "2002#GRUPO E#11#6#Alemanha#2#0#Camarões#Shizuoka\r\n"
			+ "2002#GRUPO H#14#6#Bélgica#3#2#Rússia#Shizuoka\r\n"
			+ "1958#Disp. 3°. Lugar#26#6#França#6#3#Alemanha Ocidental#Gotemborg\r\n"
			+ "1966#GRUPO A#19#7#Uruguai#0#0#México#Londres\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 1#4#7#Polônia#0#0#União Soviética#Barcelona\r\n"
			+ "1962#GRUPO B#31#5#Itália#0#0#Alemanha Ocidental#Santiago\r\n"
			+ "2006#OITAVAS-DE-FINAL#26#6#Itália#1#0#Austrália#Kaiserslautern\r\n"
			+ "1998#GRUPO F#25#6#Iugoslávia#1#0#Estados Unidos#Nantes\r\n"
			+ "1998#GRUPO F#25#6#Alemanha#2#0#Irã#Montpellier\r\n"
			+ "1962#GRUPO D#30#5#Argentina#1#0#Bulgária#Rancagua\r\n"
			+ "1966#GRUPO C#19#7#Portugal#3#1#Brasil#Liverpool\r\n"
			+ "1962#GRUPO B#30#5#Chile#3#1#Suíça#Santiago\r\n"
			+ "1974#GRUPO D#23#6#Polônia#2#1#Itália#Stuttgart\r\n"
			+ "2018#GRUPO E#17#6#Costa Rica#0#1#Sérvia#Rostov Arena\r\n"
			+ "2006#GRUPO B#15#6#Inglaterra#2#0#Trinidad e Tobago#Nuremberg\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 4#4#7#França#4#1#Irlanda do Norte#Madri\r\n"
			+ "1998#GRUPO F#15#6#Alemanha#2#0#Estados Unidos#Paris\r\n"
			+ "1986#GRUPO B#7#6#México#1#1#Paraguai#Cidade do México\r\n"
			+ "2014#GRUPO D#14#6#Inglaterra#1#2#Itália#Manaus\r\n"
			+ "1958#GRUPO B#8#6#França#7#3#Paraguai#Norrkoping\r\n"
			+ "1998#SEMIFINAL#8#7#França#2#1#Croácia#St. Denis\r\n"
			+ "2010#QUARTAS-DE-FINAL#2#7#Uruguai#1#1#Gana#Joanesburgo\r\n"
			+ "1990#GRUPO B#18#6#União Soviética#4#0#Camarões#Roma\r\n"
			+ "1954#SEMIFINAL#30#6#Alemanha Ocidental#6#1#Áustria#Basel\r\n"
			+ "FIM\r\n"
			+ "50\r\n"
			+ "18/6/1974;Brasil\r\n"
			+ "14/6/2006;Tunísia\r\n"
			+ "26/6/1954;Áustria\r\n"
			+ "7/6/1962;México\r\n"
			+ "9/6/1938;Suíça\r\n"
			+ "24/6/2010;Eslováquia\r\n"
			+ "25/6/2018;Uruguai\r\n"
			+ "18/6/2018;Bélgica\r\n"
			+ "31/5/1962;Tchecoslováquia\r\n"
			+ "9/7/2014;Holanda\r\n"
			+ "17/6/2010;Grécia\r\n"
			+ "10/7/1994;Bulgária\r\n"
			+ "19/6/1938;Itália\r\n"
			+ "11/6/1978;Espanha\r\n"
			+ "16/6/2014;Alemanha\r\n"
			+ "5/6/1986;Bulgária\r\n"
			+ "22/6/2018;Sérvia\r\n"
			+ "15/6/1998;Alemanha\r\n"
			+ "26/6/2018;Nigéria\r\n"
			+ "17/6/1982;Tchecoslováquia\r\n"
			+ "18/6/1986;Espanha\r\n"
			+ "17/6/2014;Bélgica\r\n"
			+ "8/7/1982;Alemanha Ocidental\r\n"
			+ "8/6/2002;África do Sul\r\n"
			+ "21/6/2018;Argentina\r\n"
			+ "21/6/2002;Brasil\r\n"
			+ "25/6/1986;Alemanha Ocidental\r\n"
			+ "17/6/1954;Hungria\r\n"
			+ "7/7/1998;Brasil\r\n"
			+ "30/5/1962;Argentina\r\n"
			+ "30/6/2018;França\r\n"
			+ "6/6/2002;Dinamarca\r\n"
			+ "22/6/1974;Brasil\r\n"
			+ "16/7/1994;Suécia\r\n"
			+ "8/6/2002;Croácia\r\n"
			+ "19/6/1958;França\r\n"
			+ "25/6/1998;Holanda\r\n"
			+ "12/6/2002;Espanha\r\n"
			+ "8/6/1958;Hungria\r\n"
			+ "16/6/1990;Inglaterra\r\n"
			+ "24/6/2006;Alemanha\r\n"
			+ "10/6/1978;Tunísia\r\n"
			+ "26/6/1974;Alemanha Ocidental\r\n"
			+ "14/6/2018;Russia\r\n"
			+ "2/6/1978;Itália\r\n"
			+ "4/7/1982;França\r\n"
			+ "26/6/1998;Argentina\r\n"
			+ "31/5/1934;Itália\r\n"
			+ "14/6/2002;Bélgica\r\n"
			+ "1/7/2014;Bélgica\r\n";
	
	public static void main(String[] args) {
		Jogo jg1 = new Jogo(entradaPadrao);
	}
	
	public Jogo(String entradaPadrao) {
		String[] vetor = entradaPadrao.split("\\r\\n");
		int i = 0;
		
		for(String linha : vetor) {
			System.out.println(linha);
		}
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getEtapa() {
		return this.etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	
	public String getSelecao1() {
		return selecao1;
	}
	public void setSelecao1(String selecao1) {
		this.selecao1 = selecao1;
	}
	
	public String getSelecao2() {
		return selecao2;
	}
	public void setSelecao2(String selecao2) {
		this.selecao2 = selecao2;
	}
	
	public int getPlacarSelecao1() {
		return placarSelecao1;
	}
	public void setPlacarSelecao1(int placarSelecao1) {
		this.placarSelecao1 = placarSelecao1;
	}
	
	public int getPlacarSelecao2() {
		return placarSelecao2;
	}
	public void setPlacarSelecao2(int placarSelecao2) {
		this.placarSelecao2 = placarSelecao2;
	}

	public String local() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getEntradaPadrao() {
		return entradaPadrao;
	}
	
	public void clone1() {
		// SERÁ IMPLEMENTADO FUTURAMENTE
	}
	
	public void ler() {
		MyIO.setCharset("UTF-8");
		
		String[] dados = new String[9];
		String textoLinha = MyIO.readLine();
		
		dados = textoLinha.split("#");
		
		this.ano = Integer.parseInt(dados[0]);
		this.etapa = dados[1];
		this.dia = Integer.parseInt(dados[2]);
		this.mes = Integer.parseInt(dados[3]);
		this.selecao1 = dados[4];
		this.placarSelecao1 = Integer.parseInt(dados[5]);
		this.placarSelecao2 = Integer.parseInt(dados[6]);
		this.selecao2 = dados[7];
		this.local = dados[8];
	}
	
	public void imprimir() {
		System.out.println("[COPA "+ this.ano +"] [" + this.etapa + "] "
				+ "[" + this.dia + "/" + this.mes + "] [" + this.selecao1 + " (" + this.placarSelecao1 + ") "
				+ "x" + " (" + this.placarSelecao2 + ") " + this.selecao2 + "] [" + this.local + "]");
	}
}