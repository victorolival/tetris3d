package org.yourorghere;

import java.awt.*;
import java.awt.event.*;

import com.sun.opengl.util.*;

import javax.swing.*;
import javax.media.opengl.*;

public class Animacao extends JFrame implements GLEventListener, 
					    KeyListener {
    public static final Dimension PREFERRED_FRAME_SIZE = new Dimension(250, 250);
	
    private int Object;
    private static float Xrot, Yrot, Zrot, Xstep, Ystep, Zstep;
    private static float Step = 5.0f;
    private float Scale = 1.0f;
		
    /** Constructor.
     */
    public Animacao() {
	// init JFrame
	super ("Spin");
	System.out.println("Constructor");
    }

    
    public Dimension getPreferredSize(){
	return PREFERRED_FRAME_SIZE;
    }

    /*
     * METHODS DEFINED BY GLEventListener
     */

    /** Called by drawable to initiate drawing. 
     *    Draw 2 diagonal lines to form an X
     */
    public void display(GLAutoDrawable drawable) {
	System.out.println("Display");
     
	if (this.isVisible()) {	
	    GL gl = drawable.getGL();

	    idle();
	    gl.glClear(GL.GL_COLOR_BUFFER_BIT);

	    gl.glPushMatrix();

	    gl.glTranslatef(0.0f, 0.0f, -10.0f);
	    gl.glScalef(Scale, Scale, Scale);
	    if (Xstep > 0.0f) {
		gl.glRotatef(Xrot, 1.0f, 0.0f, 0.0f);
	    } else if (Ystep > 0.0f) {
		gl.glRotatef(Yrot, 0.0f, 1.0f, 0.0f);
	    } else {
		gl.glRotatef(Zrot, 0.0f, 0.0f, 1.0f);
	    }

	    gl.glCallList(Object);

	    gl.glPopMatrix();
	  
	    gl.glFlush();
	    drawable.repaint(); /* Swap buffers */
	}
	  

    }

    /** Called by drawable to indicate mode or device has changed.
     */
    public void displayChanged(GLAutoDrawable drawable, 
			       boolean modeChanged, 
			       boolean deviceChanged){}
    
    /** Called after OpenGL is init'ed
     */
    
    public void init(GLAutoDrawable drawable) {

    	GL gl = drawable.getGL();

    	System.out.println("init()");
    	System.err.println("INIT GL IS: " + gl.getClass().getName());
    	System.err.println("GL_VENDOR: " + gl.glGetString(GL.GL_VENDOR));
    	System.err.println("GL_RENDERER: " + gl.glGetString(GL.GL_RENDERER));
    	System.err.println("GL_VERSION: " + gl.glGetString(GL.GL_VERSION));
    	
	Object = make_object(gl);
	gl.glCullFace(GL.GL_BACK);
	gl.glDisable(GL.GL_DITHER);
	gl.glShadeModel(GL.GL_FLAT);

	gl.glColor3f(1.0f, 1.0f, 1.0f);

	Xrot = Yrot = Zrot = 0.0f;
	Xstep = Step;
	Ystep = Zstep = 0.0f;
    }

    /** Called to indicate the drawing surface has been moved and/or resized.
     */
    public void reshape(GLAutoDrawable drawable, 
			int x, int y, 
			int width, int height){
    	
    	GL gl = drawable.getGL();

    	System.out.println("reshape()");

	gl.glViewport(0, 0, width, height);
	gl.glMatrixMode(GL.GL_PROJECTION);
	gl.glLoadIdentity();
	gl.glFrustum(-1.0f, 1.0f, -1.0f, 1.0f, 5.0f, 15.0f);
	gl.glMatrixMode(GL.GL_MODELVIEW);
    }

    /*
     * OUR HELPER METHODS
     */
    // What to do when the system is "idle"
    public static void idle ()
    {
	Xrot += Xstep;
	Yrot += Ystep;
	Zrot += Zstep;

	if (Xrot >= 360.0f) {
    	    Xrot = Xstep = 0.0f;
    	    Ystep = Step;
	} else if (Yrot >= 360.0f) {
    	    Yrot = Ystep = 0.0f;
    	    Zstep = Step;
	} else if (Zrot >= 360.0f) {
    	    Zrot = Zstep = 0.0f;
    	    Xstep = Step;
	}
    }
    
    // Method to construct the object
    public static int make_object(GL gl)
    {
	int list;
	  
	list = gl.glGenLists(1);

	gl.glNewList(list, GL.GL_COMPILE);

	gl.glBegin(GL.GL_LINE_LOOP);
	gl.glVertex3f(1.0f, 0.5f, -0.4f);
	gl.glVertex3f(1.0f, -0.5f, -0.4f);
	gl.glVertex3f(-1.0f, -0.5f, -0.4f);
	gl.glVertex3f(-1.0f, 0.5f, -0.4f);
	gl.glEnd();

	gl.glBegin(GL.GL_LINE_LOOP);
	gl.glVertex3f(1.0f, 0.5f, 0.4f);
	gl.glVertex3f(1.0f, -0.5f, 0.4f);
	gl.glVertex3f(-1.0f, -0.5f, 0.4f);
	gl.glVertex3f(-1.0f, 0.5f, 0.4f);
	gl.glEnd();

	gl.glEndList();

	return list;
    }

    
    // Methods required for the implementation of KeyListener      
    public void keyPressed(KeyEvent e){
        System.out.println("Key pressed");
        
        if (e.getKeyChar() == 27) {
    	    /*  Escape Key */
	    final Animator animator = new Animator((GLCanvas)(this.getContentPane().getComponentAt(0,0)));
	    // Run this on another thread than the AWT event queue to
	    // make sure the call to Animator.stop() completes before
	    // exiting
	    new Thread(new Runnable() {
		    public void run() {
			animator.stop();
			System.exit(0);
		    }
		}).start();
	}
    }

    public void keyReleased(KeyEvent e){}
      
    public void keyTyped(KeyEvent e){}
              
    /** main creates and shows a Surface-JFrame
     */
    public static void main(String[] args){

    	Animacao g = new Animacao(); 
    	//Set frame location
    	g.setLocation(100,100);
    	GLCapabilities gl_c = new GLCapabilities();
    	// Disable double buffer
    	gl_c.setDoubleBuffered(true);

    	// get a GLCanvas
    	GLCanvas canvas = new GLCanvas(gl_c);
    	// add a GLEventListener, which will get called when the
    	// canvas is resized or needs a repaint
    	canvas.addGLEventListener(g);
    	canvas.addKeyListener(g);
    	
    	// now add the canvas to the JFrame.  Note we use BorderLayout.CENTER
    	// to make the canvas stretch to fill the container (ie, the frame)
    	g.getContentPane().add(canvas, BorderLayout.CENTER);
	final Animator animator = new Animator(canvas);
	g.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
		    // Run this on another thread than the AWT event queue to
		    // make sure the call to Animator.stop() completes before
		    // exiting
		    new Thread(new Runnable() {
			    public void run() {
				animator.stop();
				System.exit(0);
			    }
			}).start();
		}
	    });


    	g.pack();
    	g.setVisible(true);
    }
}
