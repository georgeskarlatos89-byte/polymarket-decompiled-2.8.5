package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class utk extends ttk {
    public static final utk i = new utk(new Object[0]);
    public final transient Object[] h;

    public utk(Object[] objArr) {
        super(0);
        this.h = objArr;
    }

    @Override // defpackage.ttk, defpackage.otk
    public final int a(Object[] objArr) {
        System.arraycopy(this.h, 0, objArr, 0, 0);
        return 0;
    }

    @Override // defpackage.otk
    public final int b() {
        return 0;
    }

    @Override // defpackage.otk
    public final int c() {
        return 0;
    }

    @Override // defpackage.otk
    public final Object[] d() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        g8n.a(i2, 0);
        Object obj = this.h[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
