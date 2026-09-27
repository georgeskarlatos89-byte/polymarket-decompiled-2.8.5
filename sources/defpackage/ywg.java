package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ywg implements SerialDescriptor, zt2 {
    public final SerialDescriptor a;
    public final String b;
    public final Set c;

    public ywg(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.a = serialDescriptor;
        this.b = serialDescriptor.h() + '?';
        this.c = dwm.a(serialDescriptor);
    }

    @Override // defpackage.zt2
    public final Set a() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        return this.a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.a.d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywg)) {
            return false;
        }
        if (Intrinsics.areEqual(this.a, ((ywg) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        return this.a.f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return this.a.g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
