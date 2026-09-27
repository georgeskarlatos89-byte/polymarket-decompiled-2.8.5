package defpackage;

import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yx9 {
    public static final /* synthetic */ int g = 0;
    public final ky9 a;
    public final pwi b;
    public final Integer c;
    public final ooa d;
    public final zck e;
    public final u25 f;

    static {
        int i = BorderRadius.$stable;
    }

    public /* synthetic */ yx9(ky9 ky9Var, pwi pwiVar, Integer num, ooa ooaVar, u25 u25Var, int i) {
        this(ky9Var, pwiVar, (i & 4) != 0 ? null : num, ooaVar, (zck) null, (i & 32) != 0 ? new u25(null, 15) : u25Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx9)) {
            return false;
        }
        yx9 yx9Var = (yx9) obj;
        if (Intrinsics.areEqual(this.a, yx9Var.a) && Intrinsics.areEqual(this.b, yx9Var.b) && Intrinsics.areEqual(this.c, yx9Var.c) && Intrinsics.areEqual(this.d, yx9Var.d) && Intrinsics.areEqual(this.e, yx9Var.e) && Intrinsics.areEqual(this.f, yx9Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i = 0;
        pwi pwiVar = this.b;
        if (pwiVar == null) {
            hashCode = 0;
        } else {
            hashCode = pwiVar.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Integer num = this.c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ooa ooaVar = this.d;
        if (ooaVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = ooaVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        zck zckVar = this.e;
        if (zckVar != null) {
            i = zckVar.hashCode();
        }
        return this.f.hashCode() + ((i4 + i) * 31);
    }

    public final String toString() {
        return "InputComponentStyle(inputFieldStyle=" + this.a + ", errorMessageStyle=" + this.b + ", defaultTextMaxLength=" + this.c + ", keyboardOptions=" + this.d + ", visualTransformation=" + this.e + ", containerStyle=" + this.f + ")";
    }

    public yx9(ky9 ky9Var, pwi pwiVar, Integer num, ooa ooaVar, zck zckVar, u25 u25Var) {
        u25Var.getClass();
        this.a = ky9Var;
        this.b = pwiVar;
        this.c = num;
        this.d = ooaVar;
        this.e = zckVar;
        this.f = u25Var;
    }
}
