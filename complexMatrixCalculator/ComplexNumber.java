
/**
 *
 */
public class ComplexNumber{

    
    /**
     * Create a new fractional given the real and imaginary part
     * @param real the real part of the complex number
     * @param imginary the imaginary part of the complex number
     */
    public ComplexNumber(int real, int imaginary) {
    }
    
    
    /**
     * Returns the real part of this complex number
     * @return
     */
    
    public int getReal(){
        return 0;
    }
    
    /**
     * Returns the imaginary part of this complex number
     * @return
     */
    
    public int getImaginary(){
        return 0;
    }
    
    /**
     * Add this with other 
     * @param other  the complex number with which to operate
     * @return this+other
     */
    public ComplexNumber add(ComplexNumber other) {
        return null;
    }
    

    /**
     * Substract other from this 
     * @param other  the complex number with which to operate
     * @return this-other
     */
    public ComplexNumber substract(ComplexNumber other) {
        return null;
    }
    
    /**
     * Multiply this by other 
     * @param other  the complex number with which to operate
     * @return this*other
     */
    public ComplexNumber multiply(ComplexNumber other) {
        return null;
    }    
    
    /**
     * Divide this by other 
     * @param other  the complex number with which to operate
     * @return this/other
     */
    public ComplexNumber divide(ComplexNumber other) {
        return null;
    }  
    
    /**Indicates whether some other complex number is "equal to" this one.
     * @param other the complex number with which to comparate
     * @return  if this complex number is the same as the other 
     */
    public boolean equals (ComplexNumber other) {
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        return equals((ComplexNumber)obj);
    }  
    
    
    @Override
    public String toString() {
        return null;
    }
    

}