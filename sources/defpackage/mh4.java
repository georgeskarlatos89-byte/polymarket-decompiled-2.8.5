package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mh4 implements mzh {
    public final String a;

    public mh4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mh4.class == obj.getClass()) {
            return Objects.equals(this.a, ((mh4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return woa.r(new StringBuilder("CommentEvent("), this.a, ")");
    }
}
