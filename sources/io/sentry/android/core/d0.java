package io.sentry.android.core;

import android.view.View;
import defpackage.dgn;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d0 extends CopyOnWriteArrayList {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) obj;
                boolean add = super.add(c0Var);
                if (Boolean.FALSE.equals(((e0) this.b).b.d)) {
                    c0Var.e();
                } else if (Boolean.TRUE.equals(((e0) this.b).b.d)) {
                    c0Var.g();
                }
                return add;
            default:
                io.sentry.android.replay.f fVar = (io.sentry.android.replay.f) obj;
                io.sentry.android.replay.r rVar = (io.sentry.android.replay.r) this.b;
                io.sentry.util.a aVar = rVar.b;
                aVar.e();
                try {
                    Iterator it = rVar.d.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if (fVar != null) {
                            fVar.e(view, true);
                        }
                    }
                    dgn.a(aVar, null);
                    return super.add(fVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        dgn.a(aVar, th);
                        throw th2;
                    }
                }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        boolean z;
        switch (this.a) {
            case 1:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof io.sentry.android.replay.f;
                }
                if (!z) {
                    return false;
                }
                return super.contains((io.sentry.android.replay.f) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        boolean z;
        switch (this.a) {
            case 1:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof io.sentry.android.replay.f;
                }
                if (!z) {
                    return -1;
                }
                return super.indexOf((io.sentry.android.replay.f) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        switch (this.a) {
            case 1:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof io.sentry.android.replay.f;
                }
                if (!z) {
                    return -1;
                }
                return super.lastIndexOf((io.sentry.android.replay.f) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        boolean z;
        switch (this.a) {
            case 1:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof io.sentry.android.replay.f;
                }
                if (!z) {
                    return false;
                }
                return super.remove((io.sentry.android.replay.f) obj);
            default:
                return super.remove(obj);
        }
    }
}
