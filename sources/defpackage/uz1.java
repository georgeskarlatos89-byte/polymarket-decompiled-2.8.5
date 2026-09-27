package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class uz1 {
    public final ArrayList a;
    public final String b;
    public final wz1 c;
    public final kz1 d;
    public final LinkedHashMap e;

    public uz1(ArrayList arrayList, String str, wz1 wz1Var, kz1 kz1Var, LinkedHashMap linkedHashMap) {
        kz1Var.getClass();
        this.a = arrayList;
        this.b = str;
        this.c = wz1Var;
        this.d = kz1Var;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uz1) {
                uz1 uz1Var = (uz1) obj;
                if (!Intrinsics.areEqual(this.a, uz1Var.a) || !Intrinsics.areEqual(this.b, uz1Var.b) || !Intrinsics.areEqual(this.c, uz1Var.c) || this.d != uz1Var.d || !Intrinsics.areEqual(this.e, uz1Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "Result(digits=" + this.a + ", displayValue=" + this.b + ", transition=" + this.c + ", animationStyle=" + this.d + ", digitsByPosition=" + this.e + ")";
    }
}
