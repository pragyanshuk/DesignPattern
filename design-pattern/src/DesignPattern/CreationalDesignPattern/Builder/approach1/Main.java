package DesignPattern.CreationalDesignPattern.Builder.approach1;

public class Main {

    public static void main(String args[]) throws Exception {
        UserExamParameter userExamParameter = new UserExamParameter();
        userExamParameter.setEnglishMarks(75);
        userExamParameter.setMathsMarks(95);
        userExamParameter.setScienceMarks(88);
        userExamParameter.setName("Pragyanshu");

        UserExam userExam = new UserExam(userExamParameter);
        System.out.println(userExam);
    }
}
