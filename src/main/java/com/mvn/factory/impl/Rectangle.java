package com.mvn.factory.impl;

import com.mvn.factory.Shape;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Rectangle implements Shape {

    private static final Logger logger = LogManager.getLogger(Rectangle.class);
    public void draw() {
        logger.debug("Rectangle draw");
    }

    public static void main(String[] args) {
        logger.debug("main is run !");
//        System.out.println("main is run");
    }
}
