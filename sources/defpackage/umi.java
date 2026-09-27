package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class umi {
    public final Bitmap a;
    public final long b;

    public umi(Bitmap bitmap, long j) {
        this.a = bitmap;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof umi) {
                umi umiVar = (umi) obj;
                if (Intrinsics.areEqual(this.a, umiVar.a)) {
                    long j = umiVar.b;
                    int i = ib4.n;
                    if (!hkj.a(this.b, j)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "CardArt(bitmap=" + this.a + ", textColor=" + ib4.h(this.b) + ")";
    }
}
