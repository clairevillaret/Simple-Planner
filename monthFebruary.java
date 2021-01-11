package KoreanOrganizer;

public class monthFebruary extends KoreanMain{
	public monthFebruary() {
		month = "February";
		targetLesson = "Particles";
		vocabs = "every,as much as,also,too,like,each....";
		numberOfWordsLearned = "10";
		additionalToDo.add("memorize poem");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Korean particles");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("[continue]Chicago Tyepwriter");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("Dynamite by BTS");
	}
	

}
