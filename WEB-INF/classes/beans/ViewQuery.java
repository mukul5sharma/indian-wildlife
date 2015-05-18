package beans;

public class ViewQuery {
	private String subject,content,by,date;
	private int id;
	public void setBy(String by) {
		this.by = by;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBy() {
		return by;
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
