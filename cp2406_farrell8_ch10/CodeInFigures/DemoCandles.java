public class DemoCandles {
    public static void main(String[] args) {
        Candle candleOne= new Candle();
        candleOne.setColor("white Color");
        candleOne.setHeight(500);
        candleOne.setPrice();
        System.out.println("The candle " + candleOne.color + " is "+candleOne.getPrice());
        ScentedCandle CandleTwo= new ScentedCandle();
        CandleTwo.setColor("Black");
        CandleTwo.setHeight(100);
        CandleTwo.setPrice();
        System.out.println("The candle " + CandleTwo.color + " is "+CandleTwo.getPrice());

    }
}
