package by.jrr.jis4.bean;

import java.util.Objects;

public class Encoder {
    private char symbol;
    private short code;

    public Encoder() {
        //  no args constructor
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder endocoder = (Encoder) o;
        return symbol == endocoder.symbol &&
                code == endocoder.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, code);
    }

    @Override
    public String toString() {
        return "Endocoder{" +
                "symbol=" + symbol +
                ", code=" + code +
                '}';
    }
}





