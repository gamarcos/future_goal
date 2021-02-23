package br.com.gabrielmarcos.crud_goals.crud.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/crud/di/CrudGoalsComponent;", "", "inject", "", "crudGoalsFragment", "Lbr/com/gabrielmarcos/crud_goals/crud/ui/CrudGoalsFragment;", "crud_goals_debug"})
@dagger.Component(modules = {br.com.gabrielmarcos.crud_goals.crud.di.CrudGoalsModule.class}, dependencies = {br.com.gabrielmarcos.core.di.CoreComponent.class})
@br.com.gabrielmarcos.core.di.scopes.FeatureScope()
public abstract interface CrudGoalsComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.crud_goals.crud.ui.CrudGoalsFragment crudGoalsFragment);
}