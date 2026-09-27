package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class fjb implements SerialDescriptor {
    public final SerialDescriptor a;

    public fjb(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
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
        dmk.v(sv6.m(str, " is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fjb) {
                fjb fjbVar = (fjb) obj;
                if (Intrinsics.areEqual(this.a, fjbVar.a) && Intrinsics.areEqual(h(), fjbVar.h())) {
                    return true;
                }
                return false;
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
        xbc.l(ace.o(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        if (i >= 0) {
            return this.a;
        }
        xbc.l(ace.o(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return u9i.h;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        xbc.l(ace.o(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
