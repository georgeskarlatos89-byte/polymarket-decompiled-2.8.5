package androidx.core.app;

import android.util.SparseIntArray;
import defpackage.oo8;
import defpackage.pxn;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class FrameMetricsAggregator {
    public final pxn a;

    /* JADX WARN: Type inference failed for: r0v0, types: [pxn, java.lang.Object] */
    public FrameMetricsAggregator(int i) {
        ?? obj = new Object();
        obj.b = new SparseIntArray[9];
        obj.c = new ArrayList();
        obj.d = new oo8(obj);
        obj.a = i;
        this.a = obj;
    }

    public FrameMetricsAggregator() {
        this(1);
    }
}
