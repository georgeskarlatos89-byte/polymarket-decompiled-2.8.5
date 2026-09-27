package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wyd implements ayf {
    public final Set a;
    public final zqc b = new zqc(new xr8[16]);

    public wyd(Set set) {
        this.a = set;
    }

    @Override // defpackage.ayf
    public final void a() {
        zqc zqcVar = this.b;
        Object[] objArr = zqcVar.a;
        int i = zqcVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ayf ayfVar = ((xr8) objArr[i2]).a;
            this.a.remove(ayfVar);
            ayfVar.a();
        }
    }

    @Override // defpackage.ayf
    public final void b() {
    }

    @Override // defpackage.ayf
    public final void c() {
    }
}
