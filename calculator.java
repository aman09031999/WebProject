package calculator;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*  <applet code = "Calculator" width = 100 height = 200>
*/

public class Calculator extends Applet 
{
        final TextField field = new TextField();

        public void init()
        {
            Button b1 = new Button("1");
            Button b2 = new Button("2");
            Button b3 = new Button("3");
            Button b4 = new Button("4");
            Button b5 = new Button("5");        
            Button b6 = new Button("6");
            Button b7 = new Button("7");
            Button b8 = new Button("8");
            Button b9 = new Button("9");
            Button b10 = new Button("10");        
            Button b11 = new Button("+");        
            Button b12 = new Button("-");
            Button b14 = new Button("/");
            Button b15 = new Button("*");
            Button b16 = new Button("=");
            Button b17 = new Button("CLEAR");

            GridLayout grid = new GridLayout(5,4);

            setLayout(grid);
            
            add(b1);
            add(b1);
        }
        
        
        
    }
