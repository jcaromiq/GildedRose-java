package es.joaquincaro.kata.gildedrose;


public class ItemsFactory {
    public static GildItem aNewFrom(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                GildItem agedBrie = new AgedBrie(item);
                return agedBrie;
            case "Backstage passes to a TAFKAL80ETC concert":
                GildItem backStagePass = new BackStagePass(item);
                return backStagePass;
            case "Sulfuras, Hand of Ragnaros" :
                GildItem sulfuras = new Sulfuras(item);
                return  sulfuras;
            default:
                GildItem generic = new GildItem(item);
                return  generic;

        }
    }
}
