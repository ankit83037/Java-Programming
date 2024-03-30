import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		// Fill your code here
		fruitBasketList.add(fbObj);


	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		// Fill your code here
		int totalBill = 0;
		totalBill = (int)fruitBasketStream.mapToInt(fruit->fruit.getWeightInKgs()*fruit.getPricePerKg()).sum();

        return totalBill;
	
	}

}
