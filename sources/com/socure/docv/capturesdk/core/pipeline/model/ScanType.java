package com.socure.docv.capturesdk.core.pipeline.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LICENSE_FRONT", "LICENSE_BACK", "PASSPORT", "SELFIE", "SELFIE_AUTO_CAPTURE", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScanType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ScanType[] $VALUES;
    private final String value;
    public static final ScanType LICENSE_FRONT = new ScanType("LICENSE_FRONT", 0, "lic_front");
    public static final ScanType LICENSE_BACK = new ScanType("LICENSE_BACK", 1, "lic_back");
    public static final ScanType PASSPORT = new ScanType("PASSPORT", 2, "passport");
    public static final ScanType SELFIE = new ScanType("SELFIE", 3, ApiConstant.DOCUMENT_SELFIE);
    public static final ScanType SELFIE_AUTO_CAPTURE = new ScanType("SELFIE_AUTO_CAPTURE", 4, ApiConstant.DOCUMENT_SELFIE);

    private static final /* synthetic */ ScanType[] $values() {
        return new ScanType[]{LICENSE_FRONT, LICENSE_BACK, PASSPORT, SELFIE, SELFIE_AUTO_CAPTURE};
    }

    static {
        ScanType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ScanType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ScanType valueOf(String str) {
        return (ScanType) Enum.valueOf(ScanType.class, str);
    }

    public static ScanType[] values() {
        return (ScanType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
