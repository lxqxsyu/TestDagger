package doubihai.testdagger;

import javax.inject.Inject;

/**
 * Created by 水寒 on 2017/11/16.
 */

public class City {

    @Inject
    public Street street;

    @Inject
    public City(Street street) {
        this.street = street;
    }

    public String show(){
        return "成都市" + street.show();
    }
}
