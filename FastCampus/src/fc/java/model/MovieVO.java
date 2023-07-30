package fc.java.model;

public class MovieVO {
    private String title;
    private String day;
    private String major;
    private String genre;
    private int time;
    private int level;
    // 오른쪽 클릭하고 Generate 누르면 타이핑 하지 않아도 생성 가능!
    // 디폴트 생성자
    public MovieVO() {
    }
    //
    public MovieVO(String title, String day, String major, String genre, int time, int level) {
        this.title = title;
        this.day = day;
        this.major = major;
        this.genre = genre;
        this.time = time;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", major='" + major + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", level=" + level +
                '}';
    }
}
