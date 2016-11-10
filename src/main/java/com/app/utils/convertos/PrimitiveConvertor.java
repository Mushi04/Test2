package com.tbezdetnaya_github.app.utils.convertos;

/**
 * Created by Tanya on 10.11.2016.
 */
public class PrimitiveConvertor {
    private int intVariable = 9451;
    private float floatVeriable = 56F;
    private char charVeriable;


    public  void getResultConvertFloatToChar(){
        System.out.println("Input float value is: " + floatVeriable + ". Output char value is: " + charVeriable);


    }

    public  void getResultConvertIntToChar(){
        System.out.println("Input int value is: " + intVariable + ". Output char value is: " + charVeriable);
    }

    public  void getResultConvertCharToInt(){
        System.out.println("Input char value is: " + charVeriable + ". Output int value is: " + intVariable);

    }

    public void getFloatToChar() {
        charVeriable = (char) floatVeriable;
    }

   public void getIntToChar (){
       charVeriable = (char) intVariable;
   }

    public void getCharToInt(){
        intVariable = charVeriable;
    }

}
