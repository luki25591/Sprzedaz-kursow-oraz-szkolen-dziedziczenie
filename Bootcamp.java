public class Bootcamp extends Course {
    private String lecturersName;//imię prowadzącego
    private String surnameLecturer;//nazwisko prowadzącego
    private int numberOfConsultationHours;//liczba godzin konsultacji

    public Bootcamp(String ID, double price, String nameCourse, String description, String lecturersName,
                    String surnameLecturer, int numberOfConsultationHours) {
        super(ID, price, nameCourse, description);
        this.lecturersName = lecturersName;
        this.surnameLecturer = surnameLecturer;
        this.numberOfConsultationHours = numberOfConsultationHours;
    }

    public String getLecturersName() {
        return lecturersName;
    }

    public void setLecturersName(String lecturersName) {
        this.lecturersName = lecturersName;
    }

    public String getSurnameLecturer() {
        return surnameLecturer;
    }

    public void setSurnameLecturer(String surnameLecturer) {
        this.surnameLecturer = surnameLecturer;
    }

    public int getNumberOfConsultationHours() {
        return numberOfConsultationHours;
    }

    public void setNumberOfConsultationHours(int numberOfConsultationHours) {
        this.numberOfConsultationHours = numberOfConsultationHours;
    }

    @Override
    public void info() {
        String info = "ID kursu: " + getID() + ", cena: " + getID() + ", nazwa kursu: " + getNameCourse() + ", opis: "
                + getDescription() + ", imię prowadzącego: " + lecturersName + ", nazwisko prowadzącego: " + surnameLecturer
                + ", liczba godzin konsultacji: " + numberOfConsultationHours;
        System.out.println(info);
    }
}
