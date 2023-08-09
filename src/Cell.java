

public class Cell
{
    int x;
    int y;
    public int getcellX()
		{
			return x;
		}
		
		public int getcellY()
		{
			return y;
		}
		
		public void setCellX(int x)
		{
			if ((x*35)+10<710)
        {
            x=(x*35)+20;
        }
		}
		
		public void setCellY(int y)
		{
			if ((y*35)+10<710)
        {
            y=(x*35)+10;
        }
		}
}