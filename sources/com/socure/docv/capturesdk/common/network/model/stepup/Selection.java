package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Selection;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "selected", "", "<init>", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Selection {
    public static final int $stable = 0;
    private final String id;
    private final boolean selected;

    public Selection(String str, boolean z) {
        str.getClass();
        this.id = str;
        this.selected = z;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selection.id;
        }
        if ((i & 2) != 0) {
            z = selection.selected;
        }
        return selection.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final Selection copy(String id, boolean selected) {
        id.getClass();
        return new Selection(id, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        if (Intrinsics.areEqual(this.id, selection.id) && this.selected == selection.selected) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "Selection(id=" + this.id + ", selected=" + this.selected + ")";
    }
}
