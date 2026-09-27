package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s3c {
    public final USEventCardViewModel a;

    public s3c(USEventCardViewModel uSEventCardViewModel) {
        uSEventCardViewModel.getClass();
        this.a = uSEventCardViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s3c) && Intrinsics.areEqual(this.a, ((s3c) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Game(vm=" + this.a + ")";
    }
}
