public class FullTimeCourse extends Course  {
    private String town;//miejscowość
    private int numberOfClasses;//liczba zajęć

    public FullTimeCourse(String ID, double price, String nameCourse, String description, String town, int numberOfClasses) {
        super(ID, price, nameCourse, description);
        this.town = town;
        this.numberOfClasses = numberOfClasses;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    @Override
    public void info() {
        String info = "ID kursu: " + getID() + ", cena: " + getID() + ", nazwa kursu: " + getNameCourse() + ", opis: "
                + getDescription() + ", miejscowość: " + town + ", liczba zajęć: " + numberOfClasses;
        System.out.println(info);
    }
}
