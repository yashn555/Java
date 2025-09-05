
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends JFrame {
    private JTextField display;
    private double firstNumber = 0;
    private String operation = "";
    private boolean startNewInput = true;

    public CalculatorAWT() {
        setTitle("Basic Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "CE", "", ""
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                if (startNewInput) {
                    display.setText("");
                    startNewInput = false;
                }
                display.setText(display.getText() + command);
            } else if (command.equals("C")) {
                display.setText("");
                firstNumber = 0;
                operation = "";
            } else if (command.equals("CE")) {
                display.setText("");
            } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                if (!display.getText().isEmpty()) {
                    firstNumber = Double.parseDouble(display.getText());
                    operation = command;
                    startNewInput = true;
                }
            } else if (command.equals("=")) {
                if (!operation.isEmpty() && !display.getText().isEmpty()) {
                    double secondNumber = Double.parseDouble(display.getText());
                    double result = calculate(firstNumber, secondNumber, operation);
                    display.setText(String.valueOf(result));
                    operation = "";
                    startNewInput = true;
                }
            }
        }

        private double calculate(double num1, double num2, String op) {
            switch (op) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        return 0;
                    }
                    return num1 / num2;
                default:
                    return num2;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorAWT calculator = new CalculatorAWT();
            calculator.setVisible(true);
        });
    }
}