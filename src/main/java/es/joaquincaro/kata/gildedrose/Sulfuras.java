package es.joaquincaro.kata.gildedrose;

public class Sulfuras implements GildItem {
    public static final String TYPE = "Sulfuras, Hand of Ragnaros";

    private Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void changeSellIn() {

    }

    @Override
    public void changeQuality() {

    }
}
