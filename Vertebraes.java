import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * Write a program to determine what class (amphibian, reptile, fish, mammal, or bird)
 * a vertebrate is..
 * Class      Blood  Covering     Fins?
 * -----      -----  --------     -----
 * Amphibian  Cold   Moist skin	  No fins
 * Reptile    Cold   Scales       No fins
 * Fish       Cold   Scales       Fins
 * Mammal     Warm   Hair or fur  No fins
 * Bird       Warm   Feathers     No fins
 */

public class Vertebraes {

	public static void main(String[] args) {

		int answer = JOptionPane.showConfirmDialog(null, "Is the animal cold blooded?");
		boolean coldBlooded = (answer == JOptionPane.YES_OPTION);
		if (!coldBlooded)
		{
			answer = JOptionPane.showConfirmDialog(null, "Does the animal have feathers?");
			boolean hasFeathers = (answer == JOptionPane.YES_OPTION);
			if(hasFeathers)
				answer = JOptionPane.showConfirmDialog(null, "The animal is a bird.");
			else {
				answer = JOptionPane.showConfirmDialog(null, "Does the animal have wings?");
				boolean hasWings = (answer == JOptionPane.YES_OPTION);
				if(hasWings)
					answer = JOptionPane.showConfirmDialog(null, "The animal is a mammal.");
				else
					answer = JOptionPane.showConfirmDialog(null, "The animal is a mammal.");
			}
		}
		else 
		{
			answer = JOptionPane.showConfirmDialog(null, "Does the animal have scales?");
			boolean hasScales = (answer == JOptionPane.YES_OPTION);
			if(hasScales) 
			{
				answer = JOptionPane.showConfirmDialog(null, "Does the animal have fins?");
				boolean hasFins = (answer == JOptionPane.YES_OPTION);
				if(hasFins)
					answer = JOptionPane.showConfirmDialog(null, "The animal is a Fish");
				else
					answer = JOptionPane.showConfirmDialog(null, "The animal is a Reptile");
			}
			else 
			{
				answer = JOptionPane.showConfirmDialog(null, "Does the animal have wings?");
				boolean hasColdWings = (answer == JOptionPane.YES_OPTION);
				if(hasColdWings)
					answer = JOptionPane.showConfirmDialog(null, "The animal is a Mammal");
				else
					answer = JOptionPane.showConfirmDialog(null, "The animal is a Amphibian");
			}

		}


	}
}


