package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class npk implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;

    public npk(String str, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.a = str;
        this.b = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.b.b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return this.b.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.b.d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.b.e(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof npk) {
                npk npkVar = (npk) obj;
                if (Intrinsics.areEqual(this.a, npkVar.a) && Intrinsics.areEqual(this.b, npkVar.b)) {
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
        return this.b.f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return this.b.g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.b.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.b.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.b.isInline();
    }

    public final String toString() {
        return eqn.g(this);
    }
}
