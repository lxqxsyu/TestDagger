package doubihai.testdagger.zhainan;

import javax.inject.Inject;

/**
 * Created by 水寒 on 2018/2/5.
 */

public class ZhaiNan {

    @Inject
    Baozi baozi;

    @Inject
    Noodle noodle;

    @Inject
    public ZhaiNan() {

    }


    public String eat() {
        StringBuilder sb = new StringBuilder();
        sb.append("我吃的是 ");
        if ( baozi != null ) {
            sb.append(baozi.toString());
        }

        if (noodle != null) {
            sb.append("  ");
            sb.append(noodle.toString());
        }
        return sb.toString();
    }
}
