class Quiz4ChoiceQuestion extends QuizQuestion{
	
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	
	public Quiz4ChoiceQuestion(String question, String choiceA, String choiceB, String choiceC,String choiceD, String answer) {
		super(question, answer);
		this.choiceA = choiceA;
		this.choiceB = choiceB;
		this.choiceC = choiceC;
		this.choiceD = choiceD;
	}
	
	public String toString() {
		return super.toString() + "\nA.) " + choiceA + "\nB.) " + choiceB + "\nC.) " + choiceC + "\nD.) " + choiceD;
	}
	
	public boolean isAnswerCorrect(String studentAnswer) {
		return super.isAnswerCorrect(studentAnswer);
	}
}
