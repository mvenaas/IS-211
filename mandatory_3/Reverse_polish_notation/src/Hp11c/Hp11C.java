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

import java.util.Stack;

public class Hp11C {

    private Hp11cEngine engine;
    private Hp11cGui gui;
    private Integer currentNumber = 0;
    private Stack stack = new Stack<Integer>();


    public Hp11C() {
        engine = new Hp11cEngine() {

            @Override
            public void numberPressed(int number) {
                // Does not need to validate input because it is hardcoded in Gui
                currentNumber = number;
            }

            @Override
            public void pointPressed() {
                // TODO: Decimal point operator/operand
            }

            @Override
            public void chsPressed() {

            }

            @Override
            public void clearPressed() {
                stack = new Stack<Integer>();
                currentNumber = 0;
            }

            @Override
            public void plusPressed() {
                Integer one = (Integer) stack.pop();
                Integer two = (Integer) stack.pop();

                int result = one + two;
                stack.push(result);

                currentNumber = result;

            }

            @Override
            public void minusPressed() {
                Integer one = (Integer) stack.pop();
                Integer two = (Integer) stack.pop();

                int result = one - two;
                stack.push(result);

                currentNumber = result;
            }

            @Override
            public void multiplyPressed() {
                Integer one = (Integer) stack.pop();
                Integer two = (Integer) stack.pop();

                int result = one * two;
                stack.push(result);

                currentNumber = result;
            }

            @Override
            public void dividePressed() {
                Integer one = (Integer) stack.pop();
                Integer two = (Integer) stack.pop();

                int result = one / two;
                stack.push(result);

                currentNumber = result;
            }

            @Override
            public void enterPressed() {
                stack.push(currentNumber);
                System.out.println(currentNumber);
            }

            @Override
            public String getAuthor() {
                return "Built, partly, by Mvenaas";
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