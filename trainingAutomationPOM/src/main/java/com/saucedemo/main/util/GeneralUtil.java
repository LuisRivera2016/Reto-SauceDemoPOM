package com.saucedemo.main.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
public class GeneralUtil {

    private GeneralUtil() {

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(GeneralUtil.class);
    private static final String MESSAGE_WAITING = "programa pausado";
    private static final String MESSAGE_SUCCESS = "\n%s\n----------------------------------------";

    public static void explicitWait(long duration) {
        try {
            String s = formatMessageWait("El robot se pauso por" + (duration / 1000L) + "s");
            LOGGER.info(s);
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }

    }

    public static String formatMessageWait(String message) {
        return String.format(MESSAGE_WAITING, message);
    }

    public static String formatMessageInformation(String message) {
        return String.format(MESSAGE_SUCCESS,message);
    }



}
