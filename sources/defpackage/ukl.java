package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ukl extends tuj {
    public static final Object c = new Object();
    public Object b;

    public ukl(Object obj) {
        super(6);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        dmk.t();
        return null;
    }
}
