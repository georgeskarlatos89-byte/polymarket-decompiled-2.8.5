package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.rzb;
import defpackage.szb;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = szb.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "szb", "rzb", "AUTOMATIC", "CUSTOM", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ManualEntryMode {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ManualEntryMode[] $VALUES;
    public static final rzb Companion;
    private final String value;

    @dxg(MetricTracker.CarouselSource.AUTOMATIC)
    public static final ManualEntryMode AUTOMATIC = new ManualEntryMode("AUTOMATIC", 0, MetricTracker.CarouselSource.AUTOMATIC);

    @dxg("custom")
    public static final ManualEntryMode CUSTOM = new ManualEntryMode("CUSTOM", 1, "custom");

    @dxg("unknown")
    public static final ManualEntryMode UNKNOWN = new ManualEntryMode("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ ManualEntryMode[] $values() {
        return new ManualEntryMode[]{AUTOMATIC, CUSTOM, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, rzb] */
    static {
        ManualEntryMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
    }

    private ManualEntryMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ManualEntryMode valueOf(String str) {
        return (ManualEntryMode) Enum.valueOf(ManualEntryMode.class, str);
    }

    public static ManualEntryMode[] values() {
        return (ManualEntryMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
