package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mcj {
    public final lv7 a;
    public final x9h b;
    public final re3 c;
    public final rhg d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mcj(lv7 lv7Var, x9h x9hVar, re3 re3Var, rhg rhgVar, LinkedHashMap linkedHashMap, int i) {
        this(lv7Var, x9hVar, re3Var, rhgVar, r0, r7);
        boolean z;
        lv7Var = (i & 1) != 0 ? null : lv7Var;
        x9hVar = (i & 2) != 0 ? null : x9hVar;
        re3Var = (i & 4) != 0 ? null : re3Var;
        rhgVar = (i & 8) != 0 ? null : rhgVar;
        if ((i & 32) != 0) {
            z = false;
        } else {
            z = true;
        }
        Map map = linkedHashMap;
        if ((i & 64) != 0) {
            Map map2 = zc7.a;
            map2.getClass();
            map = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcj)) {
            return false;
        }
        mcj mcjVar = (mcj) obj;
        if (Intrinsics.areEqual(this.a, mcjVar.a) && Intrinsics.areEqual(this.b, mcjVar.b) && Intrinsics.areEqual(this.c, mcjVar.c) && Intrinsics.areEqual(this.d, mcjVar.d) && Intrinsics.areEqual(null, null) && this.e == mcjVar.e && Intrinsics.areEqual(this.f, mcjVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        lv7 lv7Var = this.a;
        if (lv7Var == null) {
            hashCode = 0;
        } else {
            hashCode = lv7Var.hashCode();
        }
        int i2 = hashCode * 31;
        x9h x9hVar = this.b;
        if (x9hVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = x9hVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        re3 re3Var = this.c;
        if (re3Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = re3Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        rhg rhgVar = this.d;
        if (rhgVar != null) {
            i = rhgVar.hashCode();
        }
        return this.f.hashCode() + hdi.g((i4 + i) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.a);
        sb.append(", slide=");
        sb.append(this.b);
        sb.append(", changeSize=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append(this.d);
        sb.append(", veil=null, hold=");
        sb.append(this.e);
        sb.append(", effectsMap=");
        return hdi.s(sb, this.f, ')');
    }

    public mcj(lv7 lv7Var, x9h x9hVar, re3 re3Var, rhg rhgVar, boolean z, Map map) {
        this.a = lv7Var;
        this.b = x9hVar;
        this.c = re3Var;
        this.d = rhgVar;
        this.e = z;
        this.f = map;
    }
}
