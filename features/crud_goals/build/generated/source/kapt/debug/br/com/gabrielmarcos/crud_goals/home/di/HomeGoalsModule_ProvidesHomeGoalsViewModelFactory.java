// Generated by Dagger (https://dagger.dev).
package br.com.gabrielmarcos.crud_goals.home.di;

import br.com.gabrielmarcos.core.database.GoalDatabaseRepository;
import br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository;
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeGoalsModule_ProvidesHomeGoalsViewModelFactory implements Factory<HomeGoalsViewModel> {
  private final HomeGoalsModule module;

  private final Provider<GoalDatabaseRepository> repositoryProvider;

  private final Provider<GoalsFirebaseRepository> firebaseRepositoryProvider;

  public HomeGoalsModule_ProvidesHomeGoalsViewModelFactory(HomeGoalsModule module,
      Provider<GoalDatabaseRepository> repositoryProvider,
      Provider<GoalsFirebaseRepository> firebaseRepositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.firebaseRepositoryProvider = firebaseRepositoryProvider;
  }

  @Override
  public HomeGoalsViewModel get() {
    return providesHomeGoalsViewModel(module, repositoryProvider.get(), firebaseRepositoryProvider.get());
  }

  public static HomeGoalsModule_ProvidesHomeGoalsViewModelFactory create(HomeGoalsModule module,
      Provider<GoalDatabaseRepository> repositoryProvider,
      Provider<GoalsFirebaseRepository> firebaseRepositoryProvider) {
    return new HomeGoalsModule_ProvidesHomeGoalsViewModelFactory(module, repositoryProvider, firebaseRepositoryProvider);
  }

  public static HomeGoalsViewModel providesHomeGoalsViewModel(HomeGoalsModule instance,
      GoalDatabaseRepository repository, GoalsFirebaseRepository firebaseRepository) {
    return Preconditions.checkNotNull(instance.providesHomeGoalsViewModel(repository, firebaseRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
