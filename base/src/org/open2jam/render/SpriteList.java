package org.open2jam.render;

/** SpriteList is a container for sprites.
*** list of sprites with a framespeed attribute.
**/
public class SpriteList extends java.util.ArrayList<Sprite>
{
	/** the frame change speed in milliseconds */
	private double framespeed;

	public SpriteList(double fs)
	{
		super();
		this.framespeed = fs;
	}

	public double getFrameSpeed(){ return framespeed; }
}