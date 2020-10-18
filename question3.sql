CREATE TABLE `student` (
	`studentid` INT(11) NOT NULL,
	`name` varchar(250) NOT NULL,
	`course` INT(11) NOT NULL,
	PRIMARY KEY (`studentid`)
);

CREATE TABLE `course` (
	`courseid` INT(11) NOT NULL,
	`name` varchar(250) NOT NULL,
	`institution` INT(11) NOT NULL,
	PRIMARY KEY (`courseid`)
);

CREATE TABLE `institution` (
	`institutionid` INT(11) NOT NULL,
	`name` varchar(250) NOT NULL,
	PRIMARY KEY (`institutionid`)
);

ALTER TABLE `student` ADD CONSTRAINT `student_fk0` FOREIGN KEY (`course`) REFERENCES `course`(`courseid`);

ALTER TABLE `course` ADD CONSTRAINT `course_fk0` FOREIGN KEY (`institution`) REFERENCES `institution`(`institutionid`);
