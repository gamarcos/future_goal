package br.com.gabrielmarcos.core.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0019\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "", "dao", "Lbr/com/gabrielmarcos/core/database/GoalDAO;", "(Lbr/com/gabrielmarcos/core/database/GoalDAO;)V", "deleteAllGoals", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoal", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGoals", "Landroidx/lifecycle/LiveData;", "", "Lbr/com/gabrielmarcos/core/model/Goal;", "insertGoal", "goal", "(Lbr/com/gabrielmarcos/core/model/Goal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class GoalDatabaseRepository {
    private final br.com.gabrielmarcos.core.database.GoalDAO dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> getAllGoals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllGoals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteGoal(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertGoal(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public GoalDatabaseRepository(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDAO dao) {
        super();
    }
}