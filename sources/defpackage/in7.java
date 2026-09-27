package defpackage;

import io.getstream.chat.android.models.Channel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class in7 extends mn7 {
    public final Channel a;

    public in7(Channel channel) {
        channel.getClass();
        this.a = channel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof in7) && Intrinsics.areEqual(this.a, ((in7) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Add(channel=" + this.a + ")";
    }
}
