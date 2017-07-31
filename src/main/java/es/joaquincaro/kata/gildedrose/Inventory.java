package es.joaquincaro.kata.gildedrose;

public class Inventory {

	private Item[] items;

	public Inventory(Item[] items) {
		super();
		this.items = items;
	}

	public Inventory() {
		super();
		items = new Item[] {
					new Item("+5 Dexterity Vest", 10, 20), 
					new Item("Aged Brie", 2, 0),
					new Item("Elixir of the Mongoose", 5, 7),
					new Item("Sulfuras, Hand of Ragnaros", 0, 80),
					new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
					new Item("Conjured Mana Cake", 3, 6) 
				};

	}

	public void updateQuality() {
		for (Item item : items) {
			updateSellIn(item);
			updateQuality(item);
		}
	}

	private void updateQuality(Item item) {
		if (item.getName() != "Aged Brie"
                && item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
            if (item.getQuality() > 0) {
                if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                    item.setQuality(item.getQuality() - 1);
                }
            }
        } else {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);

                if (item.getName() == "Backstage passes to a TAFKAL80ETC concert") {
                    if (item.getSellIn() < 10) {
						increaseQualityByOne(item);
					}

                    if (item.getSellIn() < 5) {
						increaseQualityByOne(item);
					}
                }
            }
        }


		if (item.getSellIn() < 0) {
            if (item.getName() != "Aged Brie") {
                if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
                    if (item.getQuality() > 0) {
                        if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                            item.setQuality(item.getQuality() - 1);
                        }
                    }
                } else {
                    item.setQuality(0);
                }
            } else {
				increaseQualityByOne(item);
			}
        }
	}

	private void increaseQualityByOne(Item item) {
		if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
	}

	private void updateSellIn(Item item) {
		if (item.getName() == "Sulfuras, Hand of Ragnaros") {
			return;
		}
		item.setSellIn(item.getSellIn() - 1);
	}
}
