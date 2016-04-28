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
	 * Construtor da classe Renderer que não recebe parâmetros.
	 */
	public Renderer()
	{
		// Especifica o ângulo da projeção perspectiva  
		angle=44;   
		// Inicializa o valor para correção de aspecto   
		fAspect = 1;    
                
                obsX=0;
		obsY=0; 
		obsZ=200;
	}

	/**
	 * Método definido na interface GLEventListener e chamado pelo objeto no qual será feito o desenho
	 * logo após a inicialização do contexto OpenGL. 
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
	 * Método definido na interface GLEventListener e chamado pelo objeto no qual será feito o desenho
	 * para começar a fazer o desenho OpenGL pelo cliente.
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
	 * Método definido na interface GLEventListener e chamado pelo objeto no qual será feito o desenho
	 * depois que a janela foi redimensionada.
	 */  
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)
	{
		gl.glViewport(0, 0, width, height);
		fAspect = (float)width/(float)height;      
	}

	/**
	 * Método definido na interface GLEventListener e chamado pelo objeto no qual será feito o desenho
	 * quando o modo de exibição ou o dispositivo de exibição associado foi alterado.
	 */  
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) { }

	/**
	 * Método usado para especificar a posição do observador virtual.
	 */    
	public void posicionaObservador()
	{
		// Especifica sistema de coordenadas do modelo
		gl.glMatrixMode(GL.GL_MODELVIEW);
		// Inicializa sistema de coordenadas do modelo
		gl.glLoadIdentity();
		// Especifica posição do observador e do alvo
                //define a câmera, isto é, através dos seus argumentos
                //é possível indicar a posição da câmera e para onde ela está direcionada
                //glu.gluLookAt(0.0,80.0,200.0, 0.0,0.0,0.0, 0.0,1.0,0.0); 
                glu.gluLookAt(obsX,obsY,obsZ, 0.0,0.0,0.0, 0.0,1.0,0.0);
                //Sua assinatura é: void gluLookAt(double eyeX, double eyeY, double eyeZ,
                //double centerX, double centerY, double centerZ, double upX, double upY, double upZ)
                //Os parâmetros: eyex, eyey e eyez são usados para definir as coordenadas x, y e z,
                //respectivamente, da posição da câmera (ou observador);
                //centerx, centery e centerz são usados para definir as coordenadas x, y e z,
                //respectivamente, da posição do alvo, isto é para onde o observador está olhando
                //(normalmente, o centro da cena);
                //upx, upy e upz são as coordenadas x, y e z, que estabelecem o vetor up 
                //(indica o "lado de cima" de uma cena 3D)
	}
   
	/**
	 * Método usado para especificar o volume de visualização.
	 */    
	public void especificaParametrosVisualizacao()
	{
		// Especifica sistema de coordenadas de projeção
		gl.glMatrixMode(GL.GL_PROJECTION);
		// Inicializa sistema de coordenadas de projeção
		gl.glLoadIdentity();

		// Especifica a projeção perspectiva(angulo,aspecto,zMin,zMax)
                //sua assinatura é gluPerspective(GLdouble fovy, GLdouble aspect,
                //GLdouble zNear, GLdouble zFar);
                glu.gluPerspective(angle, fAspect, 0.5, 500);
                // fovy é o ângulo, em graus, na direção y (usada para determinar
                //a "altura" do volume de visualização)
                //aspect é a razão de aspecto que determina a área de visualização
                //na direção x, e seu valor é a razão em x (largura) e y (altura)
                //zNear, que sempre tem que ter um valor positivo maior do que zero,
                //é a distância do observador até o plano de corte mais próximo (em z)
                //zFar, que também sempre tem que ter um valor positivo maior do
                //que zero, é a distância do observador até o plano de corte mais
                //afastado (em z)
                
		

		posicionaObservador();
	}

	/**
	 * Método da classe MouseAdapter que está sendo sobrescrito para gerenciar os 
	 * eventos de clique de mouse, de maneira que sejá feito zoom in e zoom out.
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
	 * Método definido na interface KeyListener que está sendo implementado para, 
	 * de acordo com as teclas pressionadas, permitir mover a posição do observador
	 * virtual.
	 */        
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode())
		{ 
			case KeyEvent.VK_ESCAPE:	
                                        break;
                                        
                        //estas alterações possibilitaram alterar a posição
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
	 * Método definido na interface KeyListener.
	 */      
	public void keyTyped(KeyEvent e) { }

	/**
	 * Método definido na interface KeyListener.
	 */       
	public void keyReleased(KeyEvent e) { }
}

