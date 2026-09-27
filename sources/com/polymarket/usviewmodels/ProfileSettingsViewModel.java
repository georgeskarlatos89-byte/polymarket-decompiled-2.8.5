package com.polymarket.usviewmodels;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.polymarket.data.EUser;
import com.polymarket.data.RowType;
import com.polymarket.designtokens.Icon;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.d5f;
import defpackage.l7f;
import defpackage.qx7;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Identifiable;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 _2\u00020\u0001:\u0004\\]^_B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u0014\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001a\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010\u001f\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010 \u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010$\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010%\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010(\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010)\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0082 J\u0015\u0010+\u001a\u00020\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J!\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0,2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J)\u00104\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0,H\u0082 J\u0017\u0010;\u001a\u0004\u0018\u0001052\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010<\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0016\u001a\u0004\u0018\u000105H\u0082 J\b\u0010=\u001a\u00020\u0015H\u0016J\u0015\u0010>\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010C\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010F\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010I\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0017\u0010L\u001a\u0004\u0018\u00010@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010O\u001a\u00020@2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0006\u0010P\u001a\u00020\u0015J\u0015\u0010Q\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TJ\u001d\u0010U\u001a\u00020\u00152\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010S\u001a\u00020TH\u0082 J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010Y\u001a\u00020ZH\u0082 R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010!\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R$\u0010&\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R<\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0,2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0,8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00106\u001a\u0004\u0018\u0001052\b\u0010\f\u001a\u0004\u0018\u0001058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010?\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0011\u0010G\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0013\u0010J\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bK\u0010BR\u0011\u0010M\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bN\u0010B¨\u0006`"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Callbacks;)V", "newValue", "", "enableNotifications", "getEnableNotifications", "()Z", "setEnableNotifications", "(Z)V", "Swift_enableNotifications", "Swift_enableNotifications_set", "", "value", "enableRadio", "getEnableRadio", "setEnableRadio", "Swift_enableRadio", "Swift_enableRadio_set", "showComments", "getShowComments", "setShowComments", "Swift_showComments", "Swift_showComments_set", "showXContent", "getShowXContent", "setShowXContent", "Swift_showXContent", "Swift_showXContent_set", "isLogoutLoading", "setLogoutLoading", "Swift_isLogoutLoading", "Swift_isLogoutLoading_set", "isAddPasskeyLoading", "Swift_isAddPasskeyLoading", "", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem;", "settings", "getSettings", "()Ljava/util/List;", "setSettings", "(Ljava/util/List;)V", "Swift_settings", "Swift_settings_set", "Lcom/polymarket/data/EUser;", "user", "getUser", "()Lcom/polymarket/data/EUser;", "setUser", "(Lcom/polymarket/data/EUser;)V", "Swift_user", "Swift_user_set", "setup", "Swift_setup_1", "systemDisplayInfo", "", "getSystemDisplayInfo", "()Ljava/lang/String;", "Swift_systemDisplayInfo", "versionText", "getVersionText", "Swift_versionText", "joinedPrefixText", "getJoinedPrefixText", "Swift_joinedPrefixText", "joinedDateSuffixText", "getJoinedDateSuffixText", "Swift_joinedDateSuffixText", "responsibleTradingDisclaimer", "getResponsibleTradingDisclaimer", "Swift_responsibleTradingDisclaimer", "refreshSettings", "Swift_refreshSettings_2", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "Swift_sendInput_3", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Callbacks", "SettingItem", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfileSettingsViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProfileSettingsViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1);
        Callbacks callbacks2;
        if ((i & 1) != 0) {
            callbacks2 = new Callbacks(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        } else {
            callbacks2 = callbacks;
        }
    }

    private final native boolean Swift_enableNotifications(long Swift_peer);

    private final native void Swift_enableNotifications_set(long Swift_peer, boolean value);

    private final native boolean Swift_enableRadio(long Swift_peer);

    private final native void Swift_enableRadio_set(long Swift_peer, boolean value);

    private final native boolean Swift_isAddPasskeyLoading(long Swift_peer);

    private final native boolean Swift_isLogoutLoading(long Swift_peer);

    private final native void Swift_isLogoutLoading_set(long Swift_peer, boolean value);

    private final native String Swift_joinedDateSuffixText(long Swift_peer);

    private final native String Swift_joinedPrefixText(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_refreshSettings_2(long Swift_peer);

    private final native String Swift_responsibleTradingDisclaimer(long Swift_peer);

    private final native void Swift_sendInput_3(long Swift_peer, Input input);

    private final native List<List<SettingItem>> Swift_settings(long Swift_peer);

    private final native void Swift_settings_set(long Swift_peer, List<? extends List<SettingItem>> value);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showComments(long Swift_peer);

    private final native void Swift_showComments_set(long Swift_peer, boolean value);

    private final native boolean Swift_showXContent(long Swift_peer);

    private final native void Swift_showXContent_set(long Swift_peer, boolean value);

    private final native String Swift_systemDisplayInfo(long Swift_peer);

    private final native EUser Swift_user(long Swift_peer);

    private final native void Swift_user_set(long Swift_peer, EUser value);

    private final native String Swift_versionText(long Swift_peer);

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean getEnableNotifications() {
        return Swift_enableNotifications(getSwift_peer());
    }

    public final boolean getEnableRadio() {
        return Swift_enableRadio(getSwift_peer());
    }

    public final String getJoinedDateSuffixText() {
        return Swift_joinedDateSuffixText(getSwift_peer());
    }

    public final String getJoinedPrefixText() {
        return Swift_joinedPrefixText(getSwift_peer());
    }

    public final String getResponsibleTradingDisclaimer() {
        return Swift_responsibleTradingDisclaimer(getSwift_peer());
    }

    public final List<List<SettingItem>> getSettings() {
        return Swift_settings(getSwift_peer());
    }

    public final boolean getShowComments() {
        return Swift_showComments(getSwift_peer());
    }

    public final boolean getShowXContent() {
        return Swift_showXContent(getSwift_peer());
    }

    public final String getSystemDisplayInfo() {
        return Swift_systemDisplayInfo(getSwift_peer());
    }

    public final EUser getUser() {
        return Swift_user(getSwift_peer());
    }

    public final String getVersionText() {
        return Swift_versionText(getSwift_peer());
    }

    public final boolean isAddPasskeyLoading() {
        return Swift_isAddPasskeyLoading(getSwift_peer());
    }

    public final boolean isLogoutLoading() {
        return Swift_isLogoutLoading(getSwift_peer());
    }

    public final void refreshSettings() {
        Swift_refreshSettings_2(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_3(getSwift_peer(), input);
    }

    public final void setEnableNotifications(boolean z) {
        Swift_enableNotifications_set(getSwift_peer(), z);
    }

    public final void setEnableRadio(boolean z) {
        Swift_enableRadio_set(getSwift_peer(), z);
    }

    public final void setLogoutLoading(boolean z) {
        Swift_isLogoutLoading_set(getSwift_peer(), z);
    }

    public final void setSettings(List<? extends List<SettingItem>> list) {
        list.getClass();
        Swift_settings_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setShowComments(boolean z) {
        Swift_showComments_set(getSwift_peer(), z);
    }

    public final void setShowXContent(boolean z) {
        Swift_showXContent_set(getSwift_peer(), z);
    }

    public final void setUser(EUser eUser) {
        Swift_user_set(getSwift_peer(), (EUser) StructKt.sref$default(eUser, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Z[B\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBO\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u000b\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0015H\u0016J\u0015\u0010(\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010+\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0015\u0010-\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00103\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u00107\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u00108\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u00104\u001a\u0004\u0018\u00010\u0002H\u0082 J\u0017\u0010=\u001a\u0004\u0018\u00010\u00132\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001f\u0010>\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0082 J\u0015\u0010C\u001a\u00020\u00152\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010D\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u00104\u001a\u00020\u0015H\u0082 J\u0015\u0010I\u001a\u00020\u00172\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010J\u001a\u00020\u001e2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u00104\u001a\u00020\u0017H\u0082 JK\u0010K\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J\b\u0010U\u001a\u00020\u0003H\u0016J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020#0W2\u0006\u0010X\u001a\u00020\u0015H\u0016J\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020#0W2\u0006\u0010X\u001a\u00020\u0015H\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010'R(\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010'\"\u0004\b0\u00101R(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010'\"\u0004\b6\u00101R(\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010.\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\u0016\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e\u0018\u00010MX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010@\"\u0004\bT\u0010B¨\u0006\\"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "type", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "subtitle", "detail", "leftIcon", "Lcom/polymarket/designtokens/Icon;", "badgeCount", "", "style", "Lcom/polymarket/data/RowType;", "(Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/polymarket/designtokens/Icon;ILcom/polymarket/data/RowType;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "Swift_id", "getType", "()Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "Swift_type", "getTitle", "Swift_title", "newValue", "getSubtitle", "setSubtitle", "(Ljava/lang/String;)V", "Swift_subtitle", "Swift_subtitle_set", "value", "getDetail", "setDetail", "Swift_detail", "Swift_detail_set", "getLeftIcon", "()Lcom/polymarket/designtokens/Icon;", "setLeftIcon", "(Lcom/polymarket/designtokens/Icon;)V", "Swift_leftIcon", "Swift_leftIcon_set", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "Swift_badgeCount", "Swift_badgeCount_set", "getStyle", "()Lcom/polymarket/data/RowType;", "setStyle", "(Lcom/polymarket/data/RowType;)V", "Swift_style", "Swift_style_set", "Swift_constructor_0", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "SettingItemType", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class SettingItem implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public SettingItem(SettingItemType settingItemType, String str, String str2, String str3, Icon icon, int i, RowType rowType) {
            settingItemType.getClass();
            str.getClass();
            rowType.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(settingItemType, str, str2, str3, icon, i, rowType);
        }

        private final native int Swift_badgeCount(long Swift_peer);

        private final native void Swift_badgeCount_set(long Swift_peer, int value);

        private final native long Swift_constructor_0(SettingItemType type, String title, String subtitle, String detail, Icon leftIcon, int badgeCount, RowType style);

        private final native String Swift_detail(long Swift_peer);

        private final native void Swift_detail_set(long Swift_peer, String value);

        private final native String Swift_id(long Swift_peer);

        private final native Icon Swift_leftIcon(long Swift_peer);

        private final native void Swift_leftIcon_set(long Swift_peer, Icon value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native RowType Swift_style(long Swift_peer);

        private final native void Swift_style_set(long Swift_peer, RowType value);

        private final native String Swift_subtitle(long Swift_peer);

        private final native void Swift_subtitle_set(long Swift_peer, String value);

        private final native String Swift_title(long Swift_peer);

        private final native SettingItemType Swift_type(long Swift_peer);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
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

        public final int getBadgeCount() {
            return Swift_badgeCount(this.Swift_peer);
        }

        public final String getDetail() {
            return Swift_detail(this.Swift_peer);
        }

        @Override // skip.lib.Identifiable
        /* renamed from: getId, reason: avoid collision after fix types in other method */
        public String getId2() {
            return Swift_id(this.Swift_peer);
        }

        public final Icon getLeftIcon() {
            return Swift_leftIcon(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final RowType getStyle() {
            return Swift_style(this.Swift_peer);
        }

        public final String getSubtitle() {
            return Swift_subtitle(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public final String getTitle() {
            return Swift_title(this.Swift_peer);
        }

        public final SettingItemType getType() {
            return Swift_type(this.Swift_peer);
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new SettingItem(getType(), getTitle(), getSubtitle(), getDetail(), getLeftIcon(), getBadgeCount(), getStyle());
        }

        public final void setBadgeCount(int i) {
            willmutate();
            try {
                Swift_badgeCount_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setDetail(String str) {
            willmutate();
            try {
                Swift_detail_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        public final void setLeftIcon(Icon icon) {
            willmutate();
            try {
                Swift_leftIcon_set(this.Swift_peer, icon);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setStyle(RowType rowType) {
            rowType.getClass();
            willmutate();
            try {
                Swift_style_set(this.Swift_peer, rowType);
            } finally {
                didmutate();
            }
        }

        public final void setSubtitle(String str) {
            willmutate();
            try {
                Swift_subtitle_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001)B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0016J\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020'H\u0082 R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "userEmail", "addPasskey", "userPhone", "userUsername", "referralCode", "inviteFriends", "theme", "appIcon", "authentication", "oddsFormat", "showComments", "showXContent", "retailAPI", "faqHelp", "contactSupport", "terms", "notifications", "taxDocuments", "haptics", "privacy", "discord", "depositLimits", "logout", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class SettingItemType implements RawRepresentable<String>, SwiftProjecting {
            private static final /* synthetic */ ug7 $ENTRIES;
            private static final /* synthetic */ SettingItemType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String rawValue;
            public static final SettingItemType userEmail = new SettingItemType("userEmail", 0, "userEmail", null, 2, null);
            public static final SettingItemType addPasskey = new SettingItemType("addPasskey", 1, "addPasskey", null, 2, null);
            public static final SettingItemType userPhone = new SettingItemType("userPhone", 2, "userPhone", null, 2, null);
            public static final SettingItemType userUsername = new SettingItemType("userUsername", 3, "userUsername", null, 2, null);
            public static final SettingItemType referralCode = new SettingItemType("referralCode", 4, "referralCode", null, 2, null);
            public static final SettingItemType inviteFriends = new SettingItemType("inviteFriends", 5, "inviteFriends", null, 2, null);
            public static final SettingItemType theme = new SettingItemType("theme", 6, "theme", null, 2, null);
            public static final SettingItemType appIcon = new SettingItemType("appIcon", 7, "appIcon", null, 2, null);
            public static final SettingItemType authentication = new SettingItemType("authentication", 8, "authentication", null, 2, null);
            public static final SettingItemType oddsFormat = new SettingItemType("oddsFormat", 9, "oddsFormat", null, 2, null);
            public static final SettingItemType showComments = new SettingItemType("showComments", 10, "showComments", null, 2, null);
            public static final SettingItemType showXContent = new SettingItemType("showXContent", 11, "showXContent", null, 2, null);
            public static final SettingItemType retailAPI = new SettingItemType("retailAPI", 12, "retailAPI", null, 2, null);
            public static final SettingItemType faqHelp = new SettingItemType("faqHelp", 13, "faqHelp", null, 2, null);
            public static final SettingItemType contactSupport = new SettingItemType("contactSupport", 14, "contactSupport", null, 2, null);
            public static final SettingItemType terms = new SettingItemType("terms", 15, "terms", null, 2, null);
            public static final SettingItemType notifications = new SettingItemType("notifications", 16, "notifications", null, 2, null);
            public static final SettingItemType taxDocuments = new SettingItemType("taxDocuments", 17, "taxDocuments", null, 2, null);
            public static final SettingItemType haptics = new SettingItemType("haptics", 18, "haptics", null, 2, null);
            public static final SettingItemType privacy = new SettingItemType("privacy", 19, "privacy", null, 2, null);
            public static final SettingItemType discord = new SettingItemType("discord", 20, "discord", null, 2, null);
            public static final SettingItemType depositLimits = new SettingItemType("depositLimits", 21, "depositLimits", null, 2, null);
            public static final SettingItemType logout = new SettingItemType("logout", 22, "logout", null, 2, null);

            private static final /* synthetic */ SettingItemType[] $values() {
                return new SettingItemType[]{userEmail, addPasskey, userPhone, userUsername, referralCode, inviteFriends, theme, appIcon, authentication, oddsFormat, showComments, showXContent, retailAPI, faqHelp, contactSupport, terms, notifications, taxDocuments, haptics, privacy, discord, depositLimits, logout};
            }

            static {
                SettingItemType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = ww4.b($values);
                INSTANCE = new Companion(null);
            }

            public /* synthetic */ SettingItemType(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? null : r4);
            }

            private final native Function0<Object> Swift_projectionImpl(int options);

            public static ug7 getEntries() {
                return $ENTRIES;
            }

            public static SettingItemType valueOf(String str) {
                return (SettingItemType) Enum.valueOf(SettingItemType.class, str);
            }

            public static SettingItemType[] values() {
                return (SettingItemType[]) $VALUES.clone();
            }

            @Override // skip.lib.SwiftProjecting
            public Function0<Object> Swift_projection(int options) {
                return Swift_projectionImpl(options);
            }

            @Override // skip.lib.RawRepresentable
            public /* bridge */ /* synthetic */ String getRawValue() {
                return getRawValue();
            }

            /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType$Companion;", "", "<init>", "()V", "init", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes5.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SettingItemType init(String rawValue) {
                    rawValue.getClass();
                    switch (rawValue.hashCode()) {
                        case -1507669481:
                            if (!rawValue.equals("retailAPI")) {
                                return null;
                            }
                            return SettingItemType.retailAPI;
                        case -1454387183:
                            if (rawValue.equals("showComments")) {
                                return SettingItemType.showComments;
                            }
                            return null;
                        case -1413844421:
                            if (rawValue.equals("oddsFormat")) {
                                return SettingItemType.oddsFormat;
                            }
                            return null;
                        case -1097329270:
                            if (rawValue.equals("logout")) {
                                return SettingItemType.logout;
                            }
                            return null;
                        case -1080274057:
                            if (rawValue.equals("faqHelp")) {
                                return SettingItemType.faqHelp;
                            }
                            return null;
                        case -1033642559:
                            if (rawValue.equals("userUsername")) {
                                return SettingItemType.userUsername;
                            }
                            return null;
                        case -794283462:
                            if (rawValue.equals("appIcon")) {
                                return SettingItemType.appIcon;
                            }
                            return null;
                        case -314498168:
                            if (rawValue.equals("privacy")) {
                                return SettingItemType.privacy;
                            }
                            return null;
                        case -96321450:
                            if (rawValue.equals("depositLimits")) {
                                return SettingItemType.depositLimits;
                            }
                            return null;
                        case 110250375:
                            if (rawValue.equals("terms")) {
                                return SettingItemType.terms;
                            }
                            return null;
                        case 110327241:
                            if (rawValue.equals("theme")) {
                                return SettingItemType.theme;
                            }
                            return null;
                        case 315299473:
                            if (rawValue.equals("userEmail")) {
                                return SettingItemType.userEmail;
                            }
                            return null;
                        case 325322851:
                            if (rawValue.equals("userPhone")) {
                                return SettingItemType.userPhone;
                            }
                            return null;
                        case 423830349:
                            if (rawValue.equals("taxDocuments")) {
                                return SettingItemType.taxDocuments;
                            }
                            return null;
                        case 430432888:
                            if (rawValue.equals("authentication")) {
                                return SettingItemType.authentication;
                            }
                            return null;
                        case 448055038:
                            if (rawValue.equals("showXContent")) {
                                return SettingItemType.showXContent;
                            }
                            return null;
                        case 695124156:
                            if (rawValue.equals("haptics")) {
                                return SettingItemType.haptics;
                            }
                            return null;
                        case 1116196045:
                            if (rawValue.equals("addPasskey")) {
                                return SettingItemType.addPasskey;
                            }
                            return null;
                        case 1272354024:
                            if (rawValue.equals("notifications")) {
                                return SettingItemType.notifications;
                            }
                            return null;
                        case 1609131596:
                            if (rawValue.equals("inviteFriends")) {
                                return SettingItemType.inviteFriends;
                            }
                            return null;
                        case 1671380268:
                            if (rawValue.equals("discord")) {
                                return SettingItemType.discord;
                            }
                            return null;
                        case 1988693903:
                            if (rawValue.equals("contactSupport")) {
                                return SettingItemType.contactSupport;
                            }
                            return null;
                        case 2080212778:
                            if (rawValue.equals("referralCode")) {
                                return SettingItemType.referralCode;
                            }
                            return null;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }

            @Override // skip.lib.RawRepresentable
            public String getRawValue() {
                return this.rawValue;
            }

            private SettingItemType(String str, int i, String str2, Void r4) {
                this.rawValue = str2;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$Companion;", "", "<init>", "()V", "SettingItemType", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "rawValue", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SettingItemType SettingItemType(String rawValue) {
                rawValue.getClass();
                return SettingItemType.INSTANCE.init(rawValue);
            }

            private Companion() {
            }
        }

        @Override // skip.lib.Identifiable
        public /* bridge */ /* synthetic */ String getId() {
            return getId2();
        }

        public SettingItem(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        public /* synthetic */ SettingItem(SettingItemType settingItemType, String str, String str2, String str3, Icon icon, int i, RowType rowType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(settingItemType, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : icon, (i2 & 32) != 0 ? 0 : i, rowType);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSelectItemCase", "OnVersionDoubleTapCase", "OnLogoutCase", "Companion", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnLogoutCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnSelectItemCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnVersionDoubleTapCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnViewDidLoadCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onVersionDoubleTap = new OnVersionDoubleTapCase();
        private static final Input onLogout = new OnLogoutCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnLogoutCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnLogoutCase extends Input {
            public OnLogoutCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnSelectItemCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "<init>", "(Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectItemCase extends Input {
            private final SettingItem.SettingItemType associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectItemCase(SettingItem.SettingItemType settingItemType) {
                super(null);
                settingItemType.getClass();
                this.associated0 = settingItemType;
            }

            public final SettingItem.SettingItemType getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnVersionDoubleTapCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnVersionDoubleTapCase extends Input {
            public OnVersionDoubleTapCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public static final /* synthetic */ Input access$getOnLogout$cp() {
            return onLogout;
        }

        public static final /* synthetic */ Input access$getOnVersionDoubleTap$cp() {
            return onVersionDoubleTap;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Input;", "onSelectItem", "associated0", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$SettingItem$SettingItemType;", "onVersionDoubleTap", "getOnVersionDoubleTap", "onLogout", "getOnLogout", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnLogout() {
                return Input.access$getOnLogout$cp();
            }

            public final Input getOnVersionDoubleTap() {
                return Input.access$getOnVersionDoubleTap$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onSelectItem(SettingItem.SettingItemType associated0) {
                associated0.getClass();
                return new OnSelectItemCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0010\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0011\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0082 ¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Callbacks;", "mockAuthenticated", "Lcom/polymarket/usviewmodels/ProfileSettingsViewModel;", "email", "", "Swift_Companion_mockAuthenticated_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        private final native ProfileSettingsViewModel Swift_Companion_mockAuthenticated_4(String email);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        public static /* synthetic */ ProfileSettingsViewModel mockAuthenticated$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "very.long.email@polymarket-example.com";
            }
            return companion.mockAuthenticated(str);
        }

        public final ProfileSettingsViewModel mockAuthenticated(String email) {
            email.getClass();
            return Swift_Companion_mockAuthenticated_4(email);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileSettingsViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public ProfileSettingsViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0081\u0002\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u0017\u0012 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\u001eJ\u0006\u0010#\u001a\u00020\fJ\u0015\u0010$\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016Jé\u0001\u0010+\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u00172\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u000b2\u0006\u0010-\u001a\u00020*H\u0016J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020(0\u000b2\u0006\u0010-\u001a\u00020*H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00060"}, d2 = {"Lcom/polymarket/usviewmodels/ProfileSettingsViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onThemeSelected", "Lkotlin/Function0;", "", "onAppIconSelected", "onAuthenticationSelected", "onOddsFormatSelected", "onTaxDocumentsSelected", "onUsernameSelected", "onReferralCodeSelected", "onInviteFriendsSelected", "onDepositLimitsSelected", "onPrivacySelected", "onShowURL", "Lkotlin/Function1;", "Ljava/net/URI;", "onContactSupport", "Lkotlin/Function3;", "", "onShowDebugSettings", "onLogout", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function1 function1, Function3 function3, Function0 function011, Function0 function012, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r30);
            Function0 function013;
            Function0 function014;
            Function0 function015;
            Function0 function016;
            Function0 function017;
            Function0 function018;
            Function0 function019;
            Function0 function020;
            Function0 function021;
            Function0 function022;
            Function1 function12;
            Function3 function32;
            Function0 function023;
            Function0 function024;
            if ((i & 1) != 0) {
                function013 = new d5f(17);
            } else {
                function013 = function0;
            }
            if ((i & 2) != 0) {
                function014 = new d5f(24);
            } else {
                function014 = function02;
            }
            if ((i & 4) != 0) {
                function015 = new d5f(25);
            } else {
                function015 = function03;
            }
            if ((i & 8) != 0) {
                function016 = new d5f(26);
            } else {
                function016 = function04;
            }
            if ((i & 16) != 0) {
                function017 = new d5f(27);
            } else {
                function017 = function05;
            }
            if ((i & 32) != 0) {
                function018 = new d5f(28);
            } else {
                function018 = function06;
            }
            if ((i & 64) != 0) {
                function019 = new d5f(18);
            } else {
                function019 = function07;
            }
            if ((i & 128) != 0) {
                function020 = new d5f(19);
            } else {
                function020 = function08;
            }
            if ((i & 256) != 0) {
                function021 = new d5f(20);
            } else {
                function021 = function09;
            }
            if ((i & Barcode.FORMAT_UPC_A) != 0) {
                function022 = new d5f(21);
            } else {
                function022 = function010;
            }
            if ((i & Barcode.FORMAT_UPC_E) != 0) {
                function12 = new l7f(13);
            } else {
                function12 = function1;
            }
            if ((i & 2048) != 0) {
                function32 = new qx7(7);
            } else {
                function32 = function3;
            }
            if ((i & 4096) != 0) {
                function023 = new d5f(22);
            } else {
                function023 = function011;
            }
            if ((i & 8192) != 0) {
                function024 = new d5f(23);
            } else {
                function024 = function012;
            }
        }

        private final native long Swift_constructor_0(Function0<Unit> onThemeSelected, Function0<Unit> onAppIconSelected, Function0<Unit> onAuthenticationSelected, Function0<Unit> onOddsFormatSelected, Function0<Unit> onTaxDocumentsSelected, Function0<Unit> onUsernameSelected, Function0<Unit> onReferralCodeSelected, Function0<Unit> onInviteFriendsSelected, Function0<Unit> onDepositLimitsSelected, Function0<Unit> onPrivacySelected, Function1<? super URI, Unit> onShowURL, Function3<? super String, ? super String, ? super String, Unit> onContactSupport, Function0<Unit> onShowDebugSettings, Function0<Unit> onLogout);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$10(URI uri) {
            uri.getClass();
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$11(String str, String str2, String str3) {
            g.x(str, str2, str3);
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$12() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$13() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2() {
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

        private static final Unit _init_$lambda$6() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$7() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$8() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$9() {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$3();
        }

        public static /* synthetic */ Unit b(URI uri) {
            return _init_$lambda$10(uri);
        }

        public static /* synthetic */ Unit c() {
            return _init_$lambda$7();
        }

        public static /* synthetic */ Unit d() {
            return _init_$lambda$9();
        }

        public static /* synthetic */ Unit e() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit f() {
            return _init_$lambda$6();
        }

        public static /* synthetic */ Unit g() {
            return _init_$lambda$13();
        }

        public static /* synthetic */ Unit h(String str, String str2, String str3) {
            return _init_$lambda$11(str, str2, str3);
        }

        public static /* synthetic */ Unit i() {
            return _init_$lambda$4();
        }

        public static /* synthetic */ Unit j() {
            return _init_$lambda$2();
        }

        public static /* synthetic */ Unit k() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit l() {
            return _init_$lambda$8();
        }

        public static /* synthetic */ Unit m() {
            return _init_$lambda$5();
        }

        public static /* synthetic */ Unit n() {
            return _init_$lambda$12();
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

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Function0<Unit> function010, Function1<? super URI, Unit> function1, Function3<? super String, ? super String, ? super String, Unit> function3, Function0<Unit> function011, Function0<Unit> function012) {
            function0.getClass();
            function02.getClass();
            function03.getClass();
            function04.getClass();
            function05.getClass();
            function06.getClass();
            function07.getClass();
            function08.getClass();
            function09.getClass();
            function010.getClass();
            function1.getClass();
            function3.getClass();
            function011.getClass();
            function012.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function03, function04, function05, function06, function07, function08, function09, function010, function1, function3, function011, function012);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
