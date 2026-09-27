package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.go5;
import defpackage.jpd;
import defpackage.u2d;
import defpackage.ug7;
import defpackage.w4b;
import defpackage.ww4;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/financialconnections/model/OwnershipRefresh$Status", "", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "jpd", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OwnershipRefresh$Status {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ OwnershipRefresh$Status[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final jpd Companion;

    @dxg("failed")
    public static final OwnershipRefresh$Status FAILED = new OwnershipRefresh$Status("FAILED", 0, "failed");

    @dxg("pending")
    public static final OwnershipRefresh$Status PENDING = new OwnershipRefresh$Status("PENDING", 1, "pending");

    @dxg("succeeded")
    public static final OwnershipRefresh$Status SUCCEEDED = new OwnershipRefresh$Status("SUCCEEDED", 2, "succeeded");
    public static final OwnershipRefresh$Status UNKNOWN = new OwnershipRefresh$Status("UNKNOWN", 3, "unknown");
    private final String value;

    private static final /* synthetic */ OwnershipRefresh$Status[] $values() {
        return new OwnershipRefresh$Status[]{FAILED, PENDING, SUCCEEDED, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jpd] */
    static {
        OwnershipRefresh$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new u2d(27));
    }

    private OwnershipRefresh$Status(String str, int i, String str2) {
        this.value = str2;
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return go5.f("com.stripe.android.financialconnections.model.OwnershipRefresh.Status", values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null});
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

    public static OwnershipRefresh$Status valueOf(String str) {
        return (OwnershipRefresh$Status) Enum.valueOf(OwnershipRefresh$Status.class, str);
    }

    public static OwnershipRefresh$Status[] values() {
        return (OwnershipRefresh$Status[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
