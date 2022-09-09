package br.states;

import java.awt.Graphics;

public interface State {
	
	void init();
	void update ();
	void render(Graphics g);
	void KeyPressed1(int cod);
	void KeyReleased (int cod);
	void KeyPressed(int keyCode);

	

}
