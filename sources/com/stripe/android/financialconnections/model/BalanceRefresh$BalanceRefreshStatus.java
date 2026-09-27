package com.stripe.android.financialconnections.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.a61;
import defpackage.dxg;
import defpackage.exg;
import defpackage.go5;
import defpackage.i31;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus", "", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "", ApiConstant.KEY_CODE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$financial_connections_core_release", "()Ljava/lang/String;", "Companion", "a61", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceRefresh$BalanceRefreshStatus {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ BalanceRefresh$BalanceRefreshStatus[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final a61 Companion;

    @dxg("failed")
    public static final BalanceRefresh$BalanceRefreshStatus FAILED = new BalanceRefresh$BalanceRefreshStatus("FAILED", 0, "failed");

    @dxg("pending")
    public static final BalanceRefresh$BalanceRefreshStatus PENDING = new BalanceRefresh$BalanceRefreshStatus("PENDING", 1, "pending");

    @dxg("succeeded")
    public static final BalanceRefresh$BalanceRefreshStatus SUCCEEDED = new BalanceRefresh$BalanceRefreshStatus("SUCCEEDED", 2, "succeeded");
    public static final BalanceRefresh$BalanceRefreshStatus UNKNOWN = new BalanceRefresh$BalanceRefreshStatus("UNKNOWN", 3, "unknown");
    private final String code;

    private static final /* synthetic */ BalanceRefresh$BalanceRefreshStatus[] $values() {
        return new BalanceRefresh$BalanceRefreshStatus[]{FAILED, PENDING, SUCCEEDED, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, a61] */
    static {
        BalanceRefresh$BalanceRefreshStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new i31(14));
    }

    private BalanceRefresh$BalanceRefreshStatus(String str, int i, String str2) {
        this.code = str2;
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return go5.f("com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus", values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null});
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

    public static BalanceRefresh$BalanceRefreshStatus valueOf(String str) {
        return (BalanceRefresh$BalanceRefreshStatus) Enum.valueOf(BalanceRefresh$BalanceRefreshStatus.class, str);
    }

    public static BalanceRefresh$BalanceRefreshStatus[] values() {
        return (BalanceRefresh$BalanceRefreshStatus[]) $VALUES.clone();
    }

    /* renamed from: getCode$financial_connections_core_release, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
