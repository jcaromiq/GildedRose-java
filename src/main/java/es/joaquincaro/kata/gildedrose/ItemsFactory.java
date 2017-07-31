package es.joaquincaro.kata.gildedrose;


public class ItemsFactory {
    public static GenericItem aNewFrom(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                GenericItem agedBrie = new AgedBrie(item);
                return agedBrie;
            case "Backstage passes to a TAFKAL80ETC concert":
                GenericItem backStagePass = new BackStagePass(item);
                return backStagePass;
            case "Sulfuras, Hand of Ragnaros" :
                GenericItem sulfuras = new Sulfuras(item);
                return  sulfuras;
            default:
                GenericItem generic = new GenericItem(item);
                return  generic;

        }
    }
}
