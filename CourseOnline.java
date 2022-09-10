public class CourseOnline extends Course{
    private int availableMinutes;//liczba dostępnych minut
    private int estimatedStudyTime;//szacowany czas nauki

    public CourseOnline(String ID, double price, String nameCourse, String description, int availableMinutes, int estimatedStudyTime) {
        super(ID, price, nameCourse, description);
        this.availableMinutes = availableMinutes;
        this.estimatedStudyTime = estimatedStudyTime;
    }

    public int getAvailableMinutes() {
        return availableMinutes;
    }

    public void setAvailableMinutes(int availableMinutes) {
        this.availableMinutes = availableMinutes;
    }

    public int getEstimatedStudyTime() {
        return estimatedStudyTime;
    }

    public void setEstimatedStudyTime(int estimatedStudyTime) {
        this.estimatedStudyTime = estimatedStudyTime;
    }

    @Override
    public void info(){
        String info = "ID kursu: " + getID() + ", cena: " + getID() + ", nazwa kursu: " + getNameCourse() + ", opis: "
                + getDescription() + "Liczba dostępnych minut: " + availableMinutes + ", szacowany czas nauki: "
                + estimatedStudyTime;
        System.out.println(info);
    }
}

