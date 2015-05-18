package beans;

public class Newsletters {
	private String subject,content,date;
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getSubject() {
		return subject;
	}

}
