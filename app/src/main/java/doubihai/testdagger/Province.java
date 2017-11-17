package doubihai.testdagger;

import javax.inject.Inject;

/**
 * Created by 水寒 on 2017/11/16.
 */

public class Province {

    @Inject
    public City city;

    @Inject
    public Province(City city) {
        this.city = city;
    }

    public String showAddress() {
        return "四川省" + city.show();
    }
}
