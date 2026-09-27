package com.polymarket.usviewmodels;

import com.polymarket.clients.ClientAnalytics;
import com.polymarket.clients.ClientBraze;
import com.polymarket.clients.ClientMarketingAnalytics;
import com.polymarket.clients.ClientNotifications;
import com.polymarket.clients.ClientSupport;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/polymarket/usviewmodels/ClientsBridge;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientsBridge {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ClientsBridge[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    private static final /* synthetic */ ClientsBridge[] $values() {
        return new ClientsBridge[0];
    }

    static {
        ClientsBridge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private ClientsBridge(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ClientsBridge valueOf(String str) {
        return (ClientsBridge) Enum.valueOf(ClientsBridge.class, str);
    }

    public static ClientsBridge[] values() {
        return (ClientsBridge[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010\u0006\u001a\u00020\u0005H\u0082 J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\bH\u0082 J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u000bH\u0082 J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u000eH\u0082 J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0011H\u0082 ¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/ClientsBridge$Companion;", "", "<init>", "()V", "support", "Lcom/polymarket/clients/ClientSupport;", "Swift_Companion_support_0", "analytics", "Lcom/polymarket/clients/ClientAnalytics;", "Swift_Companion_analytics_1", "braze", "Lcom/polymarket/clients/ClientBraze;", "Swift_Companion_braze_2", "marketingAnalytics", "Lcom/polymarket/clients/ClientMarketingAnalytics;", "Swift_Companion_marketingAnalytics_3", "notifications", "Lcom/polymarket/clients/ClientNotifications;", "Swift_Companion_notifications_4", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalytics Swift_Companion_analytics_1();

        private final native ClientBraze Swift_Companion_braze_2();

        private final native ClientMarketingAnalytics Swift_Companion_marketingAnalytics_3();

        private final native ClientNotifications Swift_Companion_notifications_4();

        private final native ClientSupport Swift_Companion_support_0();

        public final ClientAnalytics analytics() {
            return Swift_Companion_analytics_1();
        }

        public final ClientBraze braze() {
            return Swift_Companion_braze_2();
        }

        public final ClientMarketingAnalytics marketingAnalytics() {
            return Swift_Companion_marketingAnalytics_3();
        }

        public final ClientNotifications notifications() {
            return Swift_Companion_notifications_4();
        }

        public final ClientSupport support() {
            return Swift_Companion_support_0();
        }

        private Companion() {
        }
    }
}
