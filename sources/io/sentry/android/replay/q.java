package io.sentry.android.replay;

import defpackage.ug7;
import defpackage.ww4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q INITIAL = new q("INITIAL", 0);
    public static final q STARTED = new q("STARTED", 1);
    public static final q RESUMED = new q("RESUMED", 2);
    public static final q PAUSED = new q("PAUSED", 3);
    public static final q STOPPED = new q("STOPPED", 4);
    public static final q CLOSED = new q("CLOSED", 5);

    private static final /* synthetic */ q[] $values() {
        return new q[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private q(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
