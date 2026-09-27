package defpackage;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k9 {
    public final WeakReference a;
    public final l9 b;

    public k9(WeakReference weakReference, l9 l9Var) {
        l9Var.getClass();
        this.a = weakReference;
        this.b = l9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k9) {
                k9 k9Var = (k9) obj;
                if (!Intrinsics.areEqual(this.a, k9Var.a) || this.b != k9Var.b) {
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
        return "ActivityCallbackEvent(activity=" + this.a + ", type=" + this.b + ')';
    }
}
