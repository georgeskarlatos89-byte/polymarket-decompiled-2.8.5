package com.stripe.android.model;

import defpackage.bh7;
import defpackage.exg;
import defpackage.fhc;
import defpackage.ug7;
import defpackage.w4b;
import defpackage.ww4;
import defpackage.zob;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType", "", "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "fhc", "Unknown", "Required", "NotRequired", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MobileFallbackWebviewParams$WebviewRequirementType {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ MobileFallbackWebviewParams$WebviewRequirementType[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final fhc Companion;
    private final String value;
    public static final MobileFallbackWebviewParams$WebviewRequirementType Unknown = new MobileFallbackWebviewParams$WebviewRequirementType("Unknown", 0, "");
    public static final MobileFallbackWebviewParams$WebviewRequirementType Required = new MobileFallbackWebviewParams$WebviewRequirementType("Required", 1, "required");
    public static final MobileFallbackWebviewParams$WebviewRequirementType NotRequired = new MobileFallbackWebviewParams$WebviewRequirementType("NotRequired", 2, "notrequired");

    private static final /* synthetic */ MobileFallbackWebviewParams$WebviewRequirementType[] $values() {
        return new MobileFallbackWebviewParams$WebviewRequirementType[]{Unknown, Required, NotRequired};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fhc, java.lang.Object] */
    static {
        MobileFallbackWebviewParams$WebviewRequirementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new zob(26));
    }

    private MobileFallbackWebviewParams$WebviewRequirementType(String str, int i, String str2) {
        this.value = str2;
    }

    private static final KSerializer _init_$_anonymous_() {
        MobileFallbackWebviewParams$WebviewRequirementType[] values = values();
        values.getClass();
        return new bh7("com.stripe.android.model.MobileFallbackWebviewParams.WebviewRequirementType", (Enum[]) values);
    }

    public static /* synthetic */ KSerializer a() {
        return _init_$_anonymous_();
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        return $cachedSerializer$delegate;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static MobileFallbackWebviewParams$WebviewRequirementType valueOf(String str) {
        return (MobileFallbackWebviewParams$WebviewRequirementType) Enum.valueOf(MobileFallbackWebviewParams$WebviewRequirementType.class, str);
    }

    public static MobileFallbackWebviewParams$WebviewRequirementType[] values() {
        return (MobileFallbackWebviewParams$WebviewRequirementType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
