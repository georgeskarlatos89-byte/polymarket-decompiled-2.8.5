package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class oi3 extends cnn {
    public final List a;

    public oi3(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oi3) && Intrinsics.areEqual(this.a, ((oi3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.j(this.a.size(), "ChannelsStateData.Result(channels.size=", ")");
    }
}
