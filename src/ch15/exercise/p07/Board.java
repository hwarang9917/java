package ch15.exercise.p07;

public class Board {
    private String title;
    private String content;
    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String setTitle() { return title; }
    public String setContent() { return content; }
}