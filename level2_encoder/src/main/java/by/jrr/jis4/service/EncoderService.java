package by.jrr.jis4.service;


import by.jrr.jis4.bean.Encoder;

public class EncoderService {

    public char encode(Encoder encoder) {
        return (char) encoder.getCode();
    }

    public short decode(Encoder encoder){
        return (short)encoder.getSymbol();
    }
}
