package DesignPattern.CreationalDesignPattern.Builder.approach1;
/*
User Exam is a class for which we have to create a builder.
Its object needs to be validated before creation.
The objects are immutable
 */
public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameter userExamParameter) throws Exception {
        //validation
        if(userExamParameter.getEnglishMarks() < 35 || userExamParameter.getMathsMarks() < 35 || userExamParameter.getScienceMarks() < 35){
            throw new Exception("Failed");
        }
        // creation of object
        this.englishMarks = userExamParameter.getEnglishMarks();
        this.mathsMarks = userExamParameter.getMathsMarks();
        this.scienceMarks = userExamParameter.getScienceMarks();
        this.name = userExamParameter.getName();
    }
}
