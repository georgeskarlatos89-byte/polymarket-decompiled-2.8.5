package io.getstream.chat.android.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/models/ChannelConfig;", "", "type", "", "config", "Lio/getstream/chat/android/models/Config;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/Config;)V", "getType", "()Ljava/lang/String;", "getConfig", "()Lio/getstream/chat/android/models/Config;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChannelConfig {
    private final Config config;
    private final String type;

    public ChannelConfig(String str, Config config) {
        str.getClass();
        config.getClass();
        this.type = str;
        this.config = config;
    }

    public static /* synthetic */ ChannelConfig copy$default(ChannelConfig channelConfig, String str, Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelConfig.type;
        }
        if ((i & 2) != 0) {
            config = channelConfig.config;
        }
        return channelConfig.copy(str, config);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    public final ChannelConfig copy(String type, Config config) {
        type.getClass();
        config.getClass();
        return new ChannelConfig(type, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelConfig)) {
            return false;
        }
        ChannelConfig channelConfig = (ChannelConfig) other;
        if (Intrinsics.areEqual(this.type, channelConfig.type) && Intrinsics.areEqual(this.config, channelConfig.config)) {
            return true;
        }
        return false;
    }

    public final Config getConfig() {
        return this.config;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "ChannelConfig(type=" + this.type + ", config=" + this.config + ")";
    }
}
