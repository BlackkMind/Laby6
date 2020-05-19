package pl.kj.firstapp;

public class Wiek {
    private final long id;
    private final int wiek;

    public Wiek (long id, int wiek) {
        this.id = id;
        this.wiek = wiek;
    }

    public long getId() {
        return id;
    }

    public int getWiek() {
        return wiek;
    }
}
