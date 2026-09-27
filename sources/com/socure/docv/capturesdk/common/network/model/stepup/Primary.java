package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Primary;", "", "color", "", "backgroundColor", "button", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Button;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/Button;)V", "getColor", "()Ljava/lang/String;", "getBackgroundColor", "getButton", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/Button;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class Primary {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final Button button;
    private final String color;

    public Primary(String str, String str2, Button button) {
        str.getClass();
        str2.getClass();
        button.getClass();
        this.color = str;
        this.backgroundColor = str2;
        this.button = button;
    }

    public static /* synthetic */ Primary copy$default(Primary primary, String str, String str2, Button button, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primary.color;
        }
        if ((i & 2) != 0) {
            str2 = primary.backgroundColor;
        }
        if ((i & 4) != 0) {
            button = primary.button;
        }
        return primary.copy(str, str2, button);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    public final Primary copy(String color, String backgroundColor, Button button) {
        color.getClass();
        backgroundColor.getClass();
        button.getClass();
        return new Primary(color, backgroundColor, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Primary)) {
            return false;
        }
        Primary primary = (Primary) other;
        if (Intrinsics.areEqual(this.color, primary.color) && Intrinsics.areEqual(this.backgroundColor, primary.backgroundColor) && Intrinsics.areEqual(this.button, primary.button)) {
            return true;
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Button getButton() {
        return this.button;
    }

    public final String getColor() {
        return this.color;
    }

    public int hashCode() {
        return this.button.hashCode() + com.socure.docv.capturesdk.api.a.a(this.backgroundColor, this.color.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.color;
        String str2 = this.backgroundColor;
        Button button = this.button;
        StringBuilder r = m51.r("Primary(color=", str, ", backgroundColor=", str2, ", button=");
        r.append(button);
        r.append(")");
        return r.toString();
    }
}
