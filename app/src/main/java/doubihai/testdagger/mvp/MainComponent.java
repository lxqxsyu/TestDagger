package doubihai.testdagger.mvp;

import dagger.Subcomponent;

/**
 * Created by 水寒 on 2018/2/3.
 */

@ActivityScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent {

    void inject(MainMvpActivity mainMvpActivity);
}
