package KoreanOrganizer;

public class monthOctober extends KoreanMain{
	public monthOctober() {
		month = "October";
		targetLesson = "Changes in parts of speech";
		vocabs = "more verbs.....";
		numberOfWordsLearned = "20";
		additionalToDo.add("practice speaking in Korean");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Korean irregular verbs");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("Descendants of the Sun");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("Cheer Up by TWICE");
	}
	

}
