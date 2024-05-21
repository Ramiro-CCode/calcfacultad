import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vista {
    private JPanel panelvistas;
    private JTextField numero1;
    private JTextField numero2;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton dividirButton;
    private JButton multiplicarButton;
    private JTextField resultado;
    private JButton button1;


    public vista() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                suma ss=new suma();
                int data1,data2;
                data1= Integer.parseInt(numero1.getText());
                data2= Integer.parseInt(numero2.getText());
                ss.setA(data1);
                ss.setB(data2);
                ss.sumar();
                double result=ss.getC();
                String otro=String.valueOf(result);
                resultado.setText(otro);
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resta ss=new resta();
                int data1,data2;
                data1= Integer.parseInt(numero1.getText());
                data2= Integer.parseInt(numero2.getText());
                ss.setA(data1);
                ss.setB(data2);
                ss.restar();
                int result=ss.getC();
                String otro=String.valueOf(result);
                resultado.setText(otro);
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicar ss=new multiplicar();
                int data1,data2;
                data1= Integer.parseInt(numero1.getText());
                data2= Integer.parseInt(numero2.getText());
                ss.setA(data1);
                ss.setB(data2);
                ss.multiplica();
                int result=ss.getC();
                String otro=String.valueOf(result);
                resultado.setText(otro);
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divide ss=new divide();
                int data1,data2;
                data1= Integer.parseInt(numero1.getText());
                data2= Integer.parseInt(numero2.getText());
                ss.setA(data1);
                ss.setB(data2);
                ss.dividir();
                double result=ss.getC();
                String otro=String.valueOf(result);
                resultado.setText(otro);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(numero1.getText().equals("1")&&numero2.getText().equals("1"))
            {
                vista2 vivi= new vista2();
                vivi.setVisible(true);
            }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("ejemplo");
        frame.setContentPane(new vista().panelvistas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
