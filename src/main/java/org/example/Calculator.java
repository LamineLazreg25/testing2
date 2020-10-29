package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;
import java.text.BreakIterator;

public class Calculator {
    int Memory = 0;
    String SigneMemory = "";

    @FXML
    Button N1,N2,N3,N4,N5,N6,N7,N8,N9,N0,Plus,Minus,equal,C;

    @FXML
    Text Display;


    @FXML
    private void NumControlle(ActionEvent event) throws IOException{
        int n;
        Button b = (Button) event.getSource();
        switch (b.getText()){
            case "1":
                 n = Integer.parseInt(Display.getText()+"1")*1;
                Display.setText(String.valueOf(n));
                break;
            case "2":
                 n = Integer.parseInt(Display.getText()+"2")*1;
                Display.setText(String.valueOf(n));
                break;
            case "3":
                 n =Integer.parseInt(Display.getText()+"3")*1;
                Display.setText(String.valueOf(n));
                break;
            case "4":
                 n =Integer.parseInt(Display.getText()+"4")*1;
                Display.setText(String.valueOf(n));
                break;
            case "5":
                 n =Integer.parseInt(Display.getText()+"5")*1;
                Display.setText(String.valueOf(n));
                break;
            case "6":
                 n =Integer.parseInt(Display.getText()+"6")*1;
                Display.setText(String.valueOf(n));
                break;
            case "7":
                 n =Integer.parseInt(Display.getText()+"7")*1;
                Display.setText(String.valueOf(n));
                break;
            case "8":
                 n =Integer.parseInt(Display.getText()+"8")*1;
                Display.setText(String.valueOf(n));
                break;
            case "9":
                 n =Integer.parseInt(Display.getText()+"9")*1;
                Display.setText(String.valueOf(n));
                break;
            case "0":
                 n =Integer.parseInt(Display.getText()+"0")*1;
                Display.setText(String.valueOf(n));
                break;
        }
    }

    @FXML
    private void SigneControlle(ActionEvent event) throws IOException{
        Button b = (Button) event.getSource();
        switch (b.getText()){
            case "C":
                Display.setText("0");
                Memory = 0;
                SigneMemory ="";
                break;

            case "=":
                if(SigneMemory.equals("+")){
                    this.AdditionControlle();
                }else {
                    if (SigneMemory.equals("-")){
                        this.SubstractionControlle();
                    }

                }
                Display.setText(String.valueOf(Memory));
                Memory = 0;
                SigneMemory = "";

                break;
        }


    }

    @FXML
    private void AdditionControlle() throws IOException{
        int n = Integer.parseInt(Display.getText());
        Memory = Memory+n;
        SigneMemory = "+";
        Display.setText("0");
    }

    @FXML
    private void SubstractionControlle() throws IOException{
        int n = Integer.parseInt(Display.getText());
        if (SigneMemory.isEmpty()){
            Memory = n;
        }else {
            Memory = Memory-n;
        }
        SigneMemory = "-";
        Display.setText("0");
    }
}
