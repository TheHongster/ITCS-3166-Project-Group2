
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class GUI implements ActionListener {
	public static void main(String[] args) {
		Main m = new Main();
		//Logic
		m.IPAddressBinary = m.convertToBinaryOctets(m.IPAddress);
		m.subnetMaskBinary = m.convertToBinaryOctets(m.subnetMask);
			for(int i = 0; i < 4; i++) {//Assigns IPAddressBinary's values to networkAddressBinary values
				m.networkAddressBinary[i] = m.IPAddressBinary[i];
			}
		m.calcBinaryNetworkAddress(m.networkAddressBinary, m.subnetMaskBinary);
		m.networkAddress = m.convertToDecimalAddress(m.networkAddressBinary);

		JFrame f = new JFrame("ActionListener Example");  
	    TextField tf = new TextField();  
	    tf.setBounds(105,105,150,20);  
	    Button b=new Button("Click Here");  
	    b.setBounds(50,100,60,30);  
	    b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		tf.setText("Welcome to Javatpoint."); 
	    	}
	    });
	    f.add(b);f.add(tf);  
	    f.setTitle("IP Router");
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
        
	}
}

