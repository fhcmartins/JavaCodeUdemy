package entities;

public class Comment {
	
	private String text;
	
	// Construtor padrão (vazio)
	public Comment() {
		
	}
	
	// Construtor
	public Comment(String text) {
		this.text = text;
	}
	
	// Getter and Setter
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
