public class Course {
    public class Course {
        private String ID;//identyfikator
        private double price;//cena
        private String nameCourse;//nazwa kursu
        private String description;//opis

        public Course(String ID, double price, String nameCourse, String description) {
            this.ID = ID;
            this.price = price;
            this.nameCourse = nameCourse;
            this.description = description;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getNameCourse() {
            return nameCourse;
        }

        public void setNameCourse(String nameCourse) {
            this.nameCourse = nameCourse;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void info(){
            String info = "ID kursu: " + ID + ", cena: " + price + ", nazwa kursu: " + nameCourse + ", opis: " + description;
            System.out.println(info);
        }

    }

}
