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
			changeSellIn(item);
			changeQuality(item);
		}
	}

	private void changeQuality(Item item) {
		switch (item.getName()) {
			case "Aged Brie":
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
				}
				if(item.getSellIn() < 0) {
					item.setQuality(item.getQuality() + 1);
				}
				break;
			case "Backstage passes to a TAFKAL80ETC concert":
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
				break;
			case "Sulfuras, Hand of Ragnaros" :


			default:
				if (item.getQuality() > 0) {
					item.setQuality(item.getQuality() - 1);
				}

				if (item.getSellIn() < 0) {
					item.setQuality(item.getQuality() - 1);
				}
				break;
		}
	}

	private void changeSellIn(Item item) {
		if (item.getName() == "Sulfuras, Hand of Ragnaros") {
			return;
		}
		item.setSellIn(item.getSellIn() - 1);
	}
}
