package defpackage;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pna implements Serializable {
    public final Date a;
    public final ona b;

    public pna(Date date, ona onaVar) {
        this.a = date;
        this.b = onaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pna) {
                pna pnaVar = (pna) obj;
                if (this.a.equals(pnaVar.a) && Objects.equals(this.b, pnaVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
