// Generated by Dagger (https://dagger.dev).
package br.com.gabrielmarcos.crud_goals.home.di;

import br.com.gabrielmarcos.core.database.GoalDAO;
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository;
import br.com.gabrielmarcos.core.database.GoalDatabaseRepository_Factory;
import br.com.gabrielmarcos.core.di.CoreComponent;
import br.com.gabrielmarcos.core.network.repositories.GoalsFirebaseRepository;
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsFragment;
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsFragment_MembersInjector;
import br.com.gabrielmarcos.crud_goals.home.ui.HomeGoalsViewModel;
import br.com.gabrielmarcos.crud_goals.home.ui.adapter.HomeGoalsAdapter;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerHomeGoalsComponent implements HomeGoalsComponent {
  private Provider<GoalDAO> goalDAOProvider;

  private Provider<GoalDatabaseRepository> goalDatabaseRepositoryProvider;

  private Provider<GoalsFirebaseRepository> goalsRemoteRepositoryProvider;

  private Provider<HomeGoalsViewModel> providesHomeGoalsViewModelProvider;

  private Provider<HomeGoalsAdapter> providesHomeGoalsAdapterProvider;

  private DaggerHomeGoalsComponent(HomeGoalsModule homeGoalsModuleParam,
      CoreComponent coreComponentParam) {

    initialize(homeGoalsModuleParam, coreComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final HomeGoalsModule homeGoalsModuleParam,
      final CoreComponent coreComponentParam) {
    this.goalDAOProvider = new br_com_gabrielmarcos_core_di_CoreComponent_goalDAO(coreComponentParam);
    this.goalDatabaseRepositoryProvider = GoalDatabaseRepository_Factory.create(goalDAOProvider);
    this.goalsRemoteRepositoryProvider = new br_com_gabrielmarcos_core_di_CoreComponent_goalsRemoteRepository(coreComponentParam);
    this.providesHomeGoalsViewModelProvider = DoubleCheck.provider(HomeGoalsModule_ProvidesHomeGoalsViewModelFactory.create(homeGoalsModuleParam, goalDatabaseRepositoryProvider, goalsRemoteRepositoryProvider));
    this.providesHomeGoalsAdapterProvider = DoubleCheck.provider(HomeGoalsModule_ProvidesHomeGoalsAdapterFactory.create(homeGoalsModuleParam));
  }

  @Override
  public void inject(HomeGoalsFragment homeGoalsFragment) {
    injectHomeGoalsFragment(homeGoalsFragment);
  }

  private HomeGoalsFragment injectHomeGoalsFragment(HomeGoalsFragment instance) {
    HomeGoalsFragment_MembersInjector.injectViewModel(instance, providesHomeGoalsViewModelProvider.get());
    HomeGoalsFragment_MembersInjector.injectViewAdapter(instance, providesHomeGoalsAdapterProvider.get());
    return instance;
  }

  public static final class Builder {
    private HomeGoalsModule homeGoalsModule;

    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder homeGoalsModule(HomeGoalsModule homeGoalsModule) {
      this.homeGoalsModule = Preconditions.checkNotNull(homeGoalsModule);
      return this;
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public HomeGoalsComponent build() {
      Preconditions.checkBuilderRequirement(homeGoalsModule, HomeGoalsModule.class);
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new DaggerHomeGoalsComponent(homeGoalsModule, coreComponent);
    }
  }

  private static class br_com_gabrielmarcos_core_di_CoreComponent_goalDAO implements Provider<GoalDAO> {
    private final CoreComponent coreComponent;

    br_com_gabrielmarcos_core_di_CoreComponent_goalDAO(CoreComponent coreComponent) {
      this.coreComponent = coreComponent;
    }

    @Override
    public GoalDAO get() {
      return Preconditions.checkNotNull(coreComponent.goalDAO(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class br_com_gabrielmarcos_core_di_CoreComponent_goalsRemoteRepository implements Provider<GoalsFirebaseRepository> {
    private final CoreComponent coreComponent;

    br_com_gabrielmarcos_core_di_CoreComponent_goalsRemoteRepository(CoreComponent coreComponent) {
      this.coreComponent = coreComponent;
    }

    @Override
    public GoalsFirebaseRepository get() {
      return Preconditions.checkNotNull(coreComponent.goalsRemoteRepository(), "Cannot return null from a non-@Nullable component method");
    }
  }
}