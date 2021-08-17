/*
<applet code="PARAM_test.class"width=400 height=400>
<PARAM NAME="name" value="achin jain">
</applet>
*/
import java.applet.*;
import java.awt.*;
public class PARAM_test extends Applet
{
String str=null;
public void init()
{
str=getParameter("name");
}
public void paint(graphics g)
{
g.drawString(str,100,100);
}
}