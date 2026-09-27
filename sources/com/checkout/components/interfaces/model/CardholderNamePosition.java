package com.checkout.components.interfaces.model;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/checkout/components/interfaces/model/CardholderNamePosition;", "", "TOP", "BOTTOM", "HIDDEN", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardholderNamePosition {
    public static final CardholderNamePosition BOTTOM;
    public static final CardholderNamePosition HIDDEN;
    public static final CardholderNamePosition TOP;
    private static final /* synthetic */ CardholderNamePosition[] a;
    private static final /* synthetic */ ug7 b;

    static {
        CardholderNamePosition cardholderNamePosition = new CardholderNamePosition("TOP", 0);
        TOP = cardholderNamePosition;
        CardholderNamePosition cardholderNamePosition2 = new CardholderNamePosition("BOTTOM", 1);
        BOTTOM = cardholderNamePosition2;
        CardholderNamePosition cardholderNamePosition3 = new CardholderNamePosition("HIDDEN", 2);
        HIDDEN = cardholderNamePosition3;
        CardholderNamePosition[] cardholderNamePositionArr = {cardholderNamePosition, cardholderNamePosition2, cardholderNamePosition3};
        a = cardholderNamePositionArr;
        b = new wg7(cardholderNamePositionArr);
    }

    private CardholderNamePosition(String str, int i) {
    }

    public static ug7 getEntries() {
        return b;
    }

    public static CardholderNamePosition valueOf(String str) {
        return (CardholderNamePosition) Enum.valueOf(CardholderNamePosition.class, str);
    }

    public static CardholderNamePosition[] values() {
        return (CardholderNamePosition[]) a.clone();
    }
}
