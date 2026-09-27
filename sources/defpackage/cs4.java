package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cs4 implements Serializable {
    public static final cs4 b = new cs4("DEF");
    public final String a;

    public cs4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cs4) {
            if (this.a.equals(((cs4) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
