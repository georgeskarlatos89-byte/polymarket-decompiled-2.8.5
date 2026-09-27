package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dck {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dck(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(pnb pnbVar) {
        pnbVar.getClass();
        int i = cck.a[pnbVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.b;
                }
                dmk.a();
                return 0;
            }
            return this.a;
        }
        dmk.v("Cannot get presentedItems for loadType: REFRESH");
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dck)) {
            return false;
        }
        dck dckVar = (dck) obj;
        if (this.a == dckVar.a && this.b == dckVar.b && this.c == dckVar.c && this.d == dckVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
    }
}
