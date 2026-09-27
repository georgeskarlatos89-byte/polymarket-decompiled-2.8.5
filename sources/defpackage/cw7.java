package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cw7 implements mzh {
    public final ozh a;

    public cw7(ozh ozhVar) {
        this.a = ozhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cw7.class == obj.getClass()) {
            return this.a.equals(((cw7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "FaultEvent(" + this.a + ")";
    }
}
