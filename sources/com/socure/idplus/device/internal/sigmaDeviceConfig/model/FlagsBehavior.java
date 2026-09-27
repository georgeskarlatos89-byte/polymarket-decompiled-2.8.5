package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsBehavior;", "", "enableBehavior", "", "(Z)V", "getEnableBehavior", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlagsBehavior {

    @SerializedName("enabled")
    private final boolean enableBehavior;

    public /* synthetic */ FlagsBehavior(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ FlagsBehavior copy$default(FlagsBehavior flagsBehavior, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = flagsBehavior.enableBehavior;
        }
        return flagsBehavior.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableBehavior() {
        return this.enableBehavior;
    }

    public final FlagsBehavior copy(boolean enableBehavior) {
        return new FlagsBehavior(enableBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof FlagsBehavior) && this.enableBehavior == ((FlagsBehavior) other).enableBehavior) {
            return true;
        }
        return false;
    }

    public final boolean getEnableBehavior() {
        return this.enableBehavior;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableBehavior);
    }

    public String toString() {
        return m51.l("FlagsBehavior(enableBehavior=", ")", this.enableBehavior);
    }

    public FlagsBehavior(boolean z) {
        this.enableBehavior = z;
    }

    public FlagsBehavior() {
        this(false, 1, null);
    }
}
