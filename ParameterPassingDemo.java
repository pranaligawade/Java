import java.applet.*;
import java.awt.*;

/*
<applet code="ParameterPassingDemo.class" width=500 height=300>

	<param name="name"value="Times New Roman">

	<param name="size" value="18">
        <param name="name1" value="ashwini">
</applet>

*/



public class ParameterPassingDemo extends Applet
   {
	String fontName;
	String name;
	int fontSize;
	
	public void init()
       {
		fontName = getParameter("name");

		name=getParameter("name1");

		String s = getParameter("size");

		fontSize = Integer.parseInt(s);
	    }
	
	public void paint(Graphics g)
        {
		g.setFont(new Font(fontName,Font.BOLD,fontSize));

		g.drawString("Times New Roman",10,150);

		g.drawString(name,190,150);
	   }
   }



