package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class hs7 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ws5 d;
    public final oui e;
    public final Map f;

    public hs7(String str, boolean z, boolean z2, ws5 ws5Var) {
        oui ouiVar;
        Map map;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = ws5Var;
        if (!Intrinsics.areEqual(str, "•• / ••") && !Intrinsics.areEqual(str, "")) {
            ouiVar = ws5Var.v(str);
        } else {
            ouiVar = pui.b;
        }
        this.e = ouiVar;
        if (ouiVar.isValid()) {
            map = g63.a(new lk8(str, false));
        } else {
            map = null;
        }
        this.f = map;
    }

    public static hs7 a(hs7 hs7Var, String str, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = hs7Var.a;
        }
        boolean z2 = hs7Var.b;
        if ((i & 4) != 0) {
            z = hs7Var.c;
        } else {
            z = true;
        }
        return new hs7(str, z2, z, hs7Var.d);
    }

    public final Integer b() {
        String str;
        Integer intOrNull;
        int intValue;
        Map map = this.f;
        if (map != null) {
            ll9.Companion.getClass();
            lk8 lk8Var = (lk8) map.get(ll9.j);
            if (lk8Var != null && (str = lk8Var.a) != null && (intOrNull = StringsKt.toIntOrNull(str)) != null && 1 <= (intValue = intOrNull.intValue()) && intValue <= 12) {
                return intOrNull;
            }
        }
        return null;
    }

    public final Integer c() {
        String str;
        Integer intOrNull;
        int intValue;
        Map map = this.f;
        if (map != null) {
            ll9.Companion.getClass();
            lk8 lk8Var = (lk8) map.get(ll9.k);
            if (lk8Var != null && (str = lk8Var.a) != null && (intOrNull = StringsKt.toIntOrNull(str)) != null && 2000 <= (intValue = intOrNull.intValue()) && intValue <= 2100) {
                return intOrNull;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hs7) {
                hs7 hs7Var = (hs7) obj;
                if (!Intrinsics.areEqual(this.a, hs7Var.a) || this.b != hs7Var.b || this.c != hs7Var.c || !Intrinsics.areEqual(this.d, hs7Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.g(hdi.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder r = g.r("ExpiryDateState(text=", this.a, ", enabled=", ", validating=", this.b);
        r.append(this.c);
        r.append(", dateConfig=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
