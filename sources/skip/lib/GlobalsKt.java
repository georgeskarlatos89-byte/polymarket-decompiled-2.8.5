package skip.lib;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.f27;
import defpackage.lvf;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0010\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\r\u001a(\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019\u001a+\u0010\u001b\u001a\u0002H\u0017\"\u000e\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00170\u001c2\u0006\u0010\u0018\u001a\u0002H\u00172\u0006\u0010\u001a\u001a\u0002H\u0017¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u0002H\u0017\"\u000e\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00170\u001c2\u0006\u0010\u0018\u001a\u0002H\u00172\u0006\u0010\u001a\u001a\u0002H\u0017¢\u0006\u0002\u0010\u001d\u001a7\u0010\u001f\u001a\u00020\u00102\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0!\"\u0004\u0018\u00010\n2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0002\u0010$\u001a7\u0010%\u001a\u00020\u00102\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0!\"\u0004\u0018\u00010\n2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0002\u0010$\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003*\n\u0010\u0004\"\u00020\u00052\u00020\u0005*\u0012\u0010\u0006\"\u0006\u0012\u0002\b\u00030\u00072\u0006\u0012\u0002\b\u00030\u0007¨\u0006&"}, d2 = {"systemRandom", "Lskip/lib/SystemRandomNumberGenerator;", "getSystemRandom", "()Lskip/lib/SystemRandomNumberGenerator;", "Never", "", "AnyClass", "Lkotlin/reflect/KClass;", "type", "of", "", "fatalError", "message", "", "assertionFailure", "assert", "", "value", "", "preconditionFailure", "precondition", "condition", "swap", "T", "a", "Lskip/lib/InOut;", "b", "min", "", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "max", "print", "args", "", "separator", "terminator", "([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "debugPrint", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobalsKt {
    private static final SystemRandomNumberGenerator systemRandom = new SystemRandomNumberGenerator(null, 1, null);

    /* renamed from: assert, reason: not valid java name */
    public static final void m1278assert(boolean z, String str) {
        str.getClass();
    }

    public static final Void assertionFailure(String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void assertionFailure$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "assertionFailure";
        }
        return assertionFailure(str);
    }

    public static final void debugPrint(Object[] objArr, String str, String str2) {
        objArr.getClass();
        str.getClass();
        str2.getClass();
        print$default(new Object[]{objArr, str, str2}, null, null, 6, null);
    }

    public static /* synthetic */ void debugPrint$default(Object[] objArr, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ApiConstant.SPACE;
        }
        if ((i & 4) != 0) {
            str2 = "\n";
        }
        debugPrint(objArr, str, str2);
    }

    public static final Void fatalError(String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void fatalError$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "fatalError";
        }
        return fatalError(str);
    }

    public static final SystemRandomNumberGenerator getSystemRandom() {
        return systemRandom;
    }

    public static final <T extends Comparable<? super T>> T max(T t, T t2) {
        t.getClass();
        t2.getClass();
        if (t.compareTo(t2) >= 0) {
            return t;
        }
        return t2;
    }

    public static final <T extends Comparable<? super T>> T min(T t, T t2) {
        t.getClass();
        t2.getClass();
        if (t.compareTo(t2) <= 0) {
            return t;
        }
        return t2;
    }

    public static final void precondition(boolean z, String str) {
        str.getClass();
        if (z) {
            return;
        }
        f27.q(str);
    }

    public static /* synthetic */ void precondition$default(boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "precondition";
        }
        precondition(z, str);
    }

    public static final Void preconditionFailure(String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void preconditionFailure$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "preconditionFailure";
        }
        return preconditionFailure(str);
    }

    public static final void print(Object[] objArr, String str, String str2) {
        objArr.getClass();
        str.getClass();
        str2.getClass();
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            if (i2 > 0) {
                System.out.print((Object) str);
            }
            System.out.print(obj);
            i++;
            i2 = i3;
        }
        System.out.print((Object) str2);
    }

    public static /* synthetic */ void print$default(Object[] objArr, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ApiConstant.SPACE;
        }
        if ((i & 4) != 0) {
            str2 = "\n";
        }
        print(objArr, str, str2);
    }

    public static final <T> void swap(InOut<T> inOut, InOut<T> inOut2) {
        inOut.getClass();
        inOut2.getClass();
        T value = inOut.getValue();
        inOut.setValue(inOut2.getValue());
        inOut2.setValue(value);
    }

    public static final KClass<?> type(Object obj) {
        obj.getClass();
        return lvf.a.getOrCreateKotlinClass(obj.getClass());
    }
}
