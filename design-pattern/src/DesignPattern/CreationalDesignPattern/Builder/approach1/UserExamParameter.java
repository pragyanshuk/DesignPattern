package DesignPattern.CreationalDesignPattern.Builder.approach1;

public class UserExamParameter {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public String getName() {
        return name;
    }
}
