package edu.wpi.teamname.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoanController {

    @FXML
    private Label paymentLabel;
    @FXML
    private TextField loanAmt;
    @FXML
    private TextField rate;
    @FXML
    private TextField numMonths;

    @FXML
    private void calculatePressed(ActionEvent actionEvent) {

        Double loanAmtDouble = Double.parseDouble(loanAmt.getText());
        Double rateDouble = Double.parseDouble(rate.getText());
        Double numMonthsDouble = Double.parseDouble(numMonths.getText());

        Double payment = loanAmtDouble * Math.pow(1 + rateDouble, numMonthsDouble);

        paymentLabel.setText(payment.toString());

    }
}
