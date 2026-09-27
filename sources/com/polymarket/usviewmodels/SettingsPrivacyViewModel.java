package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.usviewmodels.AppViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0013\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0016\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010\u0019\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001d\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0082 J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0082 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006'"}, d2 = {"Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "()V", "allowSquadInvites", "", "getAllowSquadInvites", "()Z", "Swift_allowSquadInvites", "navTitle", "", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "squadInvitesTitle", "getSquadInvitesTitle", "Swift_squadInvitesTitle", "squadInvitesSubtitle", "getSquadInvitesSubtitle", "Swift_squadInvitesSubtitle", "sendInput", "", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input;", "Swift_sendInput_1", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsPrivacyViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public SettingsPrivacyViewModel() {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE), (SwiftPeerMarker) null);
    }

    private final native boolean Swift_allowSquadInvites(long Swift_peer);

    private final native String Swift_navTitle(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_1(long Swift_peer, Input input);

    private final native String Swift_squadInvitesSubtitle(long Swift_peer);

    private final native String Swift_squadInvitesTitle(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getAllowSquadInvites() {
        return Swift_allowSquadInvites(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final String getSquadInvitesSubtitle() {
        return Swift_squadInvitesSubtitle(getSwift_peer());
    }

    public final String getSquadInvitesTitle() {
        return Swift_squadInvitesTitle(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_1(getSwift_peer(), input);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u0013¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnToggleSquadInvitesCase", "Companion", "Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input$OnToggleSquadInvitesCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input$OnToggleSquadInvitesCase;", "Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnToggleSquadInvitesCase extends Input {
            private final boolean associated0;

            public OnToggleSquadInvitesCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input$Companion;", "", "<init>", "()V", "onToggleSquadInvites", "Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Input;", "associated0", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input onToggleSquadInvites(boolean associated0) {
                return new OnToggleSquadInvitesCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\bH\u0082 ¨\u0006\n"}, d2 = {"Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "mock", "Lcom/polymarket/usviewmodels/SettingsPrivacyViewModel;", "Swift_Companion_mock_2", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0();

        private final native SettingsPrivacyViewModel Swift_Companion_mock_2();

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion) {
            return companion.Swift_Companion_constructor_0();
        }

        public final SettingsPrivacyViewModel mock() {
            return Swift_Companion_mock_2();
        }

        private Companion() {
        }
    }

    public SettingsPrivacyViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
