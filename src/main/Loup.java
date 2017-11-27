package main;
public class Loup {
	private Orientation orientation;
	public Loup()
	{
		this.orientation=Orientation.NORD;
	}
	public Orientation getOrientation()
	{
		return orientation;
	}
	public void tourner()
	{
		switch(orientation){
		case NORD:
			orientation=Orientation.EST; 
			break;
		case EST:
			orientation=Orientation.SUD;
			break;
		case SUD:
			orientation=Orientation.OUEST;
			break;
		case OUEST:
			orientation=Orientation.NORD; 
			break;
		}
	}
}
