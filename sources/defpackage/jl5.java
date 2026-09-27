package defpackage;

import kotlin.collections.ArraysKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jl5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jl5[] $VALUES;
    public static final il5 Companion;
    public static final jl5 Fail;
    public static final jl5 Pass;
    public static final jl5 StateInvalid;
    public static final jl5 Unavailable;
    public static final jl5 Unchecked;
    public static final jl5 Unknown;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [il5, java.lang.Object] */
    static {
        jl5 jl5Var = new jl5("Pass", 0, "PASS");
        Pass = jl5Var;
        jl5 jl5Var2 = new jl5("Fail", 1, "FAIL");
        Fail = jl5Var2;
        jl5 jl5Var3 = new jl5("Unavailable", 2, "UNAVAILABLE");
        Unavailable = jl5Var3;
        jl5 jl5Var4 = new jl5("Unchecked", 3, "UNCHECKED");
        Unchecked = jl5Var4;
        jl5 jl5Var5 = new jl5("StateInvalid", 4, "STATE_INVALID");
        StateInvalid = jl5Var5;
        jl5 jl5Var6 = new jl5("Unknown", 5, "UNKNOWN");
        Unknown = jl5Var6;
        jl5[] jl5VarArr = {jl5Var, jl5Var2, jl5Var3, jl5Var4, jl5Var5, jl5Var6};
        $VALUES = jl5VarArr;
        $ENTRIES = new wg7(jl5VarArr);
        Companion = new Object();
    }

    public jl5(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static jl5 valueOf(String str) {
        return (jl5) Enum.valueOf(jl5.class, str);
    }

    public static jl5[] values() {
        return (jl5[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }

    public final boolean c() {
        return ArraysKt.l0(new jl5[]{Fail, Unavailable, Unchecked, StateInvalid}).contains(this);
    }
}
