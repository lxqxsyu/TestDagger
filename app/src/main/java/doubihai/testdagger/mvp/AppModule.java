package doubihai.testdagger.mvp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 水寒 on 2018/2/3.
 */
@Module
public class AppModule {

    private Context context;

    public AppModule(CustomeApplication application) {
        this.context = application;
    }

    @Singleton
    @Provides
    public Context ProviderApplicationContext(){
        return context;
    }

    @Singleton
    @Provides
    @Named("default")
    public SharedPreferences providerDefaultSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Singleton
    @Provides
    @Named("encode")
    public SharedPreferences providerEncodeSharedPreferences(){
        return context.getSharedPreferences("encode",Context.MODE_PRIVATE);
    }
}
