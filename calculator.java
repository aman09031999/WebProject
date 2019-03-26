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
            Button add = new Button("+");        
            Button sub = new Button("-");
            Button div = new Button("/");
            Button mul = new Button("*");
            Button equal = new Button("=");
            Button clear = new Button("CLEAR");

            GridLayout grid = new GridLayout(5,4);

            setLayout(grid);
            
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b10);
            add(add);
            add(sub);
            add(mul);
            add(div);
            add(equal);

        }
        
        
        
    }
