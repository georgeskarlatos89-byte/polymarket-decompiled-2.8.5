package io.intercom.android.nexus;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface NexusListener {
    void notifyEvent(NexusEvent nexusEvent);

    void onConnect();

    void onConnectFailed();

    void onShutdown();
}
