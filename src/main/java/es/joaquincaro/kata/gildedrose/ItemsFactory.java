package es.joaquincaro.kata.gildedrose;


public class ItemsFactory {
    public static GlidedItem aNewFrom(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                GlidedItem agedBrie = new AgedBrie(item);
                return agedBrie;
            case "Backstage passes to a TAFKAL80ETC concert":
                GlidedItem backStagePass = new BackStagePass(item);
                return backStagePass;
            case "Sulfuras, Hand of Ragnaros" :
                GlidedItem sulfuras = new Sulfuras(item);
                return  sulfuras;
            default:
                GlidedItem generic = new GlidedItem(item);
                return  generic;

        }
    }
}
