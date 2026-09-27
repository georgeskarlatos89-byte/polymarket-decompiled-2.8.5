package com.socure.idplus.device.internal.utils;

import android.content.Context;
import io.sentry.l0;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return f.a((Context) obj);
            case 1:
                l0 l0Var = (l0) obj;
                try {
                    l0Var.e.getClass();
                    l0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    l0Var.c = System.currentTimeMillis() + l0Var.a;
                    l0Var.d.set(false);
                    return null;
                } catch (Throwable th) {
                    l0Var.d.set(false);
                    throw th;
                }
            case 2:
                return (Integer) ((AtomicReference) obj).get();
            default:
                return (Integer) obj;
        }
    }
}
