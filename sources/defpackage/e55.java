package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e55 implements SerialDescriptor {
    public final zwg a;
    public final KClass b;
    public final String c;

    public e55(zwg zwgVar, KClass kClass) {
        kClass.getClass();
        this.a = zwgVar;
        this.b = kClass;
        this.c = zwgVar.a + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.a.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        e55 e55Var;
        if (obj instanceof e55) {
            e55Var = (e55) obj;
        } else {
            e55Var = null;
        }
        if (e55Var != null && Intrinsics.areEqual(this.a, e55Var.a) && Intrinsics.areEqual(e55Var.b, this.b)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        return this.a.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return this.a.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.a.i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
