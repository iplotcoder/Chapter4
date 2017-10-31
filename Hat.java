
public class Hat
{
    // instance variables - replace the example below with your own
    private int size;
    private String color;

    public Hat(int siz, String col)
    {
        this.size = siz;
        this.color = col;
    }

    public String getColor()
    {
        return this.color;
    }
    
    public int getSize()
    {
        return this.size;
    }
    
    public String toString()  {
        return "This hat's color is: " + this.color;
    }
    
}
