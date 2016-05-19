package org.yourorghere;
import javax.swing.*;
import java.awt.*; 

import javax.media.opengl.*;

public class Janela
{
	private Renderer renderer;

	/**
	 * Construtor da classe ExemploJava que n�o recebe par�metros. Cria uma janela e insere  
	 * um componente canvas OpenGL.
	 */
	public Janela()
	{
		// Cria janela
		JFrame janela = new JFrame("Tetris 3D");   
		janela.setBounds(50,100,1000,500); 
		janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		BorderLayout layout = new BorderLayout(); 
		Container caixa=janela.getContentPane();
		caixa.setLayout(layout); 

		// Cria um objeto GLCapabilities para especificar o n�mero de bits 
		// por pixel para RGBA
		GLCapabilities c = new GLCapabilities();
		c.setRedBits(8);
		c.setBlueBits(8);
		c.setGreenBits(8);
		c.setAlphaBits(8); 

		// Cria o objeto que ir� gerenciar os eventos
		renderer = new Renderer();
		
		// Cria um canvas, adiciona na janela, e especifica o objeto "ouvinte" 
		// para os eventos Gl, de mouse e teclado
		// GLCanvas canvas = GLDrawableFactory.getFactory().createGLCanvas(c);
		GLCanvas canvas = new GLCanvas(c);
		janela.add(canvas,BorderLayout.CENTER);
		canvas.addGLEventListener(renderer);        
		canvas.addMouseListener(renderer);
		canvas.addKeyListener(renderer);
		janela.setVisible(true);
		canvas.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Janela ej = new Janela();
	}	
}
