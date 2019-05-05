package com.yarolegovich.discretescrollview;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author jltxseo
 * Created by junlintianxia on 2019/05/05.
 */
public class DSVCenter {
    /** @hide */
    @IntDef({START, CENTER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DSVCenterMode {}

    public static final int CENTER = 0;
    public static final int START = 1;
}
