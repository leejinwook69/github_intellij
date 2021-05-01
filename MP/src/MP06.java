import java.util.Scanner;

class Student {
    String name;
    int stdnum;
    double gpa;
    Student(String name, int stdnum, double gpa) {
        this.name = name;
        this.stdnum = stdnum;
        this.gpa = gpa;
    }

    String getName() {
        return name;
    }

    int getStdnum() {
        return stdnum;
    }

    double getGPA() {
        return gpa;
    }

    public String toString() {
        String s = new String("Name : "+name+", Number : "+stdnum+", GPA : "+gpa);
        return s;
    }
}

class StudentDB {
    enum FindGPAParam {LOWER_THAN, HIGHER_THAN}

    int count = 0;
    Student[] student = new Student[3];

    void add(Student a) {
        if (count != 2) {
            student[count] = a;
            count++;
        } else {
            System.out.println("ERROR : MORE THAN 3 STUDENTS !");
        }
    }

    void add(String name, int stdnum, double gpa) {
        if (count < 3) {
            Student a = new Student(name, stdnum, gpa);
            student[count] = a;
            count++;
        } else {
            System.out.println("ERROR : MORE THAN 3 STUDENTS !");
        }
    }

    Student findBy(String name) {
        for (int i = 0; i < 3; i++) {
            if (student[i].name == name) {
                return student[i];
            }
        }
        return student[-1];
    }

    Student findBy(int stdnum) {
        for (int i = 0; i < 3; i++) {
            if (student[i].stdnum == stdnum) {
                return student[i];
            }
        }
        return student[-1];
    }

    Student findBy(double gpa) {
        for (int i = 0; i < 3; i++) {
            if (student[i].gpa == gpa) {
                return student[i];
            }
        }
        return student[-1];
    }

    Student findBy(FindGPAParam param, double gpa) {
        if (param == FindGPAParam.LOWER_THAN) {
            for (int i = 0; i < 3; i++) {
                if (student[i].gpa < gpa) {
                    return student[i];
                }
            }
            return student[-1];
        } else if (param == FindGPAParam.HIGHER_THAN) {
            for (int i = 0; i < 3; i++) {
                if (student[i].gpa > gpa) {
                    return student[i];
                }
            }
            return student[-1];
        } else return student[-1];
    }
}




public class MP06 {
    public static void main(String[] args) {
        StudentDB alpha = new StudentDB();
        Student a = new Student("김지우", 201911111, 4.01);
        alpha.add(a);
        alpha.add("이민준", 201922222, 3.85);
        alpha.add("박서윤", 201933333, 3.90);
        System.out.println(alpha.findBy("김지우"));
        System.out.println(alpha.findBy(201922222));
        System.out.println(alpha.findBy(3.90));
        System.out.println(alpha.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95));
        System.out.println(alpha.findBy(StudentDB.FindGPAParam.HIGHER_THAN.HIGHER_THAN, 3.95));
    }
}



