package ru.mirea.task22.task2;

import ru.mirea.task22.task1.divz;
import ru.mirea.task22.task1.esexep;

import java.util.Stack;

public class Model {

    private String aa,bb;

    public Model() {
        aa = "";
        bb = "";
    }

    public String getaa() {
        return aa;
    }

    public void setaa(String stUserInput) {
        this.aa = stUserInput;
    }

    public String getres() {
        return bb;
    }

    public void setres(String stResult) {
        this.bb = stResult;
    }

    public void conv() throws esexep, divz, Nost, noin {
        Double result = 0d;
        if (aa.equals("")) throw new Nost();
        String currentPosition = "";
        Stack<Double> st = new Stack<>();
        for(int i = 0; i < aa.length(); i++){
            if (isOperand(((Character) aa.charAt(i)).toString())){
                if (st.size() < 2) throw new esexep();
                result = calcul(st.pop(), st.pop(), ((Character) aa.charAt(i)).toString());
                st.push(result);
            }
            else if (aa.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".") ){
                try {
                    st.push(Double.parseDouble(currentPosition.replace(" ", "")));
                }catch (Exception ex){
                    throw new noin();
                }
                currentPosition = "";
            }
            else{
                currentPosition += aa.charAt(i);
            }
        }

        bb = String.valueOf(((st.empty())? 0 :st.pop()));
    }

    public boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private Double calcul(Double a, Double b, String operand) throws divz {
        if (operand.equals("/") && a == 0) throw new divz();
        switch(operand){
            case "+" : return a + b;
            case "-" : return b - a;
            case "*" : return a * b;
            case "/" : return b / a;
        }
        return 0d;
    }

}
