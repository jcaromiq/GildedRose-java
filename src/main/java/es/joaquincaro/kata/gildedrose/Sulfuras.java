package es.joaquincaro.kata.gildedrose;

public class Sulfuras extends GlidedItem {
    private Item item;

    public Sulfuras(Item item) {
        super(item);
        this.item = item;
    }

    @Override
    public GlidedItem changeSellIn() {
        return this;

    }

    @Override
    public GlidedItem changeQuality() {
        return this;
    }
}
