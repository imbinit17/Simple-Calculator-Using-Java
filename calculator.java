import java.awt.Font;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent ;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator implements ActionListener
{
    private static JFrame calcFrame ;
    private static JLabel stringLabel ;
    private static JLabel outputLabel ;

    private static JButton allClearBtn ;
    private static JButton divBtn ;
    private static JButton multiplyBtn ;
    private static JButton  subtractBtn ;
    private static JButton addBtn ;
    private static JButton clearBtn ;
    private static JButton equalsBtn ; 

    private static JButton num7 ;
    private static JButton num8 ;
    private static JButton num9 ;
    private static JButton num4 ;
    private static JButton num5 ;
    private static JButton num6 ;
    private static JButton num1 ;
    private static JButton num2 ;
    private static JButton num3 ;
    private static JButton num0 ;

    private static String quesString = "" ;
    private static String outputString = ""; 
    private static char op = '+';
    private static double num = 0.0D ;

    public static void launchFrame()
    {
        calcFrame = new JFrame("Calculator") ;
        calcFrame.setSize(280,280) ;
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() ;
        panel.setLayout(null);
        calcFrame.add(panel) ;

        stringLabel = new JLabel() ;
        stringLabel.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        stringLabel.setBounds(5,0,290,30);
        stringLabel.setFont(new Font("Serif",Font.CENTER_BASELINE,20)) ;
        panel.add(stringLabel) ;

        outputLabel = new JLabel() ;
        outputLabel.setBounds(5,30,290,30);
        outputLabel.setFont(new Font("Serif",Font.CENTER_BASELINE,20)) ;
        panel.add(outputLabel) ;

        allClearBtn = new JButton("ALL CLEAR") ;
        allClearBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        allClearBtn.setBounds(5,60,255,30) ;
        allClearBtn.addActionListener(new calculator()) ;
        panel.add(allClearBtn) ;

        num7 = new JButton("7") ;
        num7.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num7.setBounds(5,95,60,30) ;
        num7.addActionListener(new calculator());
        panel.add(num7) ;

        num8 = new JButton("8") ;
        num8.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num8.setBounds(70,95,60,30) ;
        num8.addActionListener(new calculator());
        panel.add(num8) ;

        num9 = new JButton("9") ;
        num9.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num9.setBounds(135,95,60,30) ;
        num9.addActionListener(new calculator());
        panel.add(num9) ;

        divBtn = new JButton("/") ;
        divBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        divBtn.setBounds(200,95,60,30) ;
        divBtn.addActionListener(new calculator());
        panel.add(divBtn) ;

        num4 = new JButton("4") ;
        num4.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num4.setBounds(5,130,60,30) ;
        num4.addActionListener(new calculator());
        panel.add(num4) ;

        num5 = new JButton("5") ;
        num5.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num5.setBounds(70,130,60,30) ;
        num5.addActionListener(new calculator());
        panel.add(num5) ;

        num6 = new JButton("6") ;
        num6.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num6.setBounds(135,130,60,30) ;
        num6.addActionListener(new calculator());
        panel.add(num6) ;

        multiplyBtn = new JButton("X") ;
        multiplyBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        multiplyBtn.setBounds(200,130,60,30) ;
        multiplyBtn.addActionListener(new calculator());
        panel.add(multiplyBtn) ;

        num1 = new JButton("1") ;
        num1.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num1.setBounds(5,165,60,30) ;
        num1.addActionListener(new calculator());
        panel.add(num1) ;

        num2 = new JButton("2") ;
        num2.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num2.setBounds(70,165,60,30) ;
        num2.addActionListener(new calculator());
        panel.add(num2) ;

        num3 = new JButton("3") ;
        num3.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num3.setBounds(135,165,60,30) ;
        num3.addActionListener(new calculator());
        panel.add(num3) ;

        subtractBtn = new JButton("-") ;
        subtractBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        subtractBtn.setBounds(200,165,60,30) ;
        subtractBtn.addActionListener(new calculator());
        panel.add(subtractBtn) ;

        num0 = new JButton("0") ;
        num0.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        num0.setBounds(5,200,60,30) ;
        num0.addActionListener(new calculator());
        panel.add(num0) ;

        ImageIcon img = new ImageIcon("C:\\Users\\Binit\\Desktop\\Calculator\\img.jpg") ;

        clearBtn = new JButton(img) ;
        clearBtn.setBounds(70,200,60,30) ;
        clearBtn.addActionListener(new calculator());
        panel.add(clearBtn) ;

        equalsBtn = new JButton("=") ;
        equalsBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        equalsBtn.setBounds(135,200,60,30) ;
        equalsBtn.addActionListener(new calculator());
        panel.add(equalsBtn) ;

        addBtn = new JButton("+") ;
        addBtn.setFont(new Font("Arial",Font.CENTER_BASELINE,20)) ;
        addBtn.setBounds(200,200,60,30) ;
        addBtn.addActionListener(new calculator());
        panel.add(addBtn) ;

        calcFrame.setVisible(true) ;
    }

    public static void main(String[] args) {
        launchFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource() ;
        if(obj==allClearBtn){
            quesString = "" ;
            outputString = "" ;
            stringLabel.setText(quesString);
            outputLabel.setText(outputString);
            op = '+' ;
            num = 0.0d ;
        }

        if(obj==num0){
            quesString += "0" ;
            stringLabel.setText(quesString);
        }

        if(obj==num1){
            quesString += "1" ;
            stringLabel.setText(quesString);
        }

        if(obj==num2){
            quesString += "2" ;
            stringLabel.setText(quesString);
        }

        if(obj==num3){
            quesString += "3" ;
            stringLabel.setText(quesString);
        }

        if(obj==num4){
            quesString += "4" ;
            stringLabel.setText(quesString);
        }

        if(obj==num5){
            quesString += "5" ;
            stringLabel.setText(quesString);
        }

        if(obj==num6){
            quesString += "6" ;
            stringLabel.setText(quesString);
        }

        if(obj==num7){
            quesString += "7" ;
            stringLabel.setText(quesString);
        }

        if(obj==num8){
            quesString += "8" ;
            stringLabel.setText(quesString);
        }

        if(obj==num9){
            quesString += "9" ;
            stringLabel.setText(quesString);
        }

        if(obj==clearBtn){
            if(quesString.length()>0)
            quesString = quesString.substring(0,quesString.length()-1) ;
            stringLabel.setText(quesString);
        }

        if(obj==addBtn){
            char ch = quesString.charAt(quesString.length()-1) ;
            if(Character.isDigit(ch)==false)
            quesString = quesString.substring(0,quesString.length()-1) ;

            quesString += "+" ;
            stringLabel.setText(quesString);
        }

        if(obj==subtractBtn){
            char ch = quesString.charAt(quesString.length()-1) ;
            if(Character.isDigit(ch)==false)
            quesString = quesString.substring(0,quesString.length()-1) ;

            quesString += "-" ;
            stringLabel.setText(quesString);
        }

        if(obj==multiplyBtn){
            char ch = quesString.charAt(quesString.length()-1) ;
            if(Character.isDigit(ch)==false)
            quesString = quesString.substring(0,quesString.length()-1) ;

            quesString += "*" ;
            stringLabel.setText(quesString);
        }

        if(obj==divBtn){
            char ch = quesString.charAt(quesString.length()-1) ;
            if(Character.isDigit(ch)==false)
            quesString = quesString.substring(0,quesString.length()-1) ;

            quesString += "/" ;
            stringLabel.setText(quesString);
        }

        if(obj==equalsBtn){
            update() ;
        }
    }

    public static void update()
    {
        num = 0.0D ;
        try{
            quesString = quesString + "+" ;
            String tempString = "" ;
            char ch ;
            double tempNum = 0.0d ;
            for(int i=0;i<quesString.length();i++)
            {
                ch = quesString.charAt(i) ;
                if(Character.isDigit(ch)==true){
                    tempString += ch ;
                }

                else{
                    tempNum = Double.parseDouble(tempString) ;
                    tempString = "" ;
                    if(op=='+'){
                        num += tempNum ;
                    }
                    
                    else if(op=='-'){
                        num -= tempNum ;
                    }

                    else if(op=='*'){
                        num *= tempNum ;
                    }

                    else if(op=='/'){
                        num /= tempNum ;
                    }
                    op = ch ;
                }
            }
            outputString = Double.toString(num) ;
            stringLabel.setText("");
            outputLabel.setText("="+outputString);
        }
            catch(Exception e){
                e.printStackTrace();
                System.exit(0) ;
            }
    }
}