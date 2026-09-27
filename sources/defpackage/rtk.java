package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rtk extends ttk {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ ttk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtk(ttk ttkVar, int i, int i2) {
        super(0);
        this.j = ttkVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.otk
    public final int b() {
        return this.j.c() + this.h + this.i;
    }

    @Override // defpackage.otk
    public final int c() {
        return this.j.c() + this.h;
    }

    @Override // defpackage.otk
    public final Object[] d() {
        return this.j.d();
    }

    @Override // java.util.List
    public final Object get(int i) {
        g8n.a(i, this.i);
        return this.j.get(i + this.h);
    }

    @Override // defpackage.ttk
    public final ttk r(int i, int i2) {
        g8n.b(i, i2, this.i);
        int i3 = this.h;
        return this.j.r(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // defpackage.ttk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return r(i, i2);
    }
}
