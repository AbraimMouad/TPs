Q1.
SELECT NameAP
FROM AIRPLANE
WHERE capacity>350 ;
Q2.
SELECT numAP, nameAP
FROM AIRPLANE
WHERE localisation=’Nice’ ;
Q3.
SELECT nump,dep_T
FROM FLIGHT ;
Q4.
SELECT *
FROM PILOT ;
Q5.
SELECT namP
FROM PILOT
WHERE address=’Paris’ AND salary>15000;
Q6.
SELECT numAP,namAP
FROM AIRPLANE
WHERE localisation=’Nice’ AND capacity>350;
Q7.
SELECT numF
FROM FLIGHT
WHERE dep_t=’Paris’ AND dep_h>’18:00:00’;
Q8.
SELECT NumP
FROM PILOT
WHERE NumP NOT IN (SELECT NumP  FROM FLIGHT);
Q9.
SELECT NumF,Dep_T
FROM FLIGHT
WHERE NumP IN(100,204);

****************************************************************

Q1.
SELECT personne
FROM Emprunt
WHERE Livre=’Recueil Examens BD’;
Q2.
SELECT personne
FROM Emprunt
WHERE personne NOT IN (SELECT Personne FROM Retard);
Q3.
SELECT personne
FROM Emprunt
WHERE Livre = ANY (SELECT Livre FROM Emprunt );
Q4.
SELECT personne
FROM Emprunt
WHERE Livre = ALL (SELECT Livre FROM Emprunt );
Q5.
SELECT personne
FROM Retard;

