/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */
package com.almasb.fxgl.settings;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.scene.menu.MenuStyle;
import com.almasb.fxgl.service.ServiceType;
import com.almasb.fxgl.util.Credits;
import javafx.scene.input.KeyCode;

import java.util.EnumSet;

/**
 * Data structure for variables that are
 * initialised before the application (game) starts.
 * <p>
 * Modifying any data after the start of the game has no effect.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class GameSettings extends ReadOnlyGameSettings {

    /**
     * Set title of the game. This will be shown as the
     * window header if the game isn't fullscreen.
     *
     * @param title app title
     * @defaultValue "Untitled FXGL Game Application"
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set target width. If the screen width is smaller,
     * the game will automatically scale down the image
     * while maintaining the aspect ratio.
     * <p>
     * All the game logic must use target width and height.
     *
     * @param width target width
     * @defaultValue 800
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Set target height. If the screen height is smaller,
     * the game will automatically scale down the image
     * while maintaining the aspect ratio.
     * <p>
     * All the game logic must use target width and height.
     *
     * @param height target height
     * @defaultValue 600
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Set version of the game.
     *
     * @param version app version
     * @defaultValue 0.0
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * If set to true, the intro video/animation will
     * be played before the start of the game.
     *
     * @param b intro flag
     * @defaultValue true
     */
    public void setIntroEnabled(boolean b) {
        introEnabled = b;
    }

    /**
     * Setting to true enables main and game menu.
     *
     * @param b menu flag
     * @defaultValue true
     */
    public void setMenuEnabled(boolean b) {
        menuEnabled = b;
    }

    /**
     * Setting to true will start the game in fullscreen mode.
     *
     * @param b fullscreen flag
     * @defaultValue false
     */
    public void setFullScreen(boolean b) {
        fullScreen = b;
    }

    /**
     * Setting to true will enable profiler that reports on performance
     * when FXGL exits.
     * Also shows render and performance FPS in the bottom left corner
     * when the application is run.
     *
     * @param b profiling enabled flag
     * @defaultValue true
     */
    public void setProfilingEnabled(boolean b) {
        profilingEnabled = b;
    }

    /**
     * Setting to false will disable asking for confirmation on exit.
     * This is useful for faster compile -> run -> exit.
     *
     * @param b ask for confirmation on close
     * @defaultValue true
     */
    public void setCloseConfirmation(boolean b) {
        closeConfirmation = b;
    }

    /**
     * Sets application run mode. See {@link ApplicationMode} for more info.
     *
     * @param mode app mode
     * @defaultValue {@link ApplicationMode#DEVELOPER}
     */
    public void setApplicationMode(ApplicationMode mode) {
        this.appMode = mode;
    }

    /**
     * Set the menu style to use.
     *
     * @param style menu style
     */
    public void setMenuStyle(MenuStyle style) {
        this.menuStyle = style;
    }

    /**
     * Set the key that will trigger in-game menu.
     *
     * @param menuKey menu key
     */
    public void setMenuKey(KeyCode menuKey) {
        this.menuKey = menuKey;
    }

    /**
     * Set additional credits.
     *
     * @param credits credits object
     */
    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    /**
     * Register a custom service with FXGL.
     *
     * @param serviceType type of service
     */
    public void addServiceType(ServiceType<?> serviceType) {
        services.add(serviceType);
    }

    public void setEnabledMenuItems(EnumSet<MenuItem> items) {
        this.enabledMenuItems = items;
    }

    /**
     * @return a read only copy of settings
     */
    public ReadOnlyGameSettings toReadOnly() {
        return new ReadOnlyGameSettings(this);
    }
}