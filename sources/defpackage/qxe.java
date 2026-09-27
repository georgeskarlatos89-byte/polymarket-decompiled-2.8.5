package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qxe extends pxe {
    private final Object c;

    public qxe(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.pxe, defpackage.oxe
    public final boolean a(Object obj) {
        boolean a;
        obj.getClass();
        synchronized (this.c) {
            a = super.a(obj);
        }
        return a;
    }

    @Override // defpackage.pxe, defpackage.oxe
    public final Object c() {
        Object c;
        synchronized (this.c) {
            c = super.c();
        }
        return c;
    }
}
