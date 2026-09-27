package com.polymarket.usviewmodels;

import com.polymarket.usviewmodels.AppViewModel;
import defpackage.dhk;
import defpackage.m4k;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 I2\u00020\u0001:\u0004FGHIB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0014\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0082 J\u0015\u0010\u001a\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0082 J\u0015\u0010\u001e\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001f\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0082 J\u0015\u0010#\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010$\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0082 J\u0015\u0010&\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010.\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00103\u001a\u0002002\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u00106\u001a\u00020(2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010;\u001a\u0002082\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>J\u001d\u0010?\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010=\u001a\u00020>H\u0082 J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010C\u001a\u00020DH\u0016J\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010C\u001a\u00020DH\u0082 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0013R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0013R$\u0010 \u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0013R\u0011\u0010%\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u00107\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006J"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/WelcomeViewModel$Callbacks;)V", "isUSMarket", "", "()Z", "Swift_isUSMarket", "newValue", "isGoogleLoading", "setGoogleLoading", "(Z)V", "Swift_isGoogleLoading", "Swift_isGoogleLoading_set", "", "value", "isAppleLoading", "setAppleLoading", "Swift_isAppleLoading", "Swift_isAppleLoading_set", "isWebLoading", "setWebLoading", "Swift_isWebLoading", "Swift_isWebLoading_set", "displaySettings", "getDisplaySettings", "setDisplaySettings", "Swift_displaySettings", "Swift_displaySettings_set", "isLoading", "Swift_isLoading", "bonusAmountText", "", "getBonusAmountText", "()Ljava/lang/String;", "Swift_bonusAmountText", "headlineText", "getHeadlineText", "Swift_headlineText", "welcomeBackground", "Lcom/polymarket/usviewmodels/WelcomeViewModel$BackgroundStyle;", "getWelcomeBackground", "()Lcom/polymarket/usviewmodels/WelcomeViewModel$BackgroundStyle;", "Swift_welcomeBackground", "termsAndConditionsMarkdown", "getTermsAndConditionsMarkdown", "Swift_termsAndConditionsMarkdown", "termsAndConditionsURL", "Ljava/net/URI;", "getTermsAndConditionsURL", "()Ljava/net/URI;", "Swift_termsAndConditionsURL", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "BackgroundStyle", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WelcomeViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$BackgroundStyle;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "default", "worldCup", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class BackgroundStyle implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ BackgroundStyle[] $VALUES;

        /* renamed from: default, reason: not valid java name */
        public static final BackgroundStyle f18default = new BackgroundStyle("default", 0);
        public static final BackgroundStyle worldCup = new BackgroundStyle("worldCup", 1);

        private static final /* synthetic */ BackgroundStyle[] $values() {
            return new BackgroundStyle[]{f18default, worldCup};
        }

        static {
            BackgroundStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private BackgroundStyle(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static BackgroundStyle valueOf(String str) {
            return (BackgroundStyle) Enum.valueOf(BackgroundStyle.class, str);
        }

        public static BackgroundStyle[] values() {
            return (BackgroundStyle[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    private final native String Swift_bonusAmountText(long Swift_peer);

    private final native boolean Swift_displaySettings(long Swift_peer);

    private final native void Swift_displaySettings_set(long Swift_peer, boolean value);

    private final native String Swift_headlineText(long Swift_peer);

    private final native boolean Swift_isAppleLoading(long Swift_peer);

    private final native void Swift_isAppleLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isGoogleLoading(long Swift_peer);

    private final native void Swift_isGoogleLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native boolean Swift_isUSMarket(long Swift_peer);

    private final native boolean Swift_isWebLoading(long Swift_peer);

    private final native void Swift_isWebLoading_set(long Swift_peer, boolean value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

    private final native String Swift_termsAndConditionsMarkdown(long Swift_peer);

    private final native URI Swift_termsAndConditionsURL(long Swift_peer);

    private final native BackgroundStyle Swift_welcomeBackground(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getBonusAmountText() {
        return Swift_bonusAmountText(getSwift_peer());
    }

    public final boolean getDisplaySettings() {
        return Swift_displaySettings(getSwift_peer());
    }

    public final String getHeadlineText() {
        return Swift_headlineText(getSwift_peer());
    }

    public final String getTermsAndConditionsMarkdown() {
        return Swift_termsAndConditionsMarkdown(getSwift_peer());
    }

    public final URI getTermsAndConditionsURL() {
        return Swift_termsAndConditionsURL(getSwift_peer());
    }

    public final BackgroundStyle getWelcomeBackground() {
        return Swift_welcomeBackground(getSwift_peer());
    }

    public final boolean isAppleLoading() {
        return Swift_isAppleLoading(getSwift_peer());
    }

    public final boolean isGoogleLoading() {
        return Swift_isGoogleLoading(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isUSMarket() {
        return Swift_isUSMarket(getSwift_peer());
    }

    public final boolean isWebLoading() {
        return Swift_isWebLoading(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
    }

    public final void setAppleLoading(boolean z) {
        Swift_isAppleLoading_set(getSwift_peer(), z);
    }

    public final void setDisplaySettings(boolean z) {
        Swift_displaySettings_set(getSwift_peer(), z);
    }

    public final void setGoogleLoading(boolean z) {
        Swift_isGoogleLoading_set(getSwift_peer(), z);
    }

    public final void setWebLoading(boolean z) {
        Swift_isWebLoading_set(getSwift_peer(), z);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSelectAppleCase", "OnSelectGoogleCase", "OnSelectWebAuthCase", "OnSelectEmailPasswordCase", "OnSelectSettingsCase", "OnDismissCase", "OnURLSelectedCase", "Companion", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectAppleCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectEmailPasswordCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectGoogleCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectSettingsCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectWebAuthCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onSelectApple = new OnSelectAppleCase();
        private static final Input onSelectGoogle = new OnSelectGoogleCase();
        private static final Input onSelectWebAuth = new OnSelectWebAuthCase();
        private static final Input onSelectEmailPassword = new OnSelectEmailPasswordCase();
        private static final Input onSelectSettings = new OnSelectSettingsCase();
        private static final Input onDismiss = new OnDismissCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnDismissCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnDismissCase extends Input {
            public OnDismissCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectAppleCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectAppleCase extends Input {
            public OnSelectAppleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectEmailPasswordCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectEmailPasswordCase extends Input {
            public OnSelectEmailPasswordCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectGoogleCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectGoogleCase extends Input {
            public OnSelectGoogleCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectSettingsCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectSettingsCase extends Input {
            public OnSelectSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnSelectWebAuthCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectWebAuthCase extends Input {
            public OnSelectWebAuthCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnURLSelectedCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "associated0", "Ljava/net/URI;", "<init>", "(Ljava/net/URI;)V", "getAssociated0", "()Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnURLSelectedCase extends Input {
            private final URI associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnURLSelectedCase(URI uri) {
                super(null);
                uri.getClass();
                this.associated0 = uri;
            }

            public final URI getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnDismiss$cp() {
            return onDismiss;
        }

        public static final /* synthetic */ Input access$getOnSelectApple$cp() {
            return onSelectApple;
        }

        public static final /* synthetic */ Input access$getOnSelectEmailPassword$cp() {
            return onSelectEmailPassword;
        }

        public static final /* synthetic */ Input access$getOnSelectGoogle$cp() {
            return onSelectGoogle;
        }

        public static final /* synthetic */ Input access$getOnSelectSettings$cp() {
            return onSelectSettings;
        }

        public static final /* synthetic */ Input access$getOnSelectWebAuth$cp() {
            return onSelectWebAuth;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/WelcomeViewModel$Input;", "onSelectApple", "getOnSelectApple", "onSelectGoogle", "getOnSelectGoogle", "onSelectWebAuth", "getOnSelectWebAuth", "onSelectEmailPassword", "getOnSelectEmailPassword", "onSelectSettings", "getOnSelectSettings", "onDismiss", "getOnDismiss", "onURLSelected", "associated0", "Ljava/net/URI;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnDismiss() {
                return Input.access$getOnDismiss$cp();
            }

            public final Input getOnSelectApple() {
                return Input.access$getOnSelectApple$cp();
            }

            public final Input getOnSelectEmailPassword() {
                return Input.access$getOnSelectEmailPassword$cp();
            }

            public final Input getOnSelectGoogle() {
                return Input.access$getOnSelectGoogle$cp();
            }

            public final Input getOnSelectSettings() {
                return Input.access$getOnSelectSettings$cp();
            }

            public final Input getOnSelectWebAuth() {
                return Input.access$getOnSelectWebAuth$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onURLSelected(URI associated0) {
                associated0.getClass();
                return new OnURLSelectedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0017\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082 ¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/WelcomeViewModel$Callbacks;", "mock", "Lcom/polymarket/usviewmodels/WelcomeViewModel;", "bonusDollars", "", "(Ljava/lang/Integer;)Lcom/polymarket/usviewmodels/WelcomeViewModel;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native WelcomeViewModel Swift_Companion_mock_2(Integer bonusDollars);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public static /* synthetic */ WelcomeViewModel mock$default(Companion companion, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            return companion.mock(num);
        }

        public final WelcomeViewModel mock(Integer bonusDollars) {
            return Swift_Companion_mock_2(bonusDollars);
        }

        private Companion() {
        }
    }

    public WelcomeViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0097\u0001\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u000f\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\fJ\u0015\u0010\u001d\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u008b\u0001\u0010'\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010)\u001a\u00020#H\u0016J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010)\u001a\u00020#H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/polymarket/usviewmodels/WelcomeViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "didLogin", "Lkotlin/Function0;", "", "didCancel", "onSMSMFARequired", "Lkotlin/Function1;", "", "didSelectEmail", "didSelectEmailPassword", "didSelectSettings", "onURLSelected", "Ljava/net/URI;", "onLegalAgreementsSelected", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnLegalAgreementsSelected", "()Lkotlin/jvm/functions/Function0;", "Swift_onLegalAgreementsSelected", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function0 function05, Function1 function12, Function0 function06, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r6, function02, r8, r9, r10, r11, r12, r13);
            Function1 function13;
            Function0 function07;
            Function0 function08;
            Function1 function14;
            Function1 function15;
            Function0 function09;
            Function0 function010;
            Function0 function011;
            function0 = (i & 1) != 0 ? new dhk(5) : function0;
            function02 = (i & 2) != 0 ? new dhk(6) : function02;
            function1 = (i & 4) != 0 ? new m4k(27) : function1;
            function03 = (i & 8) != 0 ? new dhk(7) : function03;
            function04 = (i & 16) != 0 ? new dhk(8) : function04;
            function05 = (i & 32) != 0 ? new dhk(9) : function05;
            if ((i & 64) != 0) {
                function13 = new m4k(28);
            } else {
                function13 = function12;
            }
            if ((i & 128) != 0) {
                function07 = new dhk(10);
                function08 = function04;
                function09 = function05;
                function14 = function13;
                function15 = function1;
                function011 = function03;
                function010 = function0;
            } else {
                function07 = function06;
                function08 = function04;
                function14 = function13;
                function15 = function1;
                function09 = function05;
                function010 = function0;
                function011 = function03;
            }
        }

        private final native long Swift_constructor_0(Function0<Unit> didLogin, Function0<Unit> didCancel, Function1<? super String, Unit> onSMSMFARequired, Function0<Unit> didSelectEmail, Function0<Unit> didSelectEmailPassword, Function0<Unit> didSelectSettings, Function1<? super URI, Unit> onURLSelected, Function0<Unit> onLegalAgreementsSelected);

        private final native Function0<Unit> Swift_onLegalAgreementsSelected(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(String str) {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$3() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$4() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$5() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$6(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$7();
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit f(String str) {
            return _init_$lambda$2(str);
        }

        public static /* synthetic */ Unit g(URI uri) {
            return _init_$lambda$6(uri);
        }

        public static /* synthetic */ Unit h() {
            return _init_$lambda$0();
        }

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public boolean equals(Object other) {
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final Function0<Unit> getOnLegalAgreementsSelected() {
            return Swift_onLegalAgreementsSelected(this.Swift_peer);
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function1<? super URI, Unit> function12, Function0<Unit> function06) {
            function0.getClass();
            function02.getClass();
            function1.getClass();
            function03.getClass();
            function04.getClass();
            function05.getClass();
            function12.getClass();
            function06.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function1, function03, function04, function05, function12, function06);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
