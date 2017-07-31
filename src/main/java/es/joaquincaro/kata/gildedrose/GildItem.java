package es.joaquincaro.kata.gildedrose;

public class GildItem {

    private Item item;

    public GildItem(Item item) {

        this.item = item;
    }

    public void changeSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }

    public void changeQuality() {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 1);
        }

    }
}
