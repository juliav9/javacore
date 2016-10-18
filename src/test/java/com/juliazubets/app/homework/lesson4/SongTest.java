package com.juliazubets.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by julia on 10/18/2016.
 */
public class SongTest {
    @Test
    public void positiveTest() {
        String expSong = "Do";
        Song mySong = new Song();
        Assert.assertEquals(expSong, mySong.singing(3));
    }
    @Test
    public void positiveTest2() {
        String expSong = "DooBeeDooBeeDo";
        Song mySong = new Song();
        Assert.assertEquals(expSong, mySong.singing(1));
    }
    @Test
    public void positiveTest3() {
        String expSong = "DooBeeDooBeeDooBeeDo";
        Song mySong = new Song();
        Assert.assertEquals(expSong, mySong.singing(0));
    }
    @Test
    public void positiveTest4() {
        String expSong = "DooBeeDooBeeDooBeeDooBeeDo";
        Song mySong = new Song();
        Assert.assertEquals(expSong, mySong.singing(-1));
    }
}
