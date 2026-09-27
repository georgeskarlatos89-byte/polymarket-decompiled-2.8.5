package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lkk implements WildcardType, Type {
    public static final kkk c = new kkk(null);
    public static final lkk d = new lkk(null, null);
    public final Type a;
    public final Type b;

    public lkk(Type type, Type type2) {
        this.a = type;
        this.b = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.b;
        if (type != null) {
            return "? super " + cjj.g(type);
        }
        Type type2 = this.a;
        if (type2 != null && !Intrinsics.areEqual(type2, Object.class)) {
            return "? extends " + cjj.g(type2);
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
