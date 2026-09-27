package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/HeaderConfig;", "", "background", "Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "content", "Lio/intercom/android/sdk/models/HeaderContentModel;", "headerExpanded", "", "<init>", "(Lio/intercom/android/sdk/models/HeaderBackgroundModel;Lio/intercom/android/sdk/models/HeaderContentModel;Z)V", "getBackground", "()Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "getContent", "()Lio/intercom/android/sdk/models/HeaderContentModel;", "getHeaderExpanded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HeaderConfig {
    public static final int $stable = 8;

    @SerializedName("background")
    private final HeaderBackgroundModel background;

    @SerializedName("content")
    private final HeaderContentModel content;

    @SerializedName("header_expanded")
    private final boolean headerExpanded;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r0);
        HeaderBackgroundModel headerBackgroundModel2;
        HeaderContentModel headerContentModel2;
        boolean z2;
        if ((i & 1) != 0) {
            headerBackgroundModel2 = new HeaderBackgroundModel(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
        } else {
            headerBackgroundModel2 = headerBackgroundModel;
        }
        if ((i & 2) != 0) {
            headerContentModel2 = new HeaderContentModel(null, null, false, null, null, null, null, null, 255, null);
        } else {
            headerContentModel2 = headerContentModel;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
    }

    public static /* synthetic */ HeaderConfig copy$default(HeaderConfig headerConfig, HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            headerBackgroundModel = headerConfig.background;
        }
        if ((i & 2) != 0) {
            headerContentModel = headerConfig.content;
        }
        if ((i & 4) != 0) {
            z = headerConfig.headerExpanded;
        }
        return headerConfig.copy(headerBackgroundModel, headerContentModel, z);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderContentModel getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public final HeaderConfig copy(HeaderBackgroundModel background, HeaderContentModel content, boolean headerExpanded) {
        background.getClass();
        content.getClass();
        return new HeaderConfig(background, content, headerExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderConfig)) {
            return false;
        }
        HeaderConfig headerConfig = (HeaderConfig) other;
        if (Intrinsics.areEqual(this.background, headerConfig.background) && Intrinsics.areEqual(this.content, headerConfig.content) && this.headerExpanded == headerConfig.headerExpanded) {
            return true;
        }
        return false;
    }

    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    public final HeaderContentModel getContent() {
        return this.content;
    }

    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.headerExpanded) + ((this.content.hashCode() + (this.background.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderConfig(background=");
        sb.append(this.background);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", headerExpanded=");
        return hdi.t(sb, this.headerExpanded, ')');
    }

    public HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z) {
        headerBackgroundModel.getClass();
        headerContentModel.getClass();
        this.background = headerBackgroundModel;
        this.content = headerContentModel;
        this.headerExpanded = z;
    }

    public HeaderConfig() {
        this(null, null, false, 7, null);
    }
}
