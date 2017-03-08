/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hp11c;



/**
 *
 * @author mvenaas
 */
public class Hp11C {

    private Hp11cListStack<Float> stack;
    private Hp11cEngine engine;
    private Hp11cGui gui;

    private float currentNumber = 0;



    public Hp11C() {
        engine = new Hp11cEngine() {
            @Override
            public void numberPressed(int number) {
                currentNumber = number;
            }

            @Override
            public void pointPressed() {
                // TODO: Decimal point operator
            }

            @Override
            public void chsPressed() {

            }

            @Override
            public void clearPressed() {

            }

            @Override
            public void plusPressed() {

            }

            @Override
            public void minusPressed() {

            }

            @Override
            public void multiplyPressed() {

            }

            @Override
            public void dividePressed() {

            }

            @Override
            public void enterPressed() {

            }

            @Override
            public String getAuthor() {
                return "Mvenaas";
            }

            // Make sure to return string
            @Override
            public String getDisplayValue() {
                return "" + currentNumber;
            }

            @Override
            public String getTitle() {
                return "HP c11 Simulator";
            }

            @Override
            public String getVersion() {
                return null;
            }
        };
        gui = new Hp11cGui(engine);
        gui.setVisible(true);
    }

    public static void main(String[] args) {
        new Hp11C();
    }
}