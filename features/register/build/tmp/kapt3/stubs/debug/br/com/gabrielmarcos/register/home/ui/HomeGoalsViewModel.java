package br.com.gabrielmarcos.register.home.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lbr/com/gabrielmarcos/register/home/ui/HomeGoalsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "(Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;)V", "goals", "Landroidx/lifecycle/LiveData;", "", "Lbr/com/gabrielmarcos/core/model/Goal;", "getGoals", "()Landroidx/lifecycle/LiveData;", "deleteAllGoals", "", "insertGoals", "register_debug"})
public final class HomeGoalsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> goals = null;
    private final br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> getGoals() {
        return null;
    }
    
    public final void insertGoals(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goals) {
    }
    
    public final void deleteAllGoals() {
    }
    
    @javax.inject.Inject()
    public HomeGoalsViewModel(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository) {
        super();
    }
}