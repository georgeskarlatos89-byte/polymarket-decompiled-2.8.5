package com.socure.docv.capturesdk.feature.scanner.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/TimerState;", "", "<init>", "(Ljava/lang/String;I)V", "RESET", "RUNNING", "PAUSED", "FINISHED", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimerState {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ TimerState[] $VALUES;
    public static final TimerState RESET = new TimerState("RESET", 0);
    public static final TimerState RUNNING = new TimerState("RUNNING", 1);
    public static final TimerState PAUSED = new TimerState("PAUSED", 2);
    public static final TimerState FINISHED = new TimerState("FINISHED", 3);

    private static final /* synthetic */ TimerState[] $values() {
        return new TimerState[]{RESET, RUNNING, PAUSED, FINISHED};
    }

    static {
        TimerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private TimerState(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static TimerState valueOf(String str) {
        return (TimerState) Enum.valueOf(TimerState.class, str);
    }

    public static TimerState[] values() {
        return (TimerState[]) $VALUES.clone();
    }
}
