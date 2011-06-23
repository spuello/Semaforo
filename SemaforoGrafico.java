//package com.tarea.ui;

import java.awt.*;
import javax.swing.*;

import javax.swing.JPanel;

public class SemaforoGrafico extends JPanel {
	
	private boolean norteSurVerde;
	private boolean norteSurAmarillo;
	private boolean norteSurRojo;
	
	private boolean esteOesteVerde;
	private boolean esteOesteAmarillo;
	private boolean esteOesteRojo; 
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setLayout(null);
		
		this.setBackground(Color.BLACK);
		
		//Cera Horizontales
		
		g.setColor(Color.lightGray);		
		g.fill3DRect(0, 230, 400, 30, true);
		g.fill3DRect(800, 230, 400, 30, true);
		g.fill3DRect(0, 470, 400, 30, true);
		g.fill3DRect(800, 470, 400, 30, true);
		
		//Cera Verticales		
		g.fill3DRect(370, 0, 30, 230, true);		
		g.fill3DRect(800, 0, 30, 230, true);		
		g.fill3DRect(370, 500, 30, 230, true);		
		g.fill3DRect(800, 500, 30, 230, true);
		
		//Peatonales horizontales
		g.setColor(Color.WHITE);
		g.fill3DRect(350, 275, 50, 5, true);
		g.fill3DRect(350, 290, 50, 5, true);
		g.fill3DRect(350, 305, 50, 5, true);
		g.fill3DRect(350, 320, 50, 5, true);
		g.fill3DRect(350, 335, 50, 5, true);
		g.fill3DRect(350, 350, 50, 5, true);
		g.fill3DRect(350, 365, 50, 5, true);
		g.fill3DRect(350, 380, 50, 5, true);
		g.fill3DRect(350, 395, 50, 5, true);
		g.fill3DRect(350, 410, 50, 5, true);
		g.fill3DRect(350, 425, 50, 5, true);
		g.fill3DRect(350, 440, 50, 5, true);
		g.fill3DRect(350, 455, 50, 5, true);
		
		g.fill3DRect(800, 275, 50, 5, true);
		g.fill3DRect(800, 290, 50, 5, true);
		g.fill3DRect(800, 305, 50, 5, true);
		g.fill3DRect(800, 320, 50, 5, true);
		g.fill3DRect(800, 335, 50, 5, true);
		g.fill3DRect(800, 350, 50, 5, true);
		g.fill3DRect(800, 365, 50, 5, true);
		g.fill3DRect(800, 380, 50, 5, true);
		g.fill3DRect(800, 395, 50, 5, true);
		g.fill3DRect(800, 410, 50, 5, true);
		g.fill3DRect(800, 425, 50, 5, true);
		g.fill3DRect(800, 440, 50, 5, true);
		g.fill3DRect(800, 455, 50, 5, true);
		
		//Peatones verticales
		g.fill3DRect(410, 210, 5, 50, true);
		g.fill3DRect(425, 210, 5, 50, true);
		g.fill3DRect(440, 210, 5, 50, true);
		g.fill3DRect(455, 210, 5, 50, true);
		g.fill3DRect(470, 210, 5, 50, true);
		g.fill3DRect(485, 210, 5, 50, true);
		g.fill3DRect(500, 210, 5, 50, true);
		g.fill3DRect(515, 210, 5, 50, true);
		g.fill3DRect(530, 210, 5, 50, true);
		g.fill3DRect(545, 210, 5, 50, true);
		g.fill3DRect(560, 210, 5, 50, true);
		g.fill3DRect(575, 210, 5, 50, true);
		g.fill3DRect(590, 210, 5, 50, true);
		g.fill3DRect(605, 210, 5, 50, true);
		g.fill3DRect(620, 210, 5, 50, true);
		g.fill3DRect(635, 210, 5, 50, true);
		g.fill3DRect(650, 210, 5, 50, true);
		g.fill3DRect(665, 210, 5, 50, true);
		g.fill3DRect(680, 210, 5, 50, true);
		g.fill3DRect(695, 210, 5, 50, true);
		g.fill3DRect(710, 210, 5, 50, true);
		g.fill3DRect(725, 210, 5, 50, true);
		g.fill3DRect(740, 210, 5, 50, true);
		g.fill3DRect(755, 210, 5, 50, true);
		g.fill3DRect(770, 210, 5, 50, true);
		g.fill3DRect(785, 210, 5, 50, true);
		
		g.fill3DRect(410, 470, 5, 50, true);
		g.fill3DRect(425, 470, 5, 50, true);
		g.fill3DRect(440, 470, 5, 50, true);
		g.fill3DRect(455, 470, 5, 50, true);
		g.fill3DRect(470, 470, 5, 50, true);
		g.fill3DRect(485, 470, 5, 50, true);
		g.fill3DRect(500, 470, 5, 50, true);
		g.fill3DRect(515, 470, 5, 50, true);
		g.fill3DRect(530, 470, 5, 50, true);
		g.fill3DRect(545, 470, 5, 50, true);
		g.fill3DRect(560, 470, 5, 50, true);
		g.fill3DRect(575, 470, 5, 50, true);
		g.fill3DRect(590, 470, 5, 50, true);
		g.fill3DRect(605, 470, 5, 50, true);
		g.fill3DRect(620, 470, 5, 50, true);
		g.fill3DRect(635, 470, 5, 50, true);
		g.fill3DRect(650, 470, 5, 50, true);
		g.fill3DRect(665, 470, 5, 50, true);
		g.fill3DRect(680, 470, 5, 50, true);
		g.fill3DRect(695, 470, 5, 50, true);
		g.fill3DRect(710, 470, 5, 50, true);
		g.fill3DRect(725, 470, 5, 50, true);
		g.fill3DRect(740, 470, 5, 50, true);
		g.fill3DRect(755, 470, 5, 50, true);
		g.fill3DRect(770, 470, 5, 50, true);
		g.fill3DRect(785, 470, 5, 50, true);		
		
