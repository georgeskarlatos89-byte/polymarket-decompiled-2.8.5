package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o8c implements zfd {
    public final olb a;
    public final zfd b;
    public int c = -1;

    public o8c(olb olbVar, zfd zfdVar) {
        this.a = olbVar;
        this.b = zfdVar;
    }

    public final void a() {
        this.a.j(this);
    }

    @Override // defpackage.zfd
    public final void onChanged(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.onChanged(obj);
        }
    }
}
