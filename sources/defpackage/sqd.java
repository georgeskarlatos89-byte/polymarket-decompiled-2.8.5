package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sqd extends vqd {
    public final onb a;
    public final onb b;

    public sqd(onb onbVar, onb onbVar2) {
        this.a = onbVar;
        this.b = onbVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sqd) {
                sqd sqdVar = (sqd) obj;
                if (!Intrinsics.areEqual(this.a, sqdVar.a) || !Intrinsics.areEqual(this.b, sqdVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        onb onbVar = this.b;
        if (onbVar == null) {
            hashCode = 0;
        } else {
            hashCode = onbVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        onb onbVar = this.b;
        if (onbVar != null) {
            str = str + "|   mediatorLoadStates: " + onbVar + '\n';
        }
        return c.d(str.concat("|)"));
    }
}
