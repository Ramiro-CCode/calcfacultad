import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tabla {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JTable table1;
    private JPanel tablas;
    private JButton BORRARButton;
    DefaultTableModel  dtm=new DefaultTableModel();

    public tabla() {

        dtm.addColumn("id");
        dtm.addColumn("nombre");
        dtm.addColumn("apellido");
        table1.setModel(dtm);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField3.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"errore de dato 3");
                }
                dtm.addRow(new Object[]{textField1.getText(),textField2.getText(),textField3.getText()});
                table1.setModel(dtm);
            }

        });

        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fila=table1.getSelectedRow();
                dtm.removeRow(fila);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("ejemplo");
        frame.setContentPane(new tabla().tablas);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void tomarelento(){
        int fila=table1.getSelectedRow();// selecciona el numero de fila y me la guarda en un entero
    Object d=dtm.getValueAt(fila,2);
    double j=Double.parseDouble(String.valueOf(d));
}}
