package defpackage;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l39 {
    public final String a;
    public final Handler b;

    public l39(String str, Handler handler) {
        handler.getClass();
        this.a = str;
        this.b = handler;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l39) {
                l39 l39Var = (l39) obj;
                if (!Intrinsics.areEqual(this.a, l39Var.a) || !Intrinsics.areEqual(this.b, l39Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HCaptchaTokenResponse(tokenResult=" + this.a + ", handler=" + this.b + ")";
    }
}
