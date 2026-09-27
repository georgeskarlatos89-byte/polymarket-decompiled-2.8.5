package com.socure.docv.capturesdk.feature.scanner.data;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/CardGuide;", "", "<init>", "(Ljava/lang/String;I)V", "MOVE_PHONE_UP", "MOVE_PHONE_DOWN", "MOVE_PHONE_LEFT", "MOVE_PHONE_RIGHT", "CARD_NOT_FOUND", "CARD_TOO_CLOSE", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardGuide {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ CardGuide[] $VALUES;
    public static final CardGuide MOVE_PHONE_UP = new CardGuide("MOVE_PHONE_UP", 0);
    public static final CardGuide MOVE_PHONE_DOWN = new CardGuide("MOVE_PHONE_DOWN", 1);
    public static final CardGuide MOVE_PHONE_LEFT = new CardGuide("MOVE_PHONE_LEFT", 2);
    public static final CardGuide MOVE_PHONE_RIGHT = new CardGuide("MOVE_PHONE_RIGHT", 3);
    public static final CardGuide CARD_NOT_FOUND = new CardGuide("CARD_NOT_FOUND", 4);
    public static final CardGuide CARD_TOO_CLOSE = new CardGuide("CARD_TOO_CLOSE", 5);

    private static final /* synthetic */ CardGuide[] $values() {
        return new CardGuide[]{MOVE_PHONE_UP, MOVE_PHONE_DOWN, MOVE_PHONE_LEFT, MOVE_PHONE_RIGHT, CARD_NOT_FOUND, CARD_TOO_CLOSE};
    }

    static {
        CardGuide[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private CardGuide(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static CardGuide valueOf(String str) {
        return (CardGuide) Enum.valueOf(CardGuide.class, str);
    }

    public static CardGuide[] values() {
        return (CardGuide[]) $VALUES.clone();
    }
}
