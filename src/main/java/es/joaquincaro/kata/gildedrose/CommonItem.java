package es.joaquincaro.kata.gildedrose;

public class CommonItem implements GildItem {

    private Item item;

    public CommonItem(Item item) {
        this.item = item;
    }

    @Override
    public void changeSellIn() {
        item.setSellIn(item.getSellIn() - 1);
    }

    @Override
    public void changeQuality() {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }

        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 1);
        }

    }


}
