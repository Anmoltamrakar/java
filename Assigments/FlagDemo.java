import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

class DrawingShapes extends Frame
{
    public DrawingShapes()
    {
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        //Red Filled Triangle
        int x1[] = {40,40,80};
        int y1[] = {40,80,80};
        Polygon polygon1 = new Polygon(x1,y1,3);
        g.setColor(Color.RED);
        g.fillPolygon(polygon1);

        //Blue Border Triangle
        int x2[] = {120,120,160};
        int y2[] = {40,80,80};
        Polygon polygon2 = new Polygon(x2,y2,3);
        g.setColor(Color.BLUE);
        g.drawPolygon(polygon2);

        
    }
    public static void main(String[] args)
    {
        new DrawingShapes();
    }
}