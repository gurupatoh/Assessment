SELECT institution.name,course.name student.studentid  
FROM institution,student,course join course 
ON institution.institutionid = course.institution 
join student 
ON course.courseid = student.course

