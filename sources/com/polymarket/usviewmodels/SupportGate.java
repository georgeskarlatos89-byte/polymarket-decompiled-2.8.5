package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/SupportGate;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SupportGate {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SupportGate[] $VALUES;

    private static final /* synthetic */ SupportGate[] $values() {
        return new SupportGate[0];
    }

    static {
        SupportGate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private SupportGate(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SupportGate valueOf(String str) {
        return (SupportGate) Enum.valueOf(SupportGate.class, str);
    }

    public static SupportGate[] values() {
        return (SupportGate[]) $VALUES.clone();
    }
}
