package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/WaitlistFieldFocus;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", AttributeType.PHONE, "inviteCode", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WaitlistFieldFocus implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ WaitlistFieldFocus[] $VALUES;
    public static final WaitlistFieldFocus phone = new WaitlistFieldFocus(AttributeType.PHONE, 0);
    public static final WaitlistFieldFocus inviteCode = new WaitlistFieldFocus("inviteCode", 1);

    private static final /* synthetic */ WaitlistFieldFocus[] $values() {
        return new WaitlistFieldFocus[]{phone, inviteCode};
    }

    static {
        WaitlistFieldFocus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private WaitlistFieldFocus(String str, int i) {
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static WaitlistFieldFocus valueOf(String str) {
        return (WaitlistFieldFocus) Enum.valueOf(WaitlistFieldFocus.class, str);
    }

    public static WaitlistFieldFocus[] values() {
        return (WaitlistFieldFocus[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }
}
