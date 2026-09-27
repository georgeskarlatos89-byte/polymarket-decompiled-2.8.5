package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ml0 implements xfj {
    public final /* synthetic */ int a;

    public /* synthetic */ ml0(int i) {
        this.a = i;
    }

    @Override // defpackage.xfj
    public final wfj a(i19 i19Var, jij jijVar) {
        Type componentType;
        switch (this.a) {
            case 0:
                Type type = jijVar.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                if (z) {
                    componentType = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    componentType = ((Class) type).getComponentType();
                }
                return new nl0(i19Var, i19Var.c(new jij(componentType)), bzl.h(componentType));
            case 1:
                if (jijVar.a != Date.class) {
                    return null;
                }
                return new nl0(c26.a);
            case 2:
                Class cls = jijVar.a;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new ch7(cls);
            case 3:
                throw new AssertionError("Factory should not be used");
            case 4:
                if (jijVar.a != java.sql.Date.class) {
                    return null;
                }
                return new rjh(0);
            case 5:
                if (jijVar.a != Time.class) {
                    return null;
                }
                return new rjh(1);
            default:
                if (jijVar.a != Timestamp.class) {
                    return null;
                }
                i19Var.getClass();
                return new sjh(i19Var.c(new jij(Date.class)), 0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
            default:
                return super.toString();
        }
    }
}
