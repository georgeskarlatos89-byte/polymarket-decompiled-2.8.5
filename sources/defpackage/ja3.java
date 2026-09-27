package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ja3 implements ma3 {
    public final USEventCardViewModel a;

    public ja3(USEventCardViewModel uSEventCardViewModel) {
        uSEventCardViewModel.getClass();
        this.a = uSEventCardViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ja3) && Intrinsics.areEqual(this.a, ((ja3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(vm=" + this.a + ")";
    }
}
