package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum xj4 {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<xj4> valueMap;
    private final int value;

    static {
        xj4 xj4Var = NOT_SET;
        xj4 xj4Var2 = EVENT_OVERRIDE;
        SparseArray<xj4> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, xj4Var);
        sparseArray.put(5, xj4Var2);
    }

    xj4(int i) {
        this.value = i;
    }
}
