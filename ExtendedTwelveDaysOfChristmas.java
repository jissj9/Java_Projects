
public class ExtendedTwelveDaysOfChristmas {
	public static final int NUMBER_OF_VERSES = 12;
	public static final int SECOND_GIFT_NUMBER = 2;
	public static final String TRUE_LOVE_STRING = "my true love said to me";
	public static final String FIRST_DAY_GIFT = "a Partridge in a Pear Tree.";
	public static final String SECOND_DAY_GIFT = "Two Turtle Doves";
	public static final String THIRD_DAY_GIFT = "Three French Hens";
	public static final String FOURTH_DAY_GIFT = "Four Calling Birds";
	public static final String FIFTH_DAY_GIFT = "Five Golden Rings";
	public static final String SIXTH_DAY_GIFT = "Six Geese a Laying";
	public static final String SEVENTH_DAY_GIFT = "Seven Swans a Swimming";
	public static final String EIGHTH_DAY_GIFT = "Eight Maids a Milking";
	public static final String NINTH_DAY_GIFT = "Nine Ladies Dancing";
	public static final String TENTH_DAY_GIFT = "Ten Lords a Leaping";
	public static final String ELEVENTH_DAYGIFT = "Eleven Pipers Piping";
	public static final String TWELFTH_DAY_GIFT = "Twelve Drummers Drumming";
	
	
	public static void main (String args[]) {

		for(int verse = 1; verse <= NUMBER_OF_VERSES; verse++) 
		{
			System.out.println("On the " + getOrdinalString(verse) + " day of Christmas" + 
		                         "\n" + TRUE_LOVE_STRING + "\n"+ getVerse(verse));
		}
		
	}

	public static String getVerse(int verseNumber) {
		String giftsString = "";

		for(int giftNumber = 1; giftNumber <= verseNumber; giftNumber++) 
		{
			giftsString = getChristmasGift(giftNumber) + ((giftNumber == SECOND_GIFT_NUMBER) ? 
					"\nand ":"\n") + giftsString;

		}
		return giftsString;
	}

	public static String getChristmasGift(int giftNumber) {
		String giftString = "";
		
		switch(giftNumber) {		
		case 1:
			giftString = FIRST_DAY_GIFT;
			break;
		case 2:
			giftString = SECOND_DAY_GIFT;
			break;
		case 3:
			giftString = THIRD_DAY_GIFT;
			break;
		case 4:
			giftString = FOURTH_DAY_GIFT;
			break;
		case 5:
			giftString = FIFTH_DAY_GIFT ;
			break;
		case 6:
			giftString = SIXTH_DAY_GIFT;
			break;
		case 7:
			giftString = SEVENTH_DAY_GIFT;
			break;
		case 8:
			giftString = EIGHTH_DAY_GIFT;
			break;
		case 9:
			giftString = NINTH_DAY_GIFT;
			break;
		case 10:
			giftString = TENTH_DAY_GIFT;
			break;
		case 11:
			giftString = ELEVENTH_DAYGIFT;
			break;
		case 12:
			giftString = TWELFTH_DAY_GIFT;
			break;
		}
		return giftString;
	}

	public static String getOrdinalString (int ordinalNumber){
		
		return ((ordinalNumber == 1) ? "first": (ordinalNumber == 2) ? "second": 
			(ordinalNumber == 3) ? "third": (ordinalNumber == 4) ? "fourth":
				(ordinalNumber == 5) ? "fifth": (ordinalNumber == 6) ? "sixth":
					(ordinalNumber == 7) ? "seventh": (ordinalNumber == 8) ? "eighth:":
						(ordinalNumber == 9) ? "nineth": (ordinalNumber == 10) ? "tenth":
							(ordinalNumber == 11) ? "eleventh": "twelfth");

	}

}
