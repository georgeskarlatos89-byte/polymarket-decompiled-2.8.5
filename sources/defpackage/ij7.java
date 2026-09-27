package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ij7 extends sp9 {
    public final Drawable a;
    public final ip9 b;
    public final Throwable c;

    public ij7(Drawable drawable, ip9 ip9Var, Throwable th) {
        this.a = drawable;
        this.b = ip9Var;
        this.c = th;
    }

    @Override // defpackage.sp9
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.sp9
    public final ip9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ij7) {
                ij7 ij7Var = (ij7) obj;
                if (Intrinsics.areEqual(this.a, ij7Var.a) && Intrinsics.areEqual(this.b, ij7Var.b) && Intrinsics.areEqual(this.c, ij7Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Drawable drawable = this.a;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (i * 31)) * 31);
    }
}
