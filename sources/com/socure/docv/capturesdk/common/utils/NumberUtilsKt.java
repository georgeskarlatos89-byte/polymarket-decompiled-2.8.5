package com.socure.docv.capturesdk.common.utils;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004¨\u0006\u0005"}, d2 = {"floatArrayOf", "", "entries", "", "", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NumberUtilsKt {
    public static final float[] floatArrayOf(double... dArr) {
        dArr.getClass();
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Float.valueOf((float) d));
        }
        return CollectionsKt.J0(arrayList);
    }
}
