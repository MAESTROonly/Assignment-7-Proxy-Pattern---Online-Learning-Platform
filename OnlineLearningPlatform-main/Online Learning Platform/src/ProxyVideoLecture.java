public class ProxyVideoLecture implements VideoLecture {
    private String title;
    private String fileName;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    @Override
    public String getInfo() {
        return "Video Title: " + title + " (Proxy)";
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title, fileName);
        }
        realVideoLecture.play();
    }
}
