package br.com.gabrielmarcos.crud_goals.crud.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/crud/ui/CrudGoalsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "(Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;)V", "goalById", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/gabrielmarcos/core/model/Goal;", "getGoalById", "()Landroidx/lifecycle/MutableLiveData;", "", "id", "", "insertGoal", "goal", "updateGoalsByID", "crud_goals_debug"})
public final class CrudGoalsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<br.com.gabrielmarcos.core.model.Goal> goalById = null;
    private final br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<br.com.gabrielmarcos.core.model.Goal> getGoalById() {
        return null;
    }
    
    public final void getGoalById(long id) {
    }
    
    public final void updateGoalsByID(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal) {
    }
    
    public final void insertGoal(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal) {
    }
    
    @javax.inject.Inject()
    public CrudGoalsViewModel(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository) {
        super();
    }
}