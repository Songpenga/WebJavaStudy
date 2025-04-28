package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            printDiscount(grade);
        }
    }

    private static void printDiscount(AuthGrade grade) {
        System.out.println("grade : " + grade.name() + " level : " + grade.getLevel() + " 설명 : " + grade.getGradeLogin());
    }

}
