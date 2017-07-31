package es.joaquincaro.kata.gildedrose;

public class GenericItem {

    private Item item;

    public GenericItem(Item item) {

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
