# Rsvti-Mihnea
RSVTI project

O baza de date cu informatii privind echipamentele ISCIR din cadrul firmelor.

1. Users
	1. prenume, nume
	2. adresa e-mail 
	3. parola	

2. Login users
	- adresa de e-mail + parola
	- verificare adresa de e-mail si parola

3. 4 tabele cu informatii
	- lista_firme
	- puncte_lucru
	- echipamente_ir
	- autorizari_ir

4. 4 clase pentru a crea cele 4 tabele
	- Firme
	- PuncteLucru
	- Echipamente
	- Autorizari

5. Metode pentru a crea randuri in tabelele celor 4 clase
	- createNewRow;
	- deleteRows;
	- updateRows;
	- readAllRows;


7. Selectii tabele
	- toate echipamentele unei firme;
	- toate echipamentele pentru un anumit punct de lucru;
	- toate punctele de lucru ale unei firme;
	- scadente echipamente la o anumita data;
	- toate autorizatiile unui echipament;
	- etc.

8. 4 clase de verificare a metodelor de la punctul 5 cu JUnit


