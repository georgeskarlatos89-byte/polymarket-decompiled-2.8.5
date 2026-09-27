package com.socure.docv.capturesdk.core.pipeline.model;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MANUAL", "AUTO", "AUTO_ANALYSIS", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CaptureType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CaptureType[] $VALUES;
    private final String value;
    public static final CaptureType MANUAL = new CaptureType("MANUAL", 0, "manual");
    public static final CaptureType AUTO = new CaptureType("AUTO", 1, "auto");
    public static final CaptureType AUTO_ANALYSIS = new CaptureType("AUTO_ANALYSIS", 2, "auto_analysis");

    private static final /* synthetic */ CaptureType[] $values() {
        return new CaptureType[]{MANUAL, AUTO, AUTO_ANALYSIS};
    }

    static {
        CaptureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CaptureType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CaptureType valueOf(String str) {
        return (CaptureType) Enum.valueOf(CaptureType.class, str);
    }

    public static CaptureType[] values() {
        return (CaptureType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
