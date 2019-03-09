package hijava.oop;

public abstract class SoftWare {

	public abstract void plan();
	public abstract void develop();
	public abstract void release();
	
	public final void product() {
		plan();
		develop();
		release();
		
	}
}
