package com.trv13.map.ManyToOne;

public class AnswerOTM {
	private int answerId;
	private String answer;
	private QuestionOTM question;
	public AnswerOTM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnswerOTM(int answerId, String answer, QuestionOTM question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public QuestionOTM getQuestion() {
		return question;
	}
	public void setQuestion(QuestionOTM question) {
		this.question = question;
	}
}
