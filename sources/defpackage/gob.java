package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gob {
    public final long a;
    public final float b;
    public final long c;

    public gob(fob fobVar) {
        this.a = fobVar.a;
        this.b = fobVar.b;
        this.c = fobVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gob)) {
            return false;
        }
        gob gobVar = (gob) obj;
        if (this.a == gobVar.a && this.b == gobVar.b && this.c == gobVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
