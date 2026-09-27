package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class h0g {
    public final i0g a;
    public final List b;

    public h0g(i0g i0gVar, List list) {
        list.getClass();
        this.a = i0gVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0g) {
                h0g h0gVar = (h0g) obj;
                if (!Intrinsics.areEqual(this.a, h0gVar.a) || !Intrinsics.areEqual(this.b, h0gVar.b)) {
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
        return "ReplyMessageEntity(replyMessageInnerEntity=" + this.a + ", attachments=" + this.b + ")";
    }
}