		//Lineas amarillas horizontal
		g.setColor(Color.YELLOW);
		g.fill3DRect(5, 360, 285, 3, true);
		g.fill3DRect(5, 365, 285, 3, true);
		
		g.fill3DRect(900, 360, 285, 3, true);
		g.fill3DRect(900, 365, 285, 3, true);
		
		//Lineas amarillas verical
		
		g.fill3DRect(600, 5, 3, 160, true);
		g.fill3DRect(595, 5, 3, 160, true);
		
		g.fill3DRect(600, 570, 3, 150, true);
		g.fill3DRect(595, 570, 3, 150, true);		
		
		//Cambio de colores
		
		if(norteSurRojo){
			//Norte
			g.setColor(Color.RED);
			g.fillOval(250, 10, 70, 70);
			
			g.setColor(Color.white);
			g.fillOval(250, 80, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 150, 70, 70);
			
			//Sur
			
			g.setColor(Color.RED);
			g.fillOval(870, 510, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 580, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 650, 70, 70);			
		}
		
		if(norteSurAmarillo){
			g.setColor(Color.WHITE);
			g.fillOval(250, 10, 70, 70);
			
			g.setColor(Color.YELLOW);
			g.fillOval(250, 80, 70, 70);
			
			g.setColor(Color.white);
			g.fillOval(250, 150, 70, 70);
			
			//Sur
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 510, 70, 70);
			
			g.setColor(Color.YELLOW);
			g.fillOval(870, 580, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 650, 70, 70);
			
			
		}
		
		if(norteSurVerde){
			g.setColor(Color.WHITE);
			g.fillOval(250, 10, 70, 70);
			
			g.setColor(Color.white);
			g.fillOval(250, 80, 70, 70);
			
			g.setColor(Color.GREEN);
			g.fillOval(250, 150, 70, 70);
			
			//Sur
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 510, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 580, 70, 70);
			
			g.setColor(Color.GREEN);
			g.fillOval(870, 650, 70, 70);			
			
		}
		
		if(esteOesteVerde){
		
			//Este
			g.setColor(Color.WHITE);
			g.fillOval(870, 10, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 80, 70, 70);
			
			g.setColor(Color.GREEN);
			g.fillOval(870, 150, 70, 70);
			
			//Oeste
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 510, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 580, 70, 70);
			
			g.setColor(Color.GREEN);
			g.fillOval(250, 650, 70, 70);
		}
		
		
		
		if(esteOesteAmarillo){
			g.setColor(Color.WHITE);
			g.fillOval(870, 10, 70, 70);
			
			g.setColor(Color.YELLOW);
			g.fillOval(870, 80, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 150, 70, 70);
			
			//Oeste
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 510, 70, 70);
			
			g.setColor(Color.YELLOW);
			g.fillOval(250, 580, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 650, 70, 70);
			
		}
		
		if(esteOesteRojo){
			g.setColor(Color.RED);
			g.fillOval(870, 10, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 80, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(870, 150, 70, 70);
			
			//Oeste
			
			g.setColor(Color.RED);
			g.fillOval(250, 510, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 580, 70, 70);
			
			g.setColor(Color.WHITE);
			g.fillOval(250, 650, 70, 70);
			
		}
		
		
		
		
	}




	public void setNorteSurVerde(boolean norteSurVerde) {
		this.norteSurVerde = norteSurVerde;
	}




	public void setNorteSurAmarillo(boolean norteSurAmarillo) {
		this.norteSurAmarillo = norteSurAmarillo;
	}




	public void setNorteSurRojo(boolean norteSurRojo) {
		this.norteSurRojo = norteSurRojo;
	}




	public void setEsteOesteVerde(boolean esteOesteVerde) {
		this.esteOesteVerde = esteOesteVerde;
	}




	public void setEsteOesteAmarillo(boolean esteOesteAmarillo) {
		this.esteOesteAmarillo = esteOesteAmarillo;
	}




	public void setEsteOesteRojo(boolean esteOesteRojo) {
		this.esteOesteRojo = esteOesteRojo;
	}




	public boolean isNorteSurVerde() {
		return norteSurVerde;
	}




	public boolean isNorteSurAmarillo() {
		return norteSurAmarillo;
	}




	public boolean isNorteSurRojo() {
		return norteSurRojo;
	}




	public boolean isEsteOesteVerde() {
		return esteOesteVerde;
	}




	public boolean isEsteOesteAmarillo() {
		return esteOesteAmarillo;
	}




	public boolean isEsteOesteRojo() {
		return esteOesteRojo;
	}
	
	

}
