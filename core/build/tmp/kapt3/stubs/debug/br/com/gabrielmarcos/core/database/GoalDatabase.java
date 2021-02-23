package br.com.gabrielmarcos.core.database;

import java.lang.System;

@androidx.room.Database(entities = {br.com.gabrielmarcos.core.model.Goal.class}, exportSchema = false, version = 3)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lbr/com/gabrielmarcos/core/database/GoalDatabase;", "Landroidx/room/RoomDatabase;", "()V", "goalDAO", "Lbr/com/gabrielmarcos/core/database/GoalDAO;", "core_debug"})
public abstract class GoalDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.gabrielmarcos.core.database.GoalDAO goalDAO();
    
    public GoalDatabase() {
        super();
    }
}