package br.com.gabrielmarcos.crud_goals.home.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/home/di/HomeGoalsModule;", "", "fragment", "Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsFragment;", "(Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsFragment;)V", "providesHomeGoalsAdapter", "Lbr/com/gabrielmarcos/crud_goals/home/ui/adapter/HomeGoalsAdapter;", "providesHomeGoalsViewModel", "Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsViewModel;", "repository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "crud_goals_debug"})
@dagger.Module()
public final class HomeGoalsModule {
    private final br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsFragment fragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @br.com.gabrielmarcos.core.di.scopes.FeatureScope()
    @dagger.Provides()
    public final br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel providesHomeGoalsViewModel(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @br.com.gabrielmarcos.core.di.scopes.FeatureScope()
    @dagger.Provides()
    public final br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter providesHomeGoalsAdapter() {
        return null;
    }
    
    public HomeGoalsModule(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsFragment fragment) {
        super();
    }
}