package KoreanOrganizer;

public class monthNovember extends KoreanMain{
	public monthNovember() {
		month = "November";
		targetLesson = "Tenses";
		vocabs = "........";
		numberOfWordsLearned = "10";
		additionalToDo.add("familiarize with a lot of expressions");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Past tense, present tense, and future tense of verbs");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("[continue]Descendants of the Sun");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("Lovesick Girls by Blackpink");
	}
	

}
