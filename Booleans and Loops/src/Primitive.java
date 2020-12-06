
public class Primitive {

	public static void main(String[] args) {
		// Week 2 Coding Assignment part 1 thru 4
		boolean isHotOutside = true;
	
			if (isHotOutside == true)
		
				{System.out.println("its hot outside");}
			
		boolean isWeekday = false;
		
			if (isWeekday == false)
		
				{System.out.println("It isn't a weekday.");}
			
		boolean hasMoneyInPocket = true;
		
			if (hasMoneyInPocket == true);
		
				System.out.println(hasMoneyInPocket + ". I do have money in my pocket");
		
		double costOfMilk = 4.25;
		
			System.out.println("The cost of milk is $" +  costOfMilk);
			
		double moneyInWallet = 255.00;
			
		int thirstLevel = 10;
		
			System.out.println("On a level of thirst from 1 to 10 I am a" + " " + thirstLevel);
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		
			System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		
			System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
			
			System.out.println(isAGoodDay);
			
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk;
		
		System.out.println(willBuyMilk);
		
		
		
		
		}
		
		
	}


