package kr.co.sist.vo;

public class ProductVO {

	private String name, info, img;
	private int price;
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVO(String name, String info, String img, int price) {
		super();
		this.name = name;
		this.info = info;
		this.img = img;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", info=" + info + ", img=" + img + ", price=" + price + "]";
	}
	
	
	
}
