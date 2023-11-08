package com.lk.jucesp.bots;

import com.lk.jucesp.bots.components.*;
import com.lk.jucesp.bots.exceptions.CannotGetJucespFileException;
import java.util.logging.Logger;

public class MainApplication {

    public static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());

    public static void main(String[] args) throws CannotGetJucespFileException{
        LOGGER.info("Running");
        String socialReason = args[0] ;
        SPJucespBot spJucespBot = new SPJucespBot(new SPJucespBuilderImpl());
        spJucespBot.getArchivedDocuments(socialReason);
    }
}
