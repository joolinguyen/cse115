package Day6;

public class point {

	private String id;
	private int x, y, z;
	
	public point(){
		x = 0;
		y = 0;
		z = 0;
	}
	
	public point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
	public String getID(){
		return id;
	}
}

