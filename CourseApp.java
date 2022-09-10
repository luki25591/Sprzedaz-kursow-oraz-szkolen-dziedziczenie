public class CourseApp {
    public class CourseApp {
        public static void main(String[] args) {

            Bootcamp bootcamp = new Bootcamp("Java-Bootcamp-123", 1200, "Java 17", "kurs programowania",
                    "Jan", "Kowalski", 24);

            bootcamp.info();

            CourseOnline courseOnline = new CourseOnline("Java-online-123", 900, "Java 17",
                    "kurs programowania",43, 56);

            FullTimeCourse fullTimeCourse = new FullTimeCourse("Java-stacjonarne-123", 1420, "Java 17",
                    "kurs porgramowania", "Jan",  98);

            fullTimeCourse.info();

            courseOnline.info();
        }
    }

}
