package demo.domain;

import java.sql.Timestamp;

public class boardVO {
    private Long seq;
    private String user_name;
    private String title;
	private String content;
    private Timestamp regdate;
    private Timestamp modifydate;
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getModifydate() {
		return modifydate;
	}

	public void setModifydate(Timestamp modifydate) {
		this.modifydate = modifydate;
	}

    public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

	@Override
	public String toString() {
		return "boardVO [seq=" + seq + ", user_name=" + user_name + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", modifydate=" + modifydate + ", getTitle()=" + getTitle()
				+ ", getModifydate()=" + getModifydate() + ", getRegdate()=" + getRegdate() + ", getContent()="
				+ getContent() + ", getSeq()=" + getSeq() + ", getUser_name()=" + getUser_name() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}