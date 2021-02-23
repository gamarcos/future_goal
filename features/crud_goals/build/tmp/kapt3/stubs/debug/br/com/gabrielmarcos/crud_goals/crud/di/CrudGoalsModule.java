package br.com.gabrielmarcos.crud_goals.crud.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/crud/di/CrudGoalsModule;", "", "fragment", "Lbr/com/gabrielmarcos/crud_goals/crud/ui/CrudGoalsFragment;", "(Lbr/com/gabrielmarcos/crud_goals/crud/ui/CrudGoalsFragment;)V", "providesInsertGoalsFragment", "Lbr/com/gabrielmarcos/crud_goals/crud/ui/CrudGoalsViewModel;", "repository", "Lbr/com/gabrielmarcos/core/database/GoalDatabaseRepository;", "crud_goals_debug"})
@dagger.Module()
public final class CrudGoalsModule {
    private final br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsFragment fragment = null;
    
    @org.jetbrains.annotations.NotNull()
    @br.com.gabrielmarcos.core.di.scopes.FeatureScope()
    @dagger.Provides()
    public final br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsViewModel providesInsertGoalsFragment(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.database.GoalDatabaseRepository repository) {
        return null;
    }
    
    public CrudGoalsModule(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsFragment fragment) {
        super();
    }
}