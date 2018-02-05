package doubihai.testdagger.mvp;

import android.app.Application;
import android.content.Context;

/**
 * Created by 水寒 on 2018/2/3.
 */

public class CustomeApplication extends Application{

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static CustomeApplication get(Context context) {
        return (CustomeApplication) context.getApplicationContext();
    }

    private void setupApplicationComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        if(appComponent == null){
            this.setupApplicationComponent();
        }
        return appComponent;
    }
}
