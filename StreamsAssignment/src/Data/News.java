package Data;

public class News {
	
	public int newsId;
	public String postedByUser;
	public String commentedByUser;
	public String comment;
	
	
	
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentedByUser=" + commentedByUser
				+ ", comment=" + comment + "]";
	}
	public News(int newsId, String postedByUser, String commentedByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentedByUser = commentedByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentedByUser() {
		return commentedByUser;
	}
	public void setCommentedByUser(String commentedByUser) {
		this.commentedByUser = commentedByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
