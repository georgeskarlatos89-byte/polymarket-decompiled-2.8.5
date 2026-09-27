package com.polymarket.data;

import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/data/ETournamentGamePreviewMock;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ETournamentGamePreviewMock {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ETournamentGamePreviewMock[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ETournamentGamePreviewMock[] $values() {
        return new ETournamentGamePreviewMock[0];
    }

    static {
        ETournamentGamePreviewMock[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ETournamentGamePreviewMock(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ETournamentGamePreviewMock valueOf(String str) {
        return (ETournamentGamePreviewMock) Enum.valueOf(ETournamentGamePreviewMock.class, str);
    }

    public static ETournamentGamePreviewMock[] values() {
        return (ETournamentGamePreviewMock[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0011\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 ¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/ETournamentGamePreviewMock$Companion;", "", "<init>", "()V", "liveGame", "Lcom/polymarket/data/ETournamentGameUS;", "Swift_Companion_liveGame_0", "firstRoundBye", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "Swift_Companion_firstRoundBye_1", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ETournamentGameUS Swift_Companion_firstRoundBye_1(int id);

        private final native ETournamentGameUS Swift_Companion_liveGame_0();

        public final ETournamentGameUS firstRoundBye(int id) {
            return Swift_Companion_firstRoundBye_1(id);
        }

        public final ETournamentGameUS liveGame() {
            return Swift_Companion_liveGame_0();
        }

        private Companion() {
        }
    }
}
