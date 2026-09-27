package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class yuk extends h1l {
    public final /* synthetic */ zuk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuk(zuk zukVar, epi epiVar) {
        super(epiVar);
        this.b = zukVar;
    }

    @Override // defpackage.h1l
    public final void a(Exception exc) {
        if (!(exc instanceof itk)) {
            super.a(exc);
        } else if (zuk.d(this.b)) {
            super.a(new vuh(-2, exc));
        } else {
            super.a(new vuh(-9, exc));
        }
    }
}
