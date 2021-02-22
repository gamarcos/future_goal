package br.com.gabrielmarcos.core.utils;

import java.lang.System;

/**
 * Utils interface for application theme configuration.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lbr/com/gabrielmarcos/core/utils/ThemeUtils;", "", "isDarkTheme", "", "context", "Landroid/content/Context;", "isLightTheme", "setNightMode", "", "forceNight", "delay", "", "core_debug"})
public abstract interface ThemeUtils {
    
    /**
     * Whether the current configuration is a dark theme i.e. in Night configuration.
     */
    public abstract boolean isDarkTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    /**
     * Whether the current configuration is a light theme i.e. in Day configuration.
     */
    public abstract boolean isLightTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    /**
     * Force [AppCompatDelegate] Mode to night/notnight.
     *
     * @param forceNight Boolean that force night mode otherwise notnight is configured.
     * @param delay Delay to apply mode changes.
     */
    public abstract void setNightMode(boolean forceNight, long delay);
    
    /**
     * Utils interface for application theme configuration.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}