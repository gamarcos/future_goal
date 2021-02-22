package br.com.gabrielmarcos.core.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lbr/com/gabrielmarcos/core/di/module/DatabaseModule;", "", "()V", "provideGoalDao", "Lbr/com/gabrielmarcos/core/database/GoalDAO;", "goalDataBase", "Lbr/com/gabrielmarcos/core/database/GoalDatabase;", "provideGoalDatabase", "context", "Landroid/content/Context;", "provideGoalDatabaseRepository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "dao", "core_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final br.com.gabrielmarcos.core.database.GoalDatabase provideGoalDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final br.com.gabrielmarcos.core.database.GoalDAO provideGoalDao(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabase goalDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final br.com.gabrielmarcos.core.database.GoalDatabaseRepository provideGoalDatabaseRepository(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDAO dao) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}