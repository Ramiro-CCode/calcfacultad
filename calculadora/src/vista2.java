import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vista2 {
    private JPanel vistapanel;
    private JTextField numero1;
    private JTextField numero2;
    private JButton botonsumar;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField resultado;

    public vista2() {
        botonsumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato1=numero1.getText();
                int num1=Integer.parseInt( dato1);
                int num2=Integer.parseInt(numero2.getText());
                suma ss=new suma();
                ss.setA(num1);
                ss.setB(num2);
                ss.sumar();

                resultado.setText(String.valueOf(ss.getC()));
            }
        });
    }

        public void setVisible(boolean b){
        JFrame frame=new JFrame("calculadora");
        frame.setContentPane(new vista2().vistapanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(b);
    }
}
