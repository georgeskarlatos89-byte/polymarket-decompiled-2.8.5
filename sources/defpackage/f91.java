package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f91 implements d91 {
    public float a;
    public final Object b;

    public f91(List list) {
        this.a = -1.0f;
        this.b = (soa) list.get(0);
    }

    @Override // defpackage.d91
    public boolean g(float f) {
        if (this.a == f) {
            return true;
        }
        this.a = f;
        return false;
    }

    @Override // defpackage.d91
    public soa i() {
        return (soa) this.b;
    }

    @Override // defpackage.d91
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.d91
    public boolean j(float f) {
        return !((soa) this.b).c();
    }

    @Override // defpackage.d91
    public float l() {
        return ((soa) this.b).b();
    }

    @Override // defpackage.d91
    public float u() {
        return ((soa) this.b).a();
    }

    public /* synthetic */ f91(Object obj, float f) {
        this.b = obj;
        this.a = f;
    }
}
