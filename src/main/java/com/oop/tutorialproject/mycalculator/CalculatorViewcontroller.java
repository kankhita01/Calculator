package com.oop.tutorialproject.mycalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorViewcontroller
{
    @javafx.fxml.FXML
    private TextField NumberTwotextfield;
    @javafx.fxml.FXML
    private Label answerLabel;
    @javafx.fxml.FXML
    private TextField NumberOnetextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddOnClick(ActionEvent actionEvent) {
        String numOne = NumberOnetextfield.getText();
        String numTwo = NumberTwotextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1 + num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void SubOnClick(ActionEvent actionEvent) {
        String numOne = NumberOnetextfield.getText();
        String numTwo = NumberTwotextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1-num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void MultiOnClick(ActionEvent actionEvent) {
        String numOne = NumberOnetextfield.getText();
        String numTwo = NumberTwotextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        float num3 = num1 * num2;

        String numThree = Float.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void DivOnClick(ActionEvent actionEvent) {
        String numOne = NumberOnetextfield.getText();
        String numTwo = NumberTwotextfield.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        if (num2 == 0){
            answerLabel.setText("Can not be divided by zero");
        }
        else {

            float num3 = num1/num2;
            String numThree = Float.toString(num3);
            answerLabel.setText(numThree);
        }

    }

    @javafx.fxml.FXML
    public void ClearOnClick(ActionEvent actionEvent) {
        NumberOnetextfield.clear();
        NumberTwotextfield.clear();
        answerLabel.setText("Answer");
    }
}