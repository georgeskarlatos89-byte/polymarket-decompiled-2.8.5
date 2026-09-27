package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w1k implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public w1k(Type type, Type type2, Type... typeArr) {
        boolean z;
        if (type2 instanceof Class) {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            if (z != (((Class) type2).getEnclosingClass() == null)) {
                omf.a();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            h3n.a(type3);
        }
        this.a = type;
        this.b = type2;
        this.c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && h3n.b(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return i ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return h3n.r(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(h3n.r(type));
        sb.append("<");
        sb.append(h3n.r(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(h3n.r(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
