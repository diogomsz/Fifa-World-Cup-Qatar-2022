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
	
	private static String entradaPadrao = "1978#SEGUNDA FASE - GRUPO 1#21#6#Holanda#2#1#It�lia#Buenos Aires\r\n"
			+ "1986#OITAVAS-DE-FINAL#16#6#Brasil#4#0#Pol�nia#Guadalajara\r\n"
			+ "1962#GRUPO C#6#6#Brasil#2#1#Espanha#Vi�a del Mar\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#3#7#Alemanha Ocidental#1#0#Pol�nia#Frankfurt\r\n"
			+ "1982#SEMIFINAL#8#7#Alemanha Ocidental#3#3#Fran�a#Sevilla\r\n"
			+ "1974#FINAL#7#7#Alemanha Ocidental#2#1#Holanda#Berlim\r\n"
			+ "1950#FASE FINAL#13#7#Brasil#6#1#Espanha#Rio de Janeiro\r\n"
			+ "2002#QUARTAS-DE-FINAL#21#6#Brasil#2#1#Inglaterra#Shizuoka\r\n"
			+ "1954#QUARTAS-DE-FINAL#26#6#Uruguai#4#2#Inglaterra#Basel\r\n"
			+ "1994#GRUPO D#21#6#Nig�ria#3#0#Bulg�ria#Dallas\r\n"
			+ "2018#GRUPO B#25#6#Ir�#1#1#Portugal#Mordovia Arena\r\n"
			+ "1982#GRUPO D#17#6#Tchecoslov�quia#1#1#Kuwait#Valladolid\r\n"
			+ "1994#GRUPO C#27#6#Espanha#3#1#Bolivia#Chicago\r\n"
			+ "1978#GRUPO C#3#6#�ustria#2#1#Espanha#Buenos Aires\r\n"
			+ "2002#GRUPO D#10#6#Coreia do Sul#1#1#Estados Unidos#Daegu\r\n"
			+ "2014#OITAVAS-DE-FINAL#28#6#Brasil#1#1#Chile#Belo Horizonte\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#Fran�a#4#0#Irlanda do Norte#Norrkoping\r\n"
			+ "1982#GRUPO D#16#6#Inglaterra#3#1#Fran�a#Bilbau\r\n"
			+ "1930#GRUPO D#13#7#Estados Unidos#3#0#B�lgica#Montevid�u\r\n"
			+ "1950#GRUPO A#29#6#Iugosl�via#4#1#M�xico#Porto Alegre\r\n"
			+ "1998#GRUPO H#20#6#Cro�cia#1#0#Jap�o#Nantes\r\n"
			+ "1934#OITAVAS-DE-FINAL#27#5#�ustria#3#2#Fran�a#Turim\r\n"
			+ "2002#GRUPO B#12#6#Espanha#3#2#�frica do Sul#Daejeon\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#It�lia#1#1#Espanha#Florence\r\n"
			+ "1986#FINAL#29#6#Argentina#3#2#Alemanha Ocidental#Cidade do M�xico\r\n"
			+ "1990#Disp. 3�. Lugar#7#7#It�lia#2#1#Inglaterra#Bari\r\n"
			+ "2002#OITAVAS-DE-FINAL#15#6#Inglaterra#3#0#Dinamarca#Niigata\r\n"
			+ "2006#GRUPO H#19#6#Ar�bia Saudita#0#4#Ucr�nia#Hamburgo\r\n"
			+ "1982#GRUPO C#19#6#B�lgica#1#0#El Salvador#Elche\r\n"
			+ "2002#GRUPO G#8#6#Cro�cia#2#1#It�lia#Ibaraki\r\n"
			+ "1958#GRUPO C#12#6#Su�cia#2#1#Hungria#Solna\r\n"
			+ "1982#GRUPO E#20#6#Espanha#2#1#Iugosl�via#Val�ncia\r\n"
			+ "1970#GRUPO D#10#6#Alemanha Ocidental#3#1#Peru#Le�n\r\n"
			+ "1990#GRUPO A#15#6#Tchecoslov�quia#1#0#�ustria#Florence\r\n"
			+ "1998#GRUPO B#11#6#�ustria#1#1#Camar�es#Toulouse\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 1#18#6#Holanda#2#2#Alemanha Ocidental#Cordoba\r\n"
			+ "1970#GRUPO B#7#6#Israel#1#1#Su�cia#Toluca\r\n"
			+ "2014#GRUPO G#16#6#Gana#1#2#Estados Unidos#Natal\r\n"
			+ "1998#GRUPO A#10#6#Noruega#2#2#Marrocos#Montpellier\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#Su�cia#2#0#Uni�o Sovi�tica#Solna\r\n"
			+ "1982#GRUPO C#18#6#Argentina#4#1#Hungria#Alicante\r\n"
			+ "1990#GRUPO E#13#6#Espanha#0#0#Uruguai#Udine\r\n"
			+ "2006#GRUPO A#14#6#Alemanha#1#0#Pol�nia#Dortmund\r\n"
			+ "2018#OITAVAS-DE-FINAL#3#7#Colombia#3#4#Inglaterra#Spartak Stadium\r\n"
			+ "1986#GRUPO B#11#6#M�xico#1#0#Iraque#Puebla\r\n"
			+ "1998#GRUPO A#16#6#Brasil#3#0#Marrocos#Nantes\r\n"
			+ "1954#GRUPO B#23#6#Alemanha Ocidental#7#2#Turquia#Zurique\r\n"
			+ "1998#GRUPO D#19#6#Espanha#0#0#Paraguai#St. Etienne\r\n"
			+ "1930#GRUPO A#13#7#Fran�a#4#1#M�xico#Montevid�u\r\n"
			+ "1998#GRUPO C#24#6#Ar�bia Saudita#2#2#�frica do Sul#Bordeaux\r\n"
			+ "2010#GRUPO B#17#6#Argentina#4#1#Coreia do Sul#Joanesburgo\r\n"
			+ "2018#GRUPO A#25#6#Uruguai#3#0#Russia#Samara Arena\r\n"
			+ "1990#GRUPO F#16#6#Inglaterra#0#0#Holanda#Cagliari\r\n"
			+ "2014#QUARTAS-DE-FINAL#4#7#Fran�a#0#1#Alemanha#Rio de Janeiro\r\n"
			+ "1962#QUARTAS-DE-FINAL#14#6#Brasil#3#1#Inglaterra#Vi�a del Mar\r\n"
			+ "2002#OITAVAS-DE-FINAL#18#6#Coreia do Sul#2#1#It�lia#Daejeon\r\n"
			+ "1994#GRUPO C#27#6#Alemanha#3#2#Coreia do Sul#Dallas\r\n"
			+ "1966#GRUPO D#13#7#It�lia#2#0#Chile#Sunderland\r\n"
			+ "1978#GRUPO A#6#6#It�lia#3#1#Hungria#Mar del Plata\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#Tchecoslov�quia#3#2#Su��a#Turim\r\n"
			+ "1974#GRUPO A#18#6#Alemanha Ocidental#3#0#Austr�lia#Hamburgo\r\n"
			+ "1930#GRUPO C#18#7#Uruguai#1#0#Peru#Montevid�u\r\n"
			+ "1966#SEMIFINAL#26#7#Inglaterra#2#1#Portugal#Londres\r\n"
			+ "1998#SEMIFINAL#7#7#Brasil#1#1#Holanda#Marseille\r\n"
			+ "2006#GRUPO F#22#6#Cro�cia#2#2#Austr�lia#Stuttgart\r\n"
			+ "2006#GRUPO C#21#6#Holanda#0#0#Argentina#Frankfurt\r\n"
			+ "1934#QUARTAS-DE-FINAL#31#5#�ustria#2#1#Hungria#Bologna\r\n"
			+ "1958#GRUPO D#11#6#Uni�o Sovi�tica#2#0#�ustria#Boraas\r\n"
			+ "2018#GRUPO C#26#6#Dinamarca#0#0#Fran�a#Luzhniki Stadoum\r\n"
			+ "1986#GRUPO D#12#6#Brasil#3#0#Irlanda do Norte#Guadalajara\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#It�lia#3#1#Fran�a#Paris\r\n"
			+ "2010#GRUPO C#12#6#Inglaterra#1#1#Estados Unidos#Rustemburgo\r\n"
			+ "2010#GRUPO F#20#6#Eslov�quia#0#2#Paraguai#Bloemfontein\r\n"
			+ "1950#FASE FINAL#3#7#Brasil#7#1#Su�cia#Rio de Janeiro\r\n"
			+ "1994#GRUPO D#26#6#Bulg�ria#4#0#Gr�cia#Chicago\r\n"
			+ "1978#GRUPO A#6#6#Argentina#2#1#Fran�a#Buenos Aires\r\n"
			+ "1966#GRUPO C#20#7#Hungria#3#1#Bulg�ria#Manchester\r\n"
			+ "2010#GRUPO G#20#6#Brasil#3#1#Costa do Marfim#Joanesburgo\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#26#6#Pol�nia#1#0#Su�cia#Stuttgart\r\n"
			+ "1954#Disp. 3�. Lugar#3#7#�ustria#3#1#Uruguai#Zurique\r\n"
			+ "1990#GRUPO B#8#6#Camar�es#1#0#Argentina#Mil�o\r\n"
			+ "2014#GRUPO F#16#6#Ir�#0#0#Nig�ria#Curitiba\r\n"
			+ "2014#GRUPO F#25#6#Nig�ria#2#3#Argentina#Porto Alegre\r\n"
			+ "1970#SEMIFINAL#17#6#It�lia#4#3#Alemanha Ocidental#Cidade do M�xico\r\n"
			+ "2010#GRUPO F#20#6#It�lia#1#1#Nova Zel�ndia#Nelspruit\r\n"
			+ "1958#SEMIFINAL#24#6#Su�cia#3#1#Alemanha Ocidental#Gotemborg\r\n"
			+ "1974#GRUPO A#22#6#Alemanha Oriental#1#0#Alemanha Ocidental#Hamburgo\r\n"
			+ "1978#GRUPO A#10#6#It�lia#1#0#Argentina#Buenos Aires\r\n"
			+ "1998#Disp. 3�. Lugar#11#7#Cro�cia#2#1#Holanda#Paris\r\n"
			+ "1970#GRUPO D#3#6#Alemanha Ocidental#2#1#Marrocos#Le�n\r\n"
			+ "1994#GRUPO A#22#6#Estados Unidos#2#1#Col�mbia#Los Angeles\r\n"
			+ "1986#QUARTAS-DE-FINAL#21#6#Fran�a#1#1#Brasil#Guadalajara\r\n"
			+ "2002#OITAVAS-DE-FINAL#17#6#Brasil#2#0#B�lgica#Kobe\r\n"
			+ "1962#GRUPO C#30#5#Brasil#2#0#M�xico#Vi�a del Mar\r\n"
			+ "2014#GRUPO C#24#6#Jap�o#1#4#Col�mbia#Cuiab�\r\n"
			+ "2010#OITAVAS-DE-FINAL#27#6#Alemanha#4#1#Inglaterra#Bloemfontein\r\n"
			+ "2006#GRUPO A#9#6#Alemanha#4#2#Costa Rica#Munique\r\n"
			+ "1986#GRUPO F#7#6#Pol�nia#1#0#Portugal#Monterrey\r\n"
			+ "2006#GRUPO G#13#6#Fran�a#0#0#Su��a#Stuttgart\r\n"
			+ "1954#GRUPO C#16#6#Uruguai#2#0#Tchecoslov�quia#Berna\r\n"
			+ "1958#GRUPO D#17#6#Uni�o Sovi�tica#1#0#Inglaterra#Gotemborg\r\n"
			+ "1986#GRUPO A#5#6#Bulg�ria#1#1#Coreia do Sul#Cidade do M�xico\r\n"
			+ "1982#GRUPO A#23#6#It�lia#1#1#Camar�es#Vigo\r\n"
			+ "2018#GRUPO A#20#6#Uruguai#1#0#Ar�bia Saudita#Rostov Arena\r\n"
			+ "1974#GRUPO B#18#6#Brasil#0#0#Esc�cia#Frankfurt\r\n"
			+ "1986#OITAVAS-DE-FINAL#16#6#Argentina#1#0#Uruguai#Puebla\r\n"
			+ "1958#GRUPO D#8#6#Inglaterra#2#2#Uni�o Sovi�tica#Gotemborg\r\n"
			+ "1994#GRUPO F#19#6#B�lgica#1#0#Marrocos#Orlando\r\n"
			+ "1974#GRUPO D#19#6#Argentina#1#1#It�lia#Stuttgart\r\n"
			+ "1978#FINAL#25#6#Argentina#3#1#Holanda#Buenos Aires\r\n"
			+ "2018#GRUPO G#18#6#B�lgica#3#0#Panam�#Fisht Satdium\r\n"
			+ "1958#GRUPO D#8#6#Brasil#3#0#�ustria#Uddevalla\r\n"
			+ "2018#GRUPO E#22#6#Brasil#2#0#Costa Rica#Kaliningrad Stadium\r\n"
			+ "1990#OITAVAS-DE-FINAL#24#6#Argentina#1#0#Brasil#Turim\r\n"
			+ "1998#GRUPO B#23#6#Chile#1#1#Camar�es#Nantes\r\n"
			+ "2018#GRUPO A#14#6#Russia#5#0#Ar�bia Saudita#Luzhnik Stadium\r\n"
			+ "2014#GRUPO A#17#6#Brasil#0#0#M�xico#Fortaleza\r\n"
			+ "2018#GRUPO H#24#6#Jap�o#2#2#Senegal#Ekaterinburg Arena\r\n"
			+ "1974#Disp. 3�. Lugar#6#7#Pol�nia#1#0#Brasil#Berlim\r\n"
			+ "2010#GRUPO E#19#6#Holanda#1#0#Jap�o#Durban\r\n"
			+ "1974#GRUPO A#18#6#Alemanha Oriental#1#1#Chile#Berlim\r\n"
			+ "1998#GRUPO B#17#6#It�lia#3#0#Camar�es#Montpellier\r\n"
			+ "1958#FINAL#29#6#Brasil#5#2#Su�cia#Solna\r\n"
			+ "1970#GRUPO B#10#6#Su�cia#1#0#Uruguai#Puebla\r\n"
			+ "1978#GRUPO C#7#6#Brasil#0#0#Espanha#Mar del Plata\r\n"
			+ "1974#GRUPO C#19#6#Holanda#0#0#Su�cia#Dortmund\r\n"
			+ "1978#GRUPO A#2#6#Argentina#2#1#Hungria#Buenos Aires\r\n"
			+ "2006#GRUPO C#11#6#S�rvia e Montenegro#0#1#Holanda#Leipzig\r\n"
			+ "2014#OITAVAS-DE-FINAL#1#7#B�lgica#2#1#Estados Unidos#Salvador\r\n"
			+ "1974#GRUPO D#15#6#It�lia#3#1#Haiti#Berlim\r\n"
			+ "1966#QUARTAS-DE-FINAL#23#7#Inglaterra#1#0#Argentina#Londres\r\n"
			+ "2006#FINAL#9#7#It�lia#1#1#Fran�a#Berlim\r\n"
			+ "2018#GRUPO H#19#6#Colombia#1#2#Jap�o#Mordovia Arena\r\n"
			+ "1998#GRUPO H#14#6#Cro�cia#3#1#Jamaica#Lens\r\n"
			+ "2010#GRUPO C#23#6#Estados Unidos#1#0#Arg�lia#Pret�ria\r\n"
			+ "2006#QUARTAS-DE-FINAL#30#6#Alemanha#1#1#Argentina#Berlim\r\n"
			+ "1994#GRUPO E#18#6#Irlanda#1#0#It�lia#New York\r\n"
			+ "1986#SEMIFINAL#25#6#Alemanha Ocidental#2#0#Fran�a#Guadalajara\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 2#18#6#Argentina#0#0#Brasil#Rosario\r\n"
			+ "1930#SEMIFINAL#27#7#Uruguai#6#1#Iugosl�via#Montevid�u\r\n"
			+ "1962#GRUPO C#7#6#M�xico#3#1#Tchecoslov�quia#Vi�a del Mar\r\n"
			+ "1994#GRUPO A#26#6#Rom�nia#1#0#Estados Unidos#Los Angeles\r\n"
			+ "1930#GRUPO D#17#7#Estados Unidos#3#0#Paraguai#Montevid�u\r\n"
			+ "2018#GRUPO A#15#6#Egito#0#1#Uruguai#Ekaterinburg Arena\r\n"
			+ "1966#GRUPO A#20#7#Inglaterra#2#0#Fran�a#Londres\r\n"
			+ "2002#GRUPO A#6#6#Dinamarca#1#1#Senegal#Daegu\r\n"
			+ "1966#GRUPO A#16#7#Inglaterra#2#0#M�xico#Londres\r\n"
			+ "2006#GRUPO E#22#6#Rep�blica Tcheca#0#2#It�lia#Hamburgo\r\n"
			+ "1974#GRUPO C#15#6#Holanda#2#0#Uruguai#Hanover\r\n"
			+ "2006#GRUPO B#10#6#Inglaterra#1#0#Paraguai#Frankfurt\r\n"
			+ "2014#GRUPO G#16#6#Alemanha#4#0#Portugal#Salvador\r\n"
			+ "1998#GRUPO C#18#6#Dinamarca#1#1#�frica do Sul#Toulouse\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 2#18#6#Pol�nia#1#0#Peru#Mendoza\r\n"
			+ "2006#QUARTAS-DE-FINAL#1#7#Brasil#0#1#Fran�a#Frankfurt\r\n"
			+ "1990#GRUPO A#10#6#Tchecoslov�quia#5#1#Estados Unidos#Florence\r\n"
			+ "2010#GRUPO E#14#6#Jap�o#1#0#Camar�es#Bloemfontein\r\n"
			+ "1930#GRUPO C#14#7#Rom�nia#3#1#Peru#Montevid�u\r\n"
			+ "1970#GRUPO B#2#6#Uruguai#2#0#Israel#Puebla\r\n"
			+ "1994#QUARTAS-DE-FINAL#10#7#Bulg�ria#2#1#Alemanha#New York\r\n"
			+ "2010#GRUPO A#11#6#�frica do Sul#1#1#M�xico#Joanesburgo\r\n"
			+ "1982#GRUPO F#23#6#Brasil#4#0#Nova Zel�ndia#Sevilla\r\n"
			+ "1986#QUARTAS-DE-FINAL#21#6#Alemanha Ocidental#0#0#M�xico#Monterrey\r\n"
			+ "1938#FINAL#19#6#It�lia#4#2#Hungria#Paris\r\n"
			+ "2018#OITAVAS-DE-FINAL#3#7#Su�cia#1#0#Sui�a#Saint Petersburg Stadium\r\n"
			+ "1994#QUARTAS-DE-FINAL#9#7#Brasil#3#2#Holanda#Dallas\r\n"
			+ "1978#GRUPO C#11#6#Espanha#1#0#Su�cia#Buenos Aires\r\n"
			+ "1954#QUARTAS-DE-FINAL#27#6#Alemanha Ocidental#2#0#Iugosl�via#Genebra\r\n"
			+ "2006#OITAVAS-DE-FINAL#25#6#Inglaterra#1#0#Equador#Stuttgart\r\n"
			+ "2002#QUARTAS-DE-FINAL#22#6#Coreia do Sul#0#0#Espanha#Gwangju\r\n"
			+ "2006#GRUPO G#19#6#Togo#0#2#Su��a#Dortmund\r\n"
			+ "1986#OITAVAS-DE-FINAL#18#6#Espanha#5#1#Dinamarca#Queretaro\r\n"
			+ "1950#GRUPO B#2#7#Chile#5#2#Estados Unidos#Recife\r\n"
			+ "1978#GRUPO C#7#6#�ustria#1#0#Su�cia#Buenos Aires\r\n"
			+ "1994#GRUPO B#19#6#Su�cia#2#2#Camar�es#Los Angeles\r\n"
			+ "1986#GRUPO A#2#6#Argentina#3#1#Coreia do Sul#Cidade do M�xico\r\n"
			+ "1954#GRUPO A#19#6#Brasil#1#1#Iugosl�via#Lausanne\r\n"
			+ "1994#GRUPO F#29#6#Ar�bia Saudita#1#0#B�lgica#Washington DC\r\n"
			+ "1998#OITAVAS-DE-FINAL#29#6#Alemanha#2#1#M�xico#St. Denis\r\n"
			+ "1990#GRUPO B#14#6#Camar�es#2#1#Rom�nia#Bari\r\n"
			+ "2002#GRUPO B#7#6#Espanha#3#1#Paraguai#Jeonju\r\n"
			+ "2014#GRUPO B#23#6#Holanda#2#0#Chile#S�o Paulo\r\n"
			+ "1998#GRUPO H#26#6#Argentina#1#0#Cro�cia#Bordeaux\r\n"
			+ "1990#GRUPO F#12#6#Egito#1#1#Holanda#Palermo\r\n"
			+ "1986#GRUPO A#10#6#Argentina#2#0#Bulg�ria#Cidade do M�xico\r\n"
			+ "1982#GRUPO C#13#6#B�lgica#1#0#Argentina#Barcelona\r\n"
			+ "2006#GRUPO F#18#6#Jap�o#0#0#Cro�cia#Nuremberg\r\n"
			+ "1998#GRUPO F#21#6#Ir�#2#1#Estados Unidos#Lyon\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 1#1#7#Uni�o Sovi�tica#1#0#B�lgica#Barcelona\r\n"
			+ "2018#SEMIFINAL#10#7#Fran�a#1#0#B�lgica#Saint Petersburg Stadium\r\n"
			+ "2010#GRUPO F#24#6#Eslov�quia#3#2#It�lia#Joanesburgo\r\n"
			+ "1986#GRUPO A#31#5#It�lia#1#1#Bulg�ria#Cidade do M�xico\r\n"
			+ "2010#GRUPO E#19#6#Camar�es#1#2#Dinamarca#Pret�ria\r\n"
			+ "1998#GRUPO C#18#6#Fran�a#4#0#Ar�bia Saudita#St. Denis\r\n"
			+ "1990#OITAVAS-DE-FINAL#23#6#Camar�es#2#1#Col�mbia#Napoli\r\n"
			+ "2010#GRUPO H#25#6#Su��a#0#0#Honduras#Bloemfontein\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#3#7#Su�cia#2#1#Iugosl�via#Col�nia\r\n"
			+ "1982#GRUPO B#16#6#Arg�lia#2#1#Alemanha Ocidental#Gij�n\r\n"
			+ "1978#GRUPO D#7#6#Holanda#0#0#Peru#Mendoza\r\n"
			+ "1954#QUARTAS-DE-FINAL#26#6#�ustria#7#5#Su��a#Lausanne\r\n"
			+ "2018#GRUPO C#16#6#Fran�a#2#1#Australia#Kazan Arena\r\n"
			+ "2002#GRUPO A#1#6#Uruguai#1#2#Dinamarca#Ulsan\r\n"
			+ "2010#GRUPO A#22#6#M�xico#0#1#Uruguai#Rustemburgo\r\n"
			+ "1990#OITAVAS-DE-FINAL#23#6#Tchecoslov�quia#4#1#Costa Rica#Bari\r\n"
			+ "2002#GRUPO G#3#6#It�lia#2#0#Equador#Sapporo\r\n"
			+ "1994#GRUPO E#19#6#Noruega#1#0#M�xico#Washington DC\r\n"
			+ "2002#GRUPO B#8#6#�frica do Sul#1#0#Eslov�nia#Daegu\r\n"
			+ "1982#GRUPO B#25#6#Alemanha Ocidental#1#0#�ustria#Vigo\r\n"
			+ "1994#GRUPO B#24#6#Su�cia#3#1#R�ssia#Detroit\r\n"
			+ "2018#GRUPO G#23#6#Belgica#5#2#Tunisia#Spartak Stadium\r\n"
			+ "1982#Disp. 3�. Lugar#10#7#Pol�nia#3#2#Fran�a#Alicante\r\n"
			+ "1958#GRUPO A#11#6#Argentina#3#1#Irlanda do Norte#Halmstad\r\n"
			+ "1982#GRUPO A#14#6#It�lia#0#0#Pol�nia#Vigo\r\n"
			+ "2018#GRUPO E#22#6#S�rvia#1#2#Sui�a#Saint Petersburg Stadium\r\n"
			+ "1962#GRUPO A#30#5#Uruguai#2#1#Col�mbia#Arica\r\n"
			+ "1994#Disp. 3�. Lugar#16#7#Su�cia#4#0#Bulg�ria#Los Angeles\r\n"
			+ "1954#GRUPO B#17#6#Alemanha Ocidental#4#1#Turquia#Berna\r\n"
			+ "1990#GRUPO C#16#6#Brasil#1#0#Costa Rica#Turim\r\n"
			+ "1998#GRUPO C#12#6#Fran�a#3#0#�frica do Sul#Marseilles\r\n"
			+ "2006#GRUPO H#14#6#Tun�sia#2#2#Ar�bia Saudita#Munique\r\n"
			+ "2018#GRUPO B#15#6#Portugal#3#3#Espanha#Fisht Stadium\r\n"
			+ "1938#OITAVAS-DE-FINAL#5#6#Cuba#3#3#Rom�nia#Toulouse\r\n"
			+ "2018#OITAVAS-DE-FINAL#1#7#Espanha#3#4#R�ssia#Luzhnik Stadium\r\n"
			+ "1974#GRUPO B#22#6#Esc�cia#1#1#Iugosl�via#Frankfurt\r\n"
			+ "2006#GRUPO H#23#6#Ar�bia Saudita#0#1#Espanha#Kaiserslautern\r\n"
			+ "1962#GRUPO C#31#5#Tchecoslov�quia#1#0#Espanha#Vi�a del Mar\r\n"
			+ "2002#GRUPO F#12#6#Su�cia#1#1#Argentina#Miyagi\r\n"
			+ "1998#OITAVAS-DE-FINAL#30#6#Argentina#2#2#Inglaterra#St. Etienne\r\n"
			+ "1974#GRUPO A#14#6#Alemanha Ocidental#1#0#Chile#Berlim\r\n"
			+ "1938#OITAVAS-DE-FINAL#5#6#It�lia#2#1#Noruega#Marseilles\r\n"
			+ "2002#GRUPO D#4#6#Coreia do Sul#2#0#Pol�nia#Busan\r\n"
			+ "2014#GRUPO G#22#6#Estados Unidos#2#2#Portugal#Manaus\r\n"
			+ "2010#GRUPO G#25#6#Portugal#0#0#Brasil#Durban\r\n"
			+ "1938#OITAVAS-DE-FINAL#9#6#Su��a#4#2#Alemanha#Paris\r\n"
			+ "1990#FINAL#8#7#Alemanha Ocidental#1#0#Argentina#Roma\r\n"
			+ "1998#OITAVAS-DE-FINAL#28#6#Fran�a#1#0#Paraguai#Lens\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Alemanha Ocidental#3#2#Inglaterra#Le�n\r\n"
			+ "1978#GRUPO D#7#6#Ir�#1#1#Esc�cia#Cordoba\r\n"
			+ "1990#GRUPO E#17#6#Espanha#3#1#Coreia do Sul#Udine\r\n"
			+ "1998#GRUPO D#19#6#Nig�ria#1#0#Bulg�ria#Paris\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 1#3#7#Argentina#1#1#Alemanha Oriental#Gelsenkirchen\r\n"
			+ "1994#GRUPO B#24#6#Brasil#3#0#Camar�es#San Francisco\r\n"
			+ "1994#GRUPO A#26#6#Col�mbia#2#0#Su��a#San Francisco\r\n"
			+ "2018#OITAVAS-DE-FINAL#2#7#Brasil#2#0#M�xico#Samara Arena\r\n"
			+ "1958#GRUPO A#15#6#Alemanha Ocidental#2#2#Irlanda do Norte#Malmoe\r\n"
			+ "1962#GRUPO B#3#6#Alemanha Ocidental#2#1#Su��a#Santiago\r\n"
			+ "1990#GRUPO C#20#6#Brasil#1#0#Esc�cia#Turim\r\n"
			+ "1974#GRUPO D#19#6#Pol�nia#7#0#Haiti#Berlim\r\n"
			+ "2014#OITAVAS-DE-FINAL#30#6#Fran�a#2#0#Nig�ria#Bras�lia\r\n"
			+ "1982#SEMIFINAL#8#7#It�lia#2#0#Pol�nia#Barcelona\r\n"
			+ "1978#GRUPO A#2#6#It�lia#2#1#Fran�a#Mar del Plata\r\n"
			+ "1958#GRUPO B#8#6#Esc�cia#1#1#Iugosl�via#Vasteraas\r\n"
			+ "1978#GRUPO C#3#6#Brasil#1#1#Su�cia#Mar del Plata\r\n"
			+ "1986#GRUPO D#1#6#Brasil#1#0#Espanha#Guadalajara\r\n"
			+ "2006#OITAVAS-DE-FINAL#27#6#Espanha#1#3#Fran�a#Hannover\r\n"
			+ "1982#GRUPO D#20#6#Inglaterra#2#0#Tchecoslov�quia#Bilbau\r\n"
			+ "1990#OITAVAS-DE-FINAL#25#6#Irlanda#0#0#Rom�nia#Genoa\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Uruguai#1#0#Uni�o Sovi�tica#Cidade do M�xico\r\n"
			+ "2002#GRUPO F#12#6#Inglaterra#0#0#Nig�ria#Osaka\r\n"
			+ "1982#GRUPO F#22#6#Esc�cia#2#2#Uni�o Sovi�tica#M�laga\r\n"
			+ "2018#OITAVAS-DE-FINAL#2#7#B�lgica#3#2#Jap�o#Rostov Arena\r\n"
			+ "1998#GRUPO E#20#6#Holanda#5#0#Coreia do Sul#Marseille\r\n"
			+ "1970#GRUPO C#6#6#Rom�nia#2#1#Tchecoslov�quia#Guadalajara\r\n"
			+ "2002#GRUPO D#14#6#Coreia do Sul#1#0#Portugal#Incheon\r\n"
			+ "2002#GRUPO B#2#6#Paraguai#2#2#�frica do Sul#Busan\r\n"
			+ "2014#GRUPO C#24#6#Gr�cia#2#1#Costa do Marfim#Fortaleza\r\n"
			+ "1998#GRUPO F#21#6#Alemanha#2#2#Iugosl�via#Lens\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 1#26#6#Holanda#4#0#Argentina#Gelsenkirchen\r\n"
			+ "1994#GRUPO D#21#6#Argentina#4#0#Gr�cia#Boston\r\n"
			+ "1958#GRUPO A#8#6#Irlanda do Norte#1#0#Tchecoslov�quia#Halmstad\r\n"
			+ "1950#GRUPO A#1#7#Brasil#2#0#Iugosl�via#Rio de Janeiro\r\n"
			+ "1998#GRUPO G#15#6#Inglaterra#2#0#Tun�sia#Marseilles\r\n"
			+ "1950#GRUPO A#28#6#Brasil#2#2#Su��a#S�o Paulo\r\n"
			+ "1974#SEGUNDA FASE - GRUPO 2#26#6#Alemanha Ocidental#2#0#Iugosl�via#Col�nia\r\n"
			+ "2018#GRUPO D#26#6#Nig�ria#1#2#Argentina#Saint Petersburg Stadium\r\n"
			+ "1990#QUARTAS-DE-FINAL#30#6#It�lia#1#0#Irlanda#Roma\r\n"
			+ "1986#GRUPO E#4#6#Alemanha Ocidental#1#1#Uruguai#Queretaro\r\n"
			+ "2010#GRUPO B#22#6#Nig�ria#2#2#Coreia do Sul#Durban\r\n"
			+ "1994#GRUPO F#29#6#Holanda#2#1#Marrocos#Orlando\r\n"
			+ "2002#GRUPO H#10#6#B�lgica#1#1#Tun�sia#Oita\r\n"
			+ "2010#GRUPO D#13#6#Alemanha#4#0#Austr�lia#Durban\r\n"
			+ "1990#GRUPO D#9#6#Col�mbia#2#0#Emirados Arabes#Bologna\r\n"
			+ "2014#GRUPO E#20#6#Honduras#1#2#Equador#Curitiba\r\n"
			+ "1950#GRUPO D#2#7#Uruguai#8#0#Bolivia#Belo Horizonte\r\n"
			+ "1994#OITAVAS-DE-FINAL#3#7#Su�cia#3#1#Ar�bia Saudita#Dallas\r\n"
			+ "2002#GRUPO G#13#6#M�xico#1#1#It�lia#Oita\r\n"
			+ "1966#GRUPO D#20#7#Uni�o Sovi�tica#2#1#Chile#Sunderland\r\n"
			+ "2018#GRUPO D#22#6#Nig�ria#2#0#Isl�ndia#Volgograd Arena\r\n"
			+ "2014#OITAVAS-DE-FINAL#28#6#Col�mbia#2#0#Uruguai#Rio de Janeiro\r\n"
			+ "2010#GRUPO B#17#6#Gr�cia#2#1#Nig�ria#Bloemfontein\r\n"
			+ "1994#GRUPO E#23#6#It�lia#1#0#Noruega#New York\r\n"
			+ "1954#GRUPO B#17#6#Hungria#9#0#Coreia do Sul#Zurique\r\n"
			+ "1958#QUARTAS-DE-FINAL#19#6#Brasil#1#0#Pa�s de Gales#Gotemborg\r\n"
			+ "1954#QUARTAS-DE-FINAL#27#6#Hungria#4#2#Brasil#Berna\r\n"
			+ "1970#GRUPO B#6#6#Uruguai#0#0#It�lia#Puebla\r\n"
			+ "2002#GRUPO F#7#6#Su�cia#2#1#Nig�ria#Kobe\r\n"
			+ "1938#QUARTAS-DE-FINAL#14#6#Tchecoslov�quia#1#2#Brasil#Bordeaux\r\n"
			+ "2014#GRUPO D#14#6#Uruguai#1#3#Costa Rica#Fortaleza\r\n"
			+ "1986#OITAVAS-DE-FINAL#17#6#Alemanha Ocidental#1#0#Marrocos#Monterrey\r\n"
			+ "1978#SEGUNDA FASE - GRUPO 1#14#6#It�lia#0#0#Alemanha Ocidental#Buenos Aires\r\n"
			+ "2006#SEMIFINAL#4#7#Alemanha#0#2#It�lia#Dortmund\r\n"
			+ "1982#GRUPO A#19#6#Camar�es#0#0#Pol�nia#Corunha\r\n"
			+ "2002#FINAL#30#6#Brasil#2#0#Alemanha#Yokohama\r\n"
			+ "1958#GRUPO D#11#6#Brasil#0#0#Inglaterra#Gotemborg\r\n"
			+ "2014#GRUPO G#26#6#Estados Unidos#0#1#Alemanha#Recife\r\n"
			+ "2014#SEMIFINAL#9#7#Holanda#0#0#Argentina#S�o Paulo\r\n"
			+ "1986#GRUPO E#8#6#Dinamarca#6#1#Uruguai#Nezahualcoyotl\r\n"
			+ "1930#GRUPO A#19#7#Fran�a#0#1#Chile#Montevid�u\r\n"
			+ "1990#GRUPO F#21#6#Inglaterra#1#0#Egito#Cagliari\r\n"
			+ "1990#GRUPO A#19#6#It�lia#2#0#Tchecoslov�quia#Roma\r\n"
			+ "1990#OITAVAS-DE-FINAL#25#6#It�lia#2#0#Uruguai#Roma\r\n"
			+ "2014#GRUPO H#22#6#B�lgica#1#0#R�ssia#Rio de Janeiro\r\n"
			+ "1998#GRUPO E#25#6#Holanda#2#2#M�xico#St. Etienne\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 4#1#7#�ustria#2#2#Irlanda do Norte#Madri\r\n"
			+ "1962#GRUPO D#3#6#Hungria#6#1#Bulg�ria#Rancagua\r\n"
			+ "1966#GRUPO B#20#7#Alemanha Ocidental#2#1#Espanha#Birmingham\r\n"
			+ "2010#GRUPO F#14#6#It�lia#1#1#Paraguai#Cidade do Cabo\r\n"
			+ "2018#GRUPO B#15#6#Marrocos#0#1#Ir�#Saint Petersburg Stadium\r\n"
			+ "1978#GRUPO B#10#6#Pol�nia#3#1#M�xico#Rosario\r\n"
			+ "1970#GRUPO D#2#6#Peru#3#2#Bulg�ria#Le�n\r\n"
			+ "1970#GRUPO D#6#6#Peru#3#0#Marrocos#Le�n\r\n"
			+ "1954#GRUPO A#16#6#Brasil#5#0#M�xico#Genebra\r\n"
			+ "2006#QUARTAS-DE-FINAL#30#6#It�lia#3#0#Ucr�nia#Hamburgo\r\n"
			+ "2006#GRUPO A#15#6#Equador#3#0#Costa Rica#Hamburgo\r\n"
			+ "2018#GRUPO F#18#6#Su�cia#1#0#Cor�ia do Sul#Nizhny Novgorod Stadium\r\n"
			+ "1986#GRUPO E#13#6#Esc�cia#0#0#Uruguai#Nezahualcoyotl\r\n"
			+ "2018#DISPUTA 3� LUGAR#14#7#Belgica#2#0#Inglaterra#Saint Petersburg Stadium\r\n"
			+ "1990#GRUPO A#19#6#�ustria#2#1#Estados Unidos#Florence\r\n"
			+ "2010#GRUPO H#16#6#Espanha#0#1#Su��a#Durban\r\n"
			+ "1950#FASE FINAL#16#7#Uruguai#2#1#Brasil#Rio de Janeiro\r\n"
			+ "1958#GRUPO D#15#6#Brasil#2#0#Uni�o Sovi�tica#Gotemborg\r\n"
			+ "1962#SEMIFINAL#13#6#Tchecoslov�quia#3#1#Iugosl�via#Vi�a del Mar\r\n"
			+ "2006#GRUPO F#12#6#Austr�lia#3#1#Jap�o#Kaiserslautern\r\n"
			+ "2018#QUARTAS-DE-FINAL#7#7#R�ssia#3#4#Cro�cia#Fisht Stadium\r\n"
			+ "2002#QUARTAS-DE-FINAL#22#6#Turquia#1#0#Senegal#Osaka\r\n"
			+ "1982#GRUPO E#17#6#Irlanda do Norte#0#0#Iugosl�via#Zaragoza\r\n"
			+ "1966#SEMIFINAL#25#7#Alemanha Ocidental#2#1#Uni�o Sovi�tica#Liverpool\r\n"
			+ "2018#GRUPO G#24#6#Inglaterra#6#1#Panam�#Nizhny Novgorod Stadium\r\n"
			+ "1974#GRUPO B#22#6#Brasil#3#0#Zaire#Gelsenkirchen\r\n"
			+ "1986#GRUPO B#11#6#B�lgica#2#2#Paraguai#Toluca\r\n"
			+ "2006#GRUPO E#17#6#It�lia#1#1#Estados Unidos#Kaiserslautern\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#Hungria#2#0#Su��a#Lille\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#It�lia#4#1#M�xico#Toluca\r\n"
			+ "1998#GRUPO G#26#6#Rom�nia#1#1#Tun�sia#St. Denis\r\n"
			+ "1970#GRUPO A#3#6#B�lgica#3#0#El Salvador#Cidade do M�xico\r\n"
			+ "2018#GRUPO D#21#6#Argentina#0#3#Cro�cia#Nizhny Novgorod Stadium\r\n"
			+ "2010#OITAVAS-DE-FINAL#28#6#Holanda#2#1#Eslov�quia#Durban\r\n"
			+ "1986#GRUPO E#4#6#Dinamarca#1#0#Esc�cia#Nezahualcoyotl\r\n"
			+ "2014#GRUPO A#18#6#Camar�es#0#4#Cro�cia#Manaus\r\n"
			+ "1958#GRUPO C#8#6#Hungria#1#1#Pa�s de Gales#Sandviken\r\n"
			+ "2006#OITAVAS-DE-FINAL#24#6#Alemanha#2#0#Su�cia#Munique\r\n"
			+ "2014#GRUPO B#13#6#Chile#3#1#Austr�lia#Cuiab�\r\n"
			+ "1998#GRUPO C#12#6#Dinamarca#1#0#Ar�bia Saudita#Lens\r\n"
			+ "1930#GRUPO C#21#7#Uruguai#4#0#Rom�nia#Montevid�u\r\n"
			+ "1954#GRUPO D#17#6#Su��a#2#1#It�lia#Lausanne\r\n"
			+ "1962#GRUPO A#7#6#Iugosl�via#5#0#Col�mbia#Arica\r\n"
			+ "2006#GRUPO D#17#6#Portugal#2#0#Ir�#Frankfurt\r\n"
			+ "2002#SEMIFINAL#26#6#Brasil#1#0#Turquia#Saitama\r\n"
			+ "1954#GRUPO B#20#6#Hungria#8#3#Alemanha Ocidental#Basel\r\n"
			+ "1950#GRUPO A#24#6#Brasil#4#0#M�xico#Rio de Janeiro\r\n"
			+ "1982#GRUPO F#15#6#Esc�cia#5#2#Nova Zel�ndia#M�laga\r\n"
			+ "2006#GRUPO E#17#6#Rep�blica Tcheca#0#2#Gana#Col�nia\r\n"
			+ "1998#OITAVAS-DE-FINAL#27#6#It�lia#1#0#Noruega#Marseille\r\n"
			+ "2006#GRUPO E#22#6#Gana#2#1#Estados Unidos#Nuremberg\r\n"
			+ "2010#GRUPO C#18#6#Eslov�nia#2#2#Estados Unidos#Joanesburgo\r\n"
			+ "1938#QUARTAS-DE-FINAL#12#6#Brasil#1#1#Tchecoslov�quia#Bordeaux\r\n"
			+ "2014#GRUPO C#19#6#Col�mbia#2#1#Costa do Marfim#Bras�lia\r\n"
			+ "1990#GRUPO C#11#6#Costa Rica#1#0#Esc�cia#Genoa\r\n"
			+ "1978#GRUPO B#10#6#Tun�sia#0#0#Alemanha Ocidental#Cordoba\r\n"
			+ "2018#QUARTAS-DE-FINAL#6#7#Uruguai#0#2#Fran�a#Nizhny Novgorod Stadium\r\n"
			+ "2006#GRUPO D#11#6#M�xico#3#1#Ir�#Nuremberg\r\n"
			+ "2018#OITAVAS-DE-FINAL#30#6#Fran�a#4#3#Argentina#Kazan Arena\r\n"
			+ "2006#GRUPO F#22#6#Jap�o#1#4#Brasil#Dortmund\r\n"
			+ "2014#GRUPO H#17#6#B�lgica#2#1#Arg�lia#Belo Horizonte\r\n"
			+ "2018#GRUPO B#25#6#Espanha#2#2#Marrocos#Kaliningrad Stadium\r\n"
			+ "1970#QUARTAS-DE-FINAL#14#6#Brasil#4#2#Peru#Guadalajara\r\n"
			+ "2014#QUARTAS-DE-FINAL#5#7#Argentina#1#0#B�lgica#Bras�lia\r\n"
			+ "2002#GRUPO E#11#6#Alemanha#2#0#Camar�es#Shizuoka\r\n"
			+ "2002#GRUPO H#14#6#B�lgica#3#2#R�ssia#Shizuoka\r\n"
			+ "1958#Disp. 3�. Lugar#26#6#Fran�a#6#3#Alemanha Ocidental#Gotemborg\r\n"
			+ "1966#GRUPO A#19#7#Uruguai#0#0#M�xico#Londres\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 1#4#7#Pol�nia#0#0#Uni�o Sovi�tica#Barcelona\r\n"
			+ "1962#GRUPO B#31#5#It�lia#0#0#Alemanha Ocidental#Santiago\r\n"
			+ "2006#OITAVAS-DE-FINAL#26#6#It�lia#1#0#Austr�lia#Kaiserslautern\r\n"
			+ "1998#GRUPO F#25#6#Iugosl�via#1#0#Estados Unidos#Nantes\r\n"
			+ "1998#GRUPO F#25#6#Alemanha#2#0#Ir�#Montpellier\r\n"
			+ "1962#GRUPO D#30#5#Argentina#1#0#Bulg�ria#Rancagua\r\n"
			+ "1966#GRUPO C#19#7#Portugal#3#1#Brasil#Liverpool\r\n"
			+ "1962#GRUPO B#30#5#Chile#3#1#Su��a#Santiago\r\n"
			+ "1974#GRUPO D#23#6#Pol�nia#2#1#It�lia#Stuttgart\r\n"
			+ "2018#GRUPO E#17#6#Costa Rica#0#1#S�rvia#Rostov Arena\r\n"
			+ "2006#GRUPO B#15#6#Inglaterra#2#0#Trinidad e Tobago#Nuremberg\r\n"
			+ "1982#SEGUNDA FASE - GRUPO 4#4#7#Fran�a#4#1#Irlanda do Norte#Madri\r\n"
			+ "1998#GRUPO F#15#6#Alemanha#2#0#Estados Unidos#Paris\r\n"
			+ "1986#GRUPO B#7#6#M�xico#1#1#Paraguai#Cidade do M�xico\r\n"
			+ "2014#GRUPO D#14#6#Inglaterra#1#2#It�lia#Manaus\r\n"
			+ "1958#GRUPO B#8#6#Fran�a#7#3#Paraguai#Norrkoping\r\n"
			+ "1998#SEMIFINAL#8#7#Fran�a#2#1#Cro�cia#St. Denis\r\n"
			+ "2010#QUARTAS-DE-FINAL#2#7#Uruguai#1#1#Gana#Joanesburgo\r\n"
			+ "1990#GRUPO B#18#6#Uni�o Sovi�tica#4#0#Camar�es#Roma\r\n"
			+ "1954#SEMIFINAL#30#6#Alemanha Ocidental#6#1#�ustria#Basel\r\n"
			+ "FIM\r\n"
			+ "50\r\n"
			+ "18/6/1974;Brasil\r\n"
			+ "14/6/2006;Tun�sia\r\n"
			+ "26/6/1954;�ustria\r\n"
			+ "7/6/1962;M�xico\r\n"
			+ "9/6/1938;Su��a\r\n"
			+ "24/6/2010;Eslov�quia\r\n"
			+ "25/6/2018;Uruguai\r\n"
			+ "18/6/2018;B�lgica\r\n"
			+ "31/5/1962;Tchecoslov�quia\r\n"
			+ "9/7/2014;Holanda\r\n"
			+ "17/6/2010;Gr�cia\r\n"
			+ "10/7/1994;Bulg�ria\r\n"
			+ "19/6/1938;It�lia\r\n"
			+ "11/6/1978;Espanha\r\n"
			+ "16/6/2014;Alemanha\r\n"
			+ "5/6/1986;Bulg�ria\r\n"
			+ "22/6/2018;S�rvia\r\n"
			+ "15/6/1998;Alemanha\r\n"
			+ "26/6/2018;Nig�ria\r\n"
			+ "17/6/1982;Tchecoslov�quia\r\n"
			+ "18/6/1986;Espanha\r\n"
			+ "17/6/2014;B�lgica\r\n"
			+ "8/7/1982;Alemanha Ocidental\r\n"
			+ "8/6/2002;�frica do Sul\r\n"
			+ "21/6/2018;Argentina\r\n"
			+ "21/6/2002;Brasil\r\n"
			+ "25/6/1986;Alemanha Ocidental\r\n"
			+ "17/6/1954;Hungria\r\n"
			+ "7/7/1998;Brasil\r\n"
			+ "30/5/1962;Argentina\r\n"
			+ "30/6/2018;Fran�a\r\n"
			+ "6/6/2002;Dinamarca\r\n"
			+ "22/6/1974;Brasil\r\n"
			+ "16/7/1994;Su�cia\r\n"
			+ "8/6/2002;Cro�cia\r\n"
			+ "19/6/1958;Fran�a\r\n"
			+ "25/6/1998;Holanda\r\n"
			+ "12/6/2002;Espanha\r\n"
			+ "8/6/1958;Hungria\r\n"
			+ "16/6/1990;Inglaterra\r\n"
			+ "24/6/2006;Alemanha\r\n"
			+ "10/6/1978;Tun�sia\r\n"
			+ "26/6/1974;Alemanha Ocidental\r\n"
			+ "14/6/2018;Russia\r\n"
			+ "2/6/1978;It�lia\r\n"
			+ "4/7/1982;Fran�a\r\n"
			+ "26/6/1998;Argentina\r\n"
			+ "31/5/1934;It�lia\r\n"
			+ "14/6/2002;B�lgica\r\n"
			+ "1/7/2014;B�lgica\r\n";
	
	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		Jogo jg1 = new Jogo();
	}
	
	public Jogo() {
		String dadosParaPesquisa = ler();
		System.out.println(dadosParaPesquisa);
		
		// FAZER A LOGICA DE PROGRAMACAO PARA IMPRIMIR OS DADOS
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

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getEntradaPadrao() {
		return entradaPadrao;
	}
	
	public void clone1() {
		// SER� IMPLEMENTADO FUTURAMENTE
	}
	
	public String ler() {
		MyIO.setCharset("UTF-8");
		
		String[] vetor = entradaPadrao.split("FIM");
		
		String saidaPesquisa = vetor[0];		
		
		Jogo[] vetorJogos = new Jogo[400];
		
		String[] dadosJogo = saidaPesquisa.split("\r\n");
		
		for(int i = 0; i < dadosJogo.length; i++) {
			String[] campos = dadosJogo[i].split("#");
			
			this.setAno(Integer.parseInt(campos[0]));
			this.setEtapa(campos[1]);
			this.setDia(Integer.parseInt(campos[2]));
			this.setMes(Integer.parseInt(campos[3]));
			this.setSelecao1(campos[4]);
			this.setPlacarSelecao1(Integer.parseInt(campos[5]));
			this.setPlacarSelecao2(Integer.parseInt(campos[6]));
			this.setSelecao2(campos[7]);
			this.setLocal(campos[8]);
			
			vetorJogos[i] = this;
		}
		
		return vetor[1];
	}
	
	public void imprimir() {
		
		System.out.println("[COPA "+ this.getAno() +"] [" + this.getEtapa() + "] "
				+ "[" + this.getDia() + "/" + this.getMes() + "] [" + this.getSelecao1() + " (" + this.getPlacarSelecao1() + ") "
				+ "x" + " (" + this.getPlacarSelecao2() + ") " + this.getSelecao2() + "] [" + this.getLocal() + "]");
		
	}
}