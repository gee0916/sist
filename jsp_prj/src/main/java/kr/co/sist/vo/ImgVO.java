package kr.co.sist.vo;

public class ImgVO {

	private String img, title, content;

	public ImgVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImgVO(String img, String title, String content) {
		super();
		this.img = img;
		this.title = title;
		this.content = content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
