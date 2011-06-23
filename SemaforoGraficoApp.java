//package com.tarea.ui;

import java.awt.*;

import javax.swing.JFrame;


public class SemaforoGraficoApp{
	
	JFrame frame;
	SemaforoGrafico panel;
	 Runnable job = new Light();

	
	public static void main(String[] args) {
		
		SemaforoGraficoApp gui = new SemaforoGraficoApp();		
		gui.go();

	}
	
	public void go(){	
		Thread norteSur = new Thread(job, "Norte-Sur");
		norteSur.start(); 

		
		/*panel = new SemaforoGrafico();
		
		frame = new JFrame("Semaforo");
		frame.setSize(1200, 800);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.CENTER);*/
	
		
	}
	
	
	class Light implements Runnable{


		public void run(){	
				 cambiar();
			
		}

		

		public synchronized void cambiar(){

				if(Thread.currentThread().getName().equalsIgnoreCase("Norte-sur")){

					panel = new SemaforoGrafico();					
					frame = new JFrame("Semaforo");
					
					panel.setNorteSurVerde(true);	
					panel.setEsteOesteRojo(true);					
					
					frame.setSize(1200, 800);
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.add(panel, BorderLayout.CENTER);	
				
				try{
						Thread.currentThread().sleep(2000);		
		
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				panel.setNorteSurAmarillo(true);
				panel.setNorteSurVerde(false);
				
				frame.setSize(1200, 800);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(panel, BorderLayout.CENTER);	
			
				try{			
						Thread.currentThread().sleep(2000);
						
		
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				panel.setNorteSurRojo(true);
				panel.setNorteSurAmarillo(false);
				
				frame.setSize(1200, 800);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(panel, BorderLayout.CENTER);	
				
				
				}else{
					panel.setEsteOesteVerde(true);
					panel.setNorteSurRojo(true);	
					//frame.repaint();
					
					/*}else if(cont == 0 && Thread.currentThread().getName().equalsIgnoreCase("Este-oeste")){
		
					}*/
				try{
						Thread.sleep(1000);		
		
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				panel.setEsteOesteAmarillo(true);
				panel.setEsteOesteVerde(false);
				//frame.frame.repaint();
			
				try{			
						Thread.sleep(1000);
						
		
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				panel.setEsteOesteRojo(true);
				panel.setEsteOesteAmarillo(false);
				//frame.frame.repaint();
					
				}
				
				
		}
		
	}
	
}
