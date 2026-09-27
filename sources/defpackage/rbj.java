package defpackage;

import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rbj {
    public final gb0 a;
    public final OffsetMapping b;

    public rbj(gb0 gb0Var, OffsetMapping offsetMapping) {
        this.a = gb0Var;
        this.b = offsetMapping;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rbj) {
                rbj rbjVar = (rbj) obj;
                if (!Intrinsics.areEqual(this.a, rbjVar.a) || !Intrinsics.areEqual(this.b, rbjVar.b)) {
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
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
