package org.simpleai.sprite.service.imp;

import javax.swing.ImageIcon;

import org.simpleai.sprite.service.Sprite;

public class Base implements Sprite {

	//https://openclipart.org/detail/32773/isocity-factory
	private ImageIcon img = new ImageIcon(getClass().getResource("/base.png"));
	
	@Override
	public ImageIcon getSpriteIcon() {

		return img;
	}
	
}
