package com.checkout.components.interfaces;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/interfaces/Environment;", "", "<init>", "(Ljava/lang/String;I)V", "SANDBOX", "PRODUCTION", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Environment {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment SANDBOX = new Environment("SANDBOX", 0);
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 1);

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{SANDBOX, PRODUCTION};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private Environment(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }
}
