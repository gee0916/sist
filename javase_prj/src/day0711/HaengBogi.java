package day0711;

public final class HaengBogi extends abstrackCats{

	public double kg;
	
	public HaengBogi() {
		super(2,1,1,1);
	}//HaengBogi
	
	public String kg(double kg) {
		String result="";
		if(1.8<=kg && kg<=3) {
			result="너무 말랐어요";
		}else if(3<kg && kg<=4) {
			result="말랐어요";
		}else if (4<kg && kg<=6) {
			result="보통이에요";
		}else if (6<kg && kg<=7) {
			result="통통해요";
		}else if (7<kg) {
			result="너무 뚱뚱해요";
		}//end else
		return result;
	}//power
	
	@Override
	public String favoritePlay(String play) {
		return getName()+"가 좋아하는 장난감은 "+play+"이다.";
	}//favoritePlay

	@Override
	public String favoriteSnack(String snack) {
		return getName()+"가 좋아하는 간식은 "+snack+"이다.";
	}//favoriteFood


}//class
