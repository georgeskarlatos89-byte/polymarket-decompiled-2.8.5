package com.socure.idplus.device.internal.mediaDevice.model;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutput;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "label", "type", "Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutputType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutputType;)V", "getId", "()Ljava/lang/String;", "getLabel", "getType", "()Lcom/socure/idplus/device/internal/mediaDevice/model/AudioOutputType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AudioOutput {

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    private final String id;

    @SerializedName("label")
    private final String label;

    @SerializedName("type")
    private final AudioOutputType type;

    public AudioOutput(String str, String str2, AudioOutputType audioOutputType) {
        str.getClass();
        audioOutputType.getClass();
        this.id = str;
        this.label = str2;
        this.type = audioOutputType;
    }

    public static /* synthetic */ AudioOutput copy$default(AudioOutput audioOutput, String str, String str2, AudioOutputType audioOutputType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioOutput.id;
        }
        if ((i & 2) != 0) {
            str2 = audioOutput.label;
        }
        if ((i & 4) != 0) {
            audioOutputType = audioOutput.type;
        }
        return audioOutput.copy(str, str2, audioOutputType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final AudioOutputType getType() {
        return this.type;
    }

    public final AudioOutput copy(String id, String label, AudioOutputType type) {
        id.getClass();
        type.getClass();
        return new AudioOutput(id, label, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioOutput)) {
            return false;
        }
        AudioOutput audioOutput = (AudioOutput) other;
        if (Intrinsics.areEqual(this.id, audioOutput.id) && Intrinsics.areEqual(this.label, audioOutput.label) && this.type == audioOutput.type) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final AudioOutputType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.label;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.type.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        AudioOutputType audioOutputType = this.type;
        StringBuilder r = m51.r("AudioOutput(id=", str, ", label=", str2, ", type=");
        r.append(audioOutputType);
        r.append(")");
        return r.toString();
    }
}
