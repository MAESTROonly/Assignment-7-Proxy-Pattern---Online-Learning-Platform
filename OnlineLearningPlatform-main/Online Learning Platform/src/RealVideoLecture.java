public class RealVideoLecture implements VideoLecture {
    private String title;
    private String fileName;

    public RealVideoLecture(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
        loadVideoFromFile();
    }

    private void loadVideoFromFile() {
        System.out.println("Loading video file: " + fileName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getInfo() {
        return "Video Title: " + title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
