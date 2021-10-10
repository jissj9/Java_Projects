import java.util.Scanner;
public class StudentMarks {
	public static final int FIRST_CLASS_MARK = 70;
	public static void main (String[]args) {
		boolean done = false;
		int count = 0;
		double marksArray[] = null;
		while (!done) 
		{
			Scanner input = new Scanner (System.in);
			System.out.println(" Enter a student percentage: ");
			if (input.hasNextDouble()) 
			{
				
				if (marksArray != null) {
					double tempArray[]= marksArray.clone();
					marksArray = new double [tempArray.length+1];
					System.arraycopy(tempArray, 0, marksArray, 0, tempArray.length);
				}
				else
				{
					marksArray = new double[1]; /* when the user types the first number 
												   it creates an array to add 1 location for
												   the entered number as at the start it is set 
												   to null */
											      
				}

				double enteredPercentage = input.nextDouble();
				marksArray[count] = enteredPercentage;
				count++;
				System.out.println("The highest mark was " + determineBestMark(marksArray));
				System.out.print("The people who got first class " + countFirstClassHonours(marksArray) + ".");
				
			}
		}

	}
	public static double determineBestMark(double marks[]) {
		double highestMark = 0;
		for(int index = 0; index < marks.length; index++) 
		{
			if(marks[index] > highestMark) {
				highestMark = marks[index];
			}
			
		}
		return highestMark;
	}

	public static int countFirstClassHonours(double marks[]) {
		int firstClassCount = 0;
		int newCount = 0;
		for(int index = 0; index < marks.length; index++) {
			if(marks[index] >= FIRST_CLASS_MARK)
			{
				firstClassCount++;
			    newCount = firstClassCount;
			}
		}
		return firstClassCount;
	}

	
}
