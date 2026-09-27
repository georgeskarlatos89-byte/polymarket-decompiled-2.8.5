package com.socure.docv.capturesdk.core.processor.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "", "manualCaptureMandatory", "", "weight", "", "<init>", "(Ljava/lang/String;IZD)V", "getManualCaptureMandatory", "()Z", "getWeight", "()D", "CORNER", "BLUR", "GLARE", "BRIGHTNESS", "SELFIE", "BARCODE", "SELFIE_AUTO_CAPTURE", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DetectionType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ DetectionType[] $VALUES;
    private final boolean manualCaptureMandatory;
    private final double weight;
    public static final DetectionType CORNER = new DetectionType("CORNER", 0, false, ConstantsKt.UNSET);
    public static final DetectionType BLUR = new DetectionType("BLUR", 1, false, 0.3d);
    public static final DetectionType GLARE = new DetectionType("GLARE", 2, false, 0.3d);
    public static final DetectionType BRIGHTNESS = new DetectionType("BRIGHTNESS", 3, true, 0.4d);
    public static final DetectionType SELFIE = new DetectionType("SELFIE", 4, true, ConstantsKt.UNSET);
    public static final DetectionType BARCODE = new DetectionType("BARCODE", 5, true, ConstantsKt.UNSET);
    public static final DetectionType SELFIE_AUTO_CAPTURE = new DetectionType("SELFIE_AUTO_CAPTURE", 6, true, ConstantsKt.UNSET);

    private static final /* synthetic */ DetectionType[] $values() {
        return new DetectionType[]{CORNER, BLUR, GLARE, BRIGHTNESS, SELFIE, BARCODE, SELFIE_AUTO_CAPTURE};
    }

    static {
        DetectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private DetectionType(String str, int i, boolean z, double d) {
        this.manualCaptureMandatory = z;
        this.weight = d;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static DetectionType valueOf(String str) {
        return (DetectionType) Enum.valueOf(DetectionType.class, str);
    }

    public static DetectionType[] values() {
        return (DetectionType[]) $VALUES.clone();
    }

    public final boolean getManualCaptureMandatory() {
        return this.manualCaptureMandatory;
    }

    public final double getWeight() {
        return this.weight;
    }
}
