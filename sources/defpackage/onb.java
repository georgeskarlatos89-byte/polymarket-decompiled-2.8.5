package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class onb {
    public static final onb f;
    public final ey3 a;
    public final ey3 b;
    public final ey3 c;
    public final boolean d;
    public final boolean e;

    static {
        mnb mnbVar = mnb.c;
        f = new onb(mnbVar, mnbVar, mnbVar);
    }

    public onb(ey3 ey3Var, ey3 ey3Var2, ey3 ey3Var3) {
        boolean z;
        this.a = ey3Var;
        this.b = ey3Var2;
        this.c = ey3Var3;
        if (!(ey3Var instanceof knb) && !(ey3Var3 instanceof knb) && !(ey3Var2 instanceof knb)) {
            z = false;
        } else {
            z = true;
        }
        this.d = z;
        this.e = (ey3Var instanceof mnb) && (ey3Var3 instanceof mnb) && (ey3Var2 instanceof mnb);
    }

    public static onb a(onb onbVar, int i) {
        ey3 ey3Var;
        ey3 ey3Var2;
        int i2 = i & 1;
        ey3 ey3Var3 = mnb.c;
        if (i2 != 0) {
            ey3Var = onbVar.a;
        } else {
            ey3Var = ey3Var3;
        }
        if ((i & 2) != 0) {
            ey3Var2 = onbVar.b;
        } else {
            ey3Var2 = ey3Var3;
        }
        if ((i & 4) != 0) {
            ey3Var3 = onbVar.c;
        }
        return new onb(ey3Var, ey3Var2, ey3Var3);
    }

    public final onb b(pnb pnbVar) {
        pnbVar.getClass();
        int i = nnb.a[pnbVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return a(this, 6);
                }
                dmk.a();
                return null;
            }
            return a(this, 5);
        }
        return a(this, 3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof onb) {
                onb onbVar = (onb) obj;
                if (!Intrinsics.areEqual(this.a, onbVar.a) || !Intrinsics.areEqual(this.b, onbVar.b) || !Intrinsics.areEqual(this.c, onbVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}
