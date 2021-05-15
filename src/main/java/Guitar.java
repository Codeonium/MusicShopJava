public class Guitar implements IPlay {

    private String sound;
    private int price;

    public Guitar(String sound, int price) {
        this.sound = sound;
        this.price = price;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String play(String play) {
        setSound(play);
        return this.sound;
    }
}
