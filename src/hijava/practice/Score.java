package hijava.practice;

public class Score {
	private String Subject;
	private int score;

	public Score(String subject, int score) {
		this.Subject = subject;
	    this.score = score;
	}

	public Score(String subject) {
		this.setSubject(subject);
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [Subject=" + Subject + ", score=" + score + "]";
	}

}
