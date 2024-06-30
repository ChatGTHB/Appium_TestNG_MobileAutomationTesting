package com.webdriverio.base;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class AppiumServer {

    private static AppiumDriverLocalService server;
    private static final Logger logger = LoggerFactory.getLogger(AppiumServer.class);

    /**
     * Sets up the Appium server instance using the AppiumServiceBuilder.
     */
    private static void setInstance() {
        try {
            AppiumServiceBuilder builder = new AppiumServiceBuilder();
            builder.withAppiumJS(new File(System.getenv("APPIUM_PATH")))
                    .usingDriverExecutable(new File(System.getenv("NODE_PATH")))
                    .usingPort(4723)
                    .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                    .withLogFile(new File("Appiumlog.txt"))
                    .withArgument(GeneralServerFlag.LOG_LEVEL, "debug")
                    .withIPAddress("127.0.0.1");

            server = AppiumDriverLocalService.buildService(builder);
        } catch (Exception e) {
            logger.error("Failed to set up Appium server instance.", e);
            throw new RuntimeException("Error setting up Appium server instance. Please check your configurations.", e);
        }
    }

    /**
     * Returns the Appium server instance, creating it if necessary.
     * @return AppiumDriverLocalService instance
     */
    private static AppiumDriverLocalService getInstance() {
        if (server == null) {
            setInstance();
        }
        return server;
    }

    /**
     * Starts the Appium server.
     */
    public static void start() {
        try {
            getInstance().start();
            logger.info("Appium server started at: {}", server.getUrl());
        } catch (Exception e) {
            logger.error("Failed to start Appium server.", e);
            throw new RuntimeException("Error starting Appium server. Please check the logs for details.", e);
        }
    }

    /**
     * Stops the Appium server.
     */
    public static void stop() {
        try {
            if (server != null) {
                getInstance().stop();
                logger.info("Appium server stopped.");
            }
        } catch (Exception e) {
            logger.error("Failed to stop Appium server.", e);
            throw new RuntimeException("Error stopping Appium server. Please check the logs for details.", e);
        }
    }
}
