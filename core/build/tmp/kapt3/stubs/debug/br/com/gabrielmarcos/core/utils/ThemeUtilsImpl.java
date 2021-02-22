package br.com.gabrielmarcos.core.utils;

import java.lang.System;

/**
 * Utils implementation for application theme configuration.
 * @see ThemeUtils
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lbr/com/gabrielmarcos/core/utils/ThemeUtilsImpl;", "Lbr/com/gabrielmarcos/core/utils/ThemeUtils;", "()V", "isDarkTheme", "", "context", "Landroid/content/Context;", "isLightTheme", "setNightMode", "", "forceNight", "delay", "", "core_debug"})
public final class ThemeUtilsImpl implements br.com.gabrielmarcos.core.utils.ThemeUtils {
    
    /**
     * @see ThemeUtils.isDarkTheme
     */
    @java.lang.Override()
    public boolean isDarkTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * @see ThemeUtils.isLightTheme
     */
    @java.lang.Override()
    public boolean isLightTheme(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * @see ThemeUtils.setNightMode
     */
    @java.lang.Override()
    public void setNightMode(boolean forceNight, long delay) {
    }
    
    @javax.inject.Inject()
    public ThemeUtilsImpl() {
        super();
    }
}