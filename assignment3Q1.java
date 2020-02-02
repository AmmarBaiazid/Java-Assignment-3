// -------------------------------------------------------
// Assignment (3)
// Written by: (Ammar Baiazid id(26746632))
// For COMP 248 Section (EC) – Fall 2019
// --------------------------------------------------------
// This program is generates random password and and stops when it reaches a 10000 passwords or when it finds a password with all lower case

import java.util.Random;
public class assignment3Q1 {
	
	public static void main(String args []) {
		Random randomGen = new Random();
		
		int pageNum, paragraphNum, lineNum;
		
		
		final String[][][] book = {
				
				{
				{"ALICE was beginning to get very tired of sitting by her sister on the\n",
				"bank, and of having nothing to do. Once or twice she had peeped into the\n",
				"book her sister was reading, but it had no pictures or conversations in\n",
				"it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
				"conversations?\"\n"},
				{"So she was considering in her OWN mind (as well as she could, for the\n",
				"day made her feel very sleepy and stupid), whether the pleasure of\n",
				"making a daisy-chain would be worth the trouble of getting up and\n",
				"picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
				"close by her.\n"},
				{"There was nothing so very remarkable in that, nor did Alice think it so\n",
				"very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
				"dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
				"out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
				"started to her feet, for it flashed across her mind that she had never\n",
				"before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
				"out of it, and, burning with curiosity, she ran across the field after\n",
				"it and was just in time to see it pop down a large rabbit-hole, under\n",
				"the hedge. In another moment, down went Alice after it!"}
				},
				{
				{"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
				"telescope!\"\n"},
				{"And so it was indeed! She was now only ten inches high, and her face\n",
				"brightened up at the thought that she was now the right size for going\n",
				"through the little door into that lovely garden.\n"},
				{"After awhile, finding that nothing more happened, she decided on going\n",
				"into the garden at once; but, alas for poor Alice! When she got to the\n",
				"door, she found she had forgotten the little golden key, and when she\n",
				"went back to the table for it, she found she could not possibly reach\n",
				"it: she could see it quite plainly through the glass and she tried her\n",
				"best to climb up one of the legs of the table, but it was too slippery,\n",
				"and when she had tired herself out with trying, the poor little thing\n",
				"sat down and cried.\n"},
				{"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
				"sharply. \"I advise you to leave off this minute!\" She generally gave\n",
				"herself very good advice (though she very seldom followed it), and\n",
				"sometimes she scolded herself so severely as to bring tears into her\n",
				"eyes.\n"},
				{"Soon her eye fell on a little glass box that was lying under the table:\n",
				"she opened it and found in it a very small cake, on which the words \"EAT\n",
				"ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
				"Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
				"makes me grow smaller, I can creep under the door: so either way I'll\n",
				"get into the garden, and I don't care which happens!\"\n"},
				{"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
				"way?\" holding her hand on the top of her head to feel which way she was\n",
				"growing; and she was quite surprised to find that she remained the same\n",
				"size. So she set to work and very soon finished off the cake."}
				},
				{
				{"The King and Queen of Hearts were seated on their throne when they\n",
				"arrived, with a great crowd assembled about them--all sorts of little\n",
				"birds and beasts, as well as the whole pack of cards: the Knave was\n",
				"standing before them, in chains, with a soldier on each side to guard\n",
				"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
				"and a scroll of parchment in the other. In the very middle of the court\n",
				"was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
				"trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
				{"The judge, by the way, was the King and he wore his crown over his great\n",
				"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
				"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
				{"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
				{"\"HERALD! read the accusation!\" said the King."}
				}
				};
		
		
	    boolean isValidPassword = false;
	    int randomStringLocation;
	    int newLineCount, singleCount, equalCount, lengthCount, upperCount, lowerCount, specialCount;
	    String word1 = "";
	    String word2 = "";
	    String word3 = "";
	    int i;
	    newLineCount = singleCount = equalCount = lengthCount = upperCount = lowerCount = specialCount = 0;

		boolean lowerCaseCondition = false;
		for(i=0;i<10000;i++) {
			if(lowerCaseCondition) {
				break;
			}

			//keeps looping until a password is valid
			do {
				isValidPassword = true;
				boolean isValidWord = false;
				// The 3 while loops below are used to randomly pick 3 words from the above array to generate the password 
				while(!isValidWord) {
					isValidWord = true;
					pageNum= randomGen.nextInt(book.length-1);
					paragraphNum = randomGen.nextInt(book[pageNum].length-1);
					lineNum= randomGen.nextInt(book[pageNum][paragraphNum].length-1);
					
					String[] randomSentence = book[pageNum][paragraphNum][lineNum].split(" ");
					randomStringLocation = randomGen.nextInt(randomSentence.length-1);
					word1= randomSentence[randomStringLocation];
					
					if (word1.contains("\n")) {
						isValidWord = false;
						newLineCount++;
					}
					if (word1.length()==1) {
						isValidWord = false;
						singleCount++;
					}
					
				}
				
				isValidWord = false;
				while(!isValidWord) {
					isValidWord = true;
					pageNum= randomGen.nextInt(book.length-1);
					paragraphNum = randomGen.nextInt(book[pageNum].length-1);
					lineNum= randomGen.nextInt(book[pageNum][paragraphNum].length-1);
					
					String[] randomSentence = book[pageNum][paragraphNum][lineNum].split(" ");
					randomStringLocation = randomGen.nextInt(randomSentence.length-1);
					word2= randomSentence[randomStringLocation];
					
					if (word2.contains("\n")) {
						isValidWord = false;
						newLineCount++;
					}
					if (word2.length()==1) {
						isValidWord = false;
						singleCount++;
					}
					
				}
				
				isValidWord = false;
				while(!isValidWord) {
					isValidWord = true;
					pageNum= randomGen.nextInt(book.length-1);
					paragraphNum = randomGen.nextInt(book[pageNum].length-1);
					lineNum= randomGen.nextInt(book[pageNum][paragraphNum].length-1);
					
					String[] randomSentence = book[pageNum][paragraphNum][lineNum].split(" ");
					randomStringLocation = randomGen.nextInt(randomSentence.length-1);
					word3= randomSentence[randomStringLocation];
					
					if (word3.contains("\n")) {
						isValidWord = false;
						newLineCount++;
					}
					if (word3.length()==1) {
						isValidWord = false;
						singleCount++;
					}
					
				}
				
				String password = word1.concat(word2).concat(word3);
				
				if (word1.compareTo(word2) == 0 || word2.compareTo(word3) == 0) {
					equalCount++;
					isValidPassword = false;
				}
				
				if (password.length() < 8 || password.length() > 16 ) {
					lengthCount++;
					isValidPassword = false;
				}
				
				if (password.equals(password.toLowerCase())) {
					upperCount++;
					isValidPassword = false;
				}
				
				//if all is lowercase, then print it out, and break out of the loop.
				if (password.equals(password.toUpperCase())) {
					lowerCount= 1;
					isValidPassword = false;
					lowerCaseCondition = true;
					System.out.printf("Password = %-20s NewLine = %-10s Single = %-10s Equal = %-10s Length = %-10s"
				    		+ " Upper = %-10s Lower = %-10s Special = %-10s", password, newLineCount, singleCount, equalCount, lengthCount, upperCount, lowerCount, specialCount);
					System.out.println();
					break;
				}
				
				if (!password.matches("^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[/\"+_)(*&^%$#@!~][0-9a-zA-Z]*")) {
                    isValidPassword = false;
                    specialCount++;
                }
				
				if (isValidPassword) {
					
					System.out.printf("Password = %-20s NewLine = %-10s Single = %-10s Equal = %-10s Length = %-10s"
			    		+ " Upper = %-10s Lower = %-10s Special = %-10s", password, newLineCount, singleCount, equalCount, lengthCount, upperCount, lowerCount, specialCount);
					//reset values to 0 to reset counts
				    newLineCount = singleCount = equalCount = lengthCount = upperCount = lowerCount = specialCount = 0;
					System.out.println();
				}
			}while (isValidPassword);
		}
		
		System.out.println("\nTotal Passwords generated: " +i);
		System.out.println("\nThank you for using the password generator game. Good bye.");

	}
}
