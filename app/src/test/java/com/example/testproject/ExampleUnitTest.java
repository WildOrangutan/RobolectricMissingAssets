package com.example.testproject;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class ExampleUnitTest {
    @Test
    public void checkAssets() throws Exception {
        String[] assets = ApplicationProvider.getApplicationContext().getAssets().list("");
        assertNotNull("Missing assets", assets);
        assertNotEquals("Empty assets", 0, assets.length);
        System.out.println("Assets: " + Arrays.toString(assets));
    }
}