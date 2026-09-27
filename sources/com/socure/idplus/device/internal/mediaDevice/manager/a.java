package com.socure.idplus.device.internal.mediaDevice.manager;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a extends AudioDeviceCallback {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        this.a.invoke();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        this.a.invoke();
    }
}
