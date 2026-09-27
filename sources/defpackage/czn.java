package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class czn extends c0o {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ c0o j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czn(c0o c0oVar, int i, int i2) {
        super(4);
        this.j = c0oVar;
        this.h = i;
        this.i = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tgn.c(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // defpackage.otk
    public final Object[] i() {
        return this.j.i();
    }

    @Override // defpackage.otk
    public final int j() {
        return this.j.j() + this.h;
    }

    @Override // defpackage.otk
    public final int k() {
        return this.j.j() + this.h + this.i;
    }

    @Override // defpackage.c0o
    public final c0o r(int i, int i2) {
        tgn.d(i, i2, this.i);
        int i3 = this.h;
        return this.j.r(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // defpackage.c0o, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return r(i, i2);
    }
}
