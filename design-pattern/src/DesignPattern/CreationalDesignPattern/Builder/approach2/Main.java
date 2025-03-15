package DesignPattern.CreationalDesignPattern.Builder.approach2;

public class Main {

    public static void main(String args[]){
        UserExam userExam = new UserExam.UserExamBuilder()
                                        .setEnglishMarks(45)
                                        .setMathsMarks(67)
                                        .setScienceMarks(75)
                                        .setName("Pra")
                                        .build();
        System.out.println(userExam);
    }
}
