package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uic {
    public final boolean a;
    public final boolean b;

    public uic(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && uic.class == obj.getClass()) {
            uic uicVar = (uic) obj;
            if (this.a == uicVar.a && this.b == uicVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.FALSE);
    }
}
