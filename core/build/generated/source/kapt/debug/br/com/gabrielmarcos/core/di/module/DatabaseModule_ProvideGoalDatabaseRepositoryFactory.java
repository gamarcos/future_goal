// Generated by Dagger (https://dagger.dev).
package br.com.gabrielmarcos.core.di.module;

import br.com.gabrielmarcos.core.database.GoalDAO;
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideGoalDatabaseRepositoryFactory implements Factory<GoalDatabaseRepository> {
  private final DatabaseModule module;

  private final Provider<GoalDAO> daoProvider;

  public DatabaseModule_ProvideGoalDatabaseRepositoryFactory(DatabaseModule module,
      Provider<GoalDAO> daoProvider) {
    this.module = module;
    this.daoProvider = daoProvider;
  }

  @Override
  public GoalDatabaseRepository get() {
    return provideGoalDatabaseRepository(module, daoProvider.get());
  }

  public static DatabaseModule_ProvideGoalDatabaseRepositoryFactory create(DatabaseModule module,
      Provider<GoalDAO> daoProvider) {
    return new DatabaseModule_ProvideGoalDatabaseRepositoryFactory(module, daoProvider);
  }

  public static GoalDatabaseRepository provideGoalDatabaseRepository(DatabaseModule instance,
      GoalDAO dao) {
    return Preconditions.checkNotNull(instance.provideGoalDatabaseRepository(dao), "Cannot return null from a non-@Nullable @Provides method");
  }
}