package com.socure.idplus.device.internal.mediaDevice.model;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import defpackage.woa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0016¨\u0006+"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/MediaDeviceEvent;", "", "", "Lcom/socure/idplus/device/internal/mediaDevice/model/Camera;", "cameras", "Lcom/socure/idplus/device/internal/mediaDevice/model/AudioInput;", "audioInputs", "Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutput;", "audioOutputs", "Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;", "changeReason", "", "clientTime", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;J)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;", "component5", "()J", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;J)Lcom/socure/idplus/device/internal/mediaDevice/model/MediaDeviceEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCameras", "getAudioInputs", "getAudioOutputs", "Lcom/socure/idplus/device/internal/mediaDevice/model/ChangeReason;", "getChangeReason", "J", "getClientTime", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaDeviceEvent {

    @SerializedName("audioInputs")
    private final List<AudioInput> audioInputs;

    @SerializedName("audioOutputs")
    private final List<AudioOutput> audioOutputs;

    @SerializedName("cameras")
    private final List<Camera> cameras;

    @SerializedName("changeReason")
    private final ChangeReason changeReason;

    @SerializedName("clientTime")
    private final long clientTime;

    public MediaDeviceEvent(List<Camera> list, List<AudioInput> list2, List<AudioOutput> list3, ChangeReason changeReason, long j) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        changeReason.getClass();
        this.cameras = list;
        this.audioInputs = list2;
        this.audioOutputs = list3;
        this.changeReason = changeReason;
        this.clientTime = j;
    }

    public static /* synthetic */ MediaDeviceEvent copy$default(MediaDeviceEvent mediaDeviceEvent, List list, List list2, List list3, ChangeReason changeReason, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mediaDeviceEvent.cameras;
        }
        if ((i & 2) != 0) {
            list2 = mediaDeviceEvent.audioInputs;
        }
        if ((i & 4) != 0) {
            list3 = mediaDeviceEvent.audioOutputs;
        }
        if ((i & 8) != 0) {
            changeReason = mediaDeviceEvent.changeReason;
        }
        if ((i & 16) != 0) {
            j = mediaDeviceEvent.clientTime;
        }
        long j2 = j;
        return mediaDeviceEvent.copy(list, list2, list3, changeReason, j2);
    }

    public final List<Camera> component1() {
        return this.cameras;
    }

    public final List<AudioInput> component2() {
        return this.audioInputs;
    }

    public final List<AudioOutput> component3() {
        return this.audioOutputs;
    }

    /* renamed from: component4, reason: from getter */
    public final ChangeReason getChangeReason() {
        return this.changeReason;
    }

    /* renamed from: component5, reason: from getter */
    public final long getClientTime() {
        return this.clientTime;
    }

    public final MediaDeviceEvent copy(List<Camera> cameras, List<AudioInput> audioInputs, List<AudioOutput> audioOutputs, ChangeReason changeReason, long clientTime) {
        cameras.getClass();
        audioInputs.getClass();
        audioOutputs.getClass();
        changeReason.getClass();
        return new MediaDeviceEvent(cameras, audioInputs, audioOutputs, changeReason, clientTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaDeviceEvent)) {
            return false;
        }
        MediaDeviceEvent mediaDeviceEvent = (MediaDeviceEvent) other;
        if (Intrinsics.areEqual(this.cameras, mediaDeviceEvent.cameras) && Intrinsics.areEqual(this.audioInputs, mediaDeviceEvent.audioInputs) && Intrinsics.areEqual(this.audioOutputs, mediaDeviceEvent.audioOutputs) && this.changeReason == mediaDeviceEvent.changeReason && this.clientTime == mediaDeviceEvent.clientTime) {
            return true;
        }
        return false;
    }

    public final List<AudioInput> getAudioInputs() {
        return this.audioInputs;
    }

    public final List<AudioOutput> getAudioOutputs() {
        return this.audioOutputs;
    }

    public final List<Camera> getCameras() {
        return this.cameras;
    }

    public final ChangeReason getChangeReason() {
        return this.changeReason;
    }

    public long getClientTime() {
        return this.clientTime;
    }

    public int hashCode() {
        return Long.hashCode(this.clientTime) + ((this.changeReason.hashCode() + hdi.f(hdi.f(this.cameras.hashCode() * 31, 31, this.audioInputs), 31, this.audioOutputs)) * 31);
    }

    public String toString() {
        List<Camera> list = this.cameras;
        List<AudioInput> list2 = this.audioInputs;
        List<AudioOutput> list3 = this.audioOutputs;
        ChangeReason changeReason = this.changeReason;
        long j = this.clientTime;
        StringBuilder sb = new StringBuilder("MediaDeviceEvent(cameras=");
        sb.append(list);
        sb.append(", audioInputs=");
        sb.append(list2);
        sb.append(", audioOutputs=");
        sb.append(list3);
        sb.append(", changeReason=");
        sb.append(changeReason);
        sb.append(", clientTime=");
        return woa.n(j, ")", sb);
    }
}
