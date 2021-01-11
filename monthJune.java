package KoreanOrganizer;

public class monthJune extends KoreanMain{
	public monthJune() {
		month = "June";
		targetLesson = "How to ask opinions and make suggestions";
		vocabs = "let's...., why don't you......";
		numberOfWordsLearned = "15";
		additionalToDo.add("memorize poem");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Korean days of the week");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("A werefwolf boy (movie)");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("Your Eyes Tell by BTS");
	}
	

}
