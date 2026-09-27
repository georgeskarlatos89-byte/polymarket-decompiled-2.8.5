package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class np3 {
    public final gb0 a;
    public final ArrayList b;

    public np3(gb0 gb0Var, ArrayList arrayList) {
        this.a = gb0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof np3) {
                np3 np3Var = (np3) obj;
                if (!Intrinsics.areEqual(this.a, np3Var.a) || !Intrinsics.areEqual(this.b, np3Var.b)) {
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
        return "ChatMentionedBody(text=" + ((Object) this.a) + ", runs=" + this.b + ")";
    }
}
