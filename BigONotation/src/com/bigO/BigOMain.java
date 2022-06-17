package com.bigO;

public class BigOMain {

	public static void main(String[] args) {

		// O(1) Notation - Describes an algorithm that will always execute in the same
		// space/time regardless of size
		String ex1 = "A";
		String ex4 = "New changes made";
		String ex2 = "Supercalifragalistikexpialidoscious";
		String ex3 = "Better known for literary masterpieces such as A Farewell to Arms and The Old Man and the Sea, Ernest Hemingway was born in 1899 and went on to win the Nobel Prize for Literature in 1954. Whilst in later years he gained the reputation as an avid hunter and inveterate drinker, Hemingway wrote a great deal of poetry, especially in his youth.\r\n"
				+ "\r\n"
				+ "Born in Illinois, he graduated from high school towards the end of the First World War and went to Italy in 1918 to operate as an ambulance driver. It was an eye opening experience for the young writer. In the first few weeks he was sent to a munitions factory that had been bombed, to retrieve the remains of the dead. After only a short while on the front line, Ernest Hemingway was badly injured by mortar fire and spent the next six months in hospital before returning to the United States.\r\n"
				+ "\r\n"
				+ "He was offered a job writing for the Toronto Star Weekly and later moved to Chicago where he married Hadley Richardson. They went to Paris where Hemingway worked as the overseas correspondent for the Toronto Star and met with literary luminaries such as Ezra Pound and James Joyce. In 1923 he published his first work, Three Stories and Ten Poems and his second collection, In Our Time, garnered a certain amount of praise for a new and upcoming writer.\r\n"
				+ "\r\n" + "\r\n" + "\r\n"
				+ "Influenced by the publication of Fitzgerald�s The Great Gatsby, Hemingway set his mind to writing a novel and wrote The Sun Also Rises in just over 8 weeks. The book received mixed reviews when it was first published but went onto become one of the iconic modernist novels of the early 20th Century. By this time his marriage was beginning to fail and Hemingway was having an affair. He divorced and move back to Key West in Florida after marrying Pauline Pfeiffer.\r\n"
				+ "\r\n"
				+ "There Ernest Hemingway began work on A Farewell to Arms which was published in 1929 and was set during the First World War. The novel introduced him as one of the major writers in America. He would spend his winter time in Key West, hanging out at Sloppy Joe�s bar, and the summer in Wyoming. In 1937 he went to Spain after agreeing to act as overseas correspondent during the Spanish Civil War.\r\n"
				+ "\r\n"
				+ "In 1939 he was spending time Cuba and was also beginning the long and painful separation from his second wife, again carrying on an affair with another woman. In the same year he began work on one of his most famous works, For Whom The Bell Tolls which was nominated for the Pulitzer when it was finally published in 1940.\r\n"
				+ "\r\n"
				+ "He covered the late days of the Second World War and was present at the Normandy landings and joined the 22nd on its drive towards Paris. He would later be awarded the Bronze Star for bravery. His time after the war was characterized by bouts of ill health and accidents, as well as depression brought on by the death of some of his writing friends.\r\n"
				+ "\r\n"
				+ "He wrote The Old Man and the Sea in Cuba in 1951 and it won him the Pulitzer a few years later. In 1954 he was almost killed in a series of airplane crashes in Africa, with injuries that included a ruptured liver and a cracked skull.\r\n"
				+ "\r\n"
				+ "The incidents led him to start drinking far more heavily which exacerbated his liver damage. Despite being told to stop drinking and being bedridden for the best part of a year, he failed to take the advice. There were often tales in the news about his poor health and by the start of the 1960s he had also developed an unhealthy paranoia.\r\n"
				+ "\r\n" + "\r\n" + "\r\n" + "";

//		System.out.println(ex1);
//		System.out.println(ex2);
//		System.out.println(ex3);

		// O(N) describes an algorithm whose performance will grow linearly and in
		// direct proportion to the size of the input data set

		char[] chEx1 = ex2.toCharArray();
		char[] chEx2 = ex3.toCharArray();

		for (int i = 0; i < ex1.length(); i++) {
			System.out.println(ex1);
		}

		for (int i = 0; i < chEx1.length; i++) {
			System.out.println(chEx1[i]);
		}

		for (int i = 0; i < chEx2.length; i++) {
			System.out.println(chEx2[i]);
		}

		// O(N�) represents an algorithm whose performance is directly proportional to
		// the square of the size of the input data set.

		// int count = 0;
//		for (int i = 0; i < chEx2.length; i++) {
//			System.out.println("OUTER LOOP AT: " + i);
//			for (int j = 0; j < chEx2.length; j++) {
//				System.out.println("INNER LOOP AT " + j);
//				if(chEx2[i] == chEx2[j]) {
//					count++;
//					System.out.println("COUNTED AT: " + count);
//				}
//			}
//		}

		// O(log N) Dealing with logarithmic time. The program will adjust and increase
		// with the size of the input
		// An excellent notation when dealing with large amounts of data
		// Perfect application of �think smarter, not harder�.
		int countBT = 0;
		for (int i = 1; i < chEx1.length; i = i * 2) {
			countBT++;
			System.out.println("Loop is at " + i + " Current Character is " + chEx1[i]
					+ " counted actually at this point " + countBT);
		}

	}

	public static boolean isEmptyString(String ex) {
		if (ex.isEmpty() || ex.length() == 0) {
			return true;
		}
		return false;
	}

}
