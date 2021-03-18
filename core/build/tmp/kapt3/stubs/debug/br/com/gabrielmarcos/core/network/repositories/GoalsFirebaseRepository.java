package br.com.gabrielmarcos.core.network.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/gabrielmarcos/core/network/repositories/GoalsFirebaseRepository;", "", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/database/FirebaseDatabase;Lcom/google/firebase/auth/FirebaseAuth;)V", "createAnonymouslyFirebaseAccount", "", "getGoalByIdDatabase", "id", "", "getGoalDatabase", "saveGoalDatabase", "goal", "Lbr/com/gabrielmarcos/core/model/Goal;", "core_debug"})
public final class GoalsFirebaseRepository {
    private final com.google.firebase.database.FirebaseDatabase firebaseDatabase = null;
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    
    public final void createAnonymouslyFirebaseAccount() {
    }
    
    public final void saveGoalDatabase(@org.jetbrains.annotations.NotNull()
    br.com.gabrielmarcos.core.model.Goal goal) {
    }
    
    public final void getGoalDatabase() {
    }
    
    public final void getGoalByIdDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public GoalsFirebaseRepository(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase firebaseDatabase, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
}