package FinalSlider;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;



public class SliderDemo extends JFrame{

	
		
	//creates sliders(blue is scroll bar) , labels, and panels 
		JScrollBar redSlider;
		JScrollBar greenSlider;
		JScrollBar blueSlider;
		
		JLabel redLabel;
		JLabel greenLabel;
		JLabel blueLabel;
		
		JPanel colorPanel;
		JPanel sliders;
		JPanel labels;
		JPanel slidersAndlabels;
		
		int redv = 0, bluv = 0, grnv = 0;
		
		public SliderDemo(){
			redSlider = new JScrollBar(JScrollBar.HORIZONTAL, redv, 30, 0, 285);
			greenSlider = new JScrollBar(JScrollBar.HORIZONTAL, grnv, 30, 0, 285);
			blueSlider = new JScrollBar(JScrollBar.HORIZONTAL, bluv, 30, 0, 285 );
		
			redLabel = new JLabel("Red = 0");
			greenLabel = new JLabel("Green = 0");
			blueLabel = new JLabel("Blue = 0");
		
			//creates event
			Listener e = new Listener();
			
			redSlider.addAdjustmentListener(e);
			greenSlider.addAdjustmentListener(e);
			blueSlider.addAdjustmentListener(e);
		
			colorPanel = new JPanel();
			colorPanel.setBackground(Color.BLACK);
			
			//container holds all panels
			
			Container container = this.getContentPane();
			//CHECK WORK change gridlayout
			container.setLayout(new GridLayout(2,1,3,3));
			
			sliders = new JPanel();
			labels = new JPanel();
			slidersAndlabels = new JPanel();
			
			container.add(colorPanel);
			//adds to grid and makes the look
			//container.add(sliders);
			container.add(slidersAndlabels);
			//container.add(labels);
			
			slidersAndlabels.add(labels);
			slidersAndlabels.add(sliders);
			
			slidersAndlabels.setLayout(new GridLayout(1,3,2,2));
			
			sliders.setBorder(new CompoundBorder(new TitledBorder("Choose Colors"), new EmptyBorder(2,2,2,2)));
			sliders.setLayout(new GridLayout(3,1,2,2));
			sliders.add(redSlider);
			sliders.add(greenSlider);
			sliders.add(blueSlider);
			
			labels.setLayout(new GridLayout(3,1,1,1));
			labels.add(redLabel);
			labels.add(greenLabel);
			labels.add(blueLabel);
			
		}
		/*
		//new class for ChangeListener
		public class Listener implements AdjustmentListener{
			public void stateChanged(ChangeEvent e){
				int r = redSlider.getValue();
				int g = greenSlider.getValue();
				int b = blueSlider.getValue();
			
				redLabel.setText("Red = " + r);
				greenLabel.setText("Green = " + g);
				blueLabel.setText("Blue = " + b);
			
				
				colorPanel.setBackground(new Color(r,g,b));
				
			}*/

		public class Listener implements AdjustmentListener{
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				// TODO Auto-generated method stub
				
					int r = redSlider.getValue();
					int g = greenSlider.getValue();
					int b = blueSlider.getValue();
				
					redLabel.setText("Red = " + r);
					greenLabel.setText("Green = " + g);
					blueLabel.setText("Blue = " + b);
				
					
					colorPanel.setBackground(new Color(r,g,b));
					
				
			}
		}
}
