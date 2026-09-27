package defpackage;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vhd extends m0d {
    public final uhd a;
    public final LifecycleOwner b;

    public vhd(uhd uhdVar, LifecycleOwner lifecycleOwner) {
        uhdVar.getClass();
        this.a = uhdVar;
        this.b = lifecycleOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhd)) {
            return false;
        }
        vhd vhdVar = (vhd) obj;
        if (Intrinsics.areEqual(this.a, vhdVar.a) && Intrinsics.areEqual(this.b, vhdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        LifecycleOwner lifecycleOwner = this.b;
        if (lifecycleOwner == null) {
            hashCode = 0;
        } else {
            hashCode = lifecycleOwner.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
