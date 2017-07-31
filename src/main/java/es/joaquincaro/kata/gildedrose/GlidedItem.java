package es.joaquincaro.kata.gildedrose;

public class GlidedItem {

    private Item item;

    public GlidedItem(Item item) {

        this.item = item;
    }

    public GlidedItem changeSellIn() {
        item.setSellIn(item.getSellIn() - 1);
        return this;
    }

    public GlidedItem changeQuality() {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 1);
        }
        return this;

    }
}
