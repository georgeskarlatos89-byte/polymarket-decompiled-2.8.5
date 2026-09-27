package com.stripe.android.model;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ieh;
import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/model/Source$Status", "", "Lcom/stripe/android/model/Source$Status;", "", "toString", "()Ljava/lang/String;", ApiConstant.KEY_CODE, "Ljava/lang/String;", "Companion", "ieh", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Source$Status {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Source$Status[] $VALUES;
    public static final Source$Status Canceled;
    public static final Source$Status Chargeable;
    public static final ieh Companion;
    public static final Source$Status Consumed;
    public static final Source$Status Failed;
    public static final Source$Status Pending;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ieh] */
    static {
        Source$Status source$Status = new Source$Status("Canceled", 0, "canceled");
        Canceled = source$Status;
        Source$Status source$Status2 = new Source$Status("Chargeable", 1, "chargeable");
        Chargeable = source$Status2;
        Source$Status source$Status3 = new Source$Status("Consumed", 2, "consumed");
        Consumed = source$Status3;
        Source$Status source$Status4 = new Source$Status("Failed", 3, "failed");
        Failed = source$Status4;
        Source$Status source$Status5 = new Source$Status("Pending", 4, "pending");
        Pending = source$Status5;
        Source$Status[] source$StatusArr = {source$Status, source$Status2, source$Status3, source$Status4, source$Status5};
        $VALUES = source$StatusArr;
        $ENTRIES = new wg7(source$StatusArr);
        Companion = new Object();
    }

    public Source$Status(String str, int i, String str2) {
        this.code = str2;
    }

    public static final /* synthetic */ String a(Source$Status source$Status) {
        return source$Status.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static Source$Status valueOf(String str) {
        return (Source$Status) Enum.valueOf(Source$Status.class, str);
    }

    public static Source$Status[] values() {
        return (Source$Status[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
