package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zmb {
    public final USEventCardViewModel a;

    public zmb(USEventCardViewModel uSEventCardViewModel) {
        this.a = uSEventCardViewModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zmb) || !Intrinsics.areEqual(this.a, ((zmb) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(vm=" + this.a + ")";
    }
}
