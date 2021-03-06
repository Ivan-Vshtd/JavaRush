package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.ad.AdvertisementManager;
import com.javarush.test.level27.lesson15.big01.ad.NoVideoAvailableException;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by user on 11.07.2016.
 */
public class Tablet extends Observable
    {
        private final int number;
        private static java.util.logging.Logger logger = Logger.getLogger(Tablet.class.getName());

        public Tablet(int number)
        {
            this.number = number;
        }
        public void createOrder() {

            try
            {
                final Order order = new Order(this);
                if (!order.isEmpty())
                {
                    ConsoleHelper.writeMessage(order.toString());
                    AdvertisementManager manager = new AdvertisementManager(order.getTotalCookingTime() * 60);
                    manager.processVideos();
                    setChanged();
                    notifyObservers(order);
                    try {
                        new AdvertisementManager(order.getTotalCookingTime() * 60).processVideos();
                    } catch (NoVideoAvailableException e) {
                        logger.log(Level.INFO, "No video is available for the order " + order);
                    }
                }
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Console is unavailable.");
            }

        }

        public int getNumber()
        {
            return number;
        }

        @Override
        public String toString()
        {
            return "Tablet{" + "number=" + number +'}';
        }
    }
