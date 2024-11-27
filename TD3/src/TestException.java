class ErrConst extends Exception{
	public ErrConst() {
		super("Pas de coordonnées negatif dans la création d'un Point");
	}
	public ErrConst(String s){
		super(s);
	}
}
class ErrDepl extends Exception{
	
}
class Point{
	int x,y;
	public Point(int x,int y) throws ErrConst{
		if(x<0||y<0) {
			throw new ErrConst("x te y doit être positif");
		}
	}
}

public class TestException {

	public static void main(String[] args)  {
		try {
			Point p1=new Point(1,-2);
		} catch (ErrConst e) {
			System.out.println(e.getMessage());
		}
		
	}

}
