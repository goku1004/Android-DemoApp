package com.example.enclaveit.puzzleintent.algorithm;

/**
 * Created by enclaveit on 14/12/2016.
 */

public interface InterfaceReversePolishNotation {
    /**
     * Step 1: We should perform as a suffix expression
     * - Instruction: Using Stack, Using Variable String, Using Variable Stack
     * - Analysis: Analysis priority operator in stack
     * For example:
     * Give string : 4+5-7*2
     * new String() = "4572"
     * new Stack() = "+-*"
     * => analysis priority: new Stack() = "*+-"
     * => Operator * is first operation and next is addition and substraction
     */
    public abstract String convertToPostfix(String expression);
    /**
     * Step 2: Using function to distinguish
     */
    public abstract int isOperator(String ope);

    public abstract float ReversePolishNotation(String expression);
}
