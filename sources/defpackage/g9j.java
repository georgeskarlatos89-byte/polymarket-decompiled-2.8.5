package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g9j {
    public final int a;
    public final m8j b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        u1k.G(0);
        u1k.G(1);
        u1k.G(3);
        u1k.G(4);
    }

    public g9j(m8j m8jVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i = m8jVar.a;
        this.a = i;
        boolean z3 = false;
        if (i == iArr.length && i == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        pfn.b(z2);
        this.b = m8jVar;
        if (z && i > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i) {
        if (this.d[i] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g9j.class == obj.getClass()) {
                g9j g9jVar = (g9j) obj;
                if (this.c == g9jVar.c && this.b.equals(g9jVar.b) && Arrays.equals(this.d, g9jVar.d) && Arrays.equals(this.e, g9jVar.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
