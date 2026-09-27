package defpackage;

import com.polymarket.data.EComboLegState;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class md4 {
    public final ld4 a;
    public final EComboLegState b;
    public final EComboLegState c;

    public md4(ld4 ld4Var, EComboLegState eComboLegState, EComboLegState eComboLegState2) {
        ld4Var.getClass();
        this.a = ld4Var;
        this.b = eComboLegState;
        this.c = eComboLegState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md4)) {
            return false;
        }
        md4 md4Var = (md4) obj;
        if (this.a == md4Var.a && this.b == md4Var.b && this.c == md4Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        EComboLegState eComboLegState = this.b;
        if (eComboLegState == null) {
            hashCode = 0;
        } else {
            hashCode = eComboLegState.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        EComboLegState eComboLegState2 = this.c;
        if (eComboLegState2 != null) {
            i = eComboLegState2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ComboLegTimeline(position=" + this.a + ", previousState=" + this.b + ", nextState=" + this.c + ")";
    }
}
