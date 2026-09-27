package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uca {
    public final Integer a;
    public final Object b;

    public uca(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uca) {
                uca ucaVar = (uca) obj;
                if (!Intrinsics.areEqual(this.a, ucaVar.a) || !Intrinsics.areEqual(this.b, ucaVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj instanceof Enum) {
            i = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return i + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.a);
        sb.append(", right=");
        return woa.q(sb, this.b, ')');
    }
}
