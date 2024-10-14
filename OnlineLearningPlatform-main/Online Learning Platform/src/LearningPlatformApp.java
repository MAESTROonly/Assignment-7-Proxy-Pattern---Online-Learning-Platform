public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addLecture(new ProxyVideoLecture("Lecture 1: Introduction", "intro.mp4"));
        course.addLecture(new ProxyVideoLecture("Lecture 2: Design Patterns", "design_patterns.mp4"));
        course.addLecture(new ProxyVideoLecture("Lecture 3: Proxy Pattern", "proxy.mp4"));

        System.out.println("Showing lecture info:");
        course.showLectureInfo();

        System.out.println("\nPlaying Lecture 1:");
        course.playLecture(0);

        System.out.println("\nPlaying Lecture 3:");
        course.playLecture(2);

        System.out.println("\nPlaying Lecture 2:");
        course.playLecture(1);
    }
}
