package com.checkout.components.interfaces.insight;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/insight/LogLevel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INFO", "ERROR", "WARN", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogLevel {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private final String value;
    public static final LogLevel INFO = new LogLevel("INFO", 0, "info");
    public static final LogLevel ERROR = new LogLevel("ERROR", 1, "error");
    public static final LogLevel WARN = new LogLevel("WARN", 2, "warn");

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{INFO, ERROR, WARN};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private LogLevel(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
