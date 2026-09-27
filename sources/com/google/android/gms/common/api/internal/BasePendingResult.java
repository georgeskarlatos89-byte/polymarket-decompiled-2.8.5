package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.aj;
import defpackage.arn;
import defpackage.dx8;
import defpackage.k2l;
import defpackage.p3l;
import defpackage.s3l;
import defpackage.x5g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends x5g> {
    public static final aj j = new aj(17);
    public x5g e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(dx8 dx8Var) {
        Looper mainLooper;
        if (dx8Var != null) {
            mainLooper = ((k2l) dx8Var).b.getLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        new p3l(mainLooper, 0);
        new WeakReference(dx8Var);
    }

    public final void a(s3l s3lVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    s3lVar.a(this.f);
                } else {
                    this.c.add(s3lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract x5g b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.b.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void e(x5g x5gVar) {
        synchronized (this.a) {
            try {
                if (!this.h) {
                    d();
                    arn.j("Results have already been set", !d());
                    arn.j("Result has already been consumed", !this.g);
                    this.e = x5gVar;
                    this.f = x5gVar.c();
                    this.b.countDown();
                    ArrayList arrayList = this.c;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((s3l) arrayList.get(i)).a(this.f);
                    }
                    arrayList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
