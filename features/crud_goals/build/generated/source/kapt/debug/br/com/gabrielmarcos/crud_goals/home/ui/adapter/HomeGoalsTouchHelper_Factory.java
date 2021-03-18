// Generated by Dagger (https://dagger.dev).
package br.com.gabrielmarcos.crud_goals.home.ui.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeGoalsTouchHelper_Factory implements Factory<HomeGoalsTouchHelper> {
  private final Provider<Function1<? super Integer, Unit>> onSwipedProvider;

  public HomeGoalsTouchHelper_Factory(Provider<Function1<? super Integer, Unit>> onSwipedProvider) {
    this.onSwipedProvider = onSwipedProvider;
  }

  @Override
  public HomeGoalsTouchHelper get() {
    return newInstance(onSwipedProvider.get());
  }

  public static HomeGoalsTouchHelper_Factory create(
      Provider<Function1<? super Integer, Unit>> onSwipedProvider) {
    return new HomeGoalsTouchHelper_Factory(onSwipedProvider);
  }

  public static HomeGoalsTouchHelper newInstance(Function1<? super Integer, Unit> onSwiped) {
    return new HomeGoalsTouchHelper(onSwiped);
  }
}