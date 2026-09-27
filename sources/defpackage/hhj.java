package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class hhj {
    public static Collection a(AbstractCollection abstractCollection) {
        if ((abstractCollection instanceof xja) && !(abstractCollection instanceof yja)) {
            h(abstractCollection, "kotlin.collections.MutableCollection");
            throw null;
        }
        return abstractCollection;
    }

    public static List b(Collection collection) {
        if ((collection instanceof xja) && !(collection instanceof zja)) {
            h(collection, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) collection;
        } catch (ClassCastException e) {
            Intrinsics.f(e, hhj.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof xja) && !(obj instanceof bka)) {
            h(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, hhj.class.getName());
            throw e;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof xja) && !(obj instanceof kka)) {
            h(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, hhj.class.getName());
            throw e;
        }
    }

    public static void e(int i, Object obj) {
        if (obj != null && !f(i, obj)) {
            h(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static boolean f(int i, Object obj) {
        int i2;
        if (obj instanceof qp8) {
            if (obj instanceof tp8) {
                i2 = ((tp8) obj).getArity();
            } else if (obj instanceof Function0) {
                i2 = 0;
            } else if (obj instanceof Function1) {
                i2 = 1;
            } else if (obj instanceof Function2) {
                i2 = 2;
            } else if (obj instanceof Function3) {
                i2 = 3;
            } else if (obj instanceof Function4) {
                i2 = 4;
            } else if (obj instanceof Function5) {
                i2 = 5;
            } else if (obj instanceof Function6) {
                i2 = 6;
            } else if (obj instanceof Function7) {
                i2 = 7;
            } else if (obj instanceof Function8) {
                i2 = 8;
            } else if (obj instanceof Function9) {
                i2 = 9;
            } else if (obj instanceof Function10) {
                i2 = 10;
            } else if (obj instanceof Function11) {
                i2 = 11;
            } else if (obj instanceof Function12) {
                i2 = 12;
            } else if (obj instanceof Function13) {
                i2 = 13;
            } else if (obj instanceof Function14) {
                i2 = 14;
            } else if (obj instanceof Function15) {
                i2 = 15;
            } else if (obj instanceof Function16) {
                i2 = 16;
            } else if (obj instanceof Function17) {
                i2 = 17;
            } else if (obj instanceof Function18) {
                i2 = 18;
            } else if (obj instanceof Function19) {
                i2 = 19;
            } else if (obj instanceof Function20) {
                i2 = 20;
            } else if (obj instanceof Function21) {
                i2 = 21;
            } else if (obj instanceof Function22) {
                i2 = 22;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof List) {
            if (!(obj instanceof xja) || (obj instanceof zja)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void h(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(sv6.n(name, " cannot be cast to ", str));
        Intrinsics.f(classCastException, hhj.class.getName());
        throw classCastException;
    }
}
