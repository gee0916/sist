package kr.co.sist.vo;

public class LatLngVO {

	private double lat, lng;
	private String title;
	
	public LatLngVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LatLngVO(double lat, double lng, String title) {
		super();
		this.lat = lat;
		this.lng = lng;
		this.title = title;
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "LatLngVO [lat=" + lat + ", lng=" + lng + ", title=" + title + "]";
	}
	
}
