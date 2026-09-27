package io.getstream.chat.android.models;

import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lio/getstream/chat/android/models/Device;", "", "token", "", "pushProvider", "Lio/getstream/chat/android/models/PushProvider;", "providerName", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushProvider;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getPushProvider", "()Lio/getstream/chat/android/models/PushProvider;", "getProviderName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Device {
    private final String providerName;
    private final PushProvider pushProvider;
    private final String token;

    public Device(String str, PushProvider pushProvider, String str2) {
        str.getClass();
        pushProvider.getClass();
        this.token = str;
        this.pushProvider = pushProvider;
        this.providerName = str2;
    }

    public static /* synthetic */ Device copy$default(Device device, String str, PushProvider pushProvider, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = device.token;
        }
        if ((i & 2) != 0) {
            pushProvider = device.pushProvider;
        }
        if ((i & 4) != 0) {
            str2 = device.providerName;
        }
        return device.copy(str, pushProvider, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    public final Device copy(String token, PushProvider pushProvider, String providerName) {
        token.getClass();
        pushProvider.getClass();
        return new Device(token, pushProvider, providerName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        if (Intrinsics.areEqual(this.token, device.token) && this.pushProvider == device.pushProvider && Intrinsics.areEqual(this.providerName, device.providerName)) {
            return true;
        }
        return false;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final PushProvider getPushProvider() {
        return this.pushProvider;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.pushProvider.hashCode() + (this.token.hashCode() * 31)) * 31;
        String str = this.providerName;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.token;
        PushProvider pushProvider = this.pushProvider;
        String str2 = this.providerName;
        StringBuilder sb = new StringBuilder("Device(token=");
        sb.append(str);
        sb.append(", pushProvider=");
        sb.append(pushProvider);
        sb.append(", providerName=");
        return woa.r(sb, str2, ")");
    }
}
