package br.com.gabrielmarcos.crud_goals.home.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0016\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00061"}, d2 = {"Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addNewGoals", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "kotlin.jvm.PlatformType", "getAddNewGoals", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "goalsAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "getGoalsAdapter", "()Landroidx/recyclerview/widget/RecyclerView;", "viewAdapter", "Lbr/com/gabrielmarcos/crud_goals/home/ui/adapter/HomeGoalsAdapter;", "getViewAdapter", "()Lbr/com/gabrielmarcos/crud_goals/home/ui/adapter/HomeGoalsAdapter;", "setViewAdapter", "(Lbr/com/gabrielmarcos/crud_goals/home/ui/adapter/HomeGoalsAdapter;)V", "viewModel", "Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsViewModel;", "getViewModel", "()Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsViewModel;", "setViewModel", "(Lbr/com/gabrielmarcos/crud_goals/home/ui/HomeGoalsViewModel;)V", "buildNavigationArgs", "Landroidx/navigation/NavDirections;", "arg", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onViewDataChange", "viewData", "", "Lbr/com/gabrielmarcos/core/model/Goal;", "setupBindView", "setupObserver", "setupRecyclerView", "crud_goals_debug"})
public final class HomeGoalsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter viewAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter getViewAdapter() {
        return null;
    }
    
    public final void setViewAdapter(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter p0) {
    }
    
    private final com.google.android.material.floatingactionbutton.FloatingActionButton getAddNewGoals() {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView getGoalsAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBindView() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObserver() {
    }
    
    private final void onViewDataChange(java.util.List<br.com.gabrielmarcos.core.model.Goal> viewData) {
    }
    
    private final androidx.navigation.NavDirections buildNavigationArgs(java.lang.String arg) {
        return null;
    }
    
    public HomeGoalsFragment() {
        super();
    }
}