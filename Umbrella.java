
import javax.swing.JOptionPane;

public class Umbrella {
	public static void main(String[]args) {
		int answer = JOptionPane.showConfirmDialog(null,"Is it raining outside?");
		boolean rainingYes = (answer == JOptionPane.YES_OPTION);

		if(rainingYes) 
		{
			JOptionPane.showMessageDialog(null, "Bring an umbrella and put it up.");
		}
		else 
		{
			int answer1 = JOptionPane.showConfirmDialog(null, "Does it look like it is going to rain?"
					+"\n(ie.Cloudy)");
			boolean itMightRain = (answer1 == JOptionPane.YES_OPTION);

			if(itMightRain) 
			{
				JOptionPane.showMessageDialog(null, "Bring an umbrella, don't put it up unless it "
						+ "starts to rain.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Don't bring an umbrella.");
			}


		}


	}

	

}
