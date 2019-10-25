public class QuizQuestion {
	
	private String question;
	private String answer;
	private String studentAnswer;
	
	public QuizQuestion (String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String toString() {
		return question;
	}

	public boolean isAnswerCorrect(String studentAnswer) {
		this.studentAnswer = studentAnswer;
		if (this.studentAnswer.equals(answer)) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
