package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.mda;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentComponent;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "mandatory", "", "type", "content", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getMandatory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "getContent", "getSelected", "setSelected", "(Ljava/lang/Boolean;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentComponent;", "equals", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ConsentComponent {
    public static final int $stable = 8;
    private final String content;
    private final String id;
    private final Boolean mandatory;
    private Boolean selected;
    private final String type;

    public ConsentComponent(String str, Boolean bool, String str2, String str3, Boolean bool2) {
        str2.getClass();
        str3.getClass();
        this.id = str;
        this.mandatory = bool;
        this.type = str2;
        this.content = str3;
        this.selected = bool2;
    }

    public static /* synthetic */ ConsentComponent copy$default(ConsentComponent consentComponent, String str, Boolean bool, String str2, String str3, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentComponent.id;
        }
        if ((i & 2) != 0) {
            bool = consentComponent.mandatory;
        }
        if ((i & 4) != 0) {
            str2 = consentComponent.type;
        }
        if ((i & 8) != 0) {
            str3 = consentComponent.content;
        }
        if ((i & 16) != 0) {
            bool2 = consentComponent.selected;
        }
        Boolean bool3 = bool2;
        String str4 = str2;
        return consentComponent.copy(str, bool, str4, str3, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    public final ConsentComponent copy(String id, Boolean mandatory, String type, String content, Boolean selected) {
        type.getClass();
        content.getClass();
        return new ConsentComponent(id, mandatory, type, content, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentComponent)) {
            return false;
        }
        ConsentComponent consentComponent = (ConsentComponent) other;
        if (Intrinsics.areEqual(this.id, consentComponent.id) && Intrinsics.areEqual(this.mandatory, consentComponent.mandatory) && Intrinsics.areEqual(this.type, consentComponent.type) && Intrinsics.areEqual(this.content, consentComponent.content) && Intrinsics.areEqual(this.selected, consentComponent.selected)) {
            return true;
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getMandatory() {
        return this.mandatory;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.mandatory;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int a = com.socure.docv.capturesdk.api.a.a(this.content, com.socure.docv.capturesdk.api.a.a(this.type, (i2 + hashCode2) * 31, 31), 31);
        Boolean bool2 = this.selected;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return a + i;
    }

    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    public String toString() {
        String str = this.id;
        Boolean bool = this.mandatory;
        String str2 = this.type;
        String str3 = this.content;
        Boolean bool2 = this.selected;
        StringBuilder sb = new StringBuilder("ConsentComponent(id=");
        sb.append(str);
        sb.append(", mandatory=");
        sb.append(bool);
        sb.append(", type=");
        k84.q(sb, str2, ", content=", str3, ", selected=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ConsentComponent(String str, Boolean bool, String str2, String str3, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, bool, str2, str3, bool2);
    }
}
