package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum vif {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<vif> valueMap;
    private final int value;

    static {
        vif vifVar = DEFAULT;
        vif vifVar2 = UNMETERED_ONLY;
        vif vifVar3 = UNMETERED_OR_DAILY;
        vif vifVar4 = FAST_IF_RADIO_AWAKE;
        vif vifVar5 = NEVER;
        vif vifVar6 = UNRECOGNIZED;
        SparseArray<vif> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, vifVar);
        sparseArray.put(1, vifVar2);
        sparseArray.put(2, vifVar3);
        sparseArray.put(3, vifVar4);
        sparseArray.put(4, vifVar5);
        sparseArray.put(-1, vifVar6);
    }

    vif(int i) {
        this.value = i;
    }
}
