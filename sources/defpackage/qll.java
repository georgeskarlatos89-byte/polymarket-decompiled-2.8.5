package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qll extends sll {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ sll e;

    public qll(sll sllVar, int i, int i2) {
        this.e = sllVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.wkl
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // defpackage.wkl
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // defpackage.wkl
    public final Object[] d() {
        return this.e.d();
    }

    @Override // defpackage.sll
    public final sll f(int i, int i2) {
        scn.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.f(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        scn.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.sll, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return f(i, i2);
    }
}
