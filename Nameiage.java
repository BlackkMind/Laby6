
package pl.kj.firstapp;

public class Nameiage {
    private final long id;
    private final String content;
    private final int wiek;

    public Nameiage (long id, String content, int wiek) {
        this.id = id;
        this.content = content;
        this.wiek = wiek;
    }

    public long getId() {
        return id;
    }

    public int getWiek() {
        return wiek;
    }
    public String getContent() {
        return content;
    }
}