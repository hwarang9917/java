package ch15.exercise.p08;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum; // 학번을 해시코드로 사용
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) return false;
        Student student = (Student) obj;

        if(studentNum != student.studentNum) return false;
        return true;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//        return studentNum == student.studentNum;
//    }
}