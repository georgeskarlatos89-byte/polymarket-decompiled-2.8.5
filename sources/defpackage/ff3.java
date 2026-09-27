package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ff3 {
    public final gf3 a;
    public final List b;

    public ff3(gf3 gf3Var, List list) {
        list.getClass();
        this.a = gf3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ff3) {
                ff3 ff3Var = (ff3) obj;
                if (!Intrinsics.areEqual(this.a, ff3Var.a) || !Intrinsics.areEqual(this.b, ff3Var.b)) {
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
        return "ChannelConfigEntity(channelConfigInnerEntity=" + this.a + ", commands=" + this.b + ")";
    }
}
