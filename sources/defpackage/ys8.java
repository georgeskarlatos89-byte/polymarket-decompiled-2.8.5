package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ys8 implements GenericArrayType, Type {
    public final Type a;

    public ys8(Type type) {
        type.getClass();
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (Intrinsics.areEqual(this.a, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return cjj.g(this.a) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
