package br.com.gabrielmarcos.crud_goals.home.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "firebaseRepository", "Lbr/com/gabrielmarcos/core/network/repositories/GoalsFirebaseRepository;", "(Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;Lbr/com/gabrielmarcos/core/network/repositories/GoalsFirebaseRepository;)V", "getFirebaseRepository", "()Lbr/com/gabrielmarcos/core/network/repositories/GoalsFirebaseRepository;", "goals", "Landroidx/lifecycle/LiveData;", "", "Lbr/com/gabrielmarcos/core/model/Goal;", "getGoals", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "", "id", "", "crud_goals_debug"})
public final class HomeGoalsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> goals = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository firebaseRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<br.com.gabrielmarcos.core.model.Goal>> getGoals() {
        return null;
    }
    
    public final void getGoals(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.gabrielmarcos.core.database.GoalDatabaseRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository getFirebaseRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeGoalsViewModel(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository firebaseRepository) {
        super();
    }
}