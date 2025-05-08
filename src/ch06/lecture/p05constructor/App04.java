package ch06.lecture.p05constructor;

public class App04 {
}

// class MyClass42 작성
// 5개의 필드 만들고
// 필드 초기화 하는 생성자 작성해보기
class MyClass42 {
    double height;
    String name;
    int level;
    boolean isMale;
    String religion;

    public MyClass42(double height, String name, int level, boolean isMale, String religion) {
        this.height = height;
        this.name = name;
        this.level = level;
        this.isMale = isMale;
        this.religion = religion;
    }
}


class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;

    public MyClass41(boolean married, int age, String address, String name) {
        this.married = married;
        this.age = age;
        this.address = address;
        this.name = name;
    }
}
