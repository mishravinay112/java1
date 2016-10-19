package salebook;

public class SalesDto {
	
	private String book_description;
	
	private String course_name;
	private	String course_Stream,email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBook_description() {
		return book_description;
	}
	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}
	private	String course_subject;
	
	private String Writer_name;
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_Stream() {
		return course_Stream;
	}
	public void setCourse_Stream(String course_Stream) {
		this.course_Stream = course_Stream;
	}
	public String getCourse_subject() {
		return course_subject;
	}
	public void setCourse_subject(String course_subject) {
		this.course_subject = course_subject;
	}
	
	public String getWriter_name() {
		return Writer_name;
	}
	public void setWriter_name(String writer_name) {
		Writer_name = writer_name;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNegotiable_status() {
		return Negotiable_status;
	}
	public void setNegotiable_status(String negotiable_status) {
		Negotiable_status = negotiable_status;
	}
	private	String Edition;
	private	String Book_name;
	private	String price;
	private String Negotiable_status;
	private String file_path;



	public String getFile_path() {
		return file_path;

	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	
}
