// Generated by Dagger (https://dagger.dev).
package br.com.gabrielmarcos.navigation.di;

import br.com.gabrielmarcos.core.di.CoreComponent;
import br.com.gabrielmarcos.navigation.NavigationManagerFragment;
import br.com.gabrielmarcos.navigation.NavigationManagerFragment_MembersInjector;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerNavigationComponent implements NavigationComponent {
  private final CoreComponent coreComponent;

  private DaggerNavigationComponent(CoreComponent coreComponentParam) {
    this.coreComponent = coreComponentParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void inject(NavigationManagerFragment navigationManagerFragment) {
    injectNavigationManagerFragment(navigationManagerFragment);
  }

  private NavigationManagerFragment injectNavigationManagerFragment(
      NavigationManagerFragment instance) {
    NavigationManagerFragment_MembersInjector.injectThemeUtils(instance, Preconditions.checkNotNull(coreComponent.themeUtils(), "Cannot return null from a non-@Nullable component method"));
    return instance;
  }

  public static final class Builder {
    private CoreComponent coreComponent;

    private Builder() {
    }

    public Builder coreComponent(CoreComponent coreComponent) {
      this.coreComponent = Preconditions.checkNotNull(coreComponent);
      return this;
    }

    public NavigationComponent build() {
      Preconditions.checkBuilderRequirement(coreComponent, CoreComponent.class);
      return new DaggerNavigationComponent(coreComponent);
    }
  }
}
