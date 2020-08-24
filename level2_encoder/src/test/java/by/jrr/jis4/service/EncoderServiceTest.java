package by.jrr.jis4.service;

import by.jrr.jis4.bean.Encoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderServiceTest {

    @Test
    public void encode() {
        Encoder endocoder = new Encoder();
        EncoderService encoderService = new EncoderService();
        endocoder.setCode((short) 65);

        char expected = 'A';
        char actual = encoderService.encode(endocoder);
        char delta = 0;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void decode() {
        Encoder encoder = new Encoder();
        EncoderService encoderService = new EncoderService();
        encoder.setSymbol((char) 'A');

        short expected = 65;
        short actual = encoderService.decode(encoder);
        char delta = 0;
        assertEquals(expected, actual, delta);
    }
}