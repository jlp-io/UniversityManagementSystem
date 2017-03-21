public class Test {
    public static void main(String[] args) {
        Lecturer newLecturer = new Lecturer("Simon", 50, "Mathematics");
        Lecturer newLecturer2 = new Lecturer("Simon", 50, "Mathematics");
        System.out.println(newLecturer.equals(newLecturer2));
        System.out.println(newLecturer == newLecturer2);
    }
}