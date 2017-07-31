package es.joaquincaro.kata.gildedrose;

public class AgedBrie extends GlidedItem {
    private Item item;

    public AgedBrie(Item item) {
        super(item);
        this.item = item;
    }

    @Override
    public GlidedItem changeSellIn() {
        item.setSellIn(item.getSellIn() - 1);
        return this;
    }

    @Override
    public GlidedItem changeQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        if(item.getSellIn() < 0) {
            item.setQuality(item.getQuality() + 1);
        }
        return this;
    }
}
