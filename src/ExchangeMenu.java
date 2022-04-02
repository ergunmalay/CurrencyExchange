import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExchangeMenu {
    private JComboBox MoneyOneBox;
    private JLabel exchangeMenu;
    private JLabel currentCurrency;
    private JButton exchangeButton;
    private JLabel labelCurrencyA;
    private JPanel labelCurrencyB;
    private JLabel LabelCurrencyB;
    private JTextField convertFrom;
    private JTextField convertedField;

    public ExchangeMenu() {
        exchangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] rates = {/*GBP */1,/*USD */ 1.31191,/*EURO */ 1.1868};
                double selectedRate = rates[MoneyOneBox.getSelectedIndex()];

                double converted = Double.parseDouble(convertFrom.getText())* selectedRate;
                convertedField.setText("" + converted);
            }
        });

        MoneyOneBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelCurrencyB.setText(" " + MoneyOneBox.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ExchangeMenu");
        frame.setContentPane(new ExchangeMenu().labelCurrencyB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}