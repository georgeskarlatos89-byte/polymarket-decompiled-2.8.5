package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class x1k implements WildcardType {
    public final Type a;
    public final Type b;

    public x1k(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    h3n.a(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.b = typeArr2[0];
                        this.a = Object.class;
                        return;
                    } else {
                        omf.a();
                        throw null;
                    }
                }
                typeArr[0].getClass();
                h3n.a(typeArr[0]);
                this.b = null;
                this.a = typeArr[0];
                return;
            }
            omf.a();
            throw null;
        }
        omf.a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && h3n.b(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        if (type != null) {
            return new Type[]{type};
        }
        return h3n.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        int i;
        Type type = this.b;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return (this.a.hashCode() + 31) ^ i;
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + h3n.r(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + h3n.r(type2);
    }
}
