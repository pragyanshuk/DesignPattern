package DesignPattern.CreationalDesignPattern.Builder.approach2;

public class UserExam{
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private UserExam(){

    }

    public static class UserExamBuilder {
        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build(){
            //validation
            if(englishMarks < 35 || mathsMarks < 35 || scienceMarks < 35){
                throw new RuntimeException("Failed");
            }
            //creation
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;
            return userExam;
        }
    }
 }
