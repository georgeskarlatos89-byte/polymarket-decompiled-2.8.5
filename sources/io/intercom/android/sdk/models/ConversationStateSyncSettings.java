package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.sv6;
import defpackage.woa;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "", "enabled", "", "startTimeout", "", "syncInterval", "<init>", "(ZII)V", "getEnabled", "()Z", "getStartTimeout", "()I", "getSyncInterval", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConversationStateSyncSettings {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConversationStateSyncSettings DEFAULT = new ConversationStateSyncSettings(false, 0, 0);

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("start_timeout")
    private final int startTimeout;

    @SerializedName("sync_interval")
    private final int syncInterval;

    public ConversationStateSyncSettings(boolean z, int i, int i2) {
        this.enabled = z;
        this.startTimeout = i;
        this.syncInterval = i2;
    }

    public static final /* synthetic */ ConversationStateSyncSettings access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static /* synthetic */ ConversationStateSyncSettings copy$default(ConversationStateSyncSettings conversationStateSyncSettings, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = conversationStateSyncSettings.enabled;
        }
        if ((i3 & 2) != 0) {
            i = conversationStateSyncSettings.startTimeout;
        }
        if ((i3 & 4) != 0) {
            i2 = conversationStateSyncSettings.syncInterval;
        }
        return conversationStateSyncSettings.copy(z, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartTimeout() {
        return this.startTimeout;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public final ConversationStateSyncSettings copy(boolean enabled, int startTimeout, int syncInterval) {
        return new ConversationStateSyncSettings(enabled, startTimeout, syncInterval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationStateSyncSettings)) {
            return false;
        }
        ConversationStateSyncSettings conversationStateSyncSettings = (ConversationStateSyncSettings) other;
        if (this.enabled == conversationStateSyncSettings.enabled && this.startTimeout == conversationStateSyncSettings.startTimeout && this.syncInterval == conversationStateSyncSettings.syncInterval) {
            return true;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public int hashCode() {
        return Integer.hashCode(this.syncInterval) + woa.b(this.startTimeout, Boolean.hashCode(this.enabled) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationStateSyncSettings(enabled=");
        sb.append(this.enabled);
        sb.append(", startTimeout=");
        sb.append(this.startTimeout);
        sb.append(", syncInterval=");
        return sv6.o(sb, this.syncInterval, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/ConversationStateSyncSettings$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "getDEFAULT", "()Lio/intercom/android/sdk/models/ConversationStateSyncSettings;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConversationStateSyncSettings getDEFAULT() {
            return ConversationStateSyncSettings.access$getDEFAULT$cp();
        }

        private Companion() {
        }
    }
}
