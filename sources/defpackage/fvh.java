package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class fvh {
    public static final xl8 A;
    public static final xl8 B;
    public static final xl8 C;
    public static final xl8 D;
    public static final xl8 E;
    public static final xl8 F;
    public static final xl8 G;
    public static final xl8 H;
    public static final xl8 I;
    public static final xl8 J;
    public static final xl8 K;
    public static final xl8 L;
    public static final xl8 M;
    public static final xl8 N;
    public static final xl8 O;
    public static final xl8 P;
    public static final yl8 Q;
    public static final c44 R;
    public static final c44 S;
    public static final c44 T;
    public static final c44 U;
    public static final c44 V;
    public static final xl8 W;
    public static final xl8 X;
    public static final xl8 Y;
    public static final xl8 Z;
    public static final xl8 a0;
    public static final xl8 b0;
    public static final xl8 c0;
    public static final yl8 d;
    public static final HashSet d0;
    public static final yl8 e;
    public static final HashSet e0;
    public static final yl8 f;
    public static final HashMap f0;
    public static final yl8 g;
    public static final HashMap g0;
    public static final yl8 h;
    public static final yl8 i;
    public static final yl8 j;
    public static final xl8 k;
    public static final xl8 l;
    public static final xl8 m;
    public static final xl8 n;
    public static final xl8 o;
    public static final xl8 p;
    public static final xl8 q;
    public static final xl8 r;
    public static final xl8 s;
    public static final xl8 t;
    public static final xl8 u;
    public static final xl8 v;
    public static final xl8 w;
    public static final xl8 x;
    public static final xl8 y;
    public static final xl8 z;
    public static final yl8 a = d("Any").a;
    public static final yl8 b = d("Nothing").a;
    public static final yl8 c = d("Cloneable").a;

    static {
        int i2;
        int i3;
        int i4;
        d("Suppress");
        d = d("Unit").a;
        e = d("CharSequence").a;
        f = d("String").a;
        g = d("Array").a;
        h = d("Boolean").a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        i = d("Number").a;
        j = d("Enum").a;
        d("Function");
        k = d("Throwable");
        l = d("Comparable");
        xl8 xl8Var = gvh.o;
        xl8Var.a(csc.e("IntRange"));
        xl8Var.a(csc.e("LongRange"));
        m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        n = d("DeprecationLevel");
        o = d("ReplaceWith");
        p = d("ExtensionFunctionType");
        q = d("ContextFunctionTypeParams");
        xl8 d2 = d("ParameterName");
        r = d2;
        fon.f(d2);
        s = d("Annotation");
        xl8 a2 = a("Target");
        t = a2;
        fon.f(a2);
        u = a("AnnotationTarget");
        v = a("AnnotationRetention");
        xl8 a3 = a("Retention");
        w = a3;
        fon.f(a3);
        fon.f(a("Repeatable"));
        x = a("MustBeDocumented");
        y = d("UnsafeVariance");
        d("PublishedApi");
        gvh.p.a(csc.e("AccessibleLateinitPropertyLiteral"));
        xl8 xl8Var2 = new xl8("kotlin.internal.PlatformDependent");
        z = xl8Var2;
        fon.f(xl8Var2);
        d("IntroducedAt");
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        xl8 b2 = b("Map");
        G = b2;
        H = b2.a(csc.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        xl8 b3 = b("MutableMap");
        O = b3;
        P = b3.a(csc.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        yl8 e2 = e("KProperty");
        e("KMutableProperty");
        R = fon.f(e2.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        xl8 d3 = d("UByte");
        xl8 d4 = d("UShort");
        xl8 d5 = d("UInt");
        xl8 d6 = d("ULong");
        S = fon.f(d3);
        T = fon.f(d4);
        U = fon.f(d5);
        V = fon.f(d6);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        a0 = c("AtomicIntArray");
        b0 = c("AtomicLongArray");
        c0 = c("AtomicArray");
        int length = c6f.values().length;
        int i5 = 3;
        if (length < 3) {
            i2 = 3;
        } else {
            i2 = (length / 3) + length + 1;
        }
        HashSet hashSet = new HashSet(i2);
        for (c6f c6fVar : c6f.values()) {
            hashSet.add(c6fVar.e());
        }
        d0 = hashSet;
        int length2 = c6f.values().length;
        if (length2 < 3) {
            i3 = 3;
        } else {
            i3 = (length2 / 3) + length2 + 1;
        }
        HashSet hashSet2 = new HashSet(i3);
        for (c6f c6fVar2 : c6f.values()) {
            hashSet2.add(c6fVar2.c());
        }
        e0 = hashSet2;
        int length3 = c6f.values().length;
        if (length3 < 3) {
            i4 = 3;
        } else {
            i4 = (length3 / 3) + length3 + 1;
        }
        HashMap hashMap = new HashMap(i4);
        for (c6f c6fVar3 : c6f.values()) {
            String b4 = c6fVar3.e().b();
            b4.getClass();
            hashMap.put(d(b4).a, c6fVar3);
        }
        f0 = hashMap;
        int length4 = c6f.values().length;
        if (length4 >= 3) {
            i5 = (length4 / 3) + length4 + 1;
        }
        HashMap hashMap2 = new HashMap(i5);
        for (c6f c6fVar4 : c6f.values()) {
            String b5 = c6fVar4.c().b();
            b5.getClass();
            hashMap2.put(d(b5).a, c6fVar4);
        }
        g0 = hashMap2;
    }

    public static xl8 a(String str) {
        return gvh.m.a(csc.e(str));
    }

    public static xl8 b(String str) {
        return gvh.n.a(csc.e(str));
    }

    public static xl8 c(String str) {
        return gvh.q.a(csc.e(str));
    }

    public static xl8 d(String str) {
        return gvh.l.a(csc.e(str));
    }

    public static final yl8 e(String str) {
        return gvh.i.a(csc.e(str)).a;
    }
}
