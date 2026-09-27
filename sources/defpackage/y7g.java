package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y7g extends b3 {
    public int c;
    public int d;
    public final /* synthetic */ z7g e;

    public y7g(z7g z7gVar) {
        this.e = z7gVar;
        this.c = z7gVar.size();
        this.d = z7gVar.d;
    }

    @Override // defpackage.b3
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        z7g z7gVar = this.e;
        Object[] objArr = z7gVar.b;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % z7gVar.c;
        this.c = i - 1;
    }
}
