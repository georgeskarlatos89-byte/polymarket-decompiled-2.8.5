package org.msgpack.core;

import com.appsflyer.internal.l;
import defpackage.ace;
import defpackage.dmk;
import defpackage.f27;
import defpackage.omf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        dmk.v(ace.f(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                return format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            return badPositionIndex(i2, i3, "end index");
        }
        return badPositionIndex(i, i3, "start index");
    }

    public static void checkArgument(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        f27.m(badElementIndex(i, i2, str));
        return 0;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        f27.m(badPositionIndex(i, i2, str));
        return 0;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        f27.m(badPositionIndexes(i, i2, i3));
    }

    public static void checkState(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String format(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        omf.a();
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        l.o();
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        dmk.v(format(str, objArr));
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        dmk.s(format(str, objArr));
        return null;
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        dmk.n(format(str, objArr));
    }
}
