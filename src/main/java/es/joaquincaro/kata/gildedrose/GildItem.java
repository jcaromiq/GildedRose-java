package es.joaquincaro.kata.gildedrose;

public interface GildItem {
    void changeSellIn();

    void changeQuality();

    default void updateValues() {
        changeSellIn();
        changeQuality();
    }
}
