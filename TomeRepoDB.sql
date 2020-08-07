
DROP TABLE Users;

CREATE TABLE Users (
    u_id NUMBER(10) PRIMARY KEY,
    username VARCHAR2(50) UNIQUE NOT NULL,
    password VARCHAR2(50)
    );
    
DROP TABLE Author;

CREATE TABLE Author (
    a_id NUMBER(10) PRIMARY KEY,
    firstName VARCHAR2(50) NOT NULL,
    lastName VARCHAR2(50),
    birthYear VARCHAR2(10),
    deathYear VARCHAR2(10)
    );


DROP TABLE Work;

CREATE TABLE Work (
    w_id NUMBER(10),
    title VARCHAR2(100),
    firstName VARCHAR2(50),
    lastName VARCHAR2 (50),
    pubYear VARCHAR2(10),
    genre VARCHAR2(20),
    fileType VARCHAR2(10),
    rating NUMBER(1));
    
    INSERT INTO author VALUES (1, 'Euripides', 'Euripides', '485 BCE', '406 BCE');
    INSERT INTO author VALUES (2, 'Frances E.W.', 'Harper', '1825', '1911');
    INSERT INTO author VALUES (3, 'Napoleon', 'Hill', '1883', '1970');
    INSERT INTO work VALUES (1, 'Medea', 'Euripides', 'Euripides', '431 BCE', 'Tragedy', 'EPUB', 1);
    INSERT INTO work VALUES (2, 'Iola Leroy, or Shadows Uplifted', 'Frances E.W.', 'Harper', '1892', 'Social Novel', 'EPUB', 1);
    INSERT INTO work VALUES (3, 'Think and Grow Rich', 'Napoleon', 'Hill', '1937', 'Self-Help', 'EPUB', 1);
    
    SELECT * FROM author;
    SELECT * FROM work;
    
    
    
    
    
    
   
   

    
    