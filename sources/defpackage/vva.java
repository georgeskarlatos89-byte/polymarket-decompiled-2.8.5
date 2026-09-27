package defpackage;

import com.polymarket.usviewmodels.IntegrityCheckViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vva implements zva {
    public final IntegrityCheckViewModel.IntegrityIssueType a;

    public vva(IntegrityCheckViewModel.IntegrityIssueType integrityIssueType) {
        integrityIssueType.getClass();
        this.a = integrityIssueType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vva) && this.a == ((vva) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Integrity(issueType=" + this.a + ")";
    }
}
