import java.awt.*;

public class Candle {
    String  color;
    int height;
    int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = height * 2;
    }
}
