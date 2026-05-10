import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class cal implements ActionListener {
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    
    JTextField result;
    
    JLabel title;
     
    String firstvalue , operator , aftervalue;
     
    Double firstdoublevalue ,afterdoublevalue ,total;
    
    cal(){
        
        //    Calculator Frame
        JFrame frame = new JFrame();
        frame.setSize(420,510);
        frame.setTitle("Calculator");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //    Add Fonts
        Font f1 = new Font("Verdana",Font.BOLD,10);
        Font f2 = new Font("Verdana", Font.PLAIN,25);
        Font f3 = new Font("verdana", Font.PLAIN,40);
        Font f4 = new Font("SansSerif", Font.BOLD,28);

        
        //    Header Panel
        JPanel header = new JPanel(new BorderLayout()); 
        title = new JLabel(" STANDARD CALCULATOR", Label.LEFT);
        title.setFont(f1);
        header.add(title, BorderLayout.WEST);
        header.setBackground(Color.white);

       
        
        //    Result Panel
        JPanel panel = new JPanel();
       
        result = new JTextField(10);
        result.setFont(f3);
        result.setText("0");
        result.setEditable(false);
        result.setFocusable(false);
        result.setBackground(Color.white);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setBorder(BorderFactory.createLineBorder(Color.PINK, 2));
        

        
        panel.setBackground(Color.white);
        panel.add(result);
        
        
        //      Buttons Panel
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.white);
        GridLayout g1 = new GridLayout(6, 4, 3, 3);
        
        b1 = new JButton("CE");
        b1.setFont(f4);
        b1.setPreferredSize(new Dimension(40, 60));
        b1.setBackground(Color.decode("#fcf0f4"));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFocusPainted(false); 

        

        b2 = new JButton("C");
        b2.setFont(f4);
        b2.setBackground(Color.decode("#fcf0f4"));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setFocusPainted(false); 

        b3 = new JButton("\u232B");
        b3.setFont(f4);
        b3.setBackground(Color.decode("#fcf0f4"));
        b3.setBorder(BorderFactory.createEmptyBorder()); 
        b3.setFocusPainted(false);

        b4 = new JButton("%");
        b4.setFont(f4);
        b4.setBackground(Color.decode("#fcf0f4"));
        b4.setBorder(BorderFactory.createEmptyBorder()); 
        b4.setFocusPainted(false);

        b5 = new JButton("1/x");
        b5.setFont(f4);
        b5.setBackground(Color.decode("#fcf0f4"));
        b5.setBorder(BorderFactory.createEmptyBorder()); 
        b5.setFocusPainted(false);

        b6 = new JButton("x\u00B2");
        b6.setFont(f4);
        b6.setBackground(Color.decode("#fcf0f4"));
        b6.setBorder(BorderFactory.createEmptyBorder()); 
        b6.setFocusPainted(false);

        b7 = new JButton("\u221Ax");
        b7.setFont(f4);
        b7.setBackground(Color.decode("#fcf0f4"));
        b7.setBorder(BorderFactory.createEmptyBorder()); 
        b7.setFocusPainted(false);

        b8 = new JButton("/");
        b8.setFont(f4);
        b8.setBackground(Color.decode("#fcf0f4"));
        b8.setBorder(BorderFactory.createEmptyBorder()); 
        b8.setFocusPainted(false);

        b9 = new JButton("7");
        b9.setFont(f2);
        b9.setBackground(Color.decode("#fcf0f4"));
        b9.setBorder(BorderFactory.createEmptyBorder()); 
        b9.setFocusPainted(false);

        b10 = new JButton("8");
        b10.setFont(f2);
        b10.setBackground(Color.decode("#fcf0f4"));
        b10.setBorder(BorderFactory.createEmptyBorder()); 
        b10.setFocusPainted(false);

        b11 = new JButton("9");
        b11.setFont(f2);
        b11.setBackground(Color.decode("#fcf0f4"));
        b11.setBorder(BorderFactory.createEmptyBorder()); 
        b11.setFocusPainted(false);

        b12 = new JButton("*");
        b12.setFont(f4);
        b12.setBackground(Color.decode("#fcf0f4"));
        b12.setBorder(BorderFactory.createEmptyBorder()); 
        b12.setFocusPainted(false);

        b13 = new JButton("4");
        b13.setFont(f2);
        b13.setBackground(Color.decode("#fcf0f4"));
        b13.setBorder(BorderFactory.createEmptyBorder()); 
        b13.setFocusPainted(false);

        b14 = new JButton("5");
        b14.setFont(f2);
        b14.setBackground(Color.decode("#fcf0f4"));
        b14.setBorder(BorderFactory.createEmptyBorder()); 
        b14.setFocusPainted(false);

        b15 = new JButton("6");
        b15.setFont(f2);
        b15.setBackground(Color.decode("#fcf0f4"));
        b15.setBorder(BorderFactory.createEmptyBorder()); 
        b15.setFocusPainted(false);

        b16 = new JButton("-");
        b16.setFont(f4);
        b16.setBackground(Color.decode("#fcf0f4"));
        b16.setBorder(BorderFactory.createEmptyBorder()); 
        b16.setFocusPainted(false);

        b17 = new JButton("1");
        b17.setFont(f2);
        b17.setBackground(Color.decode("#fcf0f4"));
        b17.setBorder(BorderFactory.createEmptyBorder()); 
        b17.setFocusPainted(false);

        b18 = new JButton("2");
        b18.setFont(f2);
        b18.setBackground(Color.decode("#fcf0f4"));
        b18.setBorder(BorderFactory.createEmptyBorder()); 
        b18.setFocusPainted(false);

        b19 = new JButton("3");
        b19.setFont(f2);
        b19.setBackground(Color.decode("#fcf0f4"));
        b19.setBorder(BorderFactory.createEmptyBorder()); 
        b19.setFocusPainted(false);

        b20 = new JButton("+");
        b20.setFont(f4);
        b20.setBackground(Color.decode("#fcf0f4"));
        b20.setBorder(BorderFactory.createEmptyBorder()); 
        b20.setFocusPainted(false);

        b21 = new JButton("+/-");
        b21.setFont(f4);
        b21.setBackground(Color.decode("#fcf0f4"));
        b21.setBorder(BorderFactory.createEmptyBorder()); 
        b21.setFocusPainted(false);

        b22 = new JButton("0");
        b22.setFont(f2);
        b22.setBackground(Color.decode("#fcf0f4"));
        b22.setBorder(BorderFactory.createEmptyBorder()); 
        b22.setFocusPainted(false);

        b23 = new JButton(".");
        b23.setFont(f4);
        b23.setBackground(Color.decode("#fcf0f4"));
        b23.setBorder(BorderFactory.createEmptyBorder()); 
        b23.setFocusPainted(false);

        b24 = new JButton("=");
        b24.setBackground(Color.pink);
        b24.setFont(f4);
        b24.setBorder(BorderFactory.createEmptyBorder()); 
        b24.setFocusPainted(false);
        
                
        panel2.setLayout(g1);
        
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        panel2.add(b9);
        panel2.add(b10);
        panel2.add(b11);
        panel2.add(b12);
        panel2.add(b13);
        panel2.add(b14);
        panel2.add(b15);
        panel2.add(b16);
        panel2.add(b17);
        panel2.add(b18);
        panel2.add(b19);
        panel2.add(b20);
        panel2.add(b21);
        panel2.add(b22);
        panel2.add(b23);
        panel2.add(b24);
       
       
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
       
        
        
        frame.add(header,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);

       
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

     

    @Override
    public void actionPerformed(ActionEvent d) {
        Object o = d.getSource();
        
        if(result.getText().equals("0")){
            result.setText("");
        }
        
        
            
            //  Numbers 
        if(o.equals(b17)){                                         // 1  
            result.setText(result.getText() + b17.getLabel());
        }else if(o.equals(b18)){                                   // 2 
            result.setText(result.getText() + b18.getLabel());
        }else if(o.equals(b19)){                                   // 3  
            result.setText(result.getText() + b19.getLabel());
        }else if(o.equals(b13)){                                   // 4  
            result.setText(result.getText() + b13.getLabel());
        }else if(o.equals(b14)){                                   // 5  
            result.setText(result.getText() + b14.getLabel());
        }else if(o.equals(b15)){                                   // 6 
            result.setText(result.getText() + b15.getLabel());
        }else if(o.equals(b9)){                                    // 7  
            result.setText(result.getText() + b9.getLabel());
        }else if(o.equals(b10)){                                   // 8  
            result.setText(result.getText() + b10.getLabel());
        }else if(o.equals(b11)){                                   // 9  
            result.setText(result.getText() + b11.getLabel());
        }else if(o.equals(b22)){                                   // 0 
            result.setText(result.getText() + b22.getLabel());
        
        // Clear button
        }else if (o.equals(b2)) {
            result.setText("0");
            firstvalue = operator = aftervalue = null;
        }

        // Backspace button
        else if (o.equals(b3)) {
            String current = result.getText();
            if (!current.isEmpty()) {
                result.setText(current.substring(0, current.length() - 1));
            }
        }

        // CE (Clear Entry)
        else if (o.equals(b1)) {
            result.setText("0");
            
        
        
        //     Single Operations
        }else if(o.equals(b5)){                                   // 1/x 
            try {
                double value = Double.parseDouble(result.getText());
                if (value == 0) {
                    result.setText("∞");  // can't divide by zero
                } else {
                    result.setText((1 / value) + "");
                }
            } catch (Exception e) {
                result.setText("Error");
            }
                
        }else if(o.equals(b6)){                                   // x2 
            try {
                double value = Double.parseDouble(result.getText());
                result.setText((value * value) + "");
            } catch (Exception e) {
                result.setText("Error");
            }
            
        }else if(o.equals(b7)){                                   // √x
            try {
                double value = Double.parseDouble(result.getText());
                if (value < 0) {
                    result.setText("Invalid"); // can't sqrt negative
                } else {
                    result.setText(Math.sqrt(value) + "");
                }
            } catch (Exception e) {
                result.setText("Error");
            }
            
        }else if(o.equals(b4)){                                   // %
            try {
                double value = Double.parseDouble(result.getText());
                result.setText((value / 100) + "");
            } catch (Exception e) {
                result.setText("Error");
            }
        } else if(o.equals(b21)) {                                //  +/-
            try {
                double value = Double.parseDouble(result.getText());
                value = -value;
                result.setText(value + "");
            } catch (Exception e) {
                result.setText("Error");
            }
        } else if(o.equals(b23)) { // .
            if (!result.getText().contains(".")) {
                result.setText(result.getText() + ".");
            }


        
        
        //        Operators
        }else if(o.equals(b8)){                                   // / 
            firstvalue = result.getText();
            operator = b8.getLabel();
            result.setText("");
        }else if(o.equals(b12)){                                   // * 
            firstvalue = result.getText();
            operator = b12.getLabel();
            result.setText("");
        }else if(o.equals(b16)){                                   // - 
            firstvalue = result.getText();
            operator = b16.getLabel();
            result.setText("");
        }else if(o.equals(b20)){                                   // + 
            firstvalue = result.getText();
            operator = b20.getLabel();
            result.setText("");
            
        
        //      Pressing Equal button
        }else if(o.equals(b24)){                                   
            
            aftervalue = result.getText();
            result.setText("");
             
            firstdoublevalue = Double.parseDouble(firstvalue);
            afterdoublevalue = Double.parseDouble(aftervalue);
                //  Operators 
            
            if(operator.equals("+")){                          // +
                total = firstdoublevalue + afterdoublevalue;
                result.setText(total +"");
            }
            if(operator.equals("-")){                          // -
                total = firstdoublevalue - afterdoublevalue;
                result.setText(total +"");
            }
            if(operator.equals("*")){                          // *
                total = firstdoublevalue * afterdoublevalue;
                result.setText(total +"");
            }if(operator.equals("/")){                         // /
                
                total = firstdoublevalue / afterdoublevalue;
                result.setText(total +"");
            }
            
        }
        
    }
    
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
}

public class calculator {
    public static void main(String[] args) {
        new cal().setVisible(true); 
    }
}
