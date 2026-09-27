package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q49 implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;
    public final SerialDescriptor c;

    public q49(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = str;
        this.b = serialDescriptor;
        this.c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        dmk.v(sv6.m(str, " is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q49) {
                q49 q49Var = (q49) obj;
                if (!Intrinsics.areEqual(this.a, q49Var.a) || !Intrinsics.areEqual(this.b, q49Var.b) || !Intrinsics.areEqual(this.c, q49Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        if (i >= 0) {
            return CollectionsKt.emptyList();
        }
        f27.q(woa.r(ace.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.c;
                }
                dmk.n("Unreached");
                return null;
            }
            return this.b;
        }
        f27.q(woa.r(ace.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return u9i.i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        f27.q(woa.r(ace.o(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
