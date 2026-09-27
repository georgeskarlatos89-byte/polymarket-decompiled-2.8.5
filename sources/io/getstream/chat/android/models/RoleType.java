package io.getstream.chat.android.models;

import com.appsflyer.AppsFlyerProperties;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/getstream/chat/android/models/RoleType;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "copy$stream_chat_android_core", "equals", "", "other", "hashCode", "", "toString", "Companion", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RoleType {
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RoleType User = new RoleType("user");
    private static final RoleType Channel = new RoleType(AppsFlyerProperties.CHANNEL);

    public RoleType(String str) {
        str.getClass();
        this.value = str;
    }

    public static final /* synthetic */ RoleType access$getChannel$cp() {
        return Channel;
    }

    public static final /* synthetic */ RoleType access$getUser$cp() {
        return User;
    }

    public static /* synthetic */ RoleType copy$stream_chat_android_core$default(RoleType roleType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roleType.value;
        }
        return roleType.copy$stream_chat_android_core(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final RoleType copy$stream_chat_android_core(String value) {
        value.getClass();
        return new RoleType(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof RoleType) && Intrinsics.areEqual(this.value, ((RoleType) other).value)) {
            return true;
        }
        return false;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return sv6.n("RoleType(value=", this.value, ")");
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lio/getstream/chat/android/models/RoleType$Companion;", "", "<init>", "()V", "User", "Lio/getstream/chat/android/models/RoleType;", "getUser", "()Lio/getstream/chat/android/models/RoleType;", "Channel", "getChannel", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RoleType getChannel() {
            return RoleType.access$getChannel$cp();
        }

        public final RoleType getUser() {
            return RoleType.access$getUser$cp();
        }

        private Companion() {
        }
    }
}
