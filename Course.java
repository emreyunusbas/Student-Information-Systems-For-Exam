public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double Sozlu;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        Sozlu = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();

        } else {

            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor!");
        }


    }

    void printTeacher() {

        this.teacher.print();
    }
}
