package io.sentry.featureflags;

import defpackage.m51;
import io.sentry.protocol.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a implements b {
    public volatile CopyOnWriteArrayList a;
    public final io.sentry.util.a b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.util.a] */
    public a(a aVar) {
        this.b = new Object();
        this.a = new CopyOnWriteArrayList(aVar.a);
    }

    @Override // io.sentry.featureflags.b
    public final void clear() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            this.a.clear();
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.featureflags.b
    public final b clone() {
        return new a(this);
    }

    @Override // io.sentry.featureflags.b
    public final j o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            return new j(arrayList);
        }
        throw m51.g(it);
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m874clone() {
        return new a(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, io.sentry.util.a] */
    public a(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.b = new Object();
        this.a = copyOnWriteArrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, io.sentry.util.a] */
    public a(int i) {
        this.b = new Object();
        this.a = new CopyOnWriteArrayList();
    }
}
