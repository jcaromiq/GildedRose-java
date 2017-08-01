package es.joaquincaro.kata.gildedrose;


public class GildItemsFactory {
    public static GildItem aNewFrom(Item item) {
        switch (item.getName()) {
            case AgedBrie.TYPE:
                GildItem agedBrie = new AgedBrie(item);
                return agedBrie;

            case BackStagePass.TYPE:
                GildItem backStagePass = new BackStagePass(item);
                return backStagePass;

            case Sulfuras.TYPE :
                GildItem sulfuras = new Sulfuras(item);
                return  sulfuras;

            default:
                GildItem generic = new CommonItem(item);
                return  generic;

        }
    }
}
