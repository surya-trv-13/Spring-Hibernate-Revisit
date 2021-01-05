package com.trv13.map.OneToOne;

public class Question {
	private int id;
	private String question;
	
	private Answer answer;
	public Question() {
		super();
	}
	public Question(int id, String question, Answer answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
