	public class Box
	{
	    private double length;
	    private double width;
	    private double height;
	    public void setDimensions(double l, double w, double h)
	    {
	        length = l;
	        width = w;
	        height = h;
	    }
	    public double getLength()
	    {
	        return length;
	    }
	    public double getWidth()
	    {
	        return width;
	    }
	    public double getHeight()
	    {
	        return height;
	    }
	    public double calculateVolume()
	    {
	        return length * width * height;
	    }
	    public static void main(String[] args)
	    {
	        Box myBox = new Box();
	        myBox.setDimensions(5, 4, 3);
	        System.out.println("Volume of the box is: " + myBox.calculateVolume());
	    }
	}
