public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int oralNote1, int oralNote2, int oralNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

        if (oralNote1 >= 0 && oralNote1 <= 100) {
            this.c1.Sozlu = oralNote1;
        }

        if (oralNote2 >= 0 && oralNote2 <= 100) {
            this.c2.Sozlu = oralNote2;
        }

        if (oralNote3 >= 0 && oralNote3 <= 100) {
            this.c3.Sozlu = oralNote3;
        }
    }

    void isPass() {
        System.out.println("===========================");

        this.average = ((this.c1.note * 0.8 + this.c1.Sozlu * 0.2) +
                        (this.c2.note * 0.8 + this.c2.Sozlu * 0.2) +
                        (this.c3.note * 0.8 + this.c3.Sozlu * 0.2)) / 3.0;


        if (this.average > 55) {
            System.out.println("Sınıfı Başarılı Şekilde Geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfı Geçemediniz.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {

        System.out.println(c1.name + " Sınav Notu:\t" + c1.note + "\tSözlü Notu:\t" + c1.Sozlu);
        System.out.println(c2.name + " Sınav Notu:\t" + c2.note + "\tSözlü Notu:\t" + c2.Sozlu);
        System.out.println(c3.name + " Sınav Notu:\t" + c3.note + "\tSözlü Notu:\t" + c3.Sozlu);

        System.out.println("Ortalamanız : " + this.average);


    }


}
