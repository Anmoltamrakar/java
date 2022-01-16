import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
public class Flag extends Frame{
	public Flag(){
		setSize(800,800);
		setVisible(true);
	}
	public void paint (Graphics g){
		   int x1[] = {40,90,40};
        int y1[] = {40,80,80};
        Polygon polygon1 = new Polygon(x1,y1,3);
        g.setColor(Color.GREEN);
		g.fillPolygon(polygon1);


        int x2[]={40,90,40};
		int y2[]={40,80,40};
		Polygon polygon2 = new Polygon(x2,y2,3);
		g.setColor(Color.BLUE);
		g.drawPolygon(polygon2);


		int upperTriangleX[] = {210,360,210}; // +150 for upper triangle
		int upperTriangleY[] = {40,160,160};
		// g.drawPolygon(upperTriangleX,upperTriangleY,3); // Also can be drawn like this.
		Polygon upperTriangle = new Polygon(upperTriangleX,upperTriangleY,3);
		g.drawPolygon(upperTriangle);
		g.setColor(Color.RED);
		g.fillPolygon(upperTriangle);

		// For lower traingle 
		int lowerTriangleX[] = {210,390,210}; // +180 for lower triangle
		int lowerTriangleY[] = {160,340,340};
		Polygon lowerTriangle = new Polygon(lowerTriangleX,lowerTriangleY,3);
		g.setColor(Color.RED);
		g.fillPolygon(lowerTriangle);

		// For standing rod
		int rodX[] = {207,210,210,207};
		int rodY[] = {40,40,500,498};
		Polygon rod = new Polygon(rodX,rodY,4);
		g.setColor(Color.BLACK);
		g.fillPolygon(rod);

		// For borders 
		int borderX[] = {210,210,360,210,390,210,210,396,216,366}; // 3 units
		int borderY[] = {40,50,160,160,340,340,343,343,163,163};
		Polygon border = new Polygon(borderX,borderY,10);
		g.setColor(Color.BLUE);
		g.fillPolygon(border);

			
		g.setColor(Color.WHITE);
		g.fillOval(240,100,30,30); 
		g.setColor(Color.RED);
		g.fillOval(240,91,30,30);

		// For star
		int starX[] = {240,250,255,260,270,265,270,260,255,250,240,245};
		int starY[] = {260,260,250,260,260,270,280,280,290,280,280,270}; // Starting is 240
		Polygon star = new Polygon(starX,starY,12);
		g.setColor(Color.WHITE);
		g.fillPolygon(star);
	}
	public static void main(String[] args)
	{
		new Flag();
	}
}