package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APINotificationPreferenceUS;
import com.polymarket.data.APIUSNotification;
import com.polymarket.data.EError;
import com.polymarket.usviewmodels.AppViewModel;
import defpackage.u2d;
import defpackage.u85;
import defpackage.utc;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Async;
import skip.lib.MutableStruct;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 t2\u00020\u0001:\u0004qrstB\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082 J\u0015\u0010\u001d\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001e\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u0010!\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\"\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010#2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010*\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010#H\u0082 J\u0015\u0010-\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010.\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u00101\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00102\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 J\u0015\u00109\u001a\u0002032\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010:\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0017\u001a\u000203H\u0082 J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020;0\r2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010@\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020;0\rH\u0082 J\u0015\u0010B\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010E\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010H\u001a\u00020\u00182\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010M\u001a\u00020J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010P\u001a\u00020J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010S\u001a\u00020J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010V\u001a\u00020J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0015\u0010Y\u001a\u00020J2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u000e\u0010Z\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u001d\u0010[\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\nH\u0082 J\b\u0010\\\u001a\u00020\u0016H\u0016J\u0015\u0010]\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\b\u0010^\u001a\u00020\u0016H\u0016J\u0015\u0010_\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010`\u001a\u00020\u00162\u0006\u0010a\u001a\u00020bH\u0096@¢\u0006\u0002\u0010cJ3\u0010d\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010a\u001a\u00020b2\u0014\u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010g\u0012\u0004\u0012\u00020\u00160fH\u0082 J\u000e\u0010h\u001a\u00020\u00162\u0006\u0010i\u001a\u00020jJ\u001d\u0010k\u001a\u00020\u00162\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010i\u001a\u00020jH\u0082 J\u0016\u0010l\u001a\b\u0012\u0004\u0012\u00020n0m2\u0006\u0010o\u001a\u000203H\u0016J\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020n0m2\u0006\u0010o\u001a\u000203H\u0082 R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010+\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR$\u0010/\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR$\u00104\u001a\u0002032\u0006\u0010\f\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R0\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020;0\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013R\u0011\u0010A\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bA\u0010\u001aR\u0011\u0010C\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bD\u0010\u001aR\u0011\u0010F\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bG\u0010\u001aR\u0011\u0010I\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010N\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bO\u0010LR\u0011\u0010Q\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0011\u0010T\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bU\u0010LR\u0011\u0010W\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bX\u0010L¨\u0006u"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "callbacks", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Callbacks;", "(Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Callbacks;)V", "newValue", "", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "notifications", "getNotifications", "()Ljava/util/List;", "setNotifications", "(Ljava/util/List;)V", "Swift_notifications", "Swift_notifications_set", "", "value", "", "isLoading", "()Z", "setLoading", "(Z)V", "Swift_isLoading", "Swift_isLoading_set", "isRefreshing", "setRefreshing", "Swift_isRefreshing", "Swift_isRefreshing_set", "Lcom/polymarket/data/EError;", "error", "getError", "()Lcom/polymarket/data/EError;", "setError", "(Lcom/polymarket/data/EError;)V", "Swift_error", "Swift_error_set", "isUserLoggedIn", "setUserLoggedIn", "Swift_isUserLoggedIn", "Swift_isUserLoggedIn_set", "isNotificationsEnabled", "setNotificationsEnabled", "Swift_isNotificationsEnabled", "Swift_isNotificationsEnabled_set", "", "unreadCount", "getUnreadCount", "()I", "setUnreadCount", "(I)V", "Swift_unreadCount", "Swift_unreadCount_set", "Lcom/polymarket/data/APINotificationPreferenceUS;", "preferences", "getPreferences", "setPreferences", "Swift_preferences", "Swift_preferences_set", "isEmpty", "Swift_isEmpty", "hasUnread", "getHasUnread", "Swift_hasUnread", "showsSettingsButton", "getShowsSettingsButton", "Swift_showsSettingsButton", "navTitle", "", "getNavTitle", "()Ljava/lang/String;", "Swift_navTitle", "emptyStateTitle", "getEmptyStateTitle", "Swift_emptyStateTitle", "emptyStateActivitySubtitle", "getEmptyStateActivitySubtitle", "Swift_emptyStateActivitySubtitle", "emptyStateActivityCTA", "getEmptyStateActivityCTA", "Swift_emptyStateActivityCTA", "emptyStateEnableCTA", "getEmptyStateEnableCTA", "Swift_emptyStateEnableCTA", "setCallbacks", "Swift_setCallbacks_1", "setup", "Swift_setup_2", "handleBecomeForeground", "Swift_handleBecomeForeground_3", "performLoad", "reason", "Lcom/polymarket/usviewmodels/ReloadReason;", "(Lcom/polymarket/usviewmodels/ReloadReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Swift_callback_performLoad_4", "f_callback", "Lkotlin/Function1;", "", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "Swift_sendInput_5", "Swift_projection", "Lkotlin/Function0;", "", "options", "Swift_projectionImpl", "Callbacks", "Notification", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationsFeedViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ NotificationsFeedViewModel(Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Callbacks(null, null, null, 7, null) : callbacks);
    }

    private final native void Swift_callback_performLoad_4(long Swift_peer, ReloadReason reason, Function1<? super Throwable, Unit> f_callback);

    private final native String Swift_emptyStateActivityCTA(long Swift_peer);

    private final native String Swift_emptyStateActivitySubtitle(long Swift_peer);

    private final native String Swift_emptyStateEnableCTA(long Swift_peer);

    private final native String Swift_emptyStateTitle(long Swift_peer);

    private final native EError Swift_error(long Swift_peer);

    private final native void Swift_error_set(long Swift_peer, EError value);

    private final native void Swift_handleBecomeForeground_3(long Swift_peer);

    private final native boolean Swift_hasUnread(long Swift_peer);

    private final native boolean Swift_isEmpty(long Swift_peer);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isNotificationsEnabled(long Swift_peer);

    private final native void Swift_isNotificationsEnabled_set(long Swift_peer, boolean value);

    private final native boolean Swift_isRefreshing(long Swift_peer);

    private final native void Swift_isRefreshing_set(long Swift_peer, boolean value);

    private final native boolean Swift_isUserLoggedIn(long Swift_peer);

    private final native void Swift_isUserLoggedIn_set(long Swift_peer, boolean value);

    private final native String Swift_navTitle(long Swift_peer);

    private final native List<Notification> Swift_notifications(long Swift_peer);

    private final native void Swift_notifications_set(long Swift_peer, List<Notification> value);

    private final native List<APINotificationPreferenceUS> Swift_preferences(long Swift_peer);

    private final native void Swift_preferences_set(long Swift_peer, List<APINotificationPreferenceUS> value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_sendInput_5(long Swift_peer, Input input);

    private final native void Swift_setCallbacks_1(long Swift_peer, Callbacks callbacks);

    private final native void Swift_setup_2(long Swift_peer);

    private final native boolean Swift_showsSettingsButton(long Swift_peer);

    private final native int Swift_unreadCount(long Swift_peer);

    private final native void Swift_unreadCount_set(long Swift_peer, int value);

    public static final /* synthetic */ void access$Swift_callback_performLoad_4(NotificationsFeedViewModel notificationsFeedViewModel, long j, ReloadReason reloadReason, Function1 function1) {
        notificationsFeedViewModel.Swift_callback_performLoad_4(j, reloadReason, function1);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getEmptyStateActivityCTA() {
        return Swift_emptyStateActivityCTA(getSwift_peer());
    }

    public final String getEmptyStateActivitySubtitle() {
        return Swift_emptyStateActivitySubtitle(getSwift_peer());
    }

    public final String getEmptyStateEnableCTA() {
        return Swift_emptyStateEnableCTA(getSwift_peer());
    }

    public final String getEmptyStateTitle() {
        return Swift_emptyStateTitle(getSwift_peer());
    }

    public final EError getError() {
        return Swift_error(getSwift_peer());
    }

    public final boolean getHasUnread() {
        return Swift_hasUnread(getSwift_peer());
    }

    public final String getNavTitle() {
        return Swift_navTitle(getSwift_peer());
    }

    public final List<Notification> getNotifications() {
        return Swift_notifications(getSwift_peer());
    }

    public final List<APINotificationPreferenceUS> getPreferences() {
        return Swift_preferences(getSwift_peer());
    }

    public final boolean getShowsSettingsButton() {
        return Swift_showsSettingsButton(getSwift_peer());
    }

    public final int getUnreadCount() {
        return Swift_unreadCount(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void handleBecomeForeground() {
        Swift_handleBecomeForeground_3(getSwift_peer());
    }

    public final boolean isEmpty() {
        return Swift_isEmpty(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isNotificationsEnabled() {
        return Swift_isNotificationsEnabled(getSwift_peer());
    }

    public final boolean isRefreshing() {
        return Swift_isRefreshing(getSwift_peer());
    }

    public final boolean isUserLoggedIn() {
        return Swift_isUserLoggedIn(getSwift_peer());
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public Object performLoad(ReloadReason reloadReason, Continuation<? super Unit> continuation) {
        Object run = Async.INSTANCE.run(new NotificationsFeedViewModel$performLoad$2(this, reloadReason, null), continuation);
        if (run == u85.COROUTINE_SUSPENDED) {
            return run;
        }
        return Unit.INSTANCE;
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_5(getSwift_peer(), input);
    }

    public final void setCallbacks(Callbacks callbacks) {
        callbacks.getClass();
        Swift_setCallbacks_1(getSwift_peer(), callbacks);
    }

    public final void setError(EError eError) {
        Swift_error_set(getSwift_peer(), (EError) StructKt.sref$default(eError, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setNotifications(List<Notification> list) {
        list.getClass();
        Swift_notifications_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setNotificationsEnabled(boolean z) {
        Swift_isNotificationsEnabled_set(getSwift_peer(), z);
    }

    public final void setPreferences(List<APINotificationPreferenceUS> list) {
        list.getClass();
        Swift_preferences_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setRefreshing(boolean z) {
        Swift_isRefreshing_set(getSwift_peer(), z);
    }

    public final void setUnreadCount(int i) {
        Swift_unreadCount_set(getSwift_peer(), i);
    }

    public final void setUserLoggedIn(boolean z) {
        Swift_isUserLoggedIn_set(getSwift_peer(), z);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_2(getSwift_peer());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnAppearCase", "OnRefreshCase", "OnSettingsCase", "OnSelectActivityCase", "OnEnableNotificationsCase", "OnNotificationSelectedCase", "OnWillDisplayNotificationCase", "Companion", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnEnableNotificationsCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnNotificationSelectedCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnSelectActivityCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnWillDisplayNotificationCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onAppear = new OnAppearCase();
        private static final Input onRefresh = new OnRefreshCase();
        private static final Input onSettings = new OnSettingsCase();
        private static final Input onSelectActivity = new OnSelectActivityCase();
        private static final Input onEnableNotifications = new OnEnableNotificationsCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnAppearCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAppearCase extends Input {
            public OnAppearCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnEnableNotificationsCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEnableNotificationsCase extends Input {
            public OnEnableNotificationsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnNotificationSelectedCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "<init>", "(Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnNotificationSelectedCase extends Input {
            private final Notification associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnNotificationSelectedCase(Notification notification) {
                super(null);
                notification.getClass();
                this.associated0 = notification;
            }

            public final Notification getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnRefreshCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnRefreshCase extends Input {
            public OnRefreshCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnSelectActivityCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectActivityCase extends Input {
            public OnSelectActivityCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnSettingsCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSettingsCase extends Input {
            public OnSettingsCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$OnWillDisplayNotificationCase;", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "associated0", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "<init>", "(Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;)V", "getAssociated0", "()Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnWillDisplayNotificationCase extends Input {
            private final Notification associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnWillDisplayNotificationCase(Notification notification) {
                super(null);
                notification.getClass();
                this.associated0 = notification;
            }

            public final Notification getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnAppear$cp() {
            return onAppear;
        }

        public static final /* synthetic */ Input access$getOnEnableNotifications$cp() {
            return onEnableNotifications;
        }

        public static final /* synthetic */ Input access$getOnRefresh$cp() {
            return onRefresh;
        }

        public static final /* synthetic */ Input access$getOnSelectActivity$cp() {
            return onSelectActivity;
        }

        public static final /* synthetic */ Input access$getOnSettings$cp() {
            return onSettings;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input$Companion;", "", "<init>", "()V", "onAppear", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "getOnAppear", "()Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Input;", "onRefresh", "getOnRefresh", "onSettings", "getOnSettings", "onSelectActivity", "getOnSelectActivity", "onEnableNotifications", "getOnEnableNotifications", "onNotificationSelected", "associated0", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "onWillDisplayNotification", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnAppear() {
                return Input.access$getOnAppear$cp();
            }

            public final Input getOnEnableNotifications() {
                return Input.access$getOnEnableNotifications$cp();
            }

            public final Input getOnRefresh() {
                return Input.access$getOnRefresh$cp();
            }

            public final Input getOnSelectActivity() {
                return Input.access$getOnSelectActivity$cp();
            }

            public final Input getOnSettings() {
                return Input.access$getOnSettings$cp();
            }

            public final Input onNotificationSelected(Notification associated0) {
                associated0.getClass();
                return new OnNotificationSelectedCase(associated0);
            }

            public final Input onWillDisplayNotification(Notification associated0) {
                associated0.getClass();
                return new OnWillDisplayNotificationCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 ¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", "callbacks", "Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Callbacks;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(Callbacks callbacks);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, Callbacks callbacks) {
            return companion.Swift_Companion_constructor_0(callbacks);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rB\u0011\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0015\u0010\u0016\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0015\u0010!\u001a\u00020\u001e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u0015\u0010&\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\fH\u0082 J\u0015\u0010)\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0082 J\u0015\u0010*\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0082 J\b\u00106\u001a\u00020\u0001H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a082\u0006\u00109\u001a\u00020\u001cH\u0016J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a082\u0006\u00109\u001a\u00020\u001cH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\rR(\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006<"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Notification;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "entity", "Lcom/polymarket/data/APIUSNotification;", "(Lcom/polymarket/data/APIUSNotification;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "getId", "()Ljava/lang/String;", "Swift_id", "newValue", "getEntity", "()Lcom/polymarket/data/APIUSNotification;", "setEntity", "Swift_entity", "Swift_entity_set", "value", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Notification implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public Notification(APIUSNotification aPIUSNotification) {
            aPIUSNotification.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(aPIUSNotification);
        }

        private final native long Swift_constructor_0(APIUSNotification entity);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native APIUSNotification Swift_entity(long Swift_peer);

        private final native void Swift_entity_set(long Swift_peer, APIUSNotification value);

        private final native String Swift_id(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

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

        public final APIUSNotification getEntity() {
            return Swift_entity(this.Swift_peer);
        }

        public final String getId() {
            return Swift_id(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Notification(this);
        }

        public final void setEntity(APIUSNotification aPIUSNotification) {
            aPIUSNotification.getClass();
            APIUSNotification aPIUSNotification2 = (APIUSNotification) StructKt.sref$default(aPIUSNotification, null, 1, null);
            willmutate();
            try {
                Swift_entity_set(this.Swift_peer, aPIUSNotification2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
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

        public Notification(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Notification(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsFeedViewModel(Callbacks callbacks) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, callbacks), (SwiftPeerMarker) null);
        callbacks.getClass();
    }

    public NotificationsFeedViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB?\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\b\u0010\u0011J\u0006\u0010\u0016\u001a\u00020\fJ\u0015\u0010\u0017\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J=\u0010&\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fH\u0082 J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010(\u001a\u00020\u001dH\u0016J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010(\u001a\u00020\u001dH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/polymarket/usviewmodels/NotificationsFeedViewModel$Callbacks;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "onSettings", "Lkotlin/Function0;", "", "onSelectActivity", "onNotificationSelected", "Lkotlin/Function1;", "Lcom/polymarket/data/APIUSNotification;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "Swift_release", "equals", "", "other", "", "hashCode", "", "getOnSettings", "()Lkotlin/jvm/functions/Function0;", "Swift_onSettings", "getOnSelectActivity", "Swift_onSelectActivity", "getOnNotificationSelected", "()Lkotlin/jvm/functions/Function1;", "Swift_onNotificationSelected", "Swift_constructor_0", "Swift_projection", "options", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Callbacks implements SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;

        public /* synthetic */ Callbacks(Function0 function0, Function0 function02, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new u2d(10) : function0, (i & 2) != 0 ? new u2d(11) : function02, (i & 4) != 0 ? new utc(25) : function1);
        }

        private final native long Swift_constructor_0(Function0<Unit> onSettings, Function0<Unit> onSelectActivity, Function1<? super APIUSNotification, Unit> onNotificationSelected);

        private final native Function1<APIUSNotification, Unit> Swift_onNotificationSelected(long Swift_peer);

        private final native Function0<Unit> Swift_onSelectActivity(long Swift_peer);

        private final native Function0<Unit> Swift_onSettings(long Swift_peer);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private static final Unit _init_$lambda$0() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$1() {
            return Unit.INSTANCE;
        }

        private static final Unit _init_$lambda$2(APIUSNotification aPIUSNotification) {
            aPIUSNotification.getClass();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit a() {
            return _init_$lambda$1();
        }

        public static /* synthetic */ Unit b() {
            return _init_$lambda$0();
        }

        public static /* synthetic */ Unit c(APIUSNotification aPIUSNotification) {
            return _init_$lambda$2(aPIUSNotification);
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

        public final Function1<APIUSNotification, Unit> getOnNotificationSelected() {
            return Swift_onNotificationSelected(this.Swift_peer);
        }

        public final Function0<Unit> getOnSelectActivity() {
            return Swift_onSelectActivity(this.Swift_peer);
        }

        public final Function0<Unit> getOnSettings() {
            return Swift_onSettings(this.Swift_peer);
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

        public Callbacks(Function0<Unit> function0, Function0<Unit> function02, Function1<? super APIUSNotification, Unit> function1) {
            function0.getClass();
            function02.getClass();
            function1.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(function0, function02, function1);
        }

        public Callbacks(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }
    }
}
