package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.sequences.Sequence;
import kotlin.text.e;
import okhttp3.internal.url._UrlKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class cjj {
    public static final t a = new t(5);

    public static final Type a(wka wkaVar, boolean z) {
        Class m;
        int i;
        tja c = wkaVar.c();
        if (c instanceof yka) {
            if (!(c instanceof zka)) {
                return new egd((yka) c);
            }
            zka zkaVar = (zka) c;
            GenericDeclaration javaContainingDeclaration$kotlin_stdlib = zkaVar.getJavaContainingDeclaration$kotlin_stdlib();
            if (javaContainingDeclaration$kotlin_stdlib != null) {
                TypeVariable<?>[] typeParameters = javaContainingDeclaration$kotlin_stdlib.getTypeParameters();
                typeParameters.getClass();
                TypeVariable<?> typeVariable = null;
                boolean z2 = false;
                for (TypeVariable<?> typeVariable2 : typeParameters) {
                    if (Intrinsics.areEqual(typeVariable2.getName(), zkaVar.getName())) {
                        if (!z2) {
                            z2 = true;
                            typeVariable = typeVariable2;
                        } else {
                            dmk.v("Array contains more than one matching element.");
                            return null;
                        }
                    }
                }
                if (z2) {
                    typeVariable.getClass();
                    return typeVariable;
                }
                ahh.i("Array contains no element matching the predicate.");
                return null;
            }
            ahh.h(wkaVar, "javaType is not supported for this type: ");
            return null;
        }
        if (c instanceof KClass) {
            KClass kClass = (KClass) c;
            if (z) {
                m = vzm.n(kClass);
            } else {
                m = vzm.m(kClass);
            }
            List d = wkaVar.d();
            if (!d.isEmpty()) {
                if (m.isArray()) {
                    if (!m.getComponentType().isPrimitive()) {
                        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.w0(d);
                        if (kTypeProjection != null) {
                            fla flaVar = kTypeProjection.a;
                            wka wkaVar2 = kTypeProjection.b;
                            if (flaVar == null) {
                                i = -1;
                            } else {
                                i = ajj.a[flaVar.ordinal()];
                            }
                            if (i != -1 && i != 1) {
                                if (i != 2 && i != 3) {
                                    dmk.a();
                                    return null;
                                }
                                wkaVar2.getClass();
                                Type a2 = a(wkaVar2, false);
                                if (!(a2 instanceof Class)) {
                                    return new ys8(a2);
                                }
                                return m;
                            }
                            return m;
                        }
                        qp7.k(wkaVar, "kotlin.Array must have exactly one type argument: ");
                        return null;
                    }
                    return m;
                }
                return b(m, d);
            }
            return m;
        }
        ahh.h(wkaVar, "Unsupported type classifier: ");
        return null;
    }

    public static final tud b(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((KTypeProjection) it.next()));
            }
            return new tud(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list3));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((KTypeProjection) it2.next()));
            }
            return new tud(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        tud b = b(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.w(subList));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(d((KTypeProjection) it3.next()));
        }
        return new tud(cls, b, arrayList3);
    }

    public static final Type c(wka wkaVar) {
        Type type;
        wkaVar.getClass();
        if (wkaVar instanceof xka) {
            ReflectProperties.LazySoftVal lazySoftVal = ((f3) ((xka) wkaVar)).a;
            if (lazySoftVal != null) {
                type = (Type) lazySoftVal.invoke();
            } else {
                type = null;
            }
            if (type != null) {
                return type;
            }
        }
        return a(wkaVar, false);
    }

    public static final Type d(KTypeProjection kTypeProjection) {
        fla flaVar = kTypeProjection.a;
        if (flaVar == null) {
            lkk.c.getClass();
            return lkk.d;
        }
        wka wkaVar = kTypeProjection.b;
        wkaVar.getClass();
        int i = ajj.a[flaVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new lkk(a(wkaVar, true), null);
                }
                dmk.a();
                return null;
            }
            return a(wkaVar, true);
        }
        return new lkk(null, a(wkaVar, true));
    }

    public static final Object e(ytg ytgVar, oug ougVar) {
        ztg ztgVar = ztg.i;
        Object d = ytgVar.a.d(ougVar);
        if (d == null) {
            ztgVar.getClass();
            return null;
        }
        return d;
    }

    public static final boolean f(Throwable th) {
        Class<?> cls = th.getClass();
        while (!Intrinsics.areEqual(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final String g(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                Sequence f = lwg.f(type, bjj.f);
                return ((Class) pwg.m(f)).getName() + e.q(pwg.g(f), _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return cls.getName();
        }
        return type.toString();
    }
}
