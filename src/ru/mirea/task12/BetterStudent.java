package ru.mirea.task12;

public class BetterStudent extends Student{
    protected String award;

    public String getAward() {
        return award;
    }

    public BetterStudent(String name, int GPA, int id, String award) {
        super(name, GPA, id);
        this.award = award;
    }

    @Override
    public String toString() {
        return "BetterStudent{" +
                "award='" + award + '\'' +
                ", iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public BetterStudent(String award) {
        this.award = award;
    }
    public BetterStudent() {
        this.award = "No awards";
    }

    public void setAward(String award) {
        this.award = award;
    }
}
