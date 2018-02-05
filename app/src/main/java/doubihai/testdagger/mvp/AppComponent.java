package doubihai.testdagger.mvp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 水寒 on 2018/2/3.
 */

@Singleton
@Component(modules = {AppModule.class, OkHttpModule.class})
public interface AppComponent {
    MainComponent addSub(MainModule mainModule);
}
