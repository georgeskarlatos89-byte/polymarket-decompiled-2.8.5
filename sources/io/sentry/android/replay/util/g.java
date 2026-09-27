package io.sentry.android.replay.util;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g SOC_MODEL = new g("SOC_MODEL", 0);
    public static final g SOC_MANUFACTURER = new g("SOC_MANUFACTURER", 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{SOC_MODEL, SOC_MANUFACTURER};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private g(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
