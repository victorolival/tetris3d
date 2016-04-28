package org.yourorghere;


import java.awt.event.*; 

import javax.media.opengl.*;
import javax.media.opengl.glu.*;
import com.sun.opengl.util.*;

public class Renderer extends MouseAdapter implements GLEventListener, KeyListener
{
	// Atributos
	private GL gl;
	private GLU glu;
	private GLUT glut;
	private GLAutoDrawable glDrawable;
	private double angle, fAspect;
        
        private double obsX, obsY, obsZ;

	/**
	 * Construtor da classe Renderer que n�o recebe par�metros.
	 */
	public Renderer()
	{
		// Especifica o �ngulo da proje��o perspectiva  
		angle=44;   
		// Inicializa o valor para corre��o de aspecto   
		fAspect = 1;    
                
                obsX=0;
		obsY=0; 
		obsZ=200;
	}

	/**
	 * M�todo definido na interface GLEventListener e chamado pelo objeto no qual ser� feito o desenho
	 * logo ap�s a inicializa��o do contexto OpenGL. 
	 */    
	public void init(GLAutoDrawable drawable)
	{
		glDrawable = drawable;
		gl = drawable.getGL();      
		glu = new GLU();
		glut = new GLUT();

		drawable.setGL(new DebugGL(gl));        

		gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		gl.glEnable(GL.GL_DEPTH_TEST);         
	}

    public void desenhaChao()
    {
        gl.glColor3f(1,0,1);
        gl.glLineWidth(3);
        gl.glBegin(GL.GL_LINES);
        for(float z=-1000; z<=1000; z+=10)
        {
            gl.glVertex3f(-1000,-0.1f,z);
            gl.glVertex3f( 1000,-0.1f,z);
        }
        for(float x=-1000; x<=1000; x+=10)
        {
            gl.glVertex3f(x,-0.1f,-1000);
            gl.glVertex3f(x,-0.1f,1000);
        }
        gl.glEnd();
        gl.glLineWidth(1);
    }
    
	/**
	 * M�todo definido na interface GLEventListener e chamado pelo objeto no qual ser� feito o desenho
	 * para come�ar a fazer o desenho OpenGL pelo cliente.
	 */  
	public void display(GLAutoDrawable drawable)
	{
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT );
		gl.glLoadIdentity();    

		especificaParametrosVisualizacao(); 

		gl.glColor3f(0.0f, 0.0f, 1.0f);

		glut.glutWireTeapot(35); 
		gl.glTranslatef(0,-28,0);
		desenhaChao();
	}

	/**
	 * M�todo definido na interface GLEventListener e chamado pelo objeto no qual ser� feito o desenho
	 * depois que a janela foi redimensionada.
	 */  
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)
	{
		gl.glViewport(0, 0, width, height);
		fAspect = (float)width/(float)height;      
	}

	/**
	 * M�todo definido na interface GLEventListener e chamado pelo objeto no qual ser� feito o desenho
	 * quando o modo de exibi��o ou o dispositivo de exibi��o associado foi alterado.
	 */  
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) { }

	/**
	 * M�todo usado para especificar a posi��o do observador virtual.
	 */    
	public void posicionaObservador()
	{
		// Especifica sistema de coordenadas do modelo
		gl.glMatrixMode(GL.GL_MODELVIEW);
		// Inicializa sistema de coordenadas do modelo
		gl.glLoadIdentity();
		// Especifica posi��o do observador e do alvo
                //define a c�mera, isto �, atrav�s dos seus argumentos
                //� poss�vel indicar a posi��o da c�mera e para onde ela est� direcionada
                //glu.gluLookAt(0.0,80.0,200.0, 0.0,0.0,0.0, 0.0,1.0,0.0); 
                glu.gluLookAt(obsX,obsY,obsZ, 0.0,0.0,0.0, 0.0,1.0,0.0);
                //Sua assinatura �: void gluLookAt(double eyeX, double eyeY, double eyeZ,
                //double centerX, double centerY, double centerZ, double upX, double upY, double upZ)
                //Os par�metros: eyex, eyey e eyez s�o usados para definir as coordenadas x, y e z,
                //respectivamente, da posi��o da c�mera (ou observador);
                //centerx, centery e centerz s�o usados para definir as coordenadas x, y e z,
                //respectivamente, da posi��o do alvo, isto � para onde o observador est� olhando
                //(normalmente, o centro da cena);
                //upx, upy e upz s�o as coordenadas x, y e z, que estabelecem o vetor up 
                //(indica o "lado de cima" de uma cena 3D)
	}
   
	/**
	 * M�todo usado para especificar o volume de visualiza��o.
	 */    
	public void especificaParametrosVisualizacao()
	{
		// Especifica sistema de coordenadas de proje��o
		gl.glMatrixMode(GL.GL_PROJECTION);
		// Inicializa sistema de coordenadas de proje��o
		gl.glLoadIdentity();

		// Especifica a proje��o perspectiva(angulo,aspecto,zMin,zMax)
                //sua assinatura � gluPerspective(GLdouble fovy, GLdouble aspect,
                //GLdouble zNear, GLdouble zFar);
                glu.gluPerspective(angle, fAspect, 0.5, 500);
                // fovy � o �ngulo, em graus, na dire��o y (usada para determinar
                //a "altura" do volume de visualiza��o)
                //aspect � a raz�o de aspecto que determina a �rea de visualiza��o
                //na dire��o x, e seu valor � a raz�o em x (largura) e y (altura)
                //zNear, que sempre tem que ter um valor positivo maior do que zero,
                //� a dist�ncia do observador at� o plano de corte mais pr�ximo (em z)
                //zFar, que tamb�m sempre tem que ter um valor positivo maior do
                //que zero, � a dist�ncia do observador at� o plano de corte mais
                //afastado (em z)
                
		

		posicionaObservador();
	}

	/**
	 * M�todo da classe MouseAdapter que est� sendo sobrescrito para gerenciar os 
	 * eventos de clique de mouse, de maneira que sej� feito zoom in e zoom out.
	 */  
	public void mouseClicked(MouseEvent e)
	{
		if (e.getButton() == MouseEvent.BUTTON1) // Zoom in
		if (angle >= 4) angle -= 4;
		if (e.getButton() == MouseEvent.BUTTON3) // Zoom out
		if (angle <= 72) angle += 4;
		glDrawable.display();
	}

	/**
	 * M�todo definido na interface KeyListener que est� sendo implementado para, 
	 * de acordo com as teclas pressionadas, permitir mover a posi��o do observador
	 * virtual.
	 */        
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode())
		{ 
			case KeyEvent.VK_ESCAPE:	
                                        break;
                                        
                        //estas altera��es possibilitaram alterar a posi��o
                        //do observador mantendo sempre o mesmo alvo.
                        case KeyEvent.VK_LEFT:	obsX -=10;
					break;
                        case KeyEvent.VK_RIGHT:	obsX +=10;
					break;
                        case KeyEvent.VK_UP:	obsY +=10;
					break;
                        case KeyEvent.VK_DOWN:	obsY -=10;
					break;
                        case KeyEvent.VK_HOME:	obsZ +=10;
					break;
                        case KeyEvent.VK_END:	obsZ -=10;
					break;
										 										
                }
		glDrawable.display(); 
	
	}

	/**
	 * M�todo definido na interface KeyListener.
	 */      
	public void keyTyped(KeyEvent e) { }

	/**
	 * M�todo definido na interface KeyListener.
	 */       
	public void keyReleased(KeyEvent e) { }
}

