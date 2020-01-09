--Exercice1
DECLARE
 a_ NUMBER :=1;
 b_ NUMBER :=2;
 c_ NUMBER;
BEGIN
 c_ = b_;
 b_ = a_;
 a_ = c_;
DBMS_OUTPUT.PUT_LINE('a= '||a_||'b= '||b_);
END;
/
--Exercice2
DECLARE 
 a_ NUMBER :=10;
 fact NUMBER :=1;
BEGIN
 LOOP
    fact := fact*a_;
    a_ :=a_-1;
    EXIT WHEN a_<=0;
 END LOOP;
DBMS_OUTPUT.PUT_LINE(fact);
END;
/
--Exercice3
DECLARE 
 v_id NUMBER :=270;
BEGIN
 INSERT INTO DEPARTMENTS
 VALUES(v_id+10,'Admin',NULL,NULL);
 COMMIT;
END;
/
select * from departments;
--Exercice4         
DECLARE 
 v_id_service NUMBER;
BEGIN
 SELECT MAX(department_id)
 INTO v_id_service
 FROM DEPARTMENTS;
 DBMS_OUTPUT.PUT_LINE(v_id_service);
END;
/
--Exercice5
SELECT * FROM DEPARTMENTS
WHERE department_id=280 ;
--Exercice6    
DECLARE 
 v_id NUMBER :=280;
BEGIN
 UPDATE DEPARTMENTS
 SET location_id=2500
 WHERE department_id=v_id;
END;
/
SELECT * FROM departments WHERE location_id=2500;
--Exercice7  
ACCEPT ename PROMPT 'Entrer le nom: '
DECLARE 
 e_first_name VARCHAR2(20); 
BEGIN 
 SELECT first_name 
 INTO e_first_name
 FROM EMPLOYEES
 WHERE last_name = '&ename';
DBMS_OUTPUT.PUT_LINE('Le nom de manager est '|| e_first_name);
END;
/
select * from employees;
--Exercice8:
DECLARE 
v_last_name employees.last_name%TYPE;
v_first_name employees.first_name%TYPE;
CURSOR emp_cursor IS 
  SELECT last_name, first_name 
  FROM EMPLOYEES
  ORDER BY hire_date DESC;
BEGIN
 FOR ia IN emp_cursor LOOP
EXIT WHEN emp_cursor%ROWCOUNT>10;
DBMS_OUTPUT.PUT_LINE(ia.last_name);
END LOOP;
END;
/
--Exercice9:
DECLARE 
v_last_name employees.last_name%TYPE;
v_first_name employees.first_name%TYPE;
CURSOR emp_cursor IS 
  SELECT last_name, first_name 
  FROM EMPLOYEES
  WHERE department_id=30;
  som NUMBER :=0;
BEGIN
 FOR ia IN emp_cursor LOOP
EXIT WHEN emp_cursor%NOTFOUND;
som := som+1;
END LOOP;
DBMS_OUTPUT.PUT_LINE(som);
END;
/
--Exercice10:
DECLARE 
v_salary employees.salary%TYPE;
v_name employees.last_name%TYPE ;
BEGIN
 v_salary :=6000;
 v_name :='Fay';
 IF v_salary<3000 THEN
 v_salary:= v_salary+500;
 UPDATE EMPLOYEES
 SET salary=v_salary;
 DBMS_OUTPUT.PUT_LINE(v_name||'s salary updated');
 ELSIF v_salary>3000 THEN
 DBMS_OUTPUT.PUT_LINE(v_name||' earns '|| v_salary);
 END IF;
END;
/
--Exercice11:
1.a/
SELECT NomS, Horaire
FROM Salle 
WHERE Titre='Les misérables';
b/
SELECT acteur
FROM Film 
WHERE Titre IN (SELECT Titre FROM Film);
C/
SELECT a.Amateur
FROM Aime a, Vu v
WHERE a.Titre=v.Titre;



