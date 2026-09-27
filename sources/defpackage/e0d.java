package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e0d {
    private final boolean isNullableAllowed;
    private final String name = "nav_type";
    public static final yzc Companion = new Object();
    public static final e0d IntType = new ah1(false, 2);
    public static final e0d ReferenceType = new ah1(false, 4);
    public static final e0d IntArrayType = new zg1(true, 4);
    public static final e0d IntListType = new zg1(true, 5);
    public static final e0d LongType = new ah1(false, 3);
    public static final e0d LongArrayType = new zg1(true, 6);
    public static final e0d LongListType = new zg1(true, 7);
    public static final e0d FloatType = new ah1(false, 1);
    public static final e0d FloatArrayType = new zg1(true, 2);
    public static final e0d FloatListType = new zg1(true, 3);
    public static final e0d BoolType = new ah1(false, 0);
    public static final e0d BoolArrayType = new zg1(true, 0);
    public static final e0d BoolListType = new zg1(true, 1);
    public static final e0d StringType = new ah1(true, 5);
    public static final e0d StringArrayType = new zg1(true, 8);
    public static final e0d StringListType = new zg1(true, 9);

    public e0d(boolean z) {
        this.isNullableAllowed = z;
    }

    public static e0d fromArgType(String str, String str2) {
        Companion.getClass();
        return yzc.a(str, str2);
    }

    public static final e0d inferFromValue(String str) {
        Companion.getClass();
        return yzc.b(str);
    }

    public static final e0d inferFromValueType(Object obj) {
        Companion.getClass();
        return yzc.c(obj);
    }

    public abstract Object get(Bundle bundle, String str);

    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public final Object parseAndPut(Bundle bundle, String str, String str2, Object obj) {
        bundle.getClass();
        str.getClass();
        bundle.getClass();
        str.getClass();
        if (iyn.a(bundle, str)) {
            if (str2 != null) {
                Object parseValue = parseValue(str2, obj);
                put(bundle, str, parseValue);
                return parseValue;
            }
            return obj;
        }
        dmk.v("There is no previous value in this savedState.");
        return null;
    }

    public abstract Object parseValue(String str);

    public Object parseValue(String str, Object obj) {
        str.getClass();
        return parseValue(str);
    }

    public abstract void put(Bundle bundle, String str, Object obj);

    public String serializeAsValue(Object obj) {
        return String.valueOf(obj);
    }

    public String toString() {
        return getName();
    }

    public boolean valueEquals(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public final Object parseAndPut(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        str2.getClass();
        Object parseValue = parseValue(str2);
        put(bundle, str, parseValue);
        return parseValue;
    }
}
