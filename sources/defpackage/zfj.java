package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zfj implements xfj {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ wfj c;

    public zfj(Class cls, Class cls2, wfj wfjVar) {
        this.a = cls;
        this.b = cls2;
        this.c = wfjVar;
    }

    @Override // defpackage.xfj
    public final wfj a(i19 i19Var, jij jijVar) {
        Class cls = jijVar.a;
        if (cls != this.a && cls != this.b) {
            return null;
        }
        return this.c;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
