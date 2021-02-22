package br.com.gabrielmarcos.core.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"viewModel", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "key", "", "factory", "Lkotlin/Function0;", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "core_debug"})
public final class FragmentExtensionsKt {
    
    /**
     * Generic view model provider.
     *
     * @param key The key to use to identify the ViewModel.
     * @param factory Function creates a new instance of the ViewModel.
     * @return A ViewModel that is an instance of the given type [VM].
     * @see ViewModel
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public static final <VM extends androidx.lifecycle.ViewModel>VM viewModel(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$viewModel, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends VM> factory) {
        return null;
    }
}