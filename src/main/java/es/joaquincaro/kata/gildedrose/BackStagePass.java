package es.joaquincaro.kata.gildedrose;

public class BackStagePass implements GildItem {
    public static final String TYPE ="Backstage passes to a TAFKAL80ETC concert";

    private Item item;

    public BackStagePass(Item item) {
        this.item = item;
    }

    @Override
    public void changeSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }

    @Override
    public void changeQuality() {
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
    }
}
