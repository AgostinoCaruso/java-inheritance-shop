package org.lessons.java.shop;

import java.math.BigDecimal;

public class Iva {

    private BigDecimal ivaAmount;
    public Iva(BigDecimal iva){
        this.ivaAmount = iva;
    }

    public BigDecimal getIvaAmount(){
        return ivaAmount;
    }
    public void setIvaAmount(BigDecimal ivaAmount){
        this.ivaAmount = ivaAmount;
    }
}
