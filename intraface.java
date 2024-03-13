interface Movable
{
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}
class MovablePoint implements Movable
{
	int x;
	int y;
	int xSpeed;
	int ySpeed;

	MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	
	public String toString()
	{
		
		return null;
	}
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}
	
}
class MovableCircle implements Movable
{
	int radius;
	MovablePoint centre;
	MovableCircle(int x,int y, int xSpeed, int ySpeed)
	{
		centre=new MovablePoint(x,y,xSpeed,ySpeed);
	}
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}
}
