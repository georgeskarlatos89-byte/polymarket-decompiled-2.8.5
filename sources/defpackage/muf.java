package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class muf extends quf implements taa, xaa, zba {
    public final Class a;

    public muf(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.taa
    public final cuf a(xl8 xl8Var) {
        Annotation[] declaredAnnotations;
        xl8Var.getClass();
        Class cls = this.a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            return ytn.a(declaredAnnotations, xl8Var);
        }
        return null;
    }

    public final Collection b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return pwg.q(pwg.n(pwg.i(ArraysKt.g(declaredFields), juf.f), kuf.f));
    }

    public final xl8 c() {
        return buf.a(this.a).a();
    }

    public final Collection d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        Sequence g = ArraysKt.g(declaredMethods);
        q0 q0Var = new q0(this, 26);
        g.getClass();
        return pwg.q(pwg.n(new r18(g, true, q0Var), luf.f));
    }

    public final csc e() {
        Class cls = this.a;
        if (cls.isAnonymousClass()) {
            return csc.e(StringsKt.l0(cls.getName()));
        }
        return csc.e(cls.getSimpleName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof muf) {
            if (Intrinsics.areEqual(this.a, ((muf) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.a;
        cls.getClass();
        fyg fygVar = iym.b;
        Object[] objArr = null;
        if (fygVar == null) {
            try {
                fygVar = new fyg(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 20);
            } catch (NoSuchMethodException unused) {
                fygVar = new fyg(null, null, null, null, 20);
            }
            iym.b = fygVar;
        }
        Method method = (Method) fygVar.e;
        if (method != null) {
            objArr = (Object[]) method.invoke(cls, null);
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new yuf(obj));
        }
        return arrayList;
    }

    public final boolean g() {
        Class cls = this.a;
        cls.getClass();
        fyg fygVar = iym.b;
        Boolean bool = null;
        if (fygVar == null) {
            try {
                fygVar = new fyg(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 20);
            } catch (NoSuchMethodException unused) {
                fygVar = new fyg(null, null, null, null, 20);
            }
            iym.b = fygVar;
        }
        Method method = (Method) fygVar.d;
        if (method != null) {
            Object invoke = method.invoke(cls, null);
            invoke.getClass();
            bool = (Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.taa
    public final Collection getAnnotations() {
        Collection emptyList;
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        if (cls != null && (declaredAnnotations = cls.getDeclaredAnnotations()) != null) {
            emptyList = ytn.b(declaredAnnotations);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @Override // defpackage.zba
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new avf(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return muf.class.getName() + ": " + this.a;
    }
}
