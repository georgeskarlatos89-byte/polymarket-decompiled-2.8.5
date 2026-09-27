package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n9a extends tuj {
    public final Object b;
    public boolean c;

    public n9a(Object obj) {
        super(0);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c) {
            this.c = true;
            return this.b;
        }
        dmk.t();
        return null;
    }
}
