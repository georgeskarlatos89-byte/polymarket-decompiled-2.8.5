package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vh8 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh8)) {
            return false;
        }
        vh8 vh8Var = (vh8) obj;
        if (Objects.equals(this.a, vh8Var.a) && Objects.equals(this.b, vh8Var.b) && Objects.equals(this.c, vh8Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
