package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class v9a implements Serializable {
    public final String a;

    public v9a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v9a) {
            if (this.a.equalsIgnoreCase(((v9a) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
