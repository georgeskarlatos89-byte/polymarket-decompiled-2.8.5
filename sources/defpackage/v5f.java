package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v5f implements SerialDescriptor {
    public final String a;
    public final q5f b;

    public v5f(String str, q5f q5fVar) {
        str.getClass();
        q5fVar.getClass();
        this.a = str;
        this.b = q5fVar;
    }

    public final void a() {
        throw new IllegalStateException(woa.r(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5f)) {
            return false;
        }
        v5f v5fVar = (v5f) obj;
        if (Intrinsics.areEqual(this.a, v5fVar.a) && Intrinsics.areEqual(this.b, v5fVar.b)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return m51.m(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
