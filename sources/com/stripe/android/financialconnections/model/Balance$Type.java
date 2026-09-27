package com.stripe.android.financialconnections.model;

import defpackage.dxg;
import defpackage.exg;
import defpackage.go5;
import defpackage.i31;
import defpackage.ug7;
import defpackage.w4b;
import defpackage.ww4;
import defpackage.x51;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/Balance$Type", "", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "x51", "CASH", "CREDIT", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Balance$Type {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Balance$Type[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;
    public static final x51 Companion;
    private final String value;

    @dxg("cash")
    public static final Balance$Type CASH = new Balance$Type("CASH", 0, "cash");

    @dxg("credit")
    public static final Balance$Type CREDIT = new Balance$Type("CREDIT", 1, "credit");
    public static final Balance$Type UNKNOWN = new Balance$Type("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ Balance$Type[] $values() {
        return new Balance$Type[]{CASH, CREDIT, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [x51, java.lang.Object] */
    static {
        Balance$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new i31(12));
    }

    private Balance$Type(String str, int i, String str2) {
        this.value = str2;
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return go5.f("com.stripe.android.financialconnections.model.Balance.Type", values(), new String[]{"cash", "credit", null}, new Annotation[][]{null, null, null});
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

    public static Balance$Type valueOf(String str) {
        return (Balance$Type) Enum.valueOf(Balance$Type.class, str);
    }

    public static Balance$Type[] values() {
        return (Balance$Type[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
