package com.royal.oops.polydemo;

import java.awt.*;
import java.applet.*;
public class Rainbow extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(50,50,200,200);
		g.setColor(Color.orange);
		g.fillOval(55,55,190,190);
		g.setColor(Color.yellow);
		g.fillOval(60,60,180,180);
		g.setColor(Color.green);
		g.fillOval(65,65,170,170);
		g.setColor(Color.cyan);
		g.fillOval(70,70,160,160);
		g.setColor(Color.blue);
		g.fillOval(75,75,150,150);
		g.setColor(Color.magenta);
		g.fillOval(80,80,140,140);
	}
}