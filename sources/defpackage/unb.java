package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class unb {
    public final tnb a;
    public final Bitmap b;

    public unb(String str, Bitmap bitmap) {
        Object obj;
        str.getClass();
        bitmap.getClass();
        Iterator<E> it = rnb.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((rnb) obj).getValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        tnb tnbVar = (rnb) obj;
        this.a = tnbVar == null ? new snb(str) : tnbVar;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof unb) {
                unb unbVar = (unb) obj;
                if (!Intrinsics.areEqual(this.a, unbVar.a) || !Intrinsics.areEqual(this.b, unbVar.b)) {
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
        return "LoadedImage(contentType=" + this.a + ", bitmap=" + this.b + ")";
    }
}
