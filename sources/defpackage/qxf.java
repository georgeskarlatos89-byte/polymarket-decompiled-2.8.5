package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qxf {
    public final n5a a;
    public final n5a b;
    public final Function2 c;
    public final Function0 d;
    public final Function1 e;

    public qxf(n5a n5aVar, n5a n5aVar2, b95 b95Var, m53 m53Var, k53 k53Var) {
        this.a = n5aVar;
        this.b = n5aVar2;
        this.c = b95Var;
        this.d = m53Var;
        this.e = k53Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qxf) {
                qxf qxfVar = (qxf) obj;
                if (!Intrinsics.areEqual(this.a, qxfVar.a) || !Intrinsics.areEqual(this.b, qxfVar.b) || !Intrinsics.areEqual(this.c, qxfVar.c) || !Intrinsics.areEqual(this.d, qxfVar.d) || !Intrinsics.areEqual(this.e, qxfVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        Function2 function2 = this.c;
        if (function2 == null) {
            hashCode = 0;
        } else {
            hashCode = function2.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Function0 function0 = this.d;
        if (function0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = function0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function1 function1 = this.e;
        if (function1 != null) {
            i = function1.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "RememberMeCallback(onChange=" + this.a + ", onSubmit=" + this.b + ", onTokenized=" + this.c + ", handlePayButtonTap=" + this.d + ", onCardBinChanged=" + this.e + ")";
    }
}
