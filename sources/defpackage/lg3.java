package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lg3 {
    public final String a;

    public /* synthetic */ lg3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lg3) {
            if (!Intrinsics.areEqual(this.a, ((lg3) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("ChannelId(cid=", this.a, ")");
    }
}
