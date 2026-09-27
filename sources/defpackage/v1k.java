package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v1k implements GenericArrayType {
    public final Type a;

    public v1k(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && h3n.b(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return h3n.r(this.a) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
