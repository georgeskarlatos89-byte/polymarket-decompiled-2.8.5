package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lyg implements myg {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final myg b;

    public lyg(myg mygVar) {
        this.b = mygVar;
    }

    @Override // defpackage.myg
    public final void a(qyg qygVar, nyg nygVar) {
        if (!this.a.get()) {
            this.b.a(qygVar, nygVar);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
