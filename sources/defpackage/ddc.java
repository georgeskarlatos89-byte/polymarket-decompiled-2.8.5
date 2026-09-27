package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ddc {
    public final idc a;
    public final List b;
    public final List c;
    public final List d;

    public ddc(idc idcVar, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = idcVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ddc) {
                ddc ddcVar = (ddc) obj;
                if (!Intrinsics.areEqual(this.a, ddcVar.a) || !Intrinsics.areEqual(this.b, ddcVar.b) || !Intrinsics.areEqual(this.c, ddcVar.c) || !Intrinsics.areEqual(this.d, ddcVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.f(hdi.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "MessageEntity(messageInnerEntity=" + this.a + ", attachments=" + this.b + ", ownReactions=" + this.c + ", latestReactions=" + this.d + ")";
    }
}
