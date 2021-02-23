package br.com.gabrielmarcos.core.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\'J\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lbr/com/gabrielmarcos/core/database/GoalDAO;", "", "deleteAllGoals", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoalByID", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGoals", "Landroidx/lifecycle/LiveData;", "", "Lbr/com/gabrielmarcos/core/model/Goal;", "getGoalByID", "insertGoal", "goal", "(Lbr/com/gabrielmarcos/core/model/Goal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateGoalById", "core_debug"})
public abstract interface GoalDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM future_goal")
    public abstract androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> getAllGoals();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM future_goal WHERE id = :id")
    public abstract java.lang.Object getGoalByID(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super br.com.gabrielmarcos.core.model.Goal> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM future_goal")
    public abstract java.lang.Object deleteAllGoals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM future_goal WHERE id = :id")
    public abstract java.lang.Object deleteGoalByID(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertGoal(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateGoalById(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}