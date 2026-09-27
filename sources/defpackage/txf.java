package defpackage;

import com.checkout.components.interfaces.component.AcceptedCardSchemes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class txf implements AcceptedCardSchemes {
    public final sxf a;
    public final Boolean b;
    public final List c;

    public txf(sxf sxfVar, int i) {
        Boolean bool;
        sxfVar = (i & 1) != 0 ? null : sxfVar;
        if ((i & 2) != 0) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        this.a = sxfVar;
        this.b = bool;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txf)) {
            return false;
        }
        txf txfVar = (txf) obj;
        if (Intrinsics.areEqual(this.a, txfVar.a) && Intrinsics.areEqual(this.b, txfVar.b) && Intrinsics.areEqual(this.c, txfVar.c)) {
            return true;
        }
        return false;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardSchemes
    public final List getAcceptedCardSchemes() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        sxf sxfVar = this.a;
        if (sxfVar == null) {
            hashCode = 0;
        } else {
            hashCode = sxfVar.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.b;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RememberMeConfiguration(data=");
        sb.append(this.a);
        sb.append(", showPayButton=");
        sb.append(this.b);
        sb.append(", acceptedCardSchemes=");
        return ix2.q(sb, this.c, ")");
    }

    public txf(sxf sxfVar, Boolean bool, List list) {
        this.a = sxfVar;
        this.b = bool;
        this.c = list;
    }
}
