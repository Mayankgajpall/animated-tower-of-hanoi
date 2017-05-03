import java.awt.Graphics;
import java.awt.Color;
import java.applet.Applet;
public class firstLine extends Applet
{
int x1=156, x2=100;/*initial pixel of disc 1*/ 
int y1=146, y2=115;/*initial pixel of disc 2*/ 
int z1=136, z2=130;/*initial pixel of disc 3*/ 
int r=0,r1=0,r2=0,r3=0;
	public void paint(Graphics g)
	{
		g.drawLine(0,200,500,200);
		g.setColor(Color.red);
		g.fillRect(250,100,20,100);
		g.fillRect(175,100,20,100);	
                g.fillRect(325,100,20,100);
		g.setColor(Color.pink);
		g.fillOval(y1,y2,70,15);
		g.fillOval(z1,z2,80,15);
                g.fillOval(x1,x2,60,15);
		if(x1<=231&&x2>=25&&r1==0)    /* moving disc 1 above*/ 
		{
		   g.fillOval(x1,x2,60,15);
		   x2-=1;
		   x1+=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(x1<=306&&x2<=102&&r==0)   /* moving disc 1 down*/
		{
		    g.fillOval(x1,x2,60,15);
		    x2+=1;
		    x1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(y1<=183&&y2>=78)  /* moving disc 2 above*/
		{	
		    g.fillOval(y1,y2,60,15);
		    y2-=1;
		    y1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(y1<=221&&y2<=116)   /* moving disc 2 above*/
		{
		    g.fillOval(y1,y2,60,15);
		    y2+=1;
		    y1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(x1>=269&&x2>=65&&r3==0)   /* moving disc 1 above*/
		{
		    r=1;
		    g.fillOval(x1,x2,60,15);
		    x2-=1;
		    x1-=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(x1>=233&&x2<=100&&r3==0)   /* moving disc 1 down*/
		{
		   g.fillOval(x1,x2,60,15); 
		   x2+=1;
		   x1-=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(z1<=211&&z2>=55)    /* moving disc 3 above*/
		{
		   g.fillOval(z1,z2,60,15); 
		   z2-=1;
		   z1+=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(z1<=288&&z2<=132)   /* moving disc 3 down*/
		{
		   g.fillOval(z1,z2,60,15); 
		   z2+=1;
		   z1+=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(x1>=195&&x2>=63&&r3==0)   /* moving disc 1 above*/
		{
		    r1=1;
		    g.fillOval(x1,x2,60,15);
		    x2-=1;
		    x1-=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(x1>156&&x2<100&&r2==0)     /* moving disc 1 down*/
		{
		   g.fillOval(x1,x2,60,15); 
		   x2+=1;
		   x1-=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(y1<=258&&y2>=79)      /* moving disc 2 above*/
		{	
		    g.fillOval(y1,y2,60,15);
		    y2-=1;
		    y1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(y1<=296&&y2<=115)     /* moving disc 2 down*/
		{
		    g.fillOval(y1,y2,60,15);
		    y2+=1;
		    y1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
		else if(x1<231&&x2>25)    /* moving disc 1 above*/
		{
		   r2=1;
		   g.fillOval(x1,x2,60,15);
		   x2-=1;
		   x1+=1;
	           try{Thread.sleep(10);}catch(Exception e){}	 
		   repaint();
		}
		else if(x1<=306&&x2<=102)  /* moving disc 1 down*/
		{
		    r3=1;
		    g.fillOval(x1,x2,60,15);
		    x2+=1;
		    x1+=1;
	            try{Thread.sleep(10);}catch(Exception e){}	 
		    repaint();
		    
		}
	}
}
	