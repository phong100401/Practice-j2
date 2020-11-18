CREATE database if not exists Class;
Drop database Class;
Use Class;

CREATE table Student(
    StudenID varchar(10) primary key not null ,
    StudentName varchar(20) not null ,
    Address varchar(50) not null ,
    Phone varchar(10) check (Phone not like '%[^0-9]%')
);

Drop table Student;

INSERT INTO Student values
('B01010','Nguyen Tuan Anh','Ha Noi',0904818238),
('B10394','Nguyen Hoang Hai','Hai Duong',0494949494);

SELECT  * FROM Student
