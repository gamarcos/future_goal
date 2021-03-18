package br.com.gabrielmarcos.core.network.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lbr/com/gabrielmarcos/core/network/services/NetworkState;", "", "()V", "isError", "", "isLoading", "isSuccess", "Error", "Loading", "Success", "Lbr/com/gabrielmarcos/core/network/services/NetworkState$Success;", "Lbr/com/gabrielmarcos/core/network/services/NetworkState$Loading;", "Lbr/com/gabrielmarcos/core/network/services/NetworkState$Error;", "core_debug"})
public abstract class NetworkState {
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isError() {
        return false;
    }
    
    private NetworkState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/gabrielmarcos/core/network/services/NetworkState$Success;", "Lbr/com/gabrielmarcos/core/network/services/NetworkState;", "()V", "core_debug"})
    public static final class Success extends br.com.gabrielmarcos.core.network.services.NetworkState {
        public static final br.com.gabrielmarcos.core.network.services.NetworkState.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/gabrielmarcos/core/network/services/NetworkState$Loading;", "Lbr/com/gabrielmarcos/core/network/services/NetworkState;", "()V", "core_debug"})
    public static final class Loading extends br.com.gabrielmarcos.core.network.services.NetworkState {
        public static final br.com.gabrielmarcos.core.network.services.NetworkState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/gabrielmarcos/core/network/services/NetworkState$Error;", "Lbr/com/gabrielmarcos/core/network/services/NetworkState;", "()V", "core_debug"})
    public static final class Error extends br.com.gabrielmarcos.core.network.services.NetworkState {
        public static final br.com.gabrielmarcos.core.network.services.NetworkState.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
}