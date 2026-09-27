package com.polymarket.usviewmodels;

import com.polymarket.data.EQuantity;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDisplayText;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComboDisplayText {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ComboDisplayText[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ComboDisplayText[] $values() {
        return new ComboDisplayText[0];
    }

    static {
        ComboDisplayText[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ComboDisplayText(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ComboDisplayText valueOf(String str) {
        return (ComboDisplayText) Enum.valueOf(ComboDisplayText.class, str);
    }

    public static ComboDisplayText[] values() {
        return (ComboDisplayText[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\t\u0010\f\u001a\u00020\u0005H\u0082 J\t\u0010\u000f\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 J\t\u0010\u0014\u001a\u00020\u0005H\u0082 J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/polymarket/usviewmodels/ComboDisplayText$Companion;", "", "<init>", "()V", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "marketCount", "", "Swift_Companion_title_0", Keys.KEY_NAME, "getName", "()Ljava/lang/String;", "Swift_Companion_name", "shortSideTagText", "getShortSideTagText", "Swift_Companion_shortSideTagText", "marketsText", "Swift_Companion_marketsText_1", "rateStakeText", "getRateStakeText", "Swift_Companion_rateStakeText", "rateReturnText", "multiplier", "Lcom/polymarket/data/EQuantity;", "Swift_Companion_rateReturnText_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native String Swift_Companion_marketsText_1(int marketCount);

        private final native String Swift_Companion_name();

        private final native String Swift_Companion_rateReturnText_2(EQuantity multiplier);

        private final native String Swift_Companion_rateStakeText();

        private final native String Swift_Companion_shortSideTagText();

        private final native String Swift_Companion_title_0(int marketCount);

        public final String getName() {
            return Swift_Companion_name();
        }

        public final String getRateStakeText() {
            return Swift_Companion_rateStakeText();
        }

        public final String getShortSideTagText() {
            return Swift_Companion_shortSideTagText();
        }

        public final String marketsText(int marketCount) {
            return Swift_Companion_marketsText_1(marketCount);
        }

        public final String rateReturnText(EQuantity multiplier) {
            multiplier.getClass();
            return Swift_Companion_rateReturnText_2(multiplier);
        }

        public final String title(int marketCount) {
            return Swift_Companion_title_0(marketCount);
        }

        private Companion() {
        }
    }
}
