package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import defpackage.eb4;
import defpackage.i5d;
import defpackage.rf8;
import io.ably.lib.rest.Auth;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0007J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\nJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010'\u001a\u00020\u0016H\u0016J\b\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/NexusWrapper;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/nexus/NexusListener;", "twig", "Lcom/intercom/twig/Twig;", "okHttpClient", "Lokhttp3/OkHttpClient;", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "debouncePeriodMs", "", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lcom/intercom/twig/Twig;Lokhttp3/OkHttpClient;Lio/intercom/android/sdk/api/Api;JLio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "actionFuture", "Ljava/util/concurrent/ScheduledFuture;", "connect", "", "config", "Lio/intercom/android/nexus/NexusConfig;", "shouldSendPresence", "", "connectNow", "disconnect", "disconnectNow", "scheduleDisconnect", "delayMs", "removeCallbacks", "()Ljava/lang/Boolean;", "notifyEvent", "event", "Lio/intercom/android/nexus/NexusEvent;", "logKnownEvent", "fetchUnreadConversations", "onConnect", "onConnectFailed", "onShutdown", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NexusWrapper extends NexusClient implements NexusListener {
    private static final String CONVERSATION_ID = "conversationId";
    private ScheduledFuture<?> actionFuture;
    private final Api api;
    private final IntercomDataLayer dataLayer;
    private final long debouncePeriodMs;
    private final ScheduledExecutorService executor;
    private final Twig twig;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationSeen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NexusEventType.NewContent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NexusEventType.ConversationTitleGenerated.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NexusWrapper(Twig twig, OkHttpClient okHttpClient, Api api, long j, IntercomDataLayer intercomDataLayer) {
        super(twig, okHttpClient);
        twig.getClass();
        okHttpClient.getClass();
        api.getClass();
        intercomDataLayer.getClass();
        this.twig = twig;
        this.api = api;
        this.debouncePeriodMs = j;
        this.dataLayer = intercomDataLayer;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public static /* synthetic */ void a(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z) {
        connect$lambda$0(nexusWrapper, nexusConfig, z);
    }

    public static /* synthetic */ void b(NexusWrapper nexusWrapper) {
        scheduleDisconnect$lambda$2(nexusWrapper);
    }

    public static /* synthetic */ void c(NexusWrapper nexusWrapper) {
        disconnect$lambda$1(nexusWrapper);
    }

    private static final void connect$lambda$0(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z) {
        nexusWrapper.connectNow(nexusConfig, z);
    }

    private static final void disconnect$lambda$1(NexusWrapper nexusWrapper) {
        nexusWrapper.disconnectNow();
    }

    private final void fetchUnreadConversations() {
        this.api.getUnreadConversations();
    }

    private final void logKnownEvent(NexusEvent event) {
        this.twig.internal("Nexus", "Received " + event.getEventType() + " event");
    }

    private final Boolean removeCallbacks() {
        ScheduledFuture<?> scheduledFuture = this.actionFuture;
        if (scheduledFuture != null) {
            return Boolean.valueOf(scheduledFuture.cancel(false));
        }
        return null;
    }

    private static final void scheduleDisconnect$lambda$2(NexusWrapper nexusWrapper) {
        nexusWrapper.disconnectNow();
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void connect(NexusConfig config, boolean shouldSendPresence) {
        config.getClass();
        if (config.getEndpoints().isEmpty()) {
            this.twig.w("No realtime endpoints present so we can't connect", new Object[0]);
        } else {
            removeCallbacks();
            this.actionFuture = this.executor.schedule(new rf8(this, config, shouldSendPresence), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
        }
    }

    public final void connectNow(NexusConfig config, boolean shouldSendPresence) {
        config.getClass();
        if (isConnected()) {
            return;
        }
        super.connect(config, shouldSendPresence);
        setTopics(eb4.c(Auth.WILDCARD_CLIENTID));
        addEventListener(this);
    }

    @Override // io.intercom.android.nexus.NexusClient
    public void disconnect() {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new i5d(this, 0), this.debouncePeriodMs, TimeUnit.MILLISECONDS);
    }

    public final void disconnectNow() {
        removeEventListener(this);
        super.disconnect();
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void notifyEvent(NexusEvent event) {
        int i;
        event.getClass();
        String optString = event.getEventData().optString(CONVERSATION_ID);
        NexusEventType eventType = event.getEventType();
        if (eventType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        }
        switch (i) {
            case 1:
                logKnownEvent(event);
                return;
            case 2:
                logKnownEvent(event);
                fetchUnreadConversations();
                return;
            case 3:
                logKnownEvent(event);
                return;
            case 4:
                logKnownEvent(event);
                IntercomDataLayer intercomDataLayer = this.dataLayer;
                optString.getClass();
                intercomDataLayer.markConversationAsRead(optString);
                return;
            case 5:
                logKnownEvent(event);
                long optLong = event.getEventData().optLong("entity_type");
                String optString2 = event.getEventData().optString("entity_id");
                if (optLong == 44) {
                    this.api.fetchCarouselByEntityId(optString2);
                    return;
                }
                if (optLong == 85) {
                    this.api.fetchSurveyByEntityId(optString2);
                    return;
                }
                this.twig.internal("Nexus NewContent", "Unexpected entity type: " + optLong);
                return;
            case 6:
                logKnownEvent(event);
                String optString3 = event.getEventData().optString(CONVERSATION_ID);
                String optString4 = event.getEventData().optString(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE);
                optString3.getClass();
                if (optString3.length() > 0) {
                    optString4.getClass();
                    if (optString4.length() > 0) {
                        this.dataLayer.updateConversationTitle(optString3, optString4);
                        return;
                    }
                    return;
                }
                return;
            default:
                this.twig.internal("Nexus", "Unexpected event: " + event.getEventType());
                return;
        }
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnect() {
        fetchUnreadConversations();
    }

    public final void scheduleDisconnect(long delayMs) {
        removeCallbacks();
        this.actionFuture = this.executor.schedule(new i5d(this, 1), delayMs, TimeUnit.MILLISECONDS);
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onConnectFailed() {
    }

    @Override // io.intercom.android.nexus.NexusListener
    public void onShutdown() {
    }
}
