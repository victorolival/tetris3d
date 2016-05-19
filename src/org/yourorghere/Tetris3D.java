package org.yourorghere;

import javax.media.opengl.GL;



public class Tetris3D {
    
     private GL gl;
     Tetris3D(GL gl){
         this.gl = gl;
         
     }
    
    
     public void desenhajogo(GL gl) {
        
         
         

        // Clear the drawing area
        //gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        
        //----------------------------------PEÇA1--------------------------------------------------------------
        
        
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
      
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
      
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();        
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
      
        gl.glPushMatrix();
        gl.glTranslatef(0.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
      
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA1--------------------------------------------------------------
        
        //----------------------------------PEÇA2--------------------------------------------------------------
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, 0.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-4.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,1.0f,0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA2--------------------------------------------------------------
        
        //----------------------------------PEÇA3--------------------------------------------------------------
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(6.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA3--------------------------------------------------------------
        
        //----------------------------------PEÇA4--------------------------------------------------------------
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(10.0f, 0.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
     //   gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(12.0f, 0.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(12.0f, 2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(12.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f,0.0f,1.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f,0.0f,1.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA4--------------------------------------------------------------
        
        //----------------------------------PEÇA5--------------------------------------------------------------
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-12.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 0.65f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-10.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 0.65f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-8.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 0.65f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-8.0f, 4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 0.65f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 0.65f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 0.65f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA5--------------------------------------------------------------
        
        //----------------------------------PEÇA6--------------------------------------------------------------
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-12.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 1.0f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
     //   gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-12.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 1.0f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
     //   gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-10.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 1.0f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
     //   gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(-10.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(1.0f, 1.0f, 0.0f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(1.0f, 1.0f, 0.0f);		// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(1.0f, 1.0f, 0.0f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA6--------------------------------------------------------------
        
        //----------------------------------PEÇA7--------------------------------------------------------------
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(2.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.73f, 0.33f, 0.83f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.73f, 0.33f, 0.83f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(6.0f, 6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.73f, 0.33f, 0.83f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(4.0f, 4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.73f, 0.33f, 0.83f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.73f, 0.33f, 0.83f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.73f, 0.33f, 0.83f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA7--------------------------------------------------------------
        
        //----------------------------------PEÇA8--------------------------------------------------------------
        
       // gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(10.0f, -2.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.18f, 0.55f, 0.34f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
      //  gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(10.0f, -4.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.18f, 0.55f, 0.34f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(10.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.18f, 0.55f, 0.34f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //gl.glLoadIdentity();
        
        //gl.glRotatef(rquad, 1.0f, 1.0f, 1.0f);
        
        gl.glPushMatrix();
        gl.glTranslatef(12.0f, -6.0f, -20.0f);
        gl.glBegin(GL.GL_QUADS);
        
        // Draw A Quad
        gl.glColor3f(0.18f, 0.55f, 0.34f);		// Set The Color To Green
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Top)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Bottom Left Of The Quad (Top)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Bottom Right Of The Quad (Top)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Orange
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Top Right Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Top Left Of The Quad (Bottom)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Bottom)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Bottom)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Red
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Front)
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Front)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Front)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Front)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Yellow
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Back)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Back)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Back)
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Back)

        gl.glColor3f(0.18f, 0.55f, 0.34f);	// Set The Color To Blue
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);			// Top Right Of The Quad (Left)
        gl.glVertex3f(-1.0f, 1.0f,-1.0f);			// Top Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f,-1.0f);			// Bottom Left Of The Quad (Left)
        gl.glVertex3f(-1.0f,-1.0f, 1.0f);			// Bottom Right Of The Quad (Left)

        gl.glColor3f(0.18f, 0.55f, 0.34f);			// Set The Color To Violet
        gl.glVertex3f( 1.0f, 1.0f,-1.0f);			// Top Right Of The Quad (Right)
        gl.glVertex3f( 1.0f, 1.0f, 1.0f);			// Top Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f, 1.0f);			// Bottom Left Of The Quad (Right)
        gl.glVertex3f( 1.0f,-1.0f,-1.0f);			// Bottom Right Of The Quad (Right)
        gl.glEnd();
        gl.glPopMatrix();
        
        //----------------------------------PEÇA8--------------------------------------------------------------
        
       
        
        
        gl.glFlush();
        
        
        
        }
  
    
    
    
}
