package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import com.fingerprintjs.android.fpjs_pro.NotAvailableWithoutUA;
import defpackage.hdi;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u0006*\u00028\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T1", "T2", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y3<V> implements Callable {
    public static int c;
    public static int d;
    public /* synthetic */ b4 a;
    public /* synthetic */ Sensor b;

    public static int a() {
        int i = c;
        int i2 = i % 9222939;
        c = i + 1;
        if (i2 != 0) {
            return d;
        }
        int b = hdi.b(1862976623);
        d = b;
        return b;
    }

    @Override // java.util.concurrent.Callable
    public final List<? extends List<? extends Float>> call() {
        b4 b4Var = this.a;
        int component9 = NotAvailableWithoutUA.component9();
        if (((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component9)).a) {
            Sensor sensor = this.b;
            int component92 = NotAvailableWithoutUA.component9();
            int i = ((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component92)).c;
            int component93 = NotAvailableWithoutUA.component9();
            long j = ((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component93)).b;
            int component94 = NotAvailableWithoutUA.component9();
            Object[] objArr = {b4Var, sensor, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(((unregisterForContextMenu) b4.a(new Object[]{b4Var}, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), 654279297, -654279297, NotAvailableWithoutUA.component9(), component94)).d)};
            int component95 = NotAvailableWithoutUA.component9();
            return (List) b4.a(objArr, NotAvailableWithoutUA.component9(), NotAvailableWithoutUA.component9(), -2085849857, 2085849858, NotAvailableWithoutUA.component9(), component95);
        }
        return CollectionsKt.emptyList();
    }
}
