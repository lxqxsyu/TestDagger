package doubihai.testdagger;

import javax.inject.Inject;

/**
 * Created by 水寒 on 2017/11/16.
 */

public class Street {

    @Inject
    public Street(){

    }

    public String show(){
        return "人民南路";
    }
}
