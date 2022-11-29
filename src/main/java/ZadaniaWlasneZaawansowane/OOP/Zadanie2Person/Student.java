package ZadaniaWlasneZaawansowane.OOP.Zadanie2Person;

public class Student extends Person{
    private String study;
    private String yearStudy;
    private String studyPrize;

    public Student(String study, String yearStudy, String studyPrize) {
        this.study = study;
        this.yearStudy = yearStudy;
        this.studyPrize = studyPrize;
    }

    public Student(String name, String address, String study, String yearStudy, String studyPrize) {
        super(name, address);
        this.study = study;
        this.yearStudy = yearStudy;
        this.studyPrize = studyPrize;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(String yearStudy) {
        this.yearStudy = yearStudy;
    }

    public String getStudyPrize() {
        return studyPrize;
    }

    public void setStudyPrize(String studyPrize) {
        this.studyPrize = studyPrize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ";  study= " + study  +
                ", yearStudy= " + yearStudy +
                ", studyPrize= " + studyPrize ;
    }
}
