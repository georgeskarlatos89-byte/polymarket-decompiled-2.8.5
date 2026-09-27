package defpackage;

import android.database.Observable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jsf extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).d(i, i2);
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).b(i, i2, obj);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).c(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).e(i, i2);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((ksf) ((Observable) this).mObservers.get(size)).f();
        }
    }
}
