package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import defpackage.ix2;
import defpackage.sv6;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformElement;", "", "x", "", "amplitude", "timestamp", "", "<init>", "(FFJ)V", "getX", "()F", "getAmplitude", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class WaveformElement {
    private final float amplitude;
    private final long timestamp;
    private final float x;

    public WaveformElement(float f, float f2, long j) {
        this.x = f;
        this.amplitude = f2;
        this.timestamp = j;
    }

    public static /* synthetic */ WaveformElement copy$default(WaveformElement waveformElement, float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            f = waveformElement.x;
        }
        if ((i & 2) != 0) {
            f2 = waveformElement.amplitude;
        }
        if ((i & 4) != 0) {
            j = waveformElement.timestamp;
        }
        return waveformElement.copy(f, f2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAmplitude() {
        return this.amplitude;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final WaveformElement copy(float x, float amplitude, long timestamp) {
        return new WaveformElement(x, amplitude, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveformElement)) {
            return false;
        }
        WaveformElement waveformElement = (WaveformElement) other;
        if (Float.compare(this.x, waveformElement.x) == 0 && Float.compare(this.amplitude, waveformElement.amplitude) == 0 && this.timestamp == waveformElement.timestamp) {
            return true;
        }
        return false;
    }

    public final float getAmplitude() {
        return this.amplitude;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getX() {
        return this.x;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + sv6.a(Float.hashCode(this.x) * 31, this.amplitude, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WaveformElement(x=");
        sb.append(this.x);
        sb.append(", amplitude=");
        sb.append(this.amplitude);
        sb.append(", timestamp=");
        return ix2.n(sb, this.timestamp, ')');
    }
}
