package com.trv13.map.ManyToOne;

import java.util.List;

public class QuestionOTM {
	private int questionId;
	private String question;
	private List<AnswerOTM> answers;
	public QuestionOTM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuestionOTM(int questionId, String question, List<AnswerOTM> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerOTM> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AnswerOTM> answers) {
		this.answers = answers;
	}
}
