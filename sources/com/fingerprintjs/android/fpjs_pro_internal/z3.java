package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import com.fingerprintjs.android.fpjs_pro.NotAvailableWithoutUA;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u0006*\u00028\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T1", "T2", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z3<V> implements Callable {
    public static int c = 0;
    public static int d = 1;
    public /* synthetic */ b4 a;
    public /* synthetic */ Sensor b;

    @Override // java.util.concurrent.Callable
    public final List<? extends List<? extends Float>> call() {
        d = (c + 59) % 128;
        b4 b4Var = this.a;
        int component9 = NotAvailableWithoutUA.component9();
        if (((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component9)).e) {
            int i = d;
            c = ((i & 125) + (i | 125)) % 128;
            Sensor sensor = this.b;
            int component92 = NotAvailableWithoutUA.component9();
            int i2 = ((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component92)).g;
            int component93 = NotAvailableWithoutUA.component9();
            long j = ((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component93)).f;
            int component94 = NotAvailableWithoutUA.component9();
            Object[] objArr = {b4Var, sensor, Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component94)).h)};
            int component95 = NotAvailableWithoutUA.component9();
            List<? extends List<? extends Float>> list = (List) b4.a(objArr, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), -2085849857, 2085849858, NotAvailableWithoutUA.component9(), component95);
            int i3 = c;
            d = (((i3 | 1) << 1) - (i3 ^ 1)) % 128;
            return list;
        }
        List<? extends List<? extends Float>> emptyList = CollectionsKt.emptyList();
        int i4 = d;
        int i5 = (i4 & 109) + (i4 | 109);
        c = i5 % 128;
        if (i5 % 2 == 0) {
            return emptyList;
        }
        throw null;
    }
}
