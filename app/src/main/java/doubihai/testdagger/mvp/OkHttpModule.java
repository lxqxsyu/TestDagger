package doubihai.testdagger.mvp;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 水寒 on 2018/2/3.
 */

@Module
public class OkHttpModule {

    @Singleton
    @Provides
    @Named("default")
    public OkHttpClient providerOkHttpClient(){
        return new OkHttpClient();
    }
}
