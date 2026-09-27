package com.polymarket.clients;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/clients/MarketingContentID;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarketingContentID {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ MarketingContentID[] $VALUES;

    private static final /* synthetic */ MarketingContentID[] $values() {
        return new MarketingContentID[0];
    }

    static {
        MarketingContentID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private MarketingContentID(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static MarketingContentID valueOf(String str) {
        return (MarketingContentID) Enum.valueOf(MarketingContentID.class, str);
    }

    public static MarketingContentID[] values() {
        return (MarketingContentID[]) $VALUES.clone();
    }
}
