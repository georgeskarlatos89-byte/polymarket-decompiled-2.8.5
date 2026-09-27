package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m47 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m47[] $VALUES;
    public static final m47 DAYS;
    public static final m47 HOURS;
    public static final m47 MICROSECONDS;
    public static final m47 MILLISECONDS;
    public static final m47 MINUTES;
    public static final m47 NANOSECONDS;
    public static final m47 SECONDS;
    private final TimeUnit timeUnit;

    static {
        m47 m47Var = new m47("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        NANOSECONDS = m47Var;
        m47 m47Var2 = new m47("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MICROSECONDS = m47Var2;
        m47 m47Var3 = new m47("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        MILLISECONDS = m47Var3;
        m47 m47Var4 = new m47("SECONDS", 3, TimeUnit.SECONDS);
        SECONDS = m47Var4;
        m47 m47Var5 = new m47("MINUTES", 4, TimeUnit.MINUTES);
        MINUTES = m47Var5;
        m47 m47Var6 = new m47("HOURS", 5, TimeUnit.HOURS);
        HOURS = m47Var6;
        m47 m47Var7 = new m47("DAYS", 6, TimeUnit.DAYS);
        DAYS = m47Var7;
        m47[] m47VarArr = {m47Var, m47Var2, m47Var3, m47Var4, m47Var5, m47Var6, m47Var7};
        $VALUES = m47VarArr;
        $ENTRIES = new wg7(m47VarArr);
    }

    public m47(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static m47 valueOf(String str) {
        return (m47) Enum.valueOf(m47.class, str);
    }

    public static m47[] values() {
        return (m47[]) $VALUES.clone();
    }

    public final TimeUnit a() {
        return this.timeUnit;
    }
}
