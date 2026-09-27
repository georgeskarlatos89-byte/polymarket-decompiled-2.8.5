package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j2d extends k2d {
    public final Object a;
    public final Headers b;

    public j2d(Headers headers, Object obj) {
        this.a = obj;
        this.b = headers;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j2d) {
                j2d j2dVar = (j2d) obj;
                if (!Intrinsics.areEqual(this.a, j2dVar.a) || !Intrinsics.areEqual(this.b, j2dVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Headers headers = this.b;
        if (headers == null) {
            hashCode = 0;
        } else {
            hashCode = headers.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Success(body=" + this.a + ", headers=" + this.b + ")";
    }
}
