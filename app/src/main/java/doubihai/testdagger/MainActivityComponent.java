package doubihai.testdagger;

import dagger.Component;

/**
 * Created by 水寒 on 2017/11/16.
 */

@Component
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
