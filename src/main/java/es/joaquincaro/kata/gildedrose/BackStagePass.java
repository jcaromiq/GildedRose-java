package es.joaquincaro.kata.gildedrose;

public class BackStagePass extends GlidedItem {
    private Item item;

    public BackStagePass(Item item) {
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
            if (item.getSellIn() < 10 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
            if (item.getSellIn() < 5 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
        return this;
    }
}
