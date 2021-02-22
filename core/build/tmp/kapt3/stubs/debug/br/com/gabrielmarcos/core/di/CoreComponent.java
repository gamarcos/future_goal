package br.com.gabrielmarcos.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lbr/com/gabrielmarcos/core/di/CoreComponent;", "", "context", "Landroid/content/Context;", "goalDAO", "Lbr/com/gabrielmarcos/core/database/GoalDAO;", "themeUtils", "Lbr/com/gabrielmarcos/core/utils/ThemeUtils;", "core_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {br.com.gabrielmarcos.core.di.module.ContextModule.class, br.com.gabrielmarcos.core.di.module.DatabaseModule.class, br.com.gabrielmarcos.core.di.module.UtilsModule.class})
public abstract interface CoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.gabrielmarcos.core.database.GoalDAO goalDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.gabrielmarcos.core.utils.ThemeUtils themeUtils();
}