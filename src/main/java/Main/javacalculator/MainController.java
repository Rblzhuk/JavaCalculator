package Main.javacalculator;

import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;

import java.text.Format;
import java.text.MessageFormat;

public class MainController {
    private String firstOperand = "";
    private String secondOperand = "";
    private String operator = "";

    public Label label_userInput;
    public Button button_1;
    public Button button_2;
    public Button button_3;
    public Button button_4;
    public Button button_5;
    public Button button_6;
    public Button button_7;
    public Button button_8;
    public Button button_9;
    public Button button_0;
    public Button button_clearAll;
    public Button button_clearOne;

    public Button button_plus;
    public Button button_minus;
    public Button button_multiply;
    public Button button_divide;
    public Button button_equal;


    public void onButton_1Click() {
        label_userInput.setText(label_userInput.getText() + button_1.getText());
    }

    public void onButton_2Click() {
        label_userInput.setText(label_userInput.getText() + button_2.getText());
    }

    public void onButton_3Click() {
        label_userInput.setText(label_userInput.getText() + button_3.getText());
    }

    public void onButton_4Click() {
        label_userInput.setText(label_userInput.getText() + button_4.getText());
    }

    public void onButton_5Click() {
        label_userInput.setText(label_userInput.getText() + button_5.getText());
    }

    public void onButton_6Click() {
        label_userInput.setText(label_userInput.getText() + button_6.getText());
    }

    public void onButton_7Click() {
        label_userInput.setText(label_userInput.getText() + button_7.getText());
    }

    public void onButton_8Click() {
        label_userInput.setText(label_userInput.getText() + button_8.getText());
    }

    public void onButton_9Click() {
        label_userInput.setText(label_userInput.getText() + button_9.getText());
    }

    public void onButton_0Click() {
        label_userInput.setText(label_userInput.getText() + button_0.getText());
    }

    public void onButton_clearAllClick() {
        label_userInput.setText("");
        SetOperand(firstOperand, "");
        SetOperand(secondOperand, "");
        SetOperand(operator, "");
    }

    public void onButton_clearOneClick() {
        if (!label_userInput.getText().isEmpty()) {
            label_userInput.setText(label_userInput.getText().substring(0, label_userInput.getText().length() - 1));
        }
    }

    public void onButton_plusClick() {
        firstOperand = label_userInput.getText();
        operator = button_plus.getText();
        label_userInput.setText("");
    }

    public void onButton_minusClick() {
        firstOperand = label_userInput.getText();
        operator = button_minus.getText();
        label_userInput.setText("");
    }

    public void onButton_multiplyClick() {
        firstOperand = label_userInput.getText();
        operator = button_multiply.getText();
        label_userInput.setText("");
    }

    public void onButton_divideClick() {
        firstOperand = label_userInput.getText();
        operator = button_divide.getText();
        label_userInput.setText("");
    }

    public void onButton_equalClick() {
        secondOperand = label_userInput.getText();
        if (firstOperand.isEmpty()) {
            label_userInput.setText("Первый операнд не введён");
            return;
        }
        if (secondOperand.isEmpty()) {
            label_userInput.setText("Второй операнд не введён");
            return;
        }
        if (operator.equals("/") && secondOperand.equals("0")) {
            label_userInput.setText("Попытка деления на 0");
            return;
        }
        double result = 0;
        switch (operator){
            case "+":
                result = Double.parseDouble(firstOperand)+Double.parseDouble(secondOperand);
                break;
            case "-":
                result = Double.parseDouble(firstOperand)-Double.parseDouble(secondOperand);
                break;
            case "*":
                result = Double.parseDouble(firstOperand)*Double.parseDouble(secondOperand);
                break;
            case "/":
                result = Double.parseDouble(firstOperand)/Double.parseDouble(secondOperand);
                break;
        }
        label_userInput.setText(firstOperand + operator + secondOperand + " = " + Double.toString(result));
    }

    private void SetOperand(String operand, String value) {
        operand = value;
    }
}