package email.services.entity;

public class EmailEntity {
	private String receiver;
    private String body;
    private String subject;
    private String attachment;
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public EmailEntity(String receiver, String body, String subject, String attachment) {
		super();
		this.receiver = receiver;
		this.body = body;
		this.subject = subject;
		this.attachment = attachment;
	}
	public EmailEntity() {
		super();
	}
    
}
