import java.util.LinkedList;

public class Lesson13Task1 {
    public static void removalOfStudents(LinkedList<Student> students) {
        students.removeIf(student -> student.getAvgGrade() < 3);

        for (Student s: students) {
            System.out.println("Студент " + s.getName() + " переведён на следующий курс.");
        }
    }

    public static void printStudents(LinkedList<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " обучается на " + course + " курсе.");
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Паша", "П-120", 3, 4, 5, 3);
        Student st2 = new Student("Вика", "П-121", 2, 3, 3, 3);
        Student st3 = new Student("Кристина", "П-121", 2, 3, 2, 3);
        Student st4 = new Student("Алёна", "П-120", 3, 2, 3, 3);
        Student st5 = new Student("Володя", "П-122", 3, 4, 3, 3);
        Student st6 = new Student("Костя", "П-119", 4, 2, 2, 4);

        LinkedList<Student> students = new LinkedList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        removalOfStudents(students);
        printStudents(students, 3);
    }
}

class Student {
    private String name;
    private String group;
    private int course;
    private int mathScore;
    private int englishScore;
    private int physicScore;

    public Student(String name, String group, int course, int mathScore, int englishScore, int physicScore) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.physicScore = physicScore;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getPhysicScore() {
        return physicScore;
    }

    public int getAvgGrade() {
        return (mathScore + englishScore + physicScore) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", physicScore=" + physicScore +
                '}';
    }
}



