import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> lectures = new ArrayList<>();

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showLectureInfo() {
        for (VideoLecture lecture : lectures) {
            System.out.println(lecture.getInfo());
        }
    }

    public void playLecture(int index) {
        if (index >= 0 && index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index");
        }
    }
}
